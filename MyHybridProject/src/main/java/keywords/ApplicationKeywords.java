package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationKeywords extends ValaditionKeyword //call all class methods like that
{
	public ApplicationKeywords() throws Exception
	{ //in this constructor we create object
	    mainProp= new Properties();
	    childProp=new Properties();
	    orProp=new Properties();  //in this constructor now initialize
	    
	    try
	    {
			fis=new FileInputStream(projectpath+"/src/test/resources/environment.properties");
			mainProp.load(fis);
		    String e = mainProp.getProperty("env");
		    
		    fis=new FileInputStream(projectpath+"/src/test/resources/"+e+".properties");
		    childProp.load(fis);
		    
		    fis=new FileInputStream(projectpath+"/src/test/resources/or.properties");
		    orProp.load(fis);
		    
		} 
	    catch (FileNotFoundException e) 
	    {
			e.printStackTrace();
		}
	    
	    
	    
		
	}
	public void login()//if we create object for application class then gene...,valid...,appl...functinality  every calls we can call
	{
		
	}
	public void selectDataFromCalander()
	{
		
	}

}
