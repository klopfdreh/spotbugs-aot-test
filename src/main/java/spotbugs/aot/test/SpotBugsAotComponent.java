package spotbugs.aot.test;

import org.springframework.stereotype.Component;
import spotbugs.aot.test.aop.EndAnnotation;
import spotbugs.aot.test.aop.StartAnnotation;

@Component
public class SpotBugsAotComponent {

    @StartAnnotation("start")
    public void start(){
    }

    @EndAnnotation("end")
    public void end(){
    }
}
