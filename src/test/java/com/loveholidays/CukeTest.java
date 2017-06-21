package com.loveholidays;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani on 17/06/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format = {"html:target/site/Cucumber-pretty"},tags = "@ErrorMessage")

public class CukeTest
{

}
