package org.javacream.training.maven.msg.simplejava;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
	@Test public void testLang3(){
		Assert.assertSame("org.apache.commons.lang3.SerializationUtils", new Demo().lang3());
	}
	@Test public void testDigester3(){
		Assert.assertSame("org.apache.commons.digester3.Digester", new Demo().digester3());
	}
}
