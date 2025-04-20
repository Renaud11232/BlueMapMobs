package be.renaud11232.bluemapmobs.configuration.impl;

import be.renaud11232.bluemapmobs.configuration.AbstractConfiguration;
import be.renaud11232.bluemapmobs.configuration.DoubleConfiguration;

public class SimpleDoubleConfiguration extends AbstractConfiguration<Double> implements DoubleConfiguration {
    public SimpleDoubleConfiguration(String key) {
        super(key);
    }
}
