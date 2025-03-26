package be.renaud11232.bluemapmobs;

public enum MarkerTypeVisibilityConfig {
    ;

    private final String key;
    private final boolean defaultValue;

    MarkerTypeVisibilityConfig(String key, boolean defaultValue) {
        this.key = key;
        this.defaultValue = defaultValue;
    }

    public String getKey() {
        return key;
    }

    public  boolean getDefaultValue() {
        return defaultValue;
    }
}
