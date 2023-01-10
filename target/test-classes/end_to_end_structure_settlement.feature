Feature: Verify end to end Structured Settlement (PolicyMaster)
	Description: Verify end to end Structured Settlement

	@SmokeTest
	Scenario: Verify end to end Structured Settlement for PolicyMaster LOB I
		When the user executes structured settlement with a POST request
		Then the user receives structured settlement status code of 200 from endpoint
		Then the user verify structured settlement data in documentDB

	@SmokeTest
	Scenario: Verify end to end Structured Settlement for PolicyMaster LOB L
		When the user executes structured settlement with a POST request
		Then the user receives structured settlement status code of 200 from endpoint
		Then the user verify structured settlement data in documentDB
