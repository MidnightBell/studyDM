package per.zs.studyDM.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import per.zs.studyDM.exception.CustomException;

/** 
* Create time 2020年4月24日 下午1:07:55 
* @author sheng.zhong 
* @Description  时间及日期工具类
*/
public class DateUtil {
	
	/**
	 * 将日期格式转为yyyy-dd-MM形式的字符串
	 * @param date
	 * @return
	 */
	public static String dateToString1(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return date == null?"":dateFormat.format(date);
	}
	
	/**
	 * 将yyyy-dd-MM形式的字符串转为日期格式
	 * @param dateStr
	 * @return
	 * @throws ParseException 
	 */
	public static Date stringToDate1(String dateStr) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
            return StringUtils.isEmpty(dateStr)?null:dateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new CustomException(dateStr+"转换日期失败");
        }
	}
	
	/**
	 * 将日期格式转为yyyy-dd-MM HH:mm:ss形式的字符串
	 * @param date
	 * @return
	 */
	public static String dateToString2(Date date) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return date == null?"":timeFormat.format(date);
	}
	
	/**
	 * 将yyyy-dd-MM HH:mm:ss形式的字符串转为日期格式
	 * @param dateStr
	 * @return
	 * @throws ParseException 
	 */
	public static Date stringToDate2(String dateStr)  {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
            return StringUtils.isEmpty(dateStr)?null:dateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new CustomException(dateStr+"转换日期失败");
        }
	}
}
