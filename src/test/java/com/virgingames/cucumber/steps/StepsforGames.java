package com.virgingames.cucumber.steps;

import com.virgingames.gamesinformation.GamesSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

public class StepsforGames {

    static ValidatableResponse response;
    @Steps
    GamesSteps steps;


    @When("User send a GET request")
    public void userSendAGETRequest() {
        response=steps.getAllGamesInformation();
    }

    @Then("User can assert that data contains jackpotid Bingo")
    public void userCanAssertThatDataContainsJackpotidBingo() {
        response= steps.assertData();
    }

    @And("User must get back a valid status code {int}")
    public void userMustGetBackAValidStatusCode(int statusCode) {
        response.statusCode(statusCode);
    }

}
