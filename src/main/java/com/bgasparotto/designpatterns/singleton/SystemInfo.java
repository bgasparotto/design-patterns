package com.bgasparotto.designpatterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * {@code Singleton} class containing the current system information such as the
 * operational system name and the java version.
 * 
 * @author Bruno Gasparotto
 *
 */
public final class SystemInfo implements Serializable {
	private static final long serialVersionUID = 2780033083469952344L;

	private transient String systemName = System.getProperty("os.name");
	private transient String javaVersion = System.getProperty("java.version");

	/**
	 * Private class to hold the lazy initialised singleton's instance.
	 */
	private static class SystemInfoHolder {
		private static final SystemInfo INSTANCE = new SystemInfo();
	}

	/**
	 * Constructor.
	 */
	private SystemInfo() {
		if (SystemInfoHolder.INSTANCE != null) {
			throw new AssertionError("Can not instantiate.");
		}
	}

	/**
	 * Returns the singleton instance instead of any deserialised object of this
	 * class.
	 * 
	 * @return The singleton instance of {@code SystemInfo}
	 * @throws ObjectStreamException
	 *             if a stream error occurs
	 */
	private Object readResolve() throws ObjectStreamException {
		return SystemInfoHolder.INSTANCE;
	}

	/**
	 * Gets the singleton instance of this class.
	 * 
	 * @return The unique instance of this class
	 */
	public static SystemInfo getInstance() {
		return SystemInfoHolder.INSTANCE;
	}

	/**
	 * Gets the SystemInfo's {@code systemName}.
	 *
	 * @return The SystemInfo's {@code systemName}
	 */
	public String getSystemName() {
		return systemName;
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