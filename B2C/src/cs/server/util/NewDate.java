
package cs.server.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


import org.springframework.stereotype.Component;


/******************************************************************************************
 * ���賊�撌亙
 * @author leo 
 ******************************************************************************************/
@Component("NewDate")
public class NewDate {
	
	/******************************************************************************************
	 * �� �桀���(1)
	 * @return Timestamp �桀���
	 * @author leo 
	 ******************************************************************************************/
	public static Timestamp getTime() {
		Date date = new Date();
	    String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	    java.sql.Timestamp time = Timestamp.valueOf(nowTime);
		return time;
	}
	
	/******************************************************************************************
	 * �� �桀���(2)
	 * @return String �桀���
	 * @author leo 
	 ******************************************************************************************/
	public static String getDate() {
		Date date = new Date();
	    String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		return nowTime;
	}
	
	
	/******************************************************************************************
	 * �斗�臬���唬�
	 * @param String userId
	 * @param String server
	 * @return int  0:頞�鈭� 1:����
	 * @author leo 
	 ******************************************************************************************/
	public static int timeUp(String lastTime) {
		Date date = new Date();
	    String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);   
		return compare(lastTime,nowTime);
	}
	
	
	/*******************************************************************************************
	 * ��瘥�
	 * @param date1
	 * @param date2
	 * @return 0 銵函內�貊�嚗���0 銵函內 date1 撠 date2嚗之��0 銵函內 date1 憭扳 date2 
	 ******************************************************************************************/
	public static int compare(String date1, String date2) {
		int timeUp=0;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		try {
			c1.setTime(df.parse(date1));
			c2.setTime(df.parse(date2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if(c1.compareTo(c2)>0){ // 0 銵函內�貊�嚗���0 銵函內 date1 撠 date2嚗之��0 銵函內 date1 憭扳 date2 
			timeUp=1;
		}
		return timeUp;
	}
	
	/*******************************************************************************************
	 * ��瘥�
	 * @param date1
	 * @param date2
	 * @return 0 銵函內�貊�嚗���0 銵函內 date1 撠 date2嚗之��0 銵函內 date1 憭扳 date2 
	 ******************************************************************************************/
	public static String parser(String date1) {

		String l="0";
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		if(date1!=null){
			java.sql.Timestamp timestamp1 = Timestamp.valueOf(date1);
			l = String.valueOf(timestamp1.getTime());
		}		
		return l;

	}
	
	/******************************************************************************************
	 * Timestamp 頧�摮葡
	 * @param timestamp
	 * @return
	 ******************************************************************************************/
	public static String timestampToString(Timestamp timestamp) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(timestamp);
	}
	
	/******************************************************************************************
	 * ���曉��������(憭押�����敺��唳���
	 * @param int timeD  憭�
	 * @param int timeH  撠�
	 * @param int timeM  ��
	 * @return String ��銝�
	 * @author leo 
	 ******************************************************************************************/
	public static String timeLimit(int timeD, int timeH, int timeM) {
		Calendar c = Calendar.getInstance();
//		c.add(Calendar.YEAR, -2); // �桀���皜�撟�
//		c.add(Calendar.MONTH, 1); // �桀�������
//		c.add(Calendar.DAY_OF_WEEK, 3); // �桀�����3憭�
//		c.add(Calendar.HOUR, 3); // �桀�����撠�
//		c.add(Calendar.MINUTE, 4);// �桀�������
//		c.add(Calendar.SECOND, 6);// �桀�����蝘�
		c.add(Calendar.MINUTE, timeM);// �桀�������
		c.add(Calendar.HOUR, timeH); // �桀�����撠�
		c.add(Calendar.DAY_OF_WEEK, timeD); // �桀�����3憭�
//		long l = c.getTimeInMillis();
//		return String.valueOf(l);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		
		return df.format(c.getTime());	
	}
	
	
	/******************************************************************************************
	 * 銋��餃�������虫�璅�
	 * @param String lastLoginTime
	 * @param int flag 0:���詨� 
	 * @return
	 ******************************************************************************************/
	public static String compareLoginTime(String lastLoginTime) {

		String today ="0";
		try {
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			Date lastDate = sdf.parse(lastLoginTime);
			Calendar lastLogin = Calendar.getInstance(); 
			lastLogin.setTime(lastDate); 	
			int lastYear =lastLogin.get(lastLogin.YEAR);
			int lastMonth=lastLogin.get(lastLogin.MONTH)+1;
			int lastDay =lastLogin.get(lastLogin.DAY_OF_MONTH);
	
			Calendar now = Calendar.getInstance();		
			int nowYear =now.get(now.YEAR);
			int nowMonth=now.get(now.MONTH)+1;
			int nowDay =now.get(now.DAY_OF_MONTH);
			
			if(lastYear<=nowYear || lastMonth<=nowMonth || lastDay<nowDay){
				today = nowMonth+"/"+nowDay;
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return today;
	}
	
	/******************************************************************************************
	 * �嗆�隞�憭拇
	 * @param String lastLoginTime
	 * @param ArrayList<Integer> dayList �嗆�隞賢�典予�貊�Array
	 * @return
	 ******************************************************************************************/
	public static ArrayList<Integer> getDayOfMonth(String lastLoginTime) {
		int num=0;
		ArrayList<Integer> dayList = new ArrayList<Integer>();
		Calendar cal = Calendar.getInstance();
		num = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1; i<=num; i++){
			dayList.add(0);
		}
		return dayList;
	}
	
	
	/******************************************************************************************
	 * 閮��拚���
	 * @param String time (銝活�儔AP��)
	 * @param int spacing ����(��)
	 * @return JSONObject  甈⊥嚗����
	 * @author leo 
	 ******************************************************************************************/
	/*public static JSONObject getTime(String lastTime, int spacing) {
		JSONObject jso = new JSONObject();
		long spacingTime = 0;
		int value =0;
		Timestamp timestamp1 = Timestamp.valueOf(lastTime);
		
		Date date = new Date();
	    String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	    Timestamp timestamp2 = Timestamp.valueOf(nowTime);
	    
	    spacingTime = timestamp2.getTime() - timestamp1.getTime() ;
	    value = (int)(spacingTime / (spacing * 60000));   // spacing * 60000 = ��(�箸)
	    
	    jso.put("value", value);
	    jso.put("time", nowTime);
	    
		return jso;
	}
	*/
	
	public static String DateConvertToString(Date date)
	{
		String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		return nowTime ;
	}
	
	public static Date StringConvertToDate(String Date)
	{
		Date convert = new Date();
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			convert = sdf.parse(Date);
		}catch(Exception ex )
		{
			ex.printStackTrace();
		}
		
		return convert;
	}
	
	public static int isOverOneDay(String logindate ,  String systemdate)
	{
		long cha = 0 ;
		double result = 0 ;
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date end = sdf.parse(systemdate);
			Date start = sdf.parse(logindate);
			cha = end.getTime() - start.getTime();
			result = cha * 1.0 / (1000 * 60 * 60);

		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		if (result <= 24) {
			return 1;
		} else if(result >=48){
			return 2;
		}else
			return 0;
	}
}
