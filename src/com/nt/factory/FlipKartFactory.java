package com.nt.factory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;
import com.nt.comp.Courier;
import com.nt.comp.FlipKart;
public class FlipKartFactory {
	private static Properties props;
	static {
		try {
		//locate Properties file
		InputStream is=new FileInputStream("src/com/nt/commans/input.properties");
		//load properties file content into java.util.Properties class obj
		props=new Properties();
		props.load(is);
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Static factory method having factory patter logic
		public static FlipKart getInstance(){
			try {
			//get Dependent class name (courier name)From Properties file (java.util.Properties class obj)
			String courierClassName=props.getProperty("courier.Type");
			//load and create dependent class obj
			Class c=Class.forName(courierClassName);
			//Courier courier=(Courier)c.newInstance();//Deprecated from java9
			Constructor cons[]=c.getDeclaredConstructors();
			Courier courier=(Courier)cons[0].newInstance();
	       //create target class obj
	         FlipKart fpkt=new FlipKart();
	       //assign dependent class obj to target class object
	          fpkt.setCourier(courier);
	          return fpkt;
			}
			catch(ClassNotFoundException cnf)
			{
				cnf.printStackTrace();
				return null;
			}
			catch(Exception e) {
				e.printStackTrace();
				return null;
			}
			}
}