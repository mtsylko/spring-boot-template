package com.etest.entity.vocabulary;

import com.etest.entity.BasicEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "word_pair")
public class WordPair extends BasicEntity {

    private Word original;

    private Word translation;


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


}
