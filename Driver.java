package lab3;
import java.util.Random;

/**
 * The 'Driver' class is the main class of the program which implements the 'main' method being the entry point w
 * @author user
 */



public class Driver {
	////here execution actually begins:
    public static void main(String[] args) {   
        final int VALUES = 10; //The program defines a constant (final) variable called 'VALUES' whose actual value is '10'.
        
        Stats stats = new Stats(VALUES); 
        /**
         *  An object of the Stats class called 'stats' is created. The value of the integer 'VALUES' will 
         *  determine how many random values will be generated and added to the object, in this case, 10.
         *  n instance of the Stats class is created using the constructor Stats(VALUES). This initializes an 
         *  array named numbers in the Stats object with a capacity of 10.
         */
       
        
        Random random = new Random();
        /**
         * A Random object is created to generate random numbers. Inside a for loop, it generates 10 random 
         * integers between 0 and 99 (using random.nextInt(100)) and adds these values to the Stats object using the addValue method.
         */
        
        for (int i = 0; i < VALUES; i++) {
            stats.addValue(random.nextInt(100));
        }
        
        
        System.out.println("Numbers stored : ");
        System.out.println(stats); //alls the toString method you defined in the Stats class.
        System.out.println("Average = " + stats.getAverage()); //prints the average value
        System.out.println("Count = " + stats.getCount());     //prints the count of the values of the 'numbers' array
        System.out.println("Total = " + stats.getTotal());     //prints the total sum 
        System.out.println("Minimum value = " + stats.getMinimumValue());  //print the smallest value in the array
        System.out.println("Maximum value = " + stats.getMaximumValue());  //prints the largest value in the array
    }
}
