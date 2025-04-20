package be.renaud11232.bluemapmobs.configuration.impl;

import be.renaud11232.bluemapmobs.configuration.AbstractConfiguration;
import be.renaud11232.bluemapmobs.configuration.IntegerConfiguration;

public class SimpleIntegerConfiguration extends AbstractConfiguration<Integer> implements IntegerConfiguration {
    public SimpleIntegerConfiguration(String key) {
        super(key);
    }
}
