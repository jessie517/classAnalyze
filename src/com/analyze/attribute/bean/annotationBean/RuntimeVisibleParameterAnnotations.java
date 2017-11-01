package com.analyze.attribute.bean.annotationBean;

import com.analyze.attribute.AnnotationsAnalyze;
import com.analyze.attribute.bean.AttributeInfoBean;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

/**
 * Created by chenjiaxu on 2017/11/1.
 */
public class RuntimeVisibleParameterAnnotations implements AttributeInfoBean {
    private AnnotationBean[] annotations;

    public RuntimeVisibleParameterAnnotations(byte[] infoBytes) throws Exception {
        int i = 0;
        int numAnnotations = (infoBytes[i++] & 0xFF);
        byte[] annotationBytes = Arrays.copyOfRange(infoBytes, i, infoBytes.length);
        this.annotations = new AnnotationsAnalyze().getAnnotations(numAnnotations, new ByteArrayInputStream(annotationBytes));
    }

    public AnnotationBean[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationBean[] annotations) {
        this.annotations = annotations;
    }
}