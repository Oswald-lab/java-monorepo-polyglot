package com.octiq.test.common;

public final class Strings {
    private Strings() { }

    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }
}
