package com.bgasparotto.designpatterns.singleton;

/**
 * <p> Client class for {@code SystemInfo} testing.
 *
 * <p> This class has a {@code main} method in order to run code for studying purposes, it shouldn't be taken as a
 * reference for object-oriented paradigm besides the design pattern demonstration.
 */
public class SystemClient {
    public static void main(String[] args) throws Exception {

        // Instantiate both versions of the Singleton's implementation.
        SystemInfo classInstance = SystemInfo.getInstance();
        SystemInfoEnum enumInstance = SystemInfoEnum.INSTANCE;

        // Prints the returning values from the class' singleton.
        System.out.println("Class: " + classInstance.getSystemName());
        System.out.println("Class: " + classInstance.getJavaVersion());

        // Prints the returning values from the enum's singleton.
        System.out.println("Enum: " + enumInstance.getSystemName());
        System.out.println("Enum: " + enumInstance.getJavaVersion());
    }
}