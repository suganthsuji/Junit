package com.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class Main {

        Validation validation=new Validation();
        @Test
        public void givenfNameString_WhenValidated_ReturnBoolean(){

            Boolean result =validation.nameValidation("Suganth");
            Assert.assertEquals(true,result);
    }

    @Test
    public void givenlNameString_WhenValidated_ReturnBoolean(){

            Boolean result=validation.nameValidation("Suji");
            Assert.assertEquals(true,result);

    }
}
