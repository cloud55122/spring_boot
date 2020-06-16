package com.wdpr.bussvcs.payment.hub.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {
	
	static DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
	
	public static Date stringToDate(String dateString) {
		Date date = null;
		try {
			date = format.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			try {
				date = format2.parse(dateString);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return date;
	}
	
	public static Date stringToDate(String dateString, DateFormat format) {
		Date date = null;
		try {
			date = format.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	public static XMLGregorianCalendar dateToXMLGregorianCalendar(Date date) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);

		XMLGregorianCalendar xmlGregCal = null;
		try {
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlGregCal;
	}

	


}
