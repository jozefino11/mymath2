package hu.komjozsef.mymath2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMath2Test {
@Test
public void testAddPosivite() {
	assertEquals(5, MyMath2.myAdd(3,2));
}

@Test
public void testAddNegative() {
	assertEquals(-6, MyMath2.myAdd(-3,-2));
}
}
