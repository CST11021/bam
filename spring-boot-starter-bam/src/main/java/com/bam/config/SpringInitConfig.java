package com.bam.config;

import com.bam.BamMenuRouteFilter;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author 盖伦
 * @Date 2024/2/20
 */
@Configuration
@ComponentScan(basePackages = {"com.bam"})
@ImportResource(value = {"classpath:bam/velocity-conf.xml"})
@ServletComponentScan(basePackageClasses = {BamMenuRouteFilter.class})
public class SpringInitConfig {



}
