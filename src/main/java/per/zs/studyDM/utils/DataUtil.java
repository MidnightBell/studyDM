package per.zs.studyDM.utils;

import java.util.UUID;

import com.google.common.base.CaseFormat;

/** 
* Create time 2020年8月25日 下午2:30:22 
* @author sheng.zhong 
* @Description  数据处理工具类
*/
public class DataUtil {
    /**
     * 驼峰字符串修改为下划线
     * @param orderBy 驼峰类型字符串
     * @return
     */
    public static String camelToLower(String orderBy) {
        String rt = "";
        rt = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, orderBy);
        return rt;
    }
    
     /**
      * 生成uuid
      * @return
      */
     public static String generateUUID() {
         return UUID.randomUUID().toString().replace("-", "").toLowerCase();
     }
     
}
