package com.alocotos.designpatterns.proxy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TwitterDemo {
	
	public static void main(String[] args) throws IOException {
		
		//Attempting to hide API key info for my Twitter dmeo app.
		Properties props = new Properties();
		String propFileName = "config.properties";
		String TwiConsKey = "";
		String TwiSecKey = "";
		String TwiAccTok = "";
		String TwiAccSecTok = "";
		
		try {
			FileInputStream ip= new FileInputStream(propFileName);
			props.load(ip);
			TwiConsKey = props.getProperty("TwiConsKey");
			TwiSecKey = props.getProperty("TwiSecKey");
			TwiAccTok = props.getProperty("TwiAccTok");
			TwiAccSecTok = props.getProperty("TwiAccSecTok");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Creates a Proxy Instance of the TwitterServicerImp. This make all TwitterService method calls go through 
		//the proxy's invoke method.
		TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl(TwiConsKey, TwiSecKey, TwiAccTok, TwiAccSecTok));
		
		System.out.println(service.getTimeline("BarackObama"));
		
		//Looking at our SecurityProxy we control how the invoke method executes and can filter this method.
		service.postToTimeline("BarackObama", "Some Tweet that should not be posted.");
		
	}

}
