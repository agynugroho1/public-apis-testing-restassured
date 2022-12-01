package starter.publicapis;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EntriesStepdefs {

    Entries entries = new Entries();

    @When("User {string} API {string}")
    public void userAPI(String method, String link) {
        entries.HitApi(method, link);
    }

    @Then("The response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int sc) {
        entries.VStatusCode(sc);
    }

    @And("Data {string} greather than {int}")
    public void dataGreatherThan(String key, int value) {
        entries.VData(key, value);
    }
}
