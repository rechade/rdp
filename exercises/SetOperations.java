// RDP196
// http://www.reddit.com/r/dailyprogrammer/comments/2rfae0/20150105_challenge_196_practical_exercise_ready/
package net.gusto.rdp.exercises;
import java.util.*;

public class RDPSet {	
	private Collection rdpSet = new ArrayList();	
	public void add(int i) {
		rdpSet.add(i);
	}
	boolean contains(int i) {
		if (rdpSet.contains(i)) {
			return true;
		} else {
			return false;		
		}
	}	
	public static void main (String[] args) {
	}
}