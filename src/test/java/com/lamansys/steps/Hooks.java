package com.lamansys.steps;

import com.lamansys.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup(){
        DriverManager.create("chrome");
    }

    @After
    public void tearDown(){
        DriverManager.quit();
    }
}
