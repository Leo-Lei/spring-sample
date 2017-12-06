package com.leibangzhu.sample.spring.beandefinition.beanfactorypostprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    MyConfigBean myConfigBean(){
        return new MyConfigBean();
    }
}
