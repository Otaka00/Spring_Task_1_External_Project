package com.example.SeparateSpringProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("variant1")
public class CutomizedUserService extends UserServiceVariant1{
    @Override
    public void printVariant() {

        System.out.println("Variant 1 is overridden");
    }
}
