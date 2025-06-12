/**
 * Author: Edward Clark
 * 
 * 
 * 
 * 
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Welcome to CS 112!");
        int sum = Main.add(1, 2);
        System.out.println("Sum of the two is: " + sum);
        Main.multiplesof2(3);

        Car myCar = new Car("Green");
        Car myCar2 = new Car("Orange");
        
        System.out.println("The chosen car color i desire is: "+ myCar.getColor());
        System.out.println("Car color i want to use: " + myCar2.getColor());
        System.out.println(myCar2.toString());

        myCar.setColor("Blue");

        System.out.println(myCar);
        

    }
    /**
     * This method allows for the addition of two intergers
     * @param num1 represents the first interger you can choose from.
     * @param num2 represents the second intterger you can choose from.
     * @return the return is a sum of the two intergers chosen in the main method when called upon
     */
    public static int add(int num1, int num2)
    {
        int add = num1 + num2;
        
        return add;

    }
    /**
     * This method allows for the multiples of twos in the postive direction.
     * @param num3 acts as the original number that is selected to be a multiple of two.
     */
    public static void multiplesof2(int num3)
    {
        int mult = 2 * num3;
        
        System.out.println("A multiple of 2: " + mult);
    }
    
}
