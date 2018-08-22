@CompleteFlow
Feature: HeartAge Application Test

Scenario Outline: Test your Heart 
	Given I land on heart age test page 
	And click on Start option 
	And If not scroll down then enter "<Day>","<Month>","<Year>", "<Gender>","<Ethnic Group>","<Postcode>" 
	Then Enter "<card_disease>","<smoke>","<height>","<weight>" 
	Then Enter values for "<diabetes>","<arthritis>","<kidney>","<atrial>"
	And also enter values for "<relative_cardio>","<cholestrol>","<bp>","<bp_treatment>" and click on get your results
		
	
	Examples: 
	
		|Day |Month|Year|Gender|Ethnic Group|Postcode|card_disease|smoke|height|weight|diabetes|arthritis|kidney|atrial|relative_cardio|cholestrol|bp|bp_treatment|	
		|1 |5 |1985|f|Indian|TW3 4DF|n|I quit|5'12|7-13|n|n|n|n|n|n|n|n|
			
@LinkFlow
Scenario Outline: LinksTest in HA Application
Given I land on heart age page and click on terms and conditions
When clicked on links why is this asked, why is this imp, why is this being asked, what is cardiovascular disease, "<height>", "<weight>", what is rheumatoid arthritis?,What is chronic kidney disease?,what is atrial fibrillation?,What does this mean?,Cholesterol information,blood pressure information,Blood pressure treatment

Examples:
|height|weight|
|160|50|
	