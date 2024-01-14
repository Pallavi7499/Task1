import java.util.Scanner;

public class Task1{

	              // Number game
	
	public static void guessingNumberGame()
	{
        Scanner sc=new Scanner(System.in);
		
		int number=1+(int) (100*Math.random());
		int guess,i;
		int K=5;  //trials
		
		System.out.println("A number is chosen   between 1 to 100.");
		System.out.println("-----------------------------------------------");
		System.out.println("Guess the number Within 5 trials.");
		
		for(i=0;i<K;i++)
		{
			System.out.println("Guess the number  :");
			guess=sc.nextInt();
			
			if(number==guess)
			{
				System.out.println("Congratulations !"+"You guessed the number. ");
				break;
			}
			else if(number>guess && i!=K-1)
			{
				System.out.println("The number is "+"Greater than "+guess);
			}
			else if(number<guess && i!=K-1)
			{
				System.out.println("The number is "+"Smaller than "+guess);
			}
		}
		if(i==K)
		{
			System.out.println("You have exhausted " + "K trials.");
			System.out.println("The number was "+number);
		}

	}
	
	public static void main(String[] args) {
		
		guessingNumberGame();
		
	}

}
