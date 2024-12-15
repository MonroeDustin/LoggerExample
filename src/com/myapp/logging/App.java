package com.myapp.logging;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Instantiate both logger classes
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test methods of AsteriskLogger
        System.out.println("Testing AsteriskLogger:");
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        // Test methods of SpacedLogger
        System.out.println("\nTesting SpacedLogger:");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");

	}

}
