package com.bgasparotto.designpatterns.singleton;

/**
 * A client class for {@code SystemInfo} testing.
 * 
 * @author Bruno Gasparotto
 *
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