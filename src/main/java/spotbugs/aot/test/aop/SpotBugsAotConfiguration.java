package spotbugs.aot.test.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpotBugsAotConfiguration {

    @Bean
    public SpotBugsAotAspect spotBugsAotAspect(){
        return new SpotBugsAotAspect();
    }
}
