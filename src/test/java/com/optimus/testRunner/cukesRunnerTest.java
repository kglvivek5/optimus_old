package com.optimus.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by elakskg on 3/22/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/com/optimus/features",
        glue = {"src/main/java/com/optimus/pageObjectLibraries"},
        dryRun = true)
public class cukesRunnerTest {
}