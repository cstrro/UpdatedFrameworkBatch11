package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class HardCodedExamples {

    @Test
    public void sampleTest(){

        //storing the base uri to use further
        String baseURI= RestAssured.baseURI="http://hrm.syntaxtechs.net/syntaxap1/api";

        //preparing the request to get an employee
        RequestSpecification prepareRequest= given().header("Content-Type", "application/json")
                .header("Authorization", "")
                .queryParam("employee_id","");

        Response response=prepareRequest.when().get("/getOneEmployee.php");
        System.out.println(response.asString());

        response.then().assertThat().statusCode(200);
    }
}
