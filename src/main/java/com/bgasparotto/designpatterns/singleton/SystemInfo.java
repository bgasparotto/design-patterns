package com.bgasparotto.designpatterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * {@code Singleton} example using a class as opposite to an enum.
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

    private SystemInfo() {
        if (SystemInfoHolder.INSTANCE != null) {
            throw new AssertionError("Can not instantiate.");
        }
    }

    /**
     * Returns the singleton instance instead of any deserialised object of this class.
     */
    private Object readResolve() throws ObjectStreamException {
        return SystemInfoHolder.INSTANCE;
    }

    /**
     * Gets the singleton instance of this class.
     */
    public static SystemInfo getInstance() {
        return SystemInfoHolder.INSTANCE;
    }

    public String getSystemName() {
        return systemName;
    }

    public String getJavaVersion() {
        return javaVersion;
    }
}