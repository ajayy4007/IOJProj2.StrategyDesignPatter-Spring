package com.nt.text;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.FlipKart;
public class StratgeyDpTest {
	public static void main(String[] args) {
		//Create IOC container 
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Target Class Object
		FlipKart fpkt=factory.getBean("fpkt",FlipKart.class);
		String result=fpkt.shopping(new String[] {"mangaoes","tamrind","suger canes"}, new float[] {900.0f,300.0f,100.0f});
		System.out.println(result);
	}
}
