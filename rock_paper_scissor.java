import java.util.*;
import java.lang.*;
import java.io.Console; 

class RockPaperScisspr
{
	public static void main(String[] args)
	{
		int B=1;
		int u1win=0 , u2win=0;
		String us1,us2;
		
		Scanner s1=new Scanner(System.in);
		System.out.println("\n\n\t\t\t\t\t " + "Welcome to Childhood Game ROCK_PAPER_SCISSOR ");
		
		System.out.println("GAME RULES :- ");
		System.out.println("\t1. select your choice from rock , paper & scissor ");
		
		System.out.println("\t2. rock beats the scissor  ");
		System.out.println("\t3. paper beats the rock ");
		System.out.println("\t4. scissor beats the paper ");
		
		System.out.print("enter the 1st user name :-  ");
		us1=s1.nextLine();
		
		System.out.print("enter the 2nd user name :-  ");
		us2=s1.nextLine();
		
		while (B != 0) 
		{
			int u1=0, u2=0;
			String ch1=null, ch2=null;
			Console console = System.console();
			
			System.out.print("select your choice " +us1 +"\n\t\t\tr or R for rock,\tp or P for paper,\ts or S for scissor :-\t");
			char c1[] = console.readPassword();  			 //take input from user1 //
			
			if ((c1[0] != 'r') && (c1[0] != 'R') && (c1[0] != 'p') && (c1[0] != 'P') && (c1[0] != 's') && (c1[0] != 'S'))
																		// if user1 enter wrong input it shows error // 
			{
				System.out.println(us1 + " selects " + c1 + ", This is wrong Input \n Closing the program... Try luck again");
				System.exit(0);
			}
			else
			{
				if(c1[0] == 'r' || c1[0] == 'R')
				{
					ch1 = "Rock";
					u1 = 1;
				}
				else if (c1[0] == 'p' || c1[0] == 'P')
				{
					ch1 = "Paper";
					u1 = 2;
				}
				else 
				{
					ch1 = "Scissor";
					u1 = 3;
				}
			}
			System.out.print("select second choice "+us2+"\n\t\t\tr or R for rock,\tp or P for paper,\ts or S for scissor :-\t");
			
			char c2[] = console.readPassword();				 //take input from user2 //
			if ((c2[0] != 'r') && (c2[0] != 'R') && (c2[0] != 'p') && (c2[0] != 'P') && (c2[0] != 's') && (c2[0] != 'S')) 
																		// if user2 enter wrong input it shows error //			
			{
				System.out.println( us2+ "selects " + c2 + ", This is wrong Input \n Closing the program... Try luck again");
				System.exit(0);
			}
			else
			{
				if(c2[0] == 'r' || c2[0] == 'R')
				{
					ch2 = "Rock";
					u2 = 1;
				}
				else if (c2[0] == 'p' || c2[0] == 'P')
				{
					ch2 = "Paper";
					u2 = 2;
				}
				else 
				{
					ch2 = "Scissor";
					u2 = 3;
				}
			}    
					
			if((u1==1 && u2==1) || (u1==2 && u2==2) || (u1==3 && u2==3))
			// condition for match tie //
			{
				System.out.println("MATCH TIE");  
				System.out.println( us1 +" selects "+ ch1);
				System.out.println(us2 + " selects "+ ch2);		
			}
			else
			{
			   //user 1 win condition
				if((u1==1 && u2==3) || (u1==2 && u2==1) || (u1==3 && u2==2))
				{
					System.out.println(us1 + " selects "+ ch1);
					System.out.println(us2 +" selects "+ ch2);					
					System.out.println("This Round Winner is :-\t"+ us1);
					u1win++;				
				}
			
				//user 2 win condition
				else
				{
					System.out.println(us1 + " selects "+ ch1);
					System.out.println(us2 + " selects "+ ch2);					
 					System.out.println("This Round Winner is :-\t" + us2 );
					u2win++;
				}
			}	

      
    	System.out.print("Do you want to play again? Y/N :- ");
      char d =s1.next().charAt(0);			
      
      // for continue the game
      if((d=='Y')||(d=='y'))
		{
      	B=1;	
      	System.out.println("ROCK, PAPER,SCISSOR");
    	}
    	else 
    	{
			B=0;	
			System.out.println(us1 + " win " + u1win + " times"  );  	//print the user 1 winning time //
			System.out.println(us2 + " win " + u2win + " times"  );		//print the user 2 winning time //
			System.out.println("GOODBYE");
		}
	}
 }
	
} 

