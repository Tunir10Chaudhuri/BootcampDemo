package com.telstrabootcamp.testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class TestingModuleDemo {

	@Before
	public void beforetestingmethod()
	{
		ModuleDemo md=new ModuleDemo();
		Assert.assertEquals(0,md.getCharges(md.getLevel(-99)));
	}
	
	@Test
	public void testingmethod()
	{
		ModuleDemo md=new ModuleDemo();
		Assert.assertEquals(100,md.getCharges(md.getLevel(0)));
		Assert.assertEquals(100,md.getCharges(md.getLevel(1)));
		Assert.assertEquals(500,md.getCharges(md.getLevel(2)));
		Assert.assertEquals(500,md.getCharges(md.getLevel(3)));
		Assert.assertEquals(2000,md.getCharges(md.getLevel(4)));
		Assert.assertEquals(2000,md.getCharges(md.getLevel(5)));
	}
	
	@Test
	public void testingmethod2()
	{
		ModuleDemo md=new ModuleDemo();
		Assert.assertEquals(55,md.convertIntoHundred(5,5));
		Assert.assertEquals("Your rating is rejected because it is invalid.",md.messageGenerate(11));
	}
	
	@After
	public void aftertestingmethod()
	{
		ModuleDemo md=new ModuleDemo();
		Assert.assertEquals(0,md.getCharges(md.getLevel(99)));
	}
}
