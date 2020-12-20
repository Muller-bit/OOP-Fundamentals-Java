import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class MainGame {

	public static void main(String[] args) {
		
		System.out.println("Hello.Welcome to the cave man clan.");
		
		
		/*
		System.out.println("I have a secret number. Enter a guess ");
		
		//start the game with guessing a number of variables and while loops
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();// we have to import this package
		
		int theSecretNumber = rand.nextInt(10);
		int yourGuess = 0;
		
		//getting input from the user
		
		while(theSecretNumber != yourGuess) {
			  
			 // get input from the user
			 yourGuess = scan.nextInt(); //it has to be int unless it will crash
			
			
			 //cheek to see if the guess was correct
			  if(yourGuess < theSecretNumber) {
				 System.out.println("Too low. Try guessing higher");
			 }
			  if (yourGuess > theSecretNumber){
				 System.out.println("Too high. Try guessung lower");
			 }
			 
		}
		  System.out.println("You got the secret number!");
	
		
		//For loops 
		for(int i = 0;i < 9 ; i++) {
			System.out.print("The number is " + i + "," );
		}
		System.out.println("########## \n*********");//increment by 3
		for(int i = 0;i < 23 ; i = i+3  ) {
			System.out.print("The number is " + i + "," );
		}
		
		System.out.println("########## \n*********");
		
		//show me some array 
		
		int [] luckyNumber = {12,4,23,34,53};
		System.out.println("The first item in the array is " + luckyNumber[0]);
		
		for(int i = 0;i < luckyNumber.length ; i++) {
			System.out.println("The number at position " +i+" "+  "is  " + luckyNumber[i] + "," );
		}
		
		// For each loop
		for(int number :luckyNumber) {
			System.out.println("Lucky Number is " + number);
		}
		// Show me some lists
		
		ArrayList<Integer > unluckyNumber = new ArrayList<>();
		unluckyNumber.add(7);
		unluckyNumber.add(11);
		unluckyNumber.add(9);
		unluckyNumber.add(23);
		unluckyNumber.add(52);
		
		for(int i = 0;i < unluckyNumber.size() ; i++)  // for List we can,t use length instead we use size
		{
			System.out.println("The unlucky number at position " +i+" "+  "is  " + unluckyNumber.get(i) + "," );
		}
		
		// For each loop
		for(int number :unluckyNumber) {
			System.out.println("unlucky Number is " + number);
		}
            */
		//  do some objects
		//we can create as many object as we like
		
		CaveMan c1 = new CaveMan();
		CaveMan c2 = new CaveMan("ogg",17,92.4f,new ArrayList<Rock>());
		
		c1.sayHi();
		c2.sayHi();
		
		c1.setName("Ugg");
		
		c1.sayHi();
		c2.sayHi();
		
		System.out.println("C1 = " + c1);
		System.out.println("C1 = " + c2);
		
		
		Rock r1 = new Rock();
		Rock r2 = new Rock("Red", 88.5f);
		Rock r3 = new Rock("Green", 23.4f);
		Rock r4 = new Rock("Gray", 5.5f);
		
		
		ArrayList<Rock> allOftheRocks = new ArrayList<>();
		allOftheRocks.add(r1);
		allOftheRocks.add(r2);
		allOftheRocks.add(r3);
		allOftheRocks.add(r4);
		
		ArrayList<Rock> someRocks = new ArrayList<>();
		someRocks.add(r1);
		someRocks.add(r3);	
		
		
	   c1.setRockCollection(someRocks);
       c2.setRockCollection(allOftheRocks);
       
       
       System.out.println("C1 = " + c1);
	   System.out.println("C1 = " + c2);
	   
	   //for loops for Objects
	   
	   for(Rock r:allOftheRocks) {
		   System.out.println("A rock in the collection is " + r );
	   }
	   
	   for(int i= 0; i <someRocks.size(); i++) {
		   System.out.println("A rock in the collection is" +" "+ someRocks.get(i));
	   }
	} 
  }

