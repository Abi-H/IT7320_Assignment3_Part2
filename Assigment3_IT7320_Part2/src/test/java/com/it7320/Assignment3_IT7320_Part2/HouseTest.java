package com.it7320.Assignment3_IT7320_Part2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.it7320.Assigment3_IT7320_Part2.House;

public class HouseTest {
	
	House basicHouse, basicHouse1, basicHouse2, basicHouse3, deluxeHouse, customHouse, deluxeCustomHouse;
	int budget, basicPerMetre, deluxePerMetre, customPerMetre, deluxeCustomPerMetre;

	@Before
	public void setUp() throws Exception {
		basicPerMetre = 160;
		deluxePerMetre = 240;
		customPerMetre= 320;
		customPerMetre = 400;
		
//		basicHouse1 = new House(basicPerMetre, 1, 1, "basic");
//		basicHouse2 = new House(basicPerMetre, 2, 1, "basic");
//		basicHouse3 = new House(basicPerMetre, 3, 2, "basic");
		
		basicHouse = new House(basicPerMetre, 1, 1, "basic");
		
		deluxeHouse = new House(deluxePerMetre, 1, 1, "deluxe");
		
		customHouse = new House(customPerMetre,1, 1, "custom");
		
		deluxeCustomHouse = new House(deluxeCustomPerMetre, 1, 1, "deluxe custom");	
		
		budget = 250000;
	}

	@After
	public void tearDown() throws Exception {
		basicHouse = null;
		deluxeHouse = null;
		customHouse = null;
		deluxeCustomHouse = null;
	}

	@Test
	public void testWithinBudget() {
		assertTrue(basicHouse.withinBudget(budget));	
		assertTrue(deluxeHouse.withinBudget(budget));
		assertFalse(customHouse.withinBudget(budget));
		assertFalse(deluxeCustomHouse.withinBudget(budget));
	}
	
	@Test
	public void testBasicHouse() {
		
	}
	

}
