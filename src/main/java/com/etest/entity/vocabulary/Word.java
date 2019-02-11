package com.etest.entity.vocabulary;

import com.etest.entity.BasicEntity;
import com.etest.entity.vocabulary.Language;
import com.etest.entity.vocabulary.PartOfSpeech;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "word")
public class Word extends BasicEntity {

    private String word;

    private String definition;

    private Language language;

    private PartOfSpeech partOfSpeech;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }
}
