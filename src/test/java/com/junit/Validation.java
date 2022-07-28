package com.junit;

import java.util.regex.Pattern;

public class Validation {
    public boolean nameValidation(String name){
        String nameRegex="^[A-Z][a-z]{3,}$";
        return Pattern.matches(nameRegex,name);
    }
    public boolean emailValidation(String email){
        String emailRegex="^[a-z0-9]{3,}([.][a-z0-9]{1,})?[@][a-z]{3,}[.][a-z]{2,3}([.][a-z]{2})?$";
        return Pattern.matches(emailRegex,email);
    }
    public boolean numberValidation(String number){
        String numberRegex="^([+][0-9]{2})?[\\s][1-9][0-9]{9}$";
        return Pattern.matches(numberRegex,number);
    }
}
