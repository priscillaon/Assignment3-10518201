// Programmer: Oppong-Nkentia Priscilla

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lumina BFS
 */
public class SummingThree {
    public static void main(String[] args)
    {
        Scanner input;
        int num;
        int sum = 0;
        System.out.println("Reading numbers from file \"3nums.txt\"... done.");        try
        {
            input = new Scanner(new File("3nums.txt"));
            sum = 0;
            while(true)
            {
                num = input.nextInt();
                sum = sum + num;
                System.out.print(num ); 
                if (input.hasNextInt())
                {
                    System.out.print(" + ");
                }
            }
            
            
        }
        catch(FileNotFoundException fileNotFound)
        {
            System.err.println("File not found!");
            System.exit(1);
        }
        catch(InputMismatchException mismatch)
        {
            System.out.print( " = ");
            System.out.println(sum);
        }
        
    }
}
