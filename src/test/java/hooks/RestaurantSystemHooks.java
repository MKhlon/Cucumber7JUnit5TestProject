package hooks;

import cucumbercourse.HelperClass;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class RestaurantSystemHooks {
    @Before("@SmokeTest")
    public void beforeDisplayMessage(Scenario sc) {
        System.out.println("Before " + sc.getName());
    }
    @After("@SmokeTest")
    public void afterDisplayMessage(Scenario sc) {
        System.out.println("After " + sc.getName());
    }

    @Before("@SeleniumTest")
    public static void setUp() {
        HelperClass.setUpDriver();
    }
    @After("@SeleniumTest")
    public static void tearDown(Scenario scenario) {
        HelperClass.tearDown();
    }
}