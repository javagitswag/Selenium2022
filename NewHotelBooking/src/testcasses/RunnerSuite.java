package testcasses;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class RunnerSuite
{

	public static <E> void main(String[] args)
	{
		TestNG testng = new TestNG();
		
		XmlSuite mysuite=new XmlSuite();
		mysuite.setName(" my suite");
		
		
		List<XmlSuite>allsuite=new ArrayList<XmlSuite>();
		allsuite.add(mysuite);
		testng.setXmlSuites(allsuite);
		
		XmlTest test=new XmlTest(mysuite);
		test.setName("login");
		
		List<XmlClass> classes =new ArrayList<XmlClass>();
		classes.add(new XmlClass("testcasses.Login"));
		test.setXmlClasses(classes);
		
		
		testng.run();

	}

}
