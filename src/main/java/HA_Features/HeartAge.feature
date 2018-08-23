Feature: HeartAge Application Test 

@CompleteFlow 
Scenario: Test HeartAge with different set of data
Given I land on heart age test page
And click on Start option
And Enter details from excel "C:\Automation\BDD_PHE_HeartAge\src\test\java\HA_TestData\Heart Age - Test cases v1.xlsx" and "Test HeartAge with different set of data"
 
@LinkFlow
Scenario: HeartAge all links test
Given I land on heart age page and click on terms and conditions 
When clicked on links why is this asked, why is this imp, why is this being asked, what is cardiovascular disease, height, weight, what is rheumatoid arthritis?,What is chronic kidney disease?,what is atrial fibrillation?,What does this mean?,Cholesterol information,blood pressure information,Blood pressure treatment from "C:\Automation\BDD_PHE_HeartAge\src\test\java\HA_TestData\Heart Age - Test cases v1.xlsx"

	