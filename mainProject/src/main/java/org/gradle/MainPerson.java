package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class MainPerson {
    private final String name;

    public MainPerson(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}
