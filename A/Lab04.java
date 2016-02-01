import java.util.Scanner;

public class Lab04
{
	public static void main(String[] args)
	{
		String name;
		
		Scanner storeName = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name = storeName.nextLine();
		
		System.out.println();
		
		int i;
		int totalUtils1 = 0;
		int totalUtils2 = 0;
		int totalUtils3 = 0;
		int allUtils;
		
		for (i = 0; i < 4; i++)
		{
		
			System.out.println("(1)- Buy people ice cream");
			System.out.println("(2)- Steal ice cream from people");
			System.out.println("(3)- Dream about people eating ice cream");
			System.out.println("(4)- Die");
		
			System.out.println();
		
			int numberChosen;
			Scanner enterAction = new Scanner(System.in);
		
			System.out.println("Enter action of " + name);
			numberChosen = storeName.nextInt();	
			
			
			switch (numberChosen) 
			{
            case 1:  {
            			
            			int numOfPeople;
            			Scanner enterNum = new Scanner(System.in);
            				
            			System.out.println("How many people?");
            			numOfPeople = enterNum.nextInt();
            			
            			totalUtils1 = numOfPeople * 5;
            			
            			System.out.println("This action caused " + totalUtils1 + " utils" +
            			" of happiness");
            			
            			System.out.println();
            			
                     	break;
                     	}
                     	
            case 2:  {
            			
            			int numOfPeople;
            			Scanner enterNum = new Scanner(System.in);
            				
            			System.out.println("How many people?");
            			numOfPeople = enterNum.nextInt();
            			
            			totalUtils2 = numOfPeople * -5;
            			
            			System.out.println("This action caused " + totalUtils2 + " utils" +
            			" of happiness");
            			
            			System.out.println();
            			
                     	break;
                     }
                     	
            case 3:  {

            			int numOfPeople;
            			Scanner enterNum = new Scanner(System.in);
            				
            			System.out.println("How many people?");
            			numOfPeople = enterNum.nextInt();
            			
            			totalUtils3 = numOfPeople * 0;
            			
            			System.out.println("This action caused " + totalUtils3 + " utils" +
            			" of happiness");
            			
            			System.out.println();
            			
                     	break;
                     
                     }
                     
            case 4:  {
            			
            			System.out.println("Death");
            			
                     	break;
                     	
                     } 
                     
			}
			
		}  
		
		System.out.println();
			
		allUtils = totalUtils1 +totalUtils2 + totalUtils3;
			
		System.out.println(name + " caused " + allUtils + " utils of happiness");
		
		if (allUtils > 0)
		{
			System.out.println(name + " lived a morally good life");
		}
		
		if (allUtils == 0)
		{
			System.out.println(name + " lived a morally neutral life");
		}
		
		if (allUtils < 0)
		{
			System.out.println(name + " lived a morally bad life");
		}
			
	}
}		