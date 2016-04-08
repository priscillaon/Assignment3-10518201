// Programmer: Oppong-Nkentia Priscilla
import java.util.Scanner;
public class Multiples {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Choose number: ");
        num = keyboard.nextInt();
        for (int i = 1; i < 13; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
    
}
