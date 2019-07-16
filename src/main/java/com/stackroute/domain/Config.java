package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class Config {

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean beanLifecycleDemoBean()
    {
        BeanLifecycleDemoBean beanLifecycleDemoBean=new BeanLifecycleDemoBean();
        return beanLifecycleDemoBean;
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean()
    {
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=new BeanPostProcessorDemoBean();
        return beanPostProcessorDemoBean;
    }

}
