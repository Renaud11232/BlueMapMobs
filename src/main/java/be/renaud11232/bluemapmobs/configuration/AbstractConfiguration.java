package be.renaud11232.bluemapmobs.configuration;

public abstract class AbstractConfiguration<T> implements TypedConfiguration<T> {
    private final String key;
    private final T defaultValue;

    public AbstractConfiguration(String key, T defaultValue) {
        this.key = key;
        this.defaultValue = defaultValue;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public T getDefaultValue() {
        return defaultValue;
    }
}
