import java.util.Arrays;

public class Week04Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int subtraction = ages[ages.length-1]-ages[0];
		//Using length - 1 will give you the last element in the array, since it is a 0 based system, you can't use ages[8] because it would be out of bounds. 

//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		int[] ages2 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 

//i. Make sure that there are 9 elements of type int in this new array.  

//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		int subtraction2 = ages2[ages2.length-1]-ages[2];

//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		System.out.println("#1b: Result for first array: " + subtraction);
		System.out.println("#1b: Result for second array: " + subtraction2);
		System.out.println("#1b: Calling on 3rd index of first array: " + ages[2]);
		System.out.println("#1b: Calling on 3rd index of second array: " + ages2[2]);
		System.out.println("------------------------------------");
//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console
		int sum = 0; //I have to declare a new int to store as sum
		for (int age : ages) { //for each age in my array of ages, add to sum
			sum += age; 
		}
		int avg = sum / ages.length; //sum of all ages/number of elements in array
		System.out.println("#1C: " + avg);
		System.out.println("------------------------------------");
		
		
//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int numOfLetters = 0; //establishing a new element that will represent the number of letters
		for (String name : names) {
			numOfLetters += name.length();
		} int averageLengthOfName = numOfLetters / names.length;
		System.out.println("#2a: The average # of letters/name is: " + averageLengthOfName);
		System.out.println("------------------------------------");
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	 StringBuilder concatenatedNames = new StringBuilder();
		for (String name : names) { //for each name in the array of names
		concatenatedNames.append(name); //add name to the new array
		concatenatedNames.append(" "); //add a space 
	}System.out.println("#2b: Concatenated Names: " + concatenatedNames.toString()); 
	 System.out.println("------------------------------------");

//3. How do you access the last element of any array?
	 //You access the last element by taking the length and subtracting one
	 //i.e. array.length() - 1; 
	 System.out.println("#3: The last element in the array ages is: " + ages[ages.length - 1]);
	 System.out.println("------------------------------------");
	 
//4. How do you access the first element of any array?
	 //You access the first element by array[0] because arrays are counted starting with zero. 
	 System.out.println("#4: The first element in the array ages is: " + ages[0]);
	 System.out.println("------------------------------------");
	 
//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	 int[] nameLengths = new int[names.length];//creating a new array
	 for (int i = 0; i < names.length; i++) { //loop to iterate over the names
		 nameLengths[i] = names[i].length(); //adding the length to the new array
	 }System.out.println("#5: Name Lengths: " + Arrays.toString(nameLengths));
		System.out.println("------------------------------------");
		
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumOfLengths = 0; //name a new element for sum of lengths
		for (int l = 0; l < nameLengths.length; l++) { //iterate over the array
			sumOfLengths+=l; //adding 'l' to the int sum of lengths 
		}System.out.println("#6: Sum of all the elements: " + sumOfLengths);
		System.out.println("------------------------------------");
	
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	String word = "Hello"; //name the String
	int n = 3; //give value to the int
	String result = wordNTimes(word, n); //The resulting string will be using the method named wordNTimes, in which word is the String and n is the integer.
	System.out.println("#7: " +result); //printing the result outside of the method but within the class
	System.out.println("------------------------------------");
	
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	String firstName = "Reba"; 
	String lastName = "McEntire";
	String fullName = writeFullName(firstName, lastName);
	System.out.println("#8: The full name is: " + fullName);
	System.out.println("------------------------------------");
	
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	int[] num = {1000, 101, 250, 756}; //establishing an array of integers
	boolean isItTrue = isTrue(num); //using the method in a boolean expression
	System.out.println("#9: Are the numbers > 100?: " + isItTrue);
	System.out.println("------------------------------------");
	
