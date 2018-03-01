package com.knightwars.knightwars.domain;

import org.springframework.stereotype.Component;

@Component
public class Castle {

    private String name;

    public Castle() {
    }

    public Castle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
