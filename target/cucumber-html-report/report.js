$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Automation/BDD_PHE_HeartAge/src/main/java/HA_Features/HeartAge.feature");
formatter.feature({
  "line": 1,
  "name": "HeartAge Application Test",
  "description": "",
  "id": "heartage-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test HeartAge with different set of data",
  "description": "",
  "id": "heartage-application-test;test-heartage-with-different-set-of-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@CompleteFlow"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I land on heart age test page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on Start option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter details from excel \"C:\\Automation\\BDD_PHE_HeartAge\\src\\test\\java\\HA_TestData\\Heart Age - Test cases v1.xlsx\" and \"Test HeartAge with different set of data\"",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageSteps.i_land_on_heart_age_test_page()"
});
formatter.result({
  "duration": 22259820902,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageSteps.click_on_Start_option()"
});
formatter.result({
  "duration": 3977923177,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Automation\\BDD_PHE_HeartAge\\src\\test\\java\\HA_TestData\\Heart Age - Test cases v1.xlsx",
      "offset": 26
    },
    {
      "val": "Test HeartAge with different set of data",
      "offset": 120
    }
  ],
  "location": "FillFormPageSteps.enter_details_from_excel_and(String,String)"
});
formatter.result({
  "duration": 31972639800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "HeartAge all links test",
  "description": "",
  "id": "heartage-application-test;heartage-all-links-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@LinkFlow"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I land on heart age page and click on terms and conditions",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "clicked on links why is this asked, why is this imp, why is this being asked, what is cardiovascular disease, height, weight, what is rheumatoid arthritis?,What is chronic kidney disease?,what is atrial fibrillation?,What does this mean?,Cholesterol information,blood pressure information,Blood pressure treatment from \"C:\\Automation\\BDD_PHE_HeartAge\\src\\test\\java\\HA_TestData\\Heart Age - Test cases v1.xlsx\"",
  "keyword": "When "
});
formatter.match({
  "location": "TCAndFillFormLinkPageSteps.i_land_on_heart_age_page_and_click_on_terms_and_conditions()"
});
formatter.result({
  "duration": 46054259942,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Automation\\BDD_PHE_HeartAge\\src\\test\\java\\HA_TestData\\Heart Age - Test cases v1.xlsx",
      "offset": 320
    }
  ],
  "location": "HeightWeightPageSteps.clicked_on_links_why_is_this_asked_why_is_this_imp_why_is_this_being_asked_what_is_cardiovascular_disease_height_weight_what_is_rheumatoid_arthritis_What_is_chronic_kidney_disease_what_is_atrial_fibrillation_What_does_this_mean_Cholesterol_information_blood_pressure_information_Blood_pressure_treatment_from(String)"
});
formatter.result({
  "duration": 53062912552,
  "status": "passed"
});
});