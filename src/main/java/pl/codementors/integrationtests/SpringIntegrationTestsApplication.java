package pl.codementors.integrationtests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringIntegrationTestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationTestsApplication.class, args);
    }

}
