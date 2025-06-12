public class Car {

    private String color;

    
    public Car(String color)
    {
        this.color = color; 
    }

    
    public String getColor() 
    {
        return this.color;
    }
    
    public String toString()
    {
        return "The color of the car is the color: " + color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }


}
