package com.damt.SpringBootProy.configuration;

import com.damt.SpringBootProy.bean.BeanWithProperties;
import com.damt.SpringBootProy.bean.BeanWithPropertiesImplement;
import com.damt.SpringBootProy.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {

    @Value("${value.name}")
    private String name;

    @Value("${value.lastname}")
    private String lastname;

    @Bean
    public BeanWithProperties beanProperties(){
        return new BeanWithPropertiesImplement(name,lastname);
    }

/*
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/postgres");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("admin");
        return dataSourceBuilder.build();
    }

 */
}
