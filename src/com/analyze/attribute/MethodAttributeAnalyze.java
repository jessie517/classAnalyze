package com.analyze.attribute;

import com.analyze.attribute.bean.*;
import com.analyze.constant.bean.ConstBean;
import com.utils.UToNumeric;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenjiaxu on 2017/10/27.
 */
public class MethodAttributeAnalyze extends AttributeAnalyze {

    @Override
    public AttributeInfoBean getAttributeBean(String attributeName, byte[] infoBytes, ConstBean[] constBeans) throws Exception {
        if ("Code".equals(attributeName)) {
            return new CodeAttributeBean(infoBytes, constBeans);
        } else if ("Exceptions".equals(attributeName)) {
            return new ExceptionAttributeBean(infoBytes);
        } else if ("RuntimeVisibleParameterAnnotations".equals(attributeName)) {

        } else if ("RuntimeInvisibleParameterAnnotations".equals(attributeName)) {

        } else if ("AnnotationDefault".equals(attributeName)) {

        } else if ("RuntimeVisibleAnnotations".equals(attributeName)) {

        } else if ("RuntimeInvisibleAnnotations".equals(attributeName)) {

        } else if ("Signature".equals(attributeName)) {
            return new SignatureAttributeBean(infoBytes);
        } else if ("Deprecated".equals(attributeName)) {
            return new DeprecatedAttributeBean(infoBytes);
        } else if ("Synthetic".equals(attributeName)) {
            return new SyntheticAttributeBean(infoBytes);
        } else {
            System.out.println(attributeName);
        }
        return null;
    }
}
