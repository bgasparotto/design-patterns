package com.bgasparotto.designpatterns.singleton;

/**
 * {@code Singleton} class containing the current system information such as the
 * operational system name and the java version.
 * 
 * @author Bruno Gasparotto
 *
 */
public class SystemInfo {
	private static SystemInfo instance;

	private String operationalSystemName;
	private String javaVersion;

	/**
	 * Constructor.
	 */
	private SystemInfo() {
		operationalSystemName = System.getProperty("os.name");
		javaVersion = System.getProperty("");
	}

	/**
	 * Gets the singleton instance of this class.
	 * 
	 * @return The unique instance of this class
	 */
	public static SystemInfo getInstance() {
		if (instance == null) {
			instance = new SystemInfo();
		}

		return instance;
	}

	/**
	 * Gets the SystemInfo's {@code operationalSystemName}.
	 *
	 * @return The SystemInfo's {@code operationalSystemName}
	 */
	public String getOperationalSystemName() {
		return operationalSystemName;
	}

	/**
	 * Gets the SystemInfo's {@code javaVersion}.
	 *
	 * @return The SystemInfo's {@code javaVersion}
	 */
	public String getJavaVersion() {
		return javaVersion;
	}
}