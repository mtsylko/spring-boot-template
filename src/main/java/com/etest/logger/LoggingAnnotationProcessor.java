package com.etest.logger;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * Created by Max on 28.06.18.
 */
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class LoggingAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        annotations.stream().forEach(element -> {
            roundEnv.getElementsAnnotatedWith(element);
        });
        return false;
    }

}
