package com.etest.entity.vocabulary;

public enum Language {

    ENGLISH("EN"),
    GERMAN("DE"),
    FRENCH("FR"),
    SPANISH("ES"),
    RUSSIAN("RU");

    private String language;

    Language(String language) {
        this.language = language;
    }
}
