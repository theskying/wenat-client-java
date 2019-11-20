package cn.wenat.common;

import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 常量
 *
 */
public class InfoConstant {

    /**
     * 敏感信息常量
     */
    public enum SensitiVeData{
        QQ_INFO("QQ群");

        String value;

        /**
         * 返回敏感信息列表
         * @return
         */
        public static List<String> getList() {
            List<String> list = new ArrayList<>();
            for (SensitiVeData data : SensitiVeData.values()) {
                list.add(data.getValue());
            }
            return list;
        }

        SensitiVeData(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}
