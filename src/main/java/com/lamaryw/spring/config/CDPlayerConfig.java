package com.lamaryw.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lamaryw.spring.soundsystem.Scannable;

/*
 * This java-based Spring configuration class tell Spring to seek out classes
 * annotated with @Component and to create beans from them.
 * 
 */
@Configuration
@ComponentScan (basePackageClasses=Scannable.class) // @ComponentScan enable component scanning in Spring.
//specifying scanning basePackages via classes or interfaces, this makes those components refactor-friendly
//Whatever packages those component classes are in, they will be used as the base packages for component scanning. 
//we can refactor the package names in the future. 
public class CDPlayerConfig {

}
