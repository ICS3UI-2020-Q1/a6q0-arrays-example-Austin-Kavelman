import java.util.Scanner;

/**
 * Calculates average grade using arrays
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //create array to store the grades
    double[] grades = new double[5];

    //use a for loop to get all the grades from the user input
    for(int i = 0; i < grades.length; i++){
      //ask the user for grade
      System.out.println("Enter Mark " + (i+1));
      //fill the array with the value
      grades[i] = input.nextDouble();
    }
    
    //create a variable to store the total of all grades
    double total = 0;
    //use for loop to add each value to total
    for(int i = 0; i < grades.length; i++){
      //add each grade into total
      total = total + grades[i];
    }

    //calculate the average
    double average = total/grades.length;

    //let the user know the average
    System.out.println("Your average mark is " + average);

  }
}
