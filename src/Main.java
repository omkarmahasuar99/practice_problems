import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.println("Please enter number of units");
            int unit= sc.nextInt();
            if(unit>100)
            {
                if (unit <= 200)
                {
                    unit = unit - 100;
                    int bill = unit * 5;
                    System.out.println("Your electricity bill is " + bill);
                }
                if (unit > 200)
                {
                    unit = unit - 200;
                    int bill = 500 + unit * 10;
                    System.out.println("Your electricity bill is " + bill);
                }
            }
            else System.out.println("Your electricity bill is 0");
        }

    }
}