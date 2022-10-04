import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    double radius;
    Scanner Circle = Circle();
  }
  
  public static Scanner Circle() 
  {
    
    Scanner Choice = new Scanner(System.in);
    Scanner Radius = new Scanner(System.in);
    System.out.println("Do you want the area or the perimeter of the circle?");
    String choice = Choice.nextLine();
    
    if (choice.equalsIgnoreCase("Area"))
    {
      System.out.println("You have chosen the area");
      System.out.print("Enter the radius of the Circle: ");
      double radius = Radius.nextDouble();
    
      double area = 3.14 * (radius * radius);
      System.out.println("Area: " + area);
    }
    
    else if (choice.equalsIgnoreCase("Perimeter"))
    {
      System.out.println("You have chosen the perimeter");
      System.out.print("Enter the radius of the Circle: ");
      double radius = Radius.nextDouble();
      
      double perimeter = 2 * 3.14 * radius;
      System.out.println("Perimeter: " + perimeter);
    }
    return Radius;
  }

}



