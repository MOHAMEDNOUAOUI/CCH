package com.wora.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ImportResource("classpath:applicationContext.xml")
@ComponentScan(basePackages = "com.wora")
public class WebConfig implements WebMvcConfigurer {

}