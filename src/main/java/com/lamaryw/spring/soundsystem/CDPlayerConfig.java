package com.lamaryw.spring.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * This java-based Spring configuration class tell Spring to seek out classes
 * annotated with @Component and to create beans from them.
 * 
 */
@Configuration
@ComponentScan // enable component scanning in Spring.
public class CDPlayerConfig {

}
