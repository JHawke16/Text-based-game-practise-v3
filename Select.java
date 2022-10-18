import java.util.Scanner;
public class Select
{
  public void select()
  {
    int i = 0;
    while (i < 1)
    {
      System.out.println("Select your class:\nMage\nWarrior");
      Scanner sc = new Scanner(System.in);
      String choice = sc.nextLine();
      Choice selection = new Choice();
      selection.setChoice(choice);
      if (choice.equalsIgnoreCase("Mage"))
      {
        System.out.println("\nYour class is: " + selection.getChoice());
        i++;
      }
      else if (choice.equalsIgnoreCase("Warrior"))
      {
        System.out.println("\nYour class is: " + selection.getChoice());
        i++;
      }
      else
      {
        System.out.println("");
      }
    }
  }
}

class Choice
  {
    private String choice;

    public String getChoice()
    {
      return choice;
    }

    public void setChoice(String choice)
    {
      this.choice = choice;
    }
  }