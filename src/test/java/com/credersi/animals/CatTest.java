package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void catFeeds () {
		Cat cat = new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
	}
	
	@Test
	public void catRunning () {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		cat.runs();		
		assertEquals(cat.isAlive(), false);
	}
	
	@Test
	public void catRunsEats () {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.isAlive(), false);
	}
	
}