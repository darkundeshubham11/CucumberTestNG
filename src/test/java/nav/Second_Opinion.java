package nav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Second_Opinion {
	WebDriver driver;

	@Given("Open browser, enter sparsh hospital url")
	public void open_browser_enter_sparsh_hospital_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sparshhospital.com/");
	}

	@Given("click on Hospitals link")
	public void click_on_hospitals_link() {
		driver.findElement(By.xpath("//ul/li[4]/a[@class=\"nav-link dropdown-toggle\"]")).click();
	}

	@Given("Select Yeshwantpur hospital from Hospital dropdown")
	public void select_yeshwantpur_hospital_from_hospital_dropdown() {
		driver.findElement(
				By.xpath("//div/a[@href=\"https://www.sparshhospital.com/hospitals/sparsh-hospital-yeswanthpur/\"]"))
				.click();
	}

	@Given("Click on Second Opinion link")
	public void click_on_second_opinion_link() {
		driver.findElement(By.xpath("//div/div[4]/a[@class=\"btn btn-outline-red btn-sm btn-block small\"]")).click();
	}

	@When("user enters firstname,lastname,phone,email")
	public void user_enters_firstname_lastname_phone_email() {

	}

	@When("Upload the Report and Write a message and click on send to submit")
	public void upload_the_report_and_write_a_message_and_click_on_send_to_submit() {

	}

	@Then("Thankyou message should be displayed")
	public void thankyou_message_should_be_displayed() {

	}

	@Then("bank info should be available in the page.")
	public void bank_info_should_be_available_in_the_page() {

	}

}
