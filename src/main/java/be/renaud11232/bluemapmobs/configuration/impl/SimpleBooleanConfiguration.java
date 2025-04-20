package be.renaud11232.bluemapmobs.configuration.impl;

import be.renaud11232.bluemapmobs.configuration.AbstractConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;

public class SimpleBooleanConfiguration extends AbstractConfiguration<Boolean> implements BooleanConfiguration {
    public SimpleBooleanConfiguration(String key) {
        super(key);
    }
}
