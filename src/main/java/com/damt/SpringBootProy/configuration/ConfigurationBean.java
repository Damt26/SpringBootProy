package com.damt.SpringBootProy.configuration;

import com.damt.SpringBootProy.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanTwoImplement();
    }

    @Bean
    public Operation sumOperation(){
        return new OperationImplement();
    }
    @Bean
    public OperationWithDependency operationSumDependency(Operation operation){
        return new OperationWithDependencyImplement(operation);
    }
}
