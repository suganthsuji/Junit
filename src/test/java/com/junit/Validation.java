package com.junit;

import java.util.regex.Pattern;

public class Validation {
    public boolean nameValidation(String name){
        String nameRegex="^[A-Z][a-z]{3,}$";
        return Pattern.matches(nameRegex,name);
    }
}
