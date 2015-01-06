// RDP196
// http://www.reddit.com/r/dailyprogrammer/comments/2rfae0/20150105_challenge_196_practical_exercise_ready/
package net.gusto.rdp.exercises;
import java.util.*;

public class RDPSet implements Iterable<Integer>{
	private ArrayList rdpSet = new ArrayList<Integer>();
	public RDPSet(){}
	public RDPSet(Collection<Integer> c) {
		for (int i : c) {
			if (!contains(i)) {
				add(i);
			}
		}
	}
	public void add(int i) {
		if (!contains(i)) {
			rdpSet.add(i);
		}
	}
	public boolean contains(int i) {
		return rdpSet.contains(i);
	}
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
		  private int index = 0;
		  public boolean hasNext() {
			return index < rdpSet.size();
		  }
		  public Integer next() { return (Integer)rdpSet.get(index++); }
		  public void remove() { // Not implemented
			throw new UnsupportedOperationException();
		  }
		};
    }
    public static boolean isEqual(RDPSet s1, RDPSet s2) {
    	for (int i : s1) {
    		if (!s2.contains(i)) {
    			return false;
    		}
    	}
    	for (int i : s2) {
    		if (!s1.contains(i)) {
    			return false;
    		}
    	}
    	return true;
    }
	public String toString() {		
		Object[] al = rdpSet.toArray();
		Arrays.sort(al);
		return Arrays.toString(al);
	}	
    public static RDPSet union(RDPSet s1, RDPSet s2) {
    	RDPSet result = new RDPSet(s1.rdpSet);
		for (int i: s2) {
			result.add(i);
		}
		return result;
	}
	public static RDPSet intersection(RDPSet s1, RDPSet s2) {
    	RDPSet result = new RDPSet();
		for (int i: s2) {
			if(s1.contains(i)) {
				result.add(i);
			}
		}
		return result;
	}
	public static void main (String[] args) {
		RDPSet rdps = new RDPSet(Arrays.<Integer>asList(new Integer[]{7,10,9})); 
		System.out.println(rdps);
	}
}