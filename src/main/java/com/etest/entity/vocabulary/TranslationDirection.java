package com.etest.entity.vocabulary;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TranslationDirection extends BasicEntity {

    private Language from;

    private Language to;

    public TranslationDirection(Language from, Language to) {
        this.from = from;
        this.to = to;
    }

    public Language getFrom() {
        return from;
    }

    public void setFrom(Language from) {
        this.from = from;
    }

    public Language getTo() {
        return to;
    }

    public void setTo(Language to) {
        this.to = to;
    }
}
