package org.javacream.training.maven.msg.simplejava;

import org.apache.commons.digester3.Digester;
import org.apache.commons.lang3.SerializationUtils;

/**
 * Eine simple Demo-Klasse
 * @author Rainer Sawitzki
 *
 */
public class Demo {

	/**
	 * Eine einfache Demo-Funktion
	 */
	public void doSomething(){
		System.out.println("Hello World!!!");
	}

	/**
	 * 
	 * @return Klassenname der lang3-Utility
	 */
	public String lang3(){
		return SerializationUtils.class.getName();
	}
	public String digester3(){
		return Digester.class.getName();
	}
}
