package lhq.demo.anno;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyComponent {
    /**
     * 这里我们定义一个Component注解的别名
     */
    @AliasFor(annotation = Component.class, attribute = "value")
    String val() default "";
}
