package spotbugs.aot.test.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Inherited
@Target(METHOD)
@Retention(RUNTIME)
public @interface EndAnnotation {

    String value() default "";
}
