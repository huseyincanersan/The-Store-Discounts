# The Retail Store Discounts

## Description

On a retail website, the following discounts apply:
1.	If the user has gold card of the store, he gets a 30% discount
2.	If the user has silver card of the store, he gets a 20% discount
3. If the user is an affiliate of the store, he gets a 10% discount
4. If the user has been a customer for over 2 years, he gets a 5% discount.
5. For every $200 on the bill, there would be a $ 5 discount (e.g. for $ 950, you get $ 20
as a discount).
6. The percentage based discounts do not apply on phones.
7. A user can get only one of the percentage based discounts on a bill.





## Using

### API Endpoint

* Http Method - **POST**
* Endpoint - **localhost:8080/api/v1/discounts**

Example request

```json
{
    "user": {
        "type": "SILVERCARD",
        "registerDate": "2019-06-27"
    },
    "bill": {
        "items": [
            {
                "type": "PHONE",
                "price": 450
            },
            {
                "type": "TECHNOLOGY",
                "price": 549
            },
            {
                "type": "CLOTHES",
                "price": 850
            }
        ]
    }
}

```

The response is net payable amount.

```json
1524.20
```
