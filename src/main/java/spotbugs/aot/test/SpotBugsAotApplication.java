package spotbugs.aot.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpotBugsAotApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpotBugsAotApplication.class).run(args);
    }
}
