package spotbugs.aot.test.aop;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

@Documented
@Inherited
@Target(METHOD)
@Retention(RUNTIME)
public @interface StartAnnotation {

    String value() default "";
}
