package com.virgingames.gamesinformation;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import static org.hamcrest.core.IsEqual.equalTo;

public class GamesSteps {

    static ValidatableResponse response;

    @Step
    public ValidatableResponse getAllGamesInformation(){
        return SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_GAMES_NAME)
                .then()
                .statusCode(200);
    }

    public ValidatableResponse assertData(){
        return response.body("data.jackpotId",equalTo("Bingo"));
    }
}
