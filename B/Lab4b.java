import java.util.Scanner;

public class Lab4b
{
	public static void main(String[] args)
	{
		
		System.out.println("5. Self-actualization (achieving your total potential)");
		System.out.println("4. Esteem (e.g., respect from others, self-respect)");
		System.out.println("3. Love and Belonging (e.g., friendship and family)");
		System.out.println("2. Safety (e.g., personal and financial security)");
		System.out.println("1. 1. Physiological (e.g., oxygen, food, water)");
		
		System.out.println();
		
		int numberChosen;
		
		Scanner enterAction = new Scanner(System.in);
		
		System.out.println("Choose your level: ");
		numberChosen = enterAction.nextInt();
		
		switch (numberChosen)
		{
		
			case 5: {
						System.out.println("Self-actualization"); 
						System.out.println();
					
					}
					
			case 4: {
						System.out.println("Esteem"); 
						System.out.println();
					
					}
					
			case 3: {
						System.out.println("Love and Belonging"); 
						System.out.println();
					
					}
			
			case 2: {
						System.out.println("Safety"); 
						System.out.println();
						
					}
			
			case 1: {
						System.out.println("Physiological"); 
						System.out.println();
					
					}
		}
		
	}
}			
				
		
		