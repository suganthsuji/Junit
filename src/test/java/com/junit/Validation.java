package com.junit;

import java.util.regex.Pattern;

public class Validation {

    //Validation Regex for Name
    public boolean nameValidation(String name){
        String nameRegex="^[A-Z][a-z]{3,}$";
        return Pattern.matches(nameRegex,name);
    }

    //Validation Regex for Email
    public boolean emailValidation(String email){
        String emailRegex="^[a-z0-9]{3,}([.][a-z0-9]{1,})?[@][a-z]{3,}[.][a-z]{2,3}([.][a-z]{2})?$";
        return Pattern.matches(emailRegex,email);
    }

    //Validation Regex for Number
    public boolean numberValidation(String number){
        String numberRegex="^([+][0-9]{2})?[\\s][1-9][0-9]{9}$";
        return Pattern.matches(numberRegex,number);
    }

    //Validation Regex for Password
    public boolean passwordValidation(String password){
        String passwordRegex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";
        return Pattern.matches(passwordRegex,password);
    }

}
