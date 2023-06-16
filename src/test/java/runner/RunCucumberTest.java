package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        snippets = CAMELCASE,
        plugin = {
                "pretty",
                "html: cucumber-reports/test_report.html"
        },
        tags = "@regression or @smoke",
        monochrome = true
)

public class RunCucumberTest {
}
