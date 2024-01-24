package com.example.SeparateSpringProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserServiceVariant1 {
    @Bean
    public void printVariant(){
        System.out.println("variant1");
    }
}
