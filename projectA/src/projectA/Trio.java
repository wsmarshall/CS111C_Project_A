/** Trio.java
 *      an object which holds 3 items, using generic typing
 *      
 *      written by Warren Singh and William Ye
 *     
 *      version 1.1
 *      
 *      since 2018/08/28
 * 
 */

package projectA;

public class Trio<T extends Comparable<? super T>> implements Comparable<Trio <T>> {
	//instance variable declarations
	private T item1, item2, item3;
	
	//constructor for 3 parameters provided, initializes all instance variables
	public Trio(T first, T second, T third) {
		this.item1 = first;
		this.item2 = second;
		this.item3 = third;
	} //constructor for only 1 parameter provided, initializes all instance variables to the same thing
	public Trio(T only) {
		this.item1 = only;
		this.item2 = only;
		this.item3 = only;	
	}
	
	//getters and setters for all instance variables contained herein
	public T getItem1() {
		return item1;
	}
	public T getItem2() {
		return item2;
	}
	public T getItem3() {
		return item3;
	}
	
	public void setItem1(T thing) {
		this.item1 = thing;
	}
	public void setItem2(T thing) {
		this.item2 = thing;
	}
	public void setItem3(T thing) {
		this.item3 = thing;
	}
	
	//override of toString; returns a string representation of this object
	@Override
	public String toString() {
		String thisItem = "This item is a trio, containing: " + item1.toString() + ", " + item2.toString() + ", and " + item3.toString() + ".";
		return thisItem;
	}
	
	//returns an integer count of how many times this Trio contains instances of the argument provided
	public int contains(T item) {
		int itemCount = 0;
		if(this.item1.equals(item)) {
			itemCount++;
		}
		if(this.item2.equals(item)) {
			itemCount++;
		}
		if(this.item3.equals(item)) {
			itemCount++;
		}
		return itemCount;
	}
	
	//returns a boolean indicating whether or not at least 2 items of this Trio object are effectively equivalent
	public boolean hasDuplicates() {
		boolean hasDupes = false;
		if (item1.equals(item2)) {
			hasDupes = true;
		}
		if (item1.equals(item3)) {
			hasDupes = true;
		}
		if (item2.equals(item3)) {
			hasDupes = true;
		}
		return hasDupes;
	}
	
	//overrides the Object equals method; returns a boolean used to compare 2 Trio objects, this one, and one provided as an argument
	@Override 
	public boolean equals (Object otherTrio) {
		boolean trioEquals = false;
		if(otherTrio instanceof Trio<?>) {
			Trio<?> other = (Trio<?>) otherTrio;
			if(this.item1.equals(other.item1)) {
				if(this.item2.equals(other.item2)) {
					if(this.item3.equals(other.item3)) {
						trioEquals = true;
					}
				}
				if(this.item2.equals(other.item3)) {
					if(this.item3.equals(other.item2)) {
						trioEquals = true;
					}
				}
			}
			if(this.item1.equals(other.item2)) {
				if(this.item2.equals(other.item3)) {
					if(this.item3.equals(other.item1)) {
						trioEquals = true;
					}
				}
				if(this.item2.equals(other.item1)) {
					if(this.item3.equals(other.item3)) {
						trioEquals = true;
					}
				}
			}
			if(this.item1.equals(other.item3)) {
				if(this.item2.equals(other.item1)) {
					if(this.item3.equals(other.item2)) {
						trioEquals = true;
					}
				}
				if(this.item2.equals(other.item2)) {
					if(this.item3.equals(other.item1)) {
						trioEquals = true;
					}
				}
			}
		}else {
			return false;
		}
		return trioEquals;
	}
	
	//overrides compareTo, compares the minimum of this Trio to the minimum of the other
	@Override
	public int compareTo (Trio<T> otherTrio) {
		T thisMin;
		T thatMin;
		if(findMin(this) == 1) {
			thisMin = this.getItem1();
		}else if(findMin(this) == 2) {
			thisMin = this.getItem2();
		}else if(findMin(this) == 3) {
			thisMin = this.getItem3();
		}else {
			thisMin = null;
		}
		
		if(findMin(otherTrio) == 1) {
			thatMin = otherTrio.getItem1();
		}else if(findMin(otherTrio) == 2) {
			thatMin = otherTrio.getItem2();
		}else if(findMin(otherTrio) == 3) {
			thatMin = otherTrio.getItem3();
		}else {
			thatMin = null;
		}
		
		//debugging line
//		System.out.println(thisMin + " " + thatMin);
		return thisMin.compareTo(thatMin);	
		
	}
	
	//private helper function to find the minimum value of any trio that calls it
	private int findMin(Trio<T> thing){
		int marker = 0;
		int min12 = 0;
		int min13 = 0;
		int min23 = 0;
		if(thing.item1.compareTo(thing.item2) == -1) {
			min12 = -1;
		}else if(thing.item1.compareTo(thing.item2) == 1) {
			min12 = 1;
		}else {
			min12 = 0;
		}
		if(thing.item1.compareTo(thing.item3) == -1) {
			min13 = -1;
		}else if(thing.item1.compareTo(thing.item3) == 1) {
			min13 = 1;
		}else {
			min13 = 0;
		}
		if(thing.item2.compareTo(thing.item3) == -1) {
			min23 = -1;
		}else if(thing.item2.compareTo(thing.item3) == 1) {
			min23 = 1;
		}else {
			min23 = 0;
		}
		
		if((min12 == -1) && (min13 == -1)) {
			marker = 1;
		}
		if((min12 == -1) && (min13 == 1)) {
			marker = 3;
		}
		if((min12 == 1) && (min13 == -1)) {
			marker = 2;
		}
		if(((min12 == 1) && (min13 == 1)) && (min23 == -1)) {
			marker = 2;
		}
		if(((min12 == 1) && (min13 == 1)) && (min23 == 1)) {
			marker = 3;
		}
		
		if((min12 == 0) && (min13 == 0)) {
			marker = 1;
		}
		if((min12 == 0) && (min23 == -1)) {
			marker = 1;
		}
		if((min13 == 0) && (min23 == -1)) {
			marker = 2;
		}
		if((min13 == 0) && (min23 == 1)) {
			marker = 1;
		}
	return marker;
	}
}
