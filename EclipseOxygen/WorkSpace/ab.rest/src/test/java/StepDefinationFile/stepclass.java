package StepDefinationFile;

import com.relevantcodes.extentreports.LogStatus;
import static io.restassured.RestAssured.given;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class stepclass extends reusablemethods {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	private String ENDPOINT_GET_BOOK_BY_ISBN = "https://www.googleapis.com/books/v1/volumes";


@Given("^start reporting this scenerio$")
public void start_reporting_this_scenerio() throws Throwable {
	createTestScriptReports("script running");
}

@Given("^countryCode \"([^\"]*)\" and stateCode \"([^\"]*)\"$")
public void countrycode_and_stateCode(String arg1, String arg2) throws Throwable {
	request = given().pathParams("countryCode", arg1,"stateCode",arg2);
	loggers.log(LogStatus.INFO,"given parameters passed");
}

@When("^a user go to \"([^\"]*)\"$")
public void a_user_go_to(String arg1) throws Throwable {
	response = request.when().get(arg1);
	loggers.log(LogStatus.INFO," passed");
}

@Then("^GroupKT the status code is (\\d+)$")
public void groupkt_the_status_code_is(int arg1) throws Throwable {
	json = response.then().statusCode(arg1);
	loggers.log(LogStatus.INFO,"given parameters passed");
}

@Then("^GroupKT response includes \"([^\"]*)\" is \"([^\"]*)\"$")
public void groupkt_response_includes_is(String arg1, ResponseAwareMatcher<Response> arg2) throws Throwable {
	response.then().body(arg1, arg2);
	loggers.log(LogStatus.INFO,"given responses passed");
}

@Then("^end report$")
public void end_report() throws Throwable {
	flushReports();
}



}
