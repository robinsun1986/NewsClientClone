package com.example.qianlong.utils;




import android.app.Dialog;
import android.content.Context;

/**
 * dialog utility class
 * 
 */
public class DialogUtil {


	/**
	 * create progress dialog
	 * @param context
	 * @param content
	 * @return
	 */
	public static Dialog createProgressDialog(Context context,String content){
		return new CustomProgressDialog(context, content);
	}
	
}
