package org.Dominos_runner_pkg;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.Dominos_base_pkg.Dominos_baseclass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\Dominos.feature", dryRun = false, glue = "org.Dominos_stepdef_pkg")

public class Dominos_runner_class  extends Dominos_baseclass {

    @BeforeClass
    public static void start(){

        driver=new ChromeDriver();

    }



}
