package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.*;

@RunWith(Parameterized.class)
public class ParameterizedJUnit {

    public String email;
    public boolean expectedResult;


    public ParameterizedJUnit(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection valueWithExpectedResult() {

        return Arrays.asList((new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",false},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",false},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",false},
                {"abc@gmail.com.com",false},
                {"aabc+100@gmail.com",false},
        }));

    }

    @Test
    public void givenString_WhenValidated_ReturnBoolean(){
        MainTest obj=new MainTest();
        Boolean result =obj.isEmailValidate(this.email);
        Assert.assertEquals(this.expectedResult,result);
    }

}
