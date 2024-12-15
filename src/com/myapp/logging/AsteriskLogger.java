package com.myapp.logging;


public class AsteriskLogger implements Logger {

    //@Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    //@Override
    public void error(String message) {
        String errorMessage = "ERROR: " + message;
        String border = "*".repeat(errorMessage.length() + 6);
        System.out.println(border);
        System.out.println("***" + errorMessage + "***");
        System.out.println(border);
    }
}
