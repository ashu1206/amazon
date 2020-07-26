Feature: Login and Search for desired product on Amazon

Scenario Outline: Login to the Amazon Site
Given launch the browser with "<url>"
Then click on sign in
And enter the mobile "<username>"
And click on continue
And enter the pass "<password>"
Then click on login
And verify that you are at home page

Examples: 

|url|username|password|
|https://www.amazon.in|9540716910|123456789@#|


@SearchProduct
Scenario Outline: Search desired Product and sort in desired order
Given launch the browser with "<url>"
Then click on sign in
And enter the mobile "<username>"
And click on continue
And enter the pass "<password>"
Then click on login
And verify that you are at home page
Then search for your desired product "<product>"
And sort by lowest price
Then click on the lowest price product


Examples: 

|        url          |  username| password   |product|
|https://www.amazon.in|9540716910|123456789@#|green tea|

@Add
Scenario Outline: Add and delete the products and buy
Given launch the browser with "<url>"
Then click on sign in
And enter the mobile "<username>"
And click on continue
And enter the pass "<password>"
Then click on login
And verify that you are at home page
Then search for your desired product "<product>"
And sort by lowest price
Then click on the lowest price product
Then verify the page title
And add the product to the cart
Then add a product again to the cart
And go to the cart
Then delete one of the product
And click on to buy


Examples: 

|        url          |  username| password   |product|
|https://www.amazon.in|9540716910|123456789@#|green tea|

