package com.userRegister;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean checkFirstName(String firstName) {
        String firstNamePattern = "^[A-Z]+[a-zA-Z]{3,}$";
        Pattern pattern=Pattern.compile(firstNamePattern);
        Matcher matcher=pattern.matcher(firstName);
        if(matcher.matches()){
            return  true;
        }
        return false;
        
    }

    public boolean checkLastName(String lastName) {
        String lastNamePattern="^[A-Z]+[a-z]{3,}$";
        Pattern pattern=Pattern.compile(lastNamePattern);
        Matcher matcher=pattern.matcher(lastName);
        if(matcher.matches()){
            return true;
        }
        return false;
    }


}
