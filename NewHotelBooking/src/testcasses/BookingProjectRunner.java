package testcasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class BookingProjectRunner
{
	public static void main(String[] args)
	{
		TestNG testng=new TestNG();
		
		XmlSuite mysuite=new XmlSuite();
		mysuite.setName("BookingSuite");
		
		List<XmlSuite>allsuite=new ArrayList<XmlSuite>();
		allsuite.add(mysuite);
		testng.setXmlSuites(allsuite);
		 
		//1st test
	    XmlTest CreatBookingTest=new XmlTest(mysuite);
		CreatBookingTest.setName("Creat New Booking Test - pay@hotel");
	    Map<String,String> parameters=new HashMap<String,String>();    //parameter have key &value so we go with hash map
		parameters.put("action" ,"pay@hotel");	
		CreatBookingTest.setParameters(parameters);
		
		//we have so many class so---
		List<XmlClass> testclasses=new ArrayList<XmlClass>();
		
		XmlClass testclass=new XmlClass("testcasses.BookingSearch");
		List<XmlInclude> methods=new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("searchHotel",1));
		methods.add(new XmlInclude("selectHotel",2));
		methods.add(new XmlInclude("enterGuestInfo",3));//these method i most set to the class 
		testclass.setIncludedMethods(methods);//now these class link to classes
		testclasses.add(testclass);
		
		testclass=new XmlClass("testcasses.PaymentManager");
		methods=new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("applyDiscount",1));
		methods.add(new XmlInclude("makePayment",2));
		testclass.setIncludedMethods(methods);
		testclasses.add(testclass);
	
		testclass=new XmlClass("testcasses.CustomerComunication");
		methods=new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("checkEmailVarification",1));
		methods.add(new XmlInclude("checkMobileVarification",2));
		testclass.setIncludedMethods(methods);
		testclasses.add(testclass);//this all class link to test
		
		CreatBookingTest.setXmlClasses(testclasses);
		
		testng.run();
		}

}
