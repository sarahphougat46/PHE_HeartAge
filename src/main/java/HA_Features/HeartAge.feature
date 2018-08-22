@CompleteFlow 
Feature: HeartAge Application Test 

#Scenario Outline: Test your Heart 
#	Given I land on heart age test page 
#	And click on Start option 
#	And If not scroll down then enter "<Day>","<Month>","<Year>", "<Gender>","<Ethnic Group>","<Postcode>" 
#	Then Enter "<card_disease>","<smoke>","<height>","<weight>" 
#	Then Enter values for "<diabetes>","<arthritis>","<kidney>","<atrial>" 
#	And also enter values for "<relative_cardio>","<cholestrol>","<bp>","<bp_treatment>" and click on get your results 
#	And click on get your results and check links about your calculation, loose_wt_info, low_chol_info, reduce_bp_info, check on improving height, cholesterol, bp by clicking on more details and read more about NHS Check 
#	Then either click on StartAgain or back 
#	
#	
#	Examples: 
#	
#		|Day |Month|Year|Gender|Ethnic Group|Postcode|card_disease|smoke|height|weight|diabetes|arthritis|kidney|atrial|relative_cardio|cholestrol|bp|bp_treatment|	
#		|1 |5 |1985|f|Indian|TW3 4DF|n|I quit|5'12|7-13|n|n|n|n|n|n|n|n|
#		|4|1|1985|m|White|TW13 4GA|n|I smoke less than 10 a day|5'10|6-12|y|y|y|y|n|n|n|y| 
#		
#@LinkFlow 
#Scenario Outline: LinksTest in HA Application 
#	Given I land on heart age page and click on terms and conditions 
#	When clicked on links why is this asked, why is this imp, why is this being asked, what is cardiovascular disease, "<height>", "<weight>", what is rheumatoid arthritis?,What is chronic kidney disease?,what is atrial fibrillation?,What does this mean?,Cholesterol information,blood pressure information,Blood pressure treatment 
#	
#	
#	Examples: 
#		|height|weight|
#		|160|50|

Scenario: Test HeartAge with different set of data
Given I land on heart age test page
And click on Start option
And Enter details from excel "C:\Automation\BDD_PHE_HeartAge\src\test\java\HA_TestData\Heart Age - Test cases v1.xlsx" and "Test HeartAge with different set of data"
 
	