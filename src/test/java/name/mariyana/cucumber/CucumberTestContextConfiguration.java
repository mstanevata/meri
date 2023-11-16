package name.mariyana.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import name.mariyana.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
