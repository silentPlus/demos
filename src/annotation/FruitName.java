package annotation;

import java.lang.annotation.*;

/**
 * 水果名称注解
 * Created by suvan on 2016/12/22.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
