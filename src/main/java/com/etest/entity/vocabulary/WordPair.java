package com.etest.entity.vocabulary;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document
public class WordPair extends BasicEntity {

    private Word original;

    private Word translation;

    private List<Word> allTranslations;

    public Word getOriginal() {
        return original;
    }

    public void setOriginal(Word original) {
        this.original = original;
    }

    public Word getTranslation() {
        return translation;
    }

    public void setTranslation(Word translation) {
        this.translation = translation;
    }

    public List<Word> getAllTranslations() {
        return allTranslations;
    }

    public void setAllTranslations(List<Word> allTranslations) {
        this.allTranslations = allTranslations;
    }
}
