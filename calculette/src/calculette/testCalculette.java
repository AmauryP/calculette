package calculette;

import static org.junit.Assert.*;


import org.junit.Test;

public class testCalculette {
	Calculette c1 = new Calculette ();

	@Test
	public void testShouldReturn0() {
		assertEquals(0, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn1() {
	c1.click(1);
	assertEquals(1, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn6() {
	c1.click(6);
	assertEquals(6, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn8() {
	c1.click(8);
	c1.click("+");
	assertEquals(8, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn10() {
	c1.click(2);
	c1.click("+");
	c1.click(3);
	assertEquals(5, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn4() {
	c1.click(5);
	c1.click("-");
	c1.click(3);
	assertEquals(2, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn20() {
	c1.click(9);
	c1.click(9);
	c1.click("+");
	c1.click(5);
	assertEquals(104, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn516() {
	c1.click(5);
	c1.click(1);
	c1.click(2);
	c1.click("+");
	c1.click(4);
	assertEquals(516, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn99() {
	c1.click(5);
	c1.click(1);
	c1.click("+");
	c1.click(4);
	c1.click(8);
	assertEquals(99, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn28() {
	c1.click(3);
	c1.click(6);
	c1.click("-");
	c1.click(8);
	assertEquals(28, this.c1.resultat());
	}

	@Test
	public void testShouldReturn2988() {
	c1.click(3);
	c1.click(6);
	c1.click("*");
	c1.click(8);
	c1.click(3);
	assertEquals(2988, this.c1.resultat());
	}
	
	@Test
	public void testShouldReturn25() {
	c1.click(5);
	c1.click(0);
	c1.click("/");
	c1.click(2);
	assertEquals(25, this.c1.resultat());
	}
	
}
