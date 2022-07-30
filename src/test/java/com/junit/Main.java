package com.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class Main {

    //Creating Object Validation
        Validation validation=new Validation();
    //Junit Test for Name
        @Test
        public void givenfNameString_WhenValidated_ReturnBoolean(){

            Boolean result =validation.nameValidation("Suganth");
            Assert.assertEquals(true,result);
    }
    //Junit Test for Name
    @Test
    public void givenlNameString_WhenValidated_ReturnBoolean(){

            Boolean result=validation.nameValidation("Suji");
            Assert.assertEquals(true,result);

    }
    //Junit Test for Email
    @Test
    public void givenEmailString_WhenValidated_ReturnBoolean(){

        Boolean result=validation.emailValidation("suganth.pv@bizongo.com");
        Assert.assertEquals(true,result);

    }
    //Junit Test for Number
    @Test
    public void givenNumberString_WhenValidated_ReturnBoolean(){

        Boolean result=validation.numberValidation("8072948266");
        Assert.assertEquals(true,result);

    }
    //Junit Test for Password
    @Test
    public void givenPasswordString_WhenValidated_ReturnBoolean(){

        Boolean result=validation.passwordValidation("Abcd@123");
        Assert.assertEquals(true,result);

    }
}
