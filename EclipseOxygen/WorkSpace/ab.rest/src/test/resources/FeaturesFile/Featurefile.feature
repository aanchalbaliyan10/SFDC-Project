

Feature: RestAssured with cucumber
  I want to perform some CRUD operations

  Scenario: User calls web service to get details of state
	Given start reporting this scenerio
	Given countryCode "USA" and stateCode "CO"
	When a user go to "http://services.groupkt.com/state/get/{countryCode}/{stateCode}"
	Then GroupKT the status code is 200
	And GroupKT response includes "RestResponse.result.country" is "USA "
	And end report
    