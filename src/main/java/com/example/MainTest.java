package com.example;

import java.util.regex.Pattern;

public class MainTest {

    public static Boolean isEmailValidate(String email){
        String emailRegex="^[a-z0-9]{3,}([.][a-z0-9]{1,})?[@][a-z]{3,}[.][a-z]{2,3}([.][a-z]{2})?$";
        return Pattern.matches(emailRegex,email);
    }

}
