package be.renaud11232.bluemapmobs.configuration;

public class SimpleBooleanConfiguration extends AbstractConfiguration<Boolean> implements BooleanConfiguration {
    public SimpleBooleanConfiguration(String key, Boolean defaultValue) {
        super(key, defaultValue);
    }
}
