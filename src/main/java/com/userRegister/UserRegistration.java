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

    public boolean checkMobileNumber(String mobileNumber) {
        String mobileNumberPattern="^[0-9]{2,2}[ ][7-9]{1,1}[0-9]{9}";
        Pattern pattern=Pattern.compile(mobileNumberPattern);
        Matcher matcher=pattern.matcher(mobileNumber);
        if(matcher.matches()){
            return true;
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