//10. Write a method that takes an array of double and returns the average of all the elements in the array.	
	double [] numbers = {9.99, 12.45, 8.63, 3.5}; //initializing the array
	double average = averageOfElements(numbers); //running the method and saving as 'average'
	System.out.println("#10: The average of all the elements: " + average);
	System.out.println("------------------------------------");
	
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	double[] array1 = {1.1, 2.2, 3.3, 4.4}; //Initializing the arrays
	double[] array2 = {5.5, 6.6, 7.7, 8.8};
	boolean isTwoBigger = averageTwoBiggerThanOne(array1, array2); //Run the method with the arrays and save as boolean
	System.out.println("#11: Is the avg of the 2nd array bigger than the first?: " + isTwoBigger);
	System.out.println("------------------------------------");
	
//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	boolean isHotOutside = true; //set isHotOutside as true or false
	double moneyInPocket = 2.50;  //set total of money in pocket
	boolean buyADrink = willBuyDrink(isHotOutside, moneyInPocket); //run the method with the boolean and double established
	System.out.println("#12: Will I buy a drink?: " + buyADrink);
	System.out.println("------------------------------------");
	
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	//Any money leftover in budget to put into savings? 
	double[] expenses = {900, 300, 18.50, 127, 72.48, 9.99}; //List of monthly expenses example
	double income = 750 *2; //Biweekly paycheck example
	double moneyLeftOver = putMoneyInSavings(expenses, income); //run the method by putting in expenses and income
	if(moneyLeftOver >=1 ) { //conditions depending on the math. if there's money left over -->
	System.out.println("#13: Money left over this month to put into savings: " + moneyLeftOver);
}else if(moneyLeftOver == 0) { //if you break even this month
	System.out.println("#13: No money leftover, but at least your bills are paid.");
}else { //if you're a little short this month
	System.out.println("#13: Money left over? The bills aren't even all paid this month.");
}
	}
//13
	public static double putMoneyInSavings(double[] expenses, double income) {
		double moneyOut = 0; //establish a double for moneyOut, start at zero
		for(double expense : expenses) { //for each expense in our array of expenses
			moneyOut += expense;  //add it up
		} return income - moneyOut;  //money in minus money out
	}
	
	
//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket >= 10.5){ //if isHotOutside is true AND there is > 10.5 in moneyInPocket
			return true; //be true
		}return false; //if it is not hot outside, or I have less than 10.5 in my pocket --> be false. 
	}
	
	
//11
	public static boolean averageTwoBiggerThanOne(double[] array1, double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		for(double number : array1) { //for each number in the first array, add to sum1, which starts at 0
			sum1 += number; 
		}double average1 = sum1/array1.length; //sum of the array divided by the length of the array (number of entries)
		
		for(double number2 : array2) {  //for each number in the 2nd array, add to sum2, which starts at 0
				sum2 += number2;
		}double average2 = sum2/array2.length; //sum of the array divided by the length of the array (number of entries)
		
		if(average2 > average1) { //conditional expression: is 2 bigger than 1?
			return true; //if it is? true
		}
		return false; //if its not? false
	}

//10
	public static double averageOfElements(double[] numbers) {
		double sums = 0; //declare a double to hold the spot of sums, start at 0
		for (double number : numbers) { //for each number in the array of numbers
			  sums  += number;  //add to sums, which starts at zero
		} return (sums / numbers.length); //sum of array divided by the length of the array (number of entries)
			} 
	
//9 
	public static boolean isTrue(int[] num) {
		for(Integer number : num) { //for each number in the array num
			if(number > 100) { 
				return true; //if the number is greater than 100 --> true
			}
		} 	return false; //if the number is less than 100 --> false
		}
	
//8
	public static String writeFullName(String firstName, String lastName) { //for a method that produces a string, and takes two strings
		return firstName + " " + lastName; //return the results, with a space in the middle
		
	}
	
//#7		
	public static String wordNTimes(String word, int n) { //for a method that produces a string, called wordNTimes, and the method takes a String word, and an int n)
			StringBuilder result = new StringBuilder(); //Using a string builder to generate my new string
			for (int i = 0; i < n; i++) { //To iterate over the sequence
				result.append(word); //for each index, add the word to the result
			} 	return result.toString(); //return the result as a string
		 
		} 
		
		
}

