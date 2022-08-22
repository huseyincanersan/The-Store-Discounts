package com.spring.store.demo.services;

import com.spring.store.demo.helper.DiscountHelper;
import com.spring.store.demo.models.Bill;
import com.spring.store.demo.models.ItemType;
import com.spring.store.demo.models.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DiscountServiceImpl implements DiscountService {

	@Override
	public BigDecimal discountCalculation(User user, Bill bill) {
		DiscountHelper helper = new DiscountHelper();

        BigDecimal totalAmount = helper.calculateTotal(bill.getItems());
        BigDecimal phoneAmount = helper.calculateTotalPerType(bill.getItems(), ItemType.PHONE);
        BigDecimal nonPhoneAmount = totalAmount.subtract(phoneAmount);
        BigDecimal userDiscount = helper.getUserDiscount(user);
        BigDecimal billsDiscount = helper.calculateBillsDiscount(totalAmount, new BigDecimal(200), new BigDecimal(5));
		if (nonPhoneAmount.compareTo(BigDecimal.ZERO) > 0) {
			nonPhoneAmount = helper.calculateDiscount(nonPhoneAmount, userDiscount);
		}

        BigDecimal finalAmount = (phoneAmount.add(nonPhoneAmount).subtract(billsDiscount));
		return finalAmount;
	}
}
