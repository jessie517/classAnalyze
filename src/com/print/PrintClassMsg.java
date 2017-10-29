package com.print;

import com.analyze.ClassAnalyze;
import com.analyze.attribute.bean.AttributeInfoBean;
import com.analyze.constant.bean.ConstBean;
import com.analyze.field.bean.FieldBean;
import com.analyze.method.bean.MethodBean;

/**
 * Created by chenjiaxu on 2017/10/29.
 */
public class PrintClassMsg {
    public static void print(ClassAnalyze classAnalyze) {
        StringBuffer classMsgBuffer = new StringBuffer();

        classMsgBuffer.append("version: " + classAnalyze.getVersion() + "\n");

        ConstBean[] constBeans = classAnalyze.getConstBeans();

        classMsgBuffer.append(classAnalyze.getClassBasicMsg().toString(constBeans) + "\n");

        AttributeInfoBean[] classAttributes = classAnalyze.getClassAttributes();
        classMsgBuffer.append("classAttributes: " + "\n");
        for (int i = 0; i < classAttributes.length; i++) {
            classMsgBuffer.append("\t" + classAttributes[i].toString(constBeans) + "\n");
        }

        FieldBean[] fieldBeans = classAnalyze.getFieldBeans();
        classMsgBuffer.append("fieldBeans: " + "\n");
        for (int i = 0; i < fieldBeans.length; i++) {
            classMsgBuffer.append("\t" + fieldBeans[i].toString(constBeans) + "\n");
        }

        MethodBean[] methodBeans = classAnalyze.getMethodBeans();
        classMsgBuffer.append("methodBeans: " + "\n");
        for (int i = 0; i < methodBeans.length; i++) {
            classMsgBuffer.append("\t" + methodBeans[i].toString(constBeans) + "\n");
        }

        System.out.println(classMsgBuffer.toString());
    }
}