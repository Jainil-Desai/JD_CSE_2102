package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String pwd;
    private String username;
    private String email;

    public Password(String pwd, String username, String email) {
        this.pwd = pwd;
        this.username = username;
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public boolean validPassword() {

        if (pwd.length() < 8) {
            return false;
        }

        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).+$");
        Matcher matcher = pattern.matcher(pwd);
        if (!matcher.matches()) {
            return false;
        }

        if (pwd.toLowerCase().contains(username.toLowerCase()) || pwd.toLowerCase().contains(email.toLowerCase())) {
            return false;
        }

        return true;
    }
}