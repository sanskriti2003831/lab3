
package lab3;
import java.util.Arrays;


/** 
 * The Stats class below deals with an array 'numbers' and it's operations like getting count, maximum
 * value, minimum value, total, average of the elements in the said array.
 * @author user
 */


public class Stats {
    private int[] numbers; // Declare 'numbers' as an instance variable
    private int count; // Declare 'count' as an instance variable

    /**
     * Constructor for the Stats class.
     * 
     * @param capacity The initial capacity of the 'numbers' array
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
        count = 0;
    }

    /**
     * Adds a new value to the collection.
     * 
     * @param value The value to be added.
     */
	
	
	/**
	 * The following method adds a new value to the collection, the collection meaning the array of
	 * integers is named 'numbers' which is currently stored in 'Stats' class
	 * @param value i.e the value that is yet to be added.
	 */
	
	public void addValue(int value) {
	numbers[count] = value;
	count++;
	}
	
	
	
	/**
	 *
	 * @return returns the count of the values of the 'numbers' array
	 */
    public int getCount() {
	return numbers.length;
	}
	
	
	/**
	 * This method finds and returns the largest value once the loop has processed all elements in the array
	 * @return returns the maximum value from the collection which is being stored in the variable 
	 * 'max'
	 */
     public int getMaximumValue() {
	int max = numbers[0];
	for (int i = 1; i < numbers.length; i++) {
	       if (numbers[i] > max) max = numbers[i];
	       }
	return max;
	}
	
	
	
    /**
    * This method finds and returns the smallest value once the loop has processed all elements in the array
    * @return returns the minimum value collection which is being stored in the variable 
    'min'
    */
    public int getMinimumValue() {
	int min = numbers[0];
	for (int i = 1; i < numbers.length; i++) {
	       if (numbers[i] < min)
	       min = numbers[i];
	}
	return min;
	}
	
	
    
    /**
     * This method is used to find the total of sum of all the values present in the 'numbers' array.
     * @return returns the total sum 
     */
	public int getTotal() {
	int total = 0;
    for (int i = 0; i < numbers.length; i++) {
	total += numbers[i];
	} 
    return total;
	}
	
	
	
	/**
	 * This method calculates and returns the mean average of all the values in the array.
	 * @return returns the average 
	 */
	public double getAverage() {
	int x = 0;
	for (int i = 0; i < numbers.length; i++) {
	   x += numbers[i];
	}
	double y = x/(double)numbers.length;
	return y;
	}
	
	
	/**
	 * This method has an '@override' annotation since it is being overridden in the 'driver' class
	 * Here, the toString method is used to change the arrays of numbers into strings that can be printed
	 * and displayed
	 * @return returns the string representation of the integer values in the array
	 */
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}

}
