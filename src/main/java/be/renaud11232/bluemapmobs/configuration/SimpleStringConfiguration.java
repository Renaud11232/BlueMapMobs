package be.renaud11232.bluemapmobs.configuration;

public class SimpleStringConfiguration extends AbstractConfiguration<String> implements StringConfiguration {
    public SimpleStringConfiguration(String key, String defaultValue) {
        super(key, defaultValue);
    }
}
