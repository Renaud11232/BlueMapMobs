package be.renaud11232.bluemapmobs.configuration;

public class SimpleDoubleConfiguration extends AbstractConfiguration<Double> implements DoubleConfiguration {
    public SimpleDoubleConfiguration(String key, Double defaultValue) {
        super(key, defaultValue);
    }
}
