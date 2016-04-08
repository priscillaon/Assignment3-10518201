/// Programmer: Oppong-Nkentia Priscilla
public class DistanceFormula {
    public static void main( String[] args )
	{
		// test the formula a bit
		double dist1 = distance(-2,1 , 1,5);
		System.out.println(" (-2,1) to (1,5) => " + dist1 );
 
		double dist2 = distance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + dist2 );
 
		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );
 
		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
	}
 
	public static double distance( int x1, int y1, int x2, int y2 )
	{
		return (  Math.sqrt(  ( Math.pow(x2-x1, 2) + Math.pow( y2 - y1, 2) )  ) );
	}
    
}
