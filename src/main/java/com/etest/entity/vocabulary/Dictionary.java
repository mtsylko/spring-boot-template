package com.etest.entity.vocabulary;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dictionary extends BasicEntity {

    private TranslationDirection translationDirection;



}
