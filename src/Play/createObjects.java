/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */

package Play;

//Imports java utility and classes from GolfGame package
import java.util.Scanner;
import GolfGame.GolfCourse;
import GolfGame.Hole;

/*Purpose of Class: To create Objects required to start game and to have method to start game*/


public class createObjects {
	
	//Creates 18 instances of Hole with specification of Genessee Valley park holes
	Hole GP1 = new Hole(530, 5);
	Hole GP2 = new Hole(305, 4);
	Hole GP3 = new Hole(331, 4);
	Hole GP4 = new Hole(201, 3);
	Hole GP5 = new Hole(500, 5);
	Hole GP6 = new Hole(226, 3);
	Hole GP7 = new Hole(409, 4);
	Hole GP8 = new Hole(410, 4);
	Hole GP9 = new Hole(229, 3);
	Hole GP10 = new Hole(433, 4);
	Hole GP11 = new Hole(363, 4);
	Hole GP12 = new Hole(174, 3);
	Hole GP13 = new Hole(545, 5);
	Hole GP14 = new Hole(419, 4);
	Hole GP15 = new Hole(512, 5);
	Hole GP16 = new Hole(410, 4);
	Hole GP17 = new Hole(320, 4);
	Hole GP18 = new Hole(170, 3);
	
	//Creates the GenneseeValley instance of GolfCourse
	GolfCourse GenneseeValley = new GolfCourse("Genesee Valley Park North Course","St.Andrews, Scotland", GP1, GP2, GP3, GP4, GP5, GP6, GP7, GP8, GP9, GP10, GP11, GP12, GP13, GP14, GP15, GP16, GP17, GP18);
	
	//Creates 18 instances of Hole with specification of the Old Course at St.Andrews holes
	Hole SA1 = new Hole("Burn", 376, 4);
	Hole SA2 = new Hole("Dyke", 453, 4);
	Hole SA3 = new Hole("Cartgate (Out)", 397, 4);
	Hole SA4 = new Hole("Ginger Beer", 480, 4);
	Hole SA5 = new Hole("Hole O'Cross (Out)", 568, 5);
	Hole SA6 = new Hole("Heathery (Out)", 412, 4);
	Hole SA7 = new Hole("High (Out)", 371, 4);
	Hole SA8 = new Hole("Short", 175, 3);
	Hole SA9 = new Hole("End", 352, 4);
	Hole SA10 = new Hole("Bobby Jones", 386, 4);
	Hole SA11 = new Hole("High (In)", 174, 3);
	Hole SA12 = new Hole("Heathery (In)", 348, 4);
	Hole SA13 = new Hole("Hole O'Cross (In)", 465, 4);
	Hole SA14 = new Hole("Long", 618, 5);
	Hole SA15 = new Hole("Cartgate (In)", 455, 4);
	Hole SA16 = new Hole("Corner of the Dyke", 423, 4);
	Hole SA17 = new Hole("Road", 495, 4);
	Hole SA18 = new Hole("Tom Morris", 357, 3);
	
	//Creates the Old Course at St. Andrews instance of GolfCourse
	GolfCourse Andrews = new GolfCourse("The Old Course at St. Andrews", "Rochester, NY, USA",SA1, SA2, SA3, SA4, SA5, SA6, SA7, SA8, SA9, SA10, SA11, SA12, SA13, SA14, SA15, SA16, SA17, SA18);

	//Creates method play that signals start of gam
	public void play() { 
		//Creates boolean play and string response
		boolean play = true;
		String response = "";
		
		//While loop that continues while play is equal to true
		while (play == true) {
			
			//Creates new scanner input
			Scanner input = new Scanner(System.in);
		
			System.out.println("NOTE: You may skip a round at any time by entering -1 for the club, or power if in the green");
			System.out.println("NOTE: You may forfeit at any time by entering 0 for the club, or power if in the green");
			
			//Asks user to input either 1, 2, or 3 to select which variation of the game he'd like to play
			System.out.println();
			System.out.println("Would you like to play alone [1], against another player [2] or against an AI [3]");
			System.out.print("Enter your choice [1 or 2 or 3]:");
			
			//Creates int selection and assigns value of user's input to it.
			int selection = input.nextInt();
		
			System.out.println();
			System.out.println("Please select course:");
			System.out.println("1. Genesee Valley Park North Course");
			System.out.println("2. The Old Course at St.Andrews");
			System.out.print("Enter your choice [1 or 2]:");
		
			//Creates int course_selection and assigns value of user's input to it.
			int course_selection = input.nextInt();
		
			/*If else condtionals that determine what variabtion of the game to play at which course 
			 * and then call on the appropriate methods
			 */
			if (course_selection == 1 && selection == 1 ) {
				System.out.println();
				System.out.println("You are playing in " + GenneseeValley.getName() + " at " + GenneseeValley.getLocation());
				System.out.println();
				GenneseeValley.initiate(); 
			} else if (course_selection == 1 && selection == 2 ){
				System.out.println();
				System.out.println("You are playing in " + GenneseeValley.getName() + " at " + GenneseeValley.getLocation() + " against another player");
				System.out.println();
				GenneseeValley.TwoPlayerInitiate(); 
			} else if (course_selection == 1 && selection == 3 ){
				System.out.println();
				System.out.println("You are playing in " + GenneseeValley.getName() + " at " + GenneseeValley.getLocation() + " against an AI");
				System.out.println();
				GenneseeValley.AIinitiate();
			} else if ((course_selection == 2 && selection == 1 )) {
				System.out.println();
				System.out.println("You are playing in " + Andrews.getName() + " at " + Andrews.getLocation());
				System.out.println();
				Andrews.initiate(); 
			} else if (course_selection == 2 && selection == 2 ) {
				System.out.println();
				System.out.println("You are playing in " + Andrews.getName() + " at " + Andrews.getLocation() + " against another player");
				System.out.println();
				Andrews.TwoPlayerInitiate(); 
			} else {
				System.out.println();
				System.out.println("You are playing in " + Andrews.getName() + " at " + Andrews.getLocation() + " against an AI");
				System.out.println();
				Andrews.AIinitiate(); 
			}
		
			//Asks the user if they wanna play again
			System.out.println("Do you want to play again? [Y/N]");
			response = input.next();
			
			//If user responds no, stops while loop other lets loop continue.
			if (response.equalsIgnoreCase("N")) {
				play = false;
			}
		
		} 
	}
	
}
