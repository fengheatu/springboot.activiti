package com.river;

import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * @author: he.feng
 * @date: 17:20 2017/11/30
 * @desc:
 **/
@ComponentScan
@ServletComponentScan
@EnableTransactionManagement
@MapperScan(basePackages = "com.river.dao")
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class ServletInitializer extends SpringBootServletInitializer{


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ServletInitializer.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(ServletInitializer.class,args);
    }
}
