package org.jsp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean, DisposableBean 
{
	

//	static 
//	{
//		System.out.println("Demo class is loaded into memory");
//	}
//
//	public Demo()
//	{
//		System.out.println("Demo object is getting created");
//	}
	
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Demo is initialized");
	}

	public void destroy() throws Exception 
	{
		System.out.println("Demo is destroyed");
	}

}
