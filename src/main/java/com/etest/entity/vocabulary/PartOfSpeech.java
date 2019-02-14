package com.etest.entity.vocabulary;

public enum PartOfSpeech {

    NOUN("N"),
    PRONOUN("PR"),
    ADJECTIVE("ADJ"),
    VERB("VERB"),
    ADVERB("V"),
    GERUND("GER"),
    PARTICIPLE("PRT");

    private String partOfSpeech;

    PartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }
}
