package com.bgasparotto.designpatterns.singleton;

/**
 * {@code Singleton enum} containing the current system information such as the
 * operational system name and the java version.
 * 
 * @author Bruno Gasparotto
 *
 */
public enum SystemInfoEnum {
	INSTANCE;

	private String systemName = System.getProperty("os.name");
	private String javaVersion = System.getProperty("java.version");

	/**
	 * Gets the SystemInfoEnum's {@code systemName}.
	 *
	 * @return The SystemInfoEnum's {@code systemName}
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * Gets the SystemInfoEnum's {@code javaVersion}.
	 *
	 * @return The SystemInfoEnum's {@code javaVersion}
	 */
	public String getJavaVersion() {
		return javaVersion;
	}
}