package qa.costi.pkg;

import java.util.Random;
import java.util.Scanner;

public class Runner  {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		
		String intro = ("Who's there?\nShow yourself!\nInsert name: ");
		int funny;
		
		for(funny = 0; funny < intro.length(); funny++){
		    System.out.printf("%c", intro.charAt(funny));
		    try{
		        Thread.sleep(50);//0.5s pause between characters
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		}
	 System.out.print("\n>>>");
	 Scanner scan =  new Scanner(System.in);
		String name = scan.next();
		
		
		
		 System.out.println();
			String text = ("Can't belive is not a Calculator!\nWhat's your lucky number? ");
			int anim;
			
			for(anim = 0; anim < text.length(); anim++){
			    System.out.printf("%c", text.charAt(anim));
			    try{
			        Thread.sleep(40);//0.5s pause between characters
			    }catch(InterruptedException ex){
			        Thread.currentThread().interrupt();
			    }
			}
		 System.out.print("\n>>>");
			int numero = scan.nextInt();
			
			
			for (int i = 1; i <= numero; i++) {
					for (int j = 0; j < i; j++) {
						System.out.print("*");
						
					}
			        System.out.println();
		}

		for (int i = numero - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}	
				 System.out.println();
				}
		
		
		System.out.println("Choose your destiny: 1,2,3,4,5,6 or the secret 8");
		 System.out.print("\n>>>");
		int choice = scan.nextInt();
		if(choice == 1) {
		System.out.println();
		String text1 = ("1 means +");
		
		for(anim = 0; anim < text1.length(); anim++){
		    System.out.printf("%c", text1.charAt(anim));
		    try{
		        Thread.sleep(100);//0.5s pause between characters
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		}
		
		
		System.out.println("\nFirst number:");
		System.out.print("\n>>>");
		int a =scan.nextInt();
		System.out.println("\nSecond number:");
		System.out.print("\n>>>");
		int b =scan.nextInt();
		
		System.out.println("Result: " + (a+b));
		
		}else if(choice == 2) {
			System.out.println();
			String text1 = ("2 means *");
			
			for(anim = 0; anim < text1.length(); anim++){
			    System.out.printf("%c", text1.charAt(anim));
			    try{
			        Thread.sleep(180);//0.5s pause between characters
			    }catch(InterruptedException ex){
			        Thread.currentThread().interrupt();
			    }
			}
			
			
			System.out.println("\nFirst number:");
			System.out.print("\n>>>");
			int o =scan.nextInt();
			System.out.println("\nSecond number:");
			System.out.print("\n>>>");
			int p =scan.nextInt();
			
			System.out.println("Result: " + (o*p));
		
	}else if(choice == 3) {
		System.out.println();
		String text2 = ("3 means /");
		
		for(anim = 0; anim < text2.length(); anim++){
		    System.out.printf("%c", text2.charAt(anim));
		    try{
		        Thread.sleep(180);//0.5s pause between characters
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		}
		
		
		System.out.println("\nFirst number:");
		System.out.print("\n>>>");
		int o =scan.nextInt();
		System.out.println("\nSecond number:");
		System.out.print("\n>>>");
		int p =scan.nextInt();
		
		System.out.println("Result: " + (o/p));
		
	}else if(choice == 4) {
		System.out.println();
		String text3 = ("4 means -");
		
		for(anim = 0; anim < text3.length(); anim++){
		    System.out.printf("%c", text3.charAt(anim));
		    try{
		        Thread.sleep(180);//0.5s pause between characters
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		}
		
		
		System.out.println("\nFirst number:");
		System.out.print("\n>>>");
		int o =scan.nextInt();
		System.out.println("\nSecond number:");
		System.out.print("\n>>>");
		int p =scan.nextInt();
		
		System.out.println("Result: " + (o-p));
		
		
	}else if(choice == 5) {
		System.out.println();
		String text4 = ("5 means create a password\nBecause why not?");
		
		for(anim = 0; anim < text4.length(); anim++){
		    System.out.printf("%c", text4.charAt(anim));
		    try{
		        Thread.sleep(180);//0.5s pause between characters
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		}
		
		
		System.out.println("\nEnter your password:");
		System.out.print("\n>>>");
		String x =scan.next();
		System.out.println("\nRe-enter your password:");
		System.out.print("\n>>>");
		String y =scan.next();
		if(x==y) {
			System.out.println("They match! ");}
			if(x!=y) {
				System.out.println("Not matching! ");}
			
			
	}else if(choice == 6) {
				System.out.println();
				String text5 = ("6 means x10");
				
				for(anim = 0; anim < text5.length(); anim++){
				    System.out.printf("%c", text5.charAt(anim));
				    try{
				        Thread.sleep(180);//0.5s pause between characters
				    }catch(InterruptedException ex){
				        Thread.currentThread().interrupt();
				    }
				}
				
				
				System.out.println("\nYour numba' :");
				System.out.print("\n>>>");
				int q =scan.nextInt();
				
				System.out.println("Result: " + (q*10));
			
		
		
	}else if(choice == 8) {
		
		System.out.println();
		String text8 = ("Fortune Cookies! What do people think about your donuts?");
		
		for(anim = 0; anim < text8.length(); anim++)
		    System.out.printf("%c", text8.charAt(anim));
		    try{
		        Thread.sleep(200);//0.5s pause between characters
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		
		
		
		 String[] cookie = {
				"	I was dancing with my lighter and my hair went up like a Christmas tree!",
				"	Your Outfit: 65 bracelets, dirty street trash clothing, something missing?\n	Complete the look with a single hand fingerless lacey glove at\n	city’s one stop shop for people who know underwear should be worn on the outside.",
				"	Female: Wow! You look trendy!",
				("	Male: How do you like to enjoy a " + name + "'s Donut?"),
				"	Male #2: I like to lick lovingly around the outside and then trust my tongue in the middle.",
				"	Female: I like to munch it vigourously.",
				"	Male #3: I just love the sugar. All over my face.",
				"	Male #4: On Friday nights I just can't stop eating " + name + "'s Ring Donuts.",
				"	Female: Oh my god, it's so good.",
				"	Male #5: Sometimes I like to wear women's panties and walk around 5th Street.",
				"	Male: When you go Downtown, make sure you enjoy " + name + "'s Ring Donuts."};

		System.out.println(" ---------------------------------------------------------------------------");
		System.out.println(" Write -stop- if you want to finish or *anything* to see...\nAre you Ready?:");
		System.out.print("\n>>>");
		String z =scan.next();
		while(!z.equals("stop")) {
		if (z.equals("stop")) {
			
			break;
			}
			Random rand = new Random();
			int r = rand.nextInt(cookie.length);
			System.out.println(cookie[r]);
			System.out.print("\n>>>");
		z =scan.next();
		}
		System.out.println("The End.");


		}else {
		System.out.println("The End.");
			}
		
	}
		
	}

			
		
	

		
		
	

		
	

