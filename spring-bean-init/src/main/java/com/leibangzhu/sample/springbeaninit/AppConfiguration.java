package com.leibangzhu.sample.springbeaninit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfiguration {


    @Bean
    public AlwaysBeingUsedBean alwaysBeingUsedBean() {
        return new AlwaysBeingUsedBean();
    }

    @Bean
    @Lazy
    public RarelyUsedBean rarelyUsedBean() {
        return new RarelyUsedBean();
    }
}
