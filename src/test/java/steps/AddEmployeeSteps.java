package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimOption.click();
    }

    @When("user clicks on Add employee button")
    public void user_clicks_on_add_employee_button() {
        WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeButton.click();
    }
    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {
       WebElement firstName = driver.findElement(By.id("firstName"));
       firstName.sendKeys("Nammar");
       WebElement lastName = driver.findElement(By.id("lastName"));
       lastName.sendKeys("MS");
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added succesfully");
    }

    @When("user enters {string} {string} and {string}")
    public void user_enters_and(String firstName, String middleName, String lastName) {
        WebElement firstNameLoc = driver.findElement(By.id("firstName"));
        firstNameLoc.sendKeys(firstName);
        WebElement lastNameLoc = driver.findElement(By.id("lastName"));
        lastNameLoc.sendKeys(lastName);
        WebElement middleNameLoc = driver.findElement(By.id("middleName"));
        middleNameLoc.sendKeys(middleName);
    }

    @When("user enters direct data {string} {string} and {string}")
    public void user_enters_direct_data_and(String firstName, String middleName, String lastName) {
        WebElement firstNameLoc = driver.findElement(By.id("firstName"));
        firstNameLoc.sendKeys(firstName);
        WebElement lastNameLoc = driver.findElement(By.id("lastName"));
        lastNameLoc.sendKeys(lastName);
        WebElement middleNameLoc = driver.findElement(By.id("middleName"));
        middleNameLoc.sendKeys(middleName);
    }

    @When("user add multiple employees and verify they are added")
    public void user_add_multiple_employees_and_verify_they_are_added(DataTable dataTable) throws InterruptedException {
       List<Map<String, String>> employeeNames = dataTable.asMaps();

       for (Map<String, String> emp : employeeNames){
           String firstNameValue = emp.get("firstName");
           String middleNameValue = emp.get("middleName");
           String lastNameValue = emp.get("lastName");

           WebElement firstNameLoc = driver.findElement(By.id("firstName"));
           firstNameLoc.sendKeys(firstNameValue);
           WebElement lastNameLoc = driver.findElement(By.id("lastName"));
           lastNameLoc.sendKeys(lastNameValue);
           WebElement middleNameLoc = driver.findElement(By.id("middleName"));
           middleNameLoc.sendKeys(middleNameValue);

           WebElement saveButton = driver.findElement(By.id("btnSave"));
           saveButton.click();

           //Assertions in Homework
           Thread.sleep(5000);

           //to come back again on add employee screen because hooks and background works just one time
           WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
           addEmployeeButton.click();
           Thread.sleep(3000);
        }

    }

}
