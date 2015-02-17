package textBasedAdventure;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TextBasedAdventure {
    
	/*This is an RPG text based adventure where you can fight enemies, make decisions, earn lives, or even
	 * die. The decision is up to you whether you make it out alive, while figuring out how you got here, or
	 * not make it out alive as a confused person who has no idea how they got there. The choice is up to you!
	 *
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner (System .in);
		Random r = new Random();
		String playagain="";
		
		do
		{
			while(true)
			{
				JOptionPane.showMessageDialog(null,"You wake up in the middle of nowhere and have no idea how you got" +
                                              " there. \nThe only thing you remember how to do is to fight. The only thing you have is a flashlight and \n" +
                                              " and you realize that you only have 1 life left. Try to find your way out and good luck!");
				
				int life=1;
				
				System.out.println("Press any button to go forward.");
				String a=input.nextLine();
				
				System.out.println("You come across a path near an abandoned house. \nYou can either keep going on" +
                                   " the path by pressing w or you could stop at the abandoned house to investigate by pressing i." +
                                   "\nWhat would you like to do?");
				String choice=input.nextLine();
				
				if (choice.equals ("w"))
				{
					life++;
					
					System.out.println("You have decided to keep going and you have picked up a life!\nYou now have "
                                       +life+" lives\nPress any key to go back to the abandoned house");
					String b=input.nextLine();
					
					System.out.println("You have entered the abandoned house. And there are 3 rooms that you can go to. \nPress" +
                                       " 1 to enter Room 1, Press 2 to enter Room 2 or Press 3 to enter Room 3. \nHurry up and make your decision!" +
                                       " Oh yeah and by the way you have 10 seconds to make your decision so I hope you read this fast enough");
					
				}
				else if(choice.equals ("i"))
				{
					System.out.println("You have entered the abandoned house. And there are 3 rooms that you can go to. \nPress" +
                                       " 1 to enter Room 1, Press 2 to enter Room 2 or Press 3 to enter Room 3. \nHurry up and make your decision" +
                                       " now!");
				}else{
					System.out.println("I'm sorry you pressed the wrong key therefore your player has died. Please try again");
					break;
				}
				Date time1=new Date ();
				String decision=input.nextLine();
				Date time2=new Date();
				String back=("");
				String desk=("");
				String room=("");
				String inventory=("");
				String light=("");
				String eat=("");
				String advance=("");
				boolean egg = false;
				int timer=time2.getSeconds()-time1.getSeconds();
				if(timer<11){
					if (decision.equals("1"))
					{
                        life=0;
                        System.out.println("You enter Room 1 and you discover it leads to nowhere and you lose your " +
                                           "footing and fall. \nI'm sorry, but you have lost all your lives.\n");
                        break;
                        
					}
					else if (decision.equals("2"))
					{
						System.out.println("You enter Room 2 and you discover a desk. \nWould you like to open up the desk? " +
                                           "1 for yes or 2 for no. \nChoose wisely");
						desk=input.nextLine();
					}
					else if (decision.equals("3"))
					{
                        life++;
                        System.out.println("You have found a life and now have "+life+" lives left. " +
                                           "\nWould  you like to enter through the mysterious door.\n1 for yes or 2 for no");
                        room=input.nextLine();
						
					}else{
						System.out.println("I'm sorry you pressed the wrong key therefore your player has died. Please try again");
						break;
					}
				}else{
					System.out.println("I'm sorry, but you took too long");
					break;
				}
				
				if (room.equals("1")) {
                    life=0;
                    System.out.println ("You have opened the door and have lost all your lives due to the fact there is poisonous gas in the room.\n" +
                                        "Sorry but you must start over.\n(hint:try the other door)");
                    break;
                }
				
				else if (room.equals("2"))
                {
                    life=0;
                    System.out.println("You have stayed in the door and a portal appears blasting you to a different millenium. " +
                                       "\nYou can't find your way out therefore declaring you dead. \nI'm sorry, but you lost all your lives.(hint:try the other door)");
                    break;
					
                }if (desk.equals("1")){
                    System.out.println("You have found out that there is a Room 4. " +
                                       "Would you like to enter it now or stay in the room?\n3 for enter or 4 for no");
					
				}
                else if (desk.equals("2"))
				{
                    life=0;
                    System.out.println("By not opening the desk fast enough, the walls closed in on you and you died." +
                                       "\nI'm sorry, but you have lost all your lives");
                    break;
				}
                back=input.nextLine();
				
				if (back.equals("3"))
				{
					life++;
					
					System.out.println("You have earned a life and entered into a dark tunnel. You now have "+life+" lives left. \nType i to open up your inventory");
					inventory=input.nextLine();
				}
				if (back.equals("4"))
				{
					life--;
					System.out.println("You chose to stay and a timer went off causing the room to explode.\nYou have lost a life and you now " +
                                       "have"+life+"lives left");
				}if (inventory.equals("i"));
				{
					System.out.println("You have opened up your inventory and you see you have a flashlight and "+life+ " lives left. Press f to open up your light.");
					light=input.nextLine();
				}
				if (light.equals("f"));
				{
					life++;
					System.out.println("You have turned on your flashlight and found a life and a mysterious egg.\nYou now have "+life+" lives left." +
                                       " Would you like to eat the egg now or save it for later.\nPress 1 to eat it now or press 2 to save it for later");
					eat = input.nextLine();
				}
				if (eat.equals("1"))
				{
					life++;
                    System.out.println("You have chosen to eat the egg now which gave you an extra life. You now have "+life+" lives left. \nPress any button to move on.");
                    eat=input.nextLine();
                    egg = true;
				}
				else if (eat.equals("2"))
				{
					System.out.println("You have chosen to save the egg for later. Press any button to move on.");
					eat=input.nextLine();
				}
				if (advance.equals(""))
				{ System.out.println("You have advanced and have encountered your brother who is unfortunetly a zombie.\nType fight to fight him");
                    input.nextLine();
                    int zombielives=3;
                    int zombieNumber = 0;
                    int playerNumber = 0;
                    while (zombielives > 0 && life > 0)
                    {
                        zombieNumber = r.nextInt(10);
                        System.out.println("What attack would you like to perform? \n1 to grab him, 2 to punch him or 3 to use the egg on him if you still have it.");
                        String attack = input.nextLine();
                        if (attack.equals("1"))
                        {
                            playerNumber = 3;
                        } else if (attack.equals("2"))
                        {
                            playerNumber = 5;
                        } else if (attack.equals("3") && egg == true)
                        {
                            playerNumber = 8;
                        } else {
                            playerNumber = r.nextInt(10);
                        }
                        if(playerNumber > zombieNumber)
                        {
                            zombielives--;
                            System.out.println("Your attack caused the zombie to lose a life!");
                        } else 
                        {
                            life--;
                            System.out.println("Your attack was blocked and the zombie responded with an attack! You now have "+life+ " lives left");
                        }
                    }
                    if (life==0)
                    {
                        System.out.println("Sorry, but you ran out of lives.");
                        break;
                        
                        
                    }else{
                        System.out.println("You have defeated your zombie brother and brought him back to life.\nYou talk to your brother and you find out that you ran away from " +
                                           "home one day and came up missing.\nA few days later a disease spread throughout the world causing massive destruction and causing civilians to be turned into zombies." +
                                           "\nYou find out by defeating your brother you have stopped the disease from spreading farther and saved the world's population. \nThank you for playing!");
                        break;
                    }
				}
				
				
				if (life==0)
				{
					System.out.println("Sorry, but you ran out of lives.");
					break;
                    
					
				}
				
				System.out.println();
				System.out.println("Press any button to continue on");
				room=input.nextLine();
				
				
				
				//end of game
				break;
			}
            
			
			
			
            
			System.out.println("Would you like to play again? Type either yes or no");
			playagain=input.nextLine();
			
		} while(playagain.toLowerCase().equals("yes"));
        
	}
	
}