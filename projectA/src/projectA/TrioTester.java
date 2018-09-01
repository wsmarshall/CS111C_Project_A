package projectA;
import java.util.ArrayList;


public class TrioTester {

	public static void main(String[] args) {

		Trio<Integer> numberTrio = new Trio<Integer>(3, 4, 5);
		/* 
		 * un-comment the line of code below and it should cause a compiler error because trio1 should only accept Strings
		 */
		//numberTrio.setItem2("apple");
		
		System.out.println("***TESTING TOSTRING METHOD***");
		System.out.println("Should print a text representation:");
		System.out.println(numberTrio);
		
		System.out.println("\n***TESTING GETTERS AND SETTERS METHOD***");
		System.out.println("Item 1 should be 3: " + numberTrio.getItem1());
		System.out.println("Item 2 should be 4: " + numberTrio.getItem2());
		System.out.println("Item 3 should be 5: " + numberTrio.getItem3());
		numberTrio.setItem1(6);
		numberTrio.setItem2(7);
		numberTrio.setItem3(8);
		System.out.println("Item 1 should be 6: " + numberTrio.getItem1());
		System.out.println("Item 2 should be 7: " + numberTrio.getItem2());
		System.out.println("Item 3 should be 8: " + numberTrio.getItem3());	
			
		System.out.println("\n***TESTING HASDUPLICATES METHOD***");				
		System.out.println("Trio contains duplicates? false: " + numberTrio.hasDuplicates());
		numberTrio.setItem2(6);
		System.out.println("Trio contains duplicates? true: " + numberTrio.hasDuplicates());
		numberTrio.setItem3(6);
		System.out.println("Trio contains duplicates? true: " + numberTrio.hasDuplicates());
		
		System.out.println("\n***TESTING CONTAINS METHOD***");
		numberTrio.setItem1(0);
		numberTrio.setItem2(2);
		numberTrio.setItem3(3);
		System.out.println("Trio contains how many 1s? 0: " + numberTrio.contains(1));
		numberTrio.setItem1(1);
		System.out.println("Trio contains how many 1s? 1: " + numberTrio.contains(1));
		numberTrio.setItem2(1);
		System.out.println("Trio contains how many 1s? 2: " + numberTrio.contains(1));
		numberTrio.setItem3(1);
		System.out.println("Trio contains how many 1s? 3: " + numberTrio.contains(1));
		
		Trio<String> wordTrio = new Trio<String>("hello");
		wordTrio.setItem2("goodbye");
		wordTrio.setItem3("nice knowing you");
		/* 
		 * un-comment the line of code below and it should cause a compiler error because wordTrio should only accept Strings
		 */
		//wordTrio.setItem2(3);

		
		System.out.println("\n***TESTING CONTAINS METHOD***");			
		String testString1 = new String("hello");
		String testString2 = new String("HELLO");
		System.out.println("Trio contains how many hello? 1: " + wordTrio.contains(testString1));
		System.out.println("Trio contains how many HELLO? 0: " + wordTrio.contains(testString2));

		System.out.println("\n***TESTING EQUALS METHOD***");		
		Trio<Integer> numberTrio2 = new Trio<Integer>(5, 6, 8);
		Trio<Integer> numberTrio3 = new Trio<Integer>(8, 5, 6);
		System.out.println("Trios the same? true: " + numberTrio2.equals(numberTrio3));
		numberTrio2.setItem2(5);
		System.out.println("Trios the same? false: " + numberTrio2.equals(numberTrio3));
		System.out.println("Trios the same? false: " + numberTrio2.equals(wordTrio));
		System.out.println();
		Trio<Integer> numberTrio4 = new Trio<Integer>(1, 1, 2);
		Trio<Integer> numberTrio5 = new Trio<Integer>(1, 2, 2);
		System.out.println("Trios the same? false: " + numberTrio4.equals(numberTrio5));
		
		System.out.println("\n***TESTING COMPARETO METHOD***");
		Trio<Integer> numberTrio6 = new Trio<Integer>(5, 6, 8);
		Trio<Integer> numberTrio7 = new Trio<Integer>(7, 2, 5);
		System.out.println("Trio6 is larger (the minimum 5 is larger than the minimum 2)- should be a positive number: " + numberTrio6.compareTo(numberTrio7));
		Trio<Integer> numberTrio8 = new Trio<Integer>(9, 8, 1);
		Trio<Integer> numberTrio9 = new Trio<Integer>(2, 8, 3);
		System.out.println("Trio8 is smaller (the minimum 1 is smaller than the minimum 2)- should be a negative number: " + numberTrio8.compareTo(numberTrio9));
		Trio<Integer> numberTrio10 = new Trio<Integer>(4, 6, 2);
		Trio<Integer> numberTrio11 = new Trio<Integer>(2, 3, 7);
		System.out.println("Trio10 is not smaller or larger (the minimum 2 is the same as the minimum 2)- should be 0: " + numberTrio10.compareTo(numberTrio11));
		Trio<Integer> numberTrio12 = new Trio<Integer>(1, 1, 4);
		Trio<Integer> numberTrio13 = new Trio<Integer>(2, 2, 3);
		System.out.println("Trio12 is smaller (the minimum 1 is smaller than the minimum 2)- should be a negative number: " + numberTrio12.compareTo(numberTrio13));
		
		
	}

}
