package com.pw;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
       

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    // http://localhost:8080/v1.0.0/services/getHelloMessage
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        
        System.out.println("/************************************************************************************/");
        System.out.println("/*                                                                                  */");
        System.out.println("/*                              Hello, world...                                     */");
        System.out.println("/*                                                                                  */");
        System.out.println("/*          SpringApplicationBuilder.configure(SpringApplicationBuilder):           */");
        System.out.println("/*                                                                                  */");
        System.out.println("/************************************************************************************/");
        
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        final String rootContext = "/";
        
        System.out.println("Top of main: " + new Date() + ". Root context=" + rootContext);
        
        // https://www.baeldung.com/spring-boot-context-path
        System.setProperty("server.servlet.context-path", rootContext);
        SpringApplication.run(Application.class, args);
    }
    
}
