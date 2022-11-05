import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        for (int e = 0; e < 10; e++)
        {


            System.out.println("Please enter a binary number");
            int num = Integer.parseInt(sc.nextLine());

            int position = 0, sum = 0;


                while (num > 0)
                {
                    if (num % 10 == 1)
                    {
                        sum = sum + (int) (Math.pow(2, position));
                    }
                    position++;

                    num = num / 10;
                }
                System.out.println("Decimal number: " + sum);
            }
        }
    }
