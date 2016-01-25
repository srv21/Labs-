public class Running 
{
	public static void main(String[] args)
	{
		
		double distanceOfSeperation = 10.0;
		int steps = 0;
		while (distanceOfSeperation > 0)
		{  
			distanceOfSeperation = distanceOfSeperation / 2;
			System.out.println("Paris is " + distanceOfSeperation + " meters away " +
			"from Helen.");
			
			steps++;
			System.out.println();
			System.out.println("Step number: " + steps);
		}
	}
}
