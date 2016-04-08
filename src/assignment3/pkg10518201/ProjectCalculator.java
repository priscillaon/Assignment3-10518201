
import java.util.Scanner;

// Programmer: Oppong-Nkentia Priscilla
public class ProjectCalculator {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b = 0, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
                        if( !( op.equalsIgnoreCase("sin") || op.equalsIgnoreCase("cos") || op.equalsIgnoreCase("tan") || op.equalsIgnoreCase("!") || op.equalsIgnoreCase("!"))){
                            b  = keyboard.nextDouble();
                        }

			if( op.equals("+") )
				c = a + b;
                        else if ( op.equals("-"))
                            c = a - b;
                        else if ( op.equals("*"))
                            c = a * b;
                        else if ( op.equals("/"))
                            c = a / b;
                        else if (op.equals("^")){
                            c = Math.pow(a,b);
                        }
                        else if (op.equals("%")){
                            c = a%b;
                        }
                        else if (op.equals("sin")){
                            c = Math.sin(a);
                        }
                        else if (op.equals("cos")){
                            c = Math.cos(a);
                        }
                        else if (op.equals("tan")){
                            c = Math.tan(a);
                        }
                        else if (op.equals("!")){
                            c = factorial((int)a);
                        }
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}

			System.out.println(c);

		} while ( true );
	}
        
        public static int factorial( int x){
            if ( x == 0){
                return 1;
            }
            else{
                return x * factorial(x-1);
            }
        }
    
}
