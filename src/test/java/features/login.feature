Feature: login function

Scenario Outline: Check Login with multiple data

Given user is on login page
When user fills the form in login page from given sheetname <SheetName> and rownumber <RowNumber>
And clicks on send Button
Then login should be successful

Examples:

|	SheetName	|	RowNumber	|
|	login	|	1	|
|	login	|	2	|
|	login	|	3	|
|	login	|	4	|
|	login	|	5	|


