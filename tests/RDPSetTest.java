package net.gusto.rdp.tests;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import net.gusto.rdp.exercises.*;
import java.util.Arrays;

public class RDPSetTest {
	@Test
	public void myAddContainsTest() {	
		RDPSet rdps = new RDPSet(); 
		rdps.add(2);
		rdps.add(4);
		rdps.add(6);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps.contains(2),true);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps.contains(4),true);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps.contains(6),true);
		org.junit.Assert.assertEquals("contains 5 failed ",rdps.contains(5),false);
	}	
	//@Test
	public void myConstructorTest() {		
		RDPSet rdps = new RDPSet(Arrays.<Integer>asList(new Integer[]{7,8,9})); 
		org.junit.Assert.assertEquals("contains 4 failed ",rdps.contains(2),false);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps.contains(4),false);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps.contains(6),false);
		org.junit.Assert.assertEquals("contains 5 failed ",rdps.contains(5),false);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps.contains(7),true);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps.contains(8),true);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps.contains(9),true);
	}	
	@Test
	public void myUnionTest() {		
		RDPSet rdps1 = new RDPSet(Arrays.<Integer>asList(new Integer[]{7,8,9})); 
		RDPSet rdps2 = new RDPSet(Arrays.<Integer>asList(new Integer[]{10,8,9})); 
		RDPSet rdps3 = RDPSet.union(rdps1,rdps2); 
		org.junit.Assert.assertEquals("contains 2 failed ",rdps3.contains(2),false);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps3.contains(4),false);
		org.junit.Assert.assertEquals("contains 6 failed ",rdps3.contains(6),false);
		org.junit.Assert.assertEquals("contains 5 failed ",rdps3.contains(5),false);
		org.junit.Assert.assertEquals("contains 7 failed ",rdps3.contains(7),true);
		org.junit.Assert.assertEquals("contains 8 failed ",rdps3.contains(8),true);
		org.junit.Assert.assertEquals("contains 9 failed ",rdps3.contains(9),true);
		org.junit.Assert.assertEquals("contains 10 failed ",rdps3.contains(10),true);
	}	
	@Test
	public void myIntersectionTest() {		
		RDPSet rdps1 = new RDPSet(Arrays.<Integer>asList(new Integer[]{7,8,9})); 
		RDPSet rdps2 = new RDPSet(Arrays.<Integer>asList(new Integer[]{10,8,9})); 
		RDPSet rdps3 = RDPSet.intersection(rdps1,rdps2); 
		org.junit.Assert.assertEquals("contains 2 failed ",rdps3.contains(2),false);
		org.junit.Assert.assertEquals("contains 4 failed ",rdps3.contains(4),false);
		org.junit.Assert.assertEquals("contains 6 failed ",rdps3.contains(6),false);
		org.junit.Assert.assertEquals("contains 5 failed ",rdps3.contains(5),false);
		org.junit.Assert.assertEquals("contains 7 failed ",rdps3.contains(7),false);
		org.junit.Assert.assertEquals("contains 8 failed ",rdps3.contains(8),true);
		org.junit.Assert.assertEquals("contains 9 failed ",rdps3.contains(9),true);
		org.junit.Assert.assertEquals("contains 10 failed ",rdps3.contains(10),false);
	}	
	@Test
	public void myIsEqualTest() {	
		RDPSet rdps1 = new RDPSet(Arrays.<Integer>asList(new Integer[]{7,8,9})); 
		RDPSet rdps2 = new RDPSet(Arrays.<Integer>asList(new Integer[]{10,8,9}));		 
		org.junit.Assert.assertEquals("isEqual failed ",RDPSet.isEqual(rdps1,rdps2), false);
			
		rdps1 = new RDPSet(Arrays.<Integer>asList(new Integer[]{7,8,9})); 
		rdps2 = new RDPSet(Arrays.<Integer>asList(new Integer[]{9,8,7}));		 
		org.junit.Assert.assertEquals("isEqual failed ",RDPSet.isEqual(rdps1,rdps2), true);
	}	
}