package com.analyze.attribute.bean;

import com.analyze.constant.bean.ConstBean;

/**
 * Created by chenjiaxu on 2017/10/28.
 */
public class ConstantValueAttributeBean implements AttributeInfoBean {
    private int constantValueIndex;

    public ConstantValueAttributeBean(byte[] infoBytes) {
        this.constantValueIndex = (infoBytes[0] & 0xFF) << 8 | (infoBytes[1] & 0xFF);
    }

    public String toString(ConstBean[] constBeans) {
        return constBeans[constantValueIndex].getValue().toString();
    }
}
