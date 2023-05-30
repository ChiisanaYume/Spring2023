package com.faintdream.spring6.bean;

import java.util.Properties;

public class MyProperties extends Properties {

    /**
     * Creates an empty property list with no default values.
     *
     * @implNote The initial capacity of a {@code Properties} object created
     * with this constructor is unspecified.
     */
    public MyProperties() {
    }

    /**
     * Creates an empty property list with the specified defaults.
     *
     * @param defaults the defaults.
     * @implNote The initial capacity of a {@code Properties} object created
     * with this constructor is unspecified.
     */
    public MyProperties(Properties defaults) {
        super(defaults);
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "defaults=" + defaults +
                '}';
    }
}
