package testRunner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import utilities.TestBase;

@CucumberOptions(features = {"src/test/java/features"}
        ,glue = {"stepDef","pages", "utilities"}
        ,tags = ("@test and @FERegression") //("@Test1 or @test2 and @test3 and not @test4")
        ,plugin = {"pretty","html:test-output/DefaultReport/DefaultReport.html"
//        ,"json:test-output/jsonReport/jsonReport.json"
        //,"junit:test-output/junitReport/xmlReport.xml"
        //,"com.cucumber.listener.ExtentCucumberFormatter:"
        ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class FETestRunner extends TestBase {
}

