package com.zendesk.vinay.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Type {
    PROBLEM("problem"),
    INCIDENT("incident"),
    QUESTION("question"),
    TASK("task");

    private String key;

    Type(String key) {
        this.key = key;
    }

    @JsonCreator
    public static Type fromString(String key) {
        return key == null
                ? null
                : Type.valueOf(key.toUpperCase());
    }

    @JsonValue
    public String getKey() {
        return key;
    }
}
