package com.zendesk.vinay.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Priority {
    URGENT("urgent"),
    HIGH("high"),
    NORMAL("normal"),
    LOW("low");

    private String key;

    Priority(String key) {
        this.key = key;
    }

    @JsonCreator
    public static Priority fromString(String key) {
        return key == null
                ? null
                : Priority.valueOf(key.toUpperCase());
    }

    @JsonValue
    public String getKey() {
        return key;
    }
}
