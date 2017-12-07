package com.leibangzhu.sample.spring.beandefinition.customizescan;

import java.lang.annotation.*;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Reference {
    String value() default "";
    Class<?> interfaceClass();
}
