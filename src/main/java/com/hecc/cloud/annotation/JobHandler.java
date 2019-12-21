package com.hecc.cloud.annotation;

import java.lang.annotation.*;

/**
 * @author xuhoujun
 * @description: 脚本处理注解 赋予默认值
 * @date: created In 1:45 PM on 2019/10/19.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface JobHandler {
    String value() default "";
}
