package com.zendesk.vinay.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    NEW("new"),
    OPEN("open"),
    PENDING("pending"),
    HOLD("hold"),
    SOLVED("solved"),
    CLOSED("closed"),
    DELETED("deleted");

    private String key;

    Status(String key) {
        this.key = key;
    }

    @JsonCreator
    public static Status fromString(String key) {
        return key == null
                ? null
                : Status.valueOf(key.toUpperCase());
    }

    @JsonValue
    public String getKey() {
        return key;
    }
}
