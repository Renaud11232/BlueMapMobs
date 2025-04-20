package be.renaud11232.bluemapmobs.configuration.impl;

import be.renaud11232.bluemapmobs.configuration.AbstractConfiguration;
import be.renaud11232.bluemapmobs.configuration.StringConfiguration;

public class SimpleStringConfiguration extends AbstractConfiguration<String> implements StringConfiguration {
    public SimpleStringConfiguration(String key) {
        super(key);
    }
}
