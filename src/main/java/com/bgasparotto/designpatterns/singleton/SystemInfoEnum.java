package com.bgasparotto.designpatterns.singleton;

/**
 * {@code Singleton} example using the preferred implementation backed by an enum.
 */
public enum SystemInfoEnum {
    INSTANCE;

    private String systemName = System.getProperty("os.name");
    private String javaVersion = System.getProperty("java.version");

    public String getSystemName() {
        return systemName;
    }

    public String getJavaVersion() {
        return javaVersion;
    }
}