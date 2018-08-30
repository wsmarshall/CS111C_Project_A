package projectA;

public class Trio<T extends Comparable<? super T>> implements Comparable<Trio <T>> {
	private T itemOne, itemTwo, itemThree;
	
	public Trio(T first, T second, T third) {
		this.itemOne = first;
		this.itemTwo = second;
		this.itemThree = third;
	}
	public Trio(T only) {
		this.itemOne = only;
		this.itemTwo = only;
		this.itemThree = only;	
	}
	
	public T getFirst() {
		return itemOne;
	}
	public T getSecond() {
		return itemTwo;
	}
	public T getThird() {
		return itemThree;
	}
	
	public void setFirst(T thing) {
		//need to check item type of thing, it needs to match the other 2 of the Trio?
	}
	public void setSecond(T thing) {
		//same
	}
	public void setThird(T thing) {
		//same
	}
	
	@Override
	public String toString() {
		//code goes here
	}
	
	public int contains() {
		//needs argument as well as code
	}
	
	public boolean hasDuplicates() {
		//same
	}
	
	@Override 
	public boolean equals (T thing) {
		//your code here
	}
	
	@Override
	public int compareTo (Trio<T> otherTrio) {
		//needs code and filling out
		//nb should probably use a private helper method to find the smallest item in any Trio (per the hint on Canvas)
	
	}
}
