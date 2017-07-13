package org.javacream.training.maven.msg.simplejava;

import org.apache.commons.digester3.Digester;
import org.apache.commons.lang3.SerializationUtils;


public class Demo {

	public void doSomething(){
		System.out.println("Hello World!!!");
	}

	public String lang3(){
		return SerializationUtils.class.getName();
	}
	public String digester3(){
		return Digester.class.getName();
	}
}
