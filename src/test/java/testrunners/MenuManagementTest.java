package testrunners;


import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.junit.platform.engine.CucumberTestEngine;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectDirectory;
import static org.junit.platform.suite.commons.SuiteLauncherDiscoveryRequestBuilder.request;

//Implementation for JUnit 4 and older Cucumber
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/java/features",
//                 glue = {"stepdefinitions","hooks"},
//                 tags = {"@SmokeTest or @RegularTest"}, // or
//                 tags = {"@SmokeTest, @RegularTest"}, // or condition
//                 tags = {"@NightlyBuildTest and @RegularTest"}, // and
//                 tags = {"@NightlyBuildTest", "@RegularTest"}, // and
//                 tags = {"not @NightlyBuildTest"}, // not
//                 plugin = {"pretty",
//                     "html:target/SystemTestReports/html",
//                     "json:target/SystemTestReports/json/report.json",
//                     "junit:target/SystemTestReports/junit/report.xml"},
//                 tags = {"@ScenarioOutlineExample"},
//                 dryRun = false,
//                 monochrome = true) //true - if no implementation - stubs are created

public class MenuManagementTest {

}