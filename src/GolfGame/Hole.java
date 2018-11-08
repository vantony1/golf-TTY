/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */

package GolfGame;

/*Summary of Class's Function:
 * Allows for creation of new holes and stimulates the playing of a hole by a player
 */

//imports java utility Scanner
import java.util.Scanner;

//Creates public class Hole
public class Hole{
	
	//Declares variables
	private String name;
	private int yards;
	private int par;
	
	//Creates constructor which creates instances of Holes w/ all variables above
	public Hole(String name, int yards, int par) {
		this.yards = yards;
		this.par = par;
		this.name = name;
	}
	
	//Creates constructor which creates instances of Holes w/ yards and par
	public Hole(int yards, int par) {
		this.yards = yards;
		this.par = par;

	}
	
	//Generates getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYards() {
		return yards;
	}

	public void setYards(int yards) {
		this.yards = yards;
	}

	public int getPar() {
		return par;
	}

	public void setPar(int par) {
		this.par = par;
	}

	/*playHole method that plays out every hole 
	 * and returns the # of strokes player used (parActual)
	 * accepts Hole a and Player c as input
	 * and returns integer
	 */
	public int playHole(Hole a, Player c) {
		
		//Creates scanner
		Scanner input = new Scanner(System.in);
		
		//Gets the yards and par for hole a and sets to value of variables
		int distance = a.getYards();
		int expPar = a.getPar();
		
		//Creates new clubFinder instance of findClub class 
		findClub clubFinder = new findClub();
		
		//Declares variables for use later
		int clubNum;
		club current;
		putt currentp;
		int power;
		int travel;
		int distancef;
		
		//Initializes variable parActual to 0 which here means # of strokes player used to finish hole
		int parActual = 0;
		
		//Creates new instance of Table class to print out putt and clubs informatively
		Table table = new Table();
		
		//Creates int array b equates it to the value of player c's score array to it. 
		int b[] = c.getScore();
		
		/* Prints out distance to hole and par of Hole
		 * Allows user to make informative decisions 
		 */
		System.out.println("The hole is " + distance + " yards away. The par for the hole is " + expPar);
		
		//Main while loop which continues while distance is not equal to 1 i.e. the ball is sunk.
		while (distance != 1) {
			
			//Adds to stroke counter
			parActual ++;
			
			//Asks user to choose club
			System.out.print("Choose your club [1-10]:");
			
			//Assigns value of user's int input to clubNum and runs its through clubFinder
			clubNum = input.nextInt();
			
			//Allows user to skip at any point by choosing -1 for club
			if (clubNum == -1) {
				System.out.println("The player has skipped this round");
				return parActual = expPar + 2;
			}
			
			//Allows user to skip at any point by choosing 0 for club
			if (clubNum == 0) {
				return 0;
			}
			
			//Assigns user's choice of club as the current club
			current = clubFinder.clubCurrent(clubNum);
		
			System.out.println();
			//Asks user to choose power
			System.out.print("Choose your power [1-10]:");
			
			//Assigns value of user's int input to power
			power = input.nextInt();
			System.out.println();
			
			/* Computes variable travel as the absolute value of
			 *  distance of user from hole minus distance ball traveled calculated with the swing method
			 */
			travel = Math.abs(distance - current.Swing(current, power));
			
			//Sets distance to travel;
			distance = travel;
			
			/*If conditional triggered when distance is greater than 21 yards, i.e., ball is out of the green
			 * else if conditional triggered if ball sunk from outside of green
			 * else statement triggered when ball is in the green i.e. distance less than equal to 20 yards
			 */
			if (distance >= 21) {
				
				//Prints out user's current position. 
				System.out.println("You are " + distance + " yards from the hole");
				System.out.println();
				System.out.println("Next shot! ");
				System.out.println();
				
			} else if (distance == 1 || distance  == 0) {
				//Declares end of hole and sets distance to 1 to break main while loop and breaks;
				System.out.println();
				System.out.println("Its in!");
				System.out.println();
				distance = 1; 
				break;
				
			} else { 
				//Informs the user that he is in the green
				System.out.println("You are in the green");
				System.out.println();
				
				//converts distance to feet and sets it to value of distancef
				distancef = distance*3;
				
				//Prints out putt table
				table.puttTable();
				System.out.println();
				
				/*While loop continues while distance is less than equal to 20 
				 * i.e. ball is still in the green;
				 */
				while (distance <= 20) {
					
					//Tells user's his position in feet
					System.out.println("You are " + distancef + " feet from the hole");
					
					//Adds to stroke count
					parActual ++;
					
					//Asks user to choose power
					System.out.print("Choose your power [1-10]:");
					
					//Assigns value of user's int input to power and runs its through puttFinder
					power = input.nextInt();
					System.out.println();
					
					//Allows user to skip at any point by choosing -1 for power
					if (power == -1) {
						System.out.println("The player has skipped this round");
						return parActual = expPar + 2;
					}
					
					//Allows user to skip at any point by choosing 0 for power
					if (power == 0) {
						return 0;
					}
					
					
					//Assigns user's choice of putt power as the current putt given choice of power
					currentp = clubFinder.puttCurrent(power);
					
					/* Computes variable travel as the absolute value of distance in feet of user from hole minus 
					 * distance in feet ball traveled calculated with the swing method
					 * Possible since both distancef and putt means and stddev are in feet
					 */
					travel = Math.abs(distancef - currentp.Swing(currentp));
					
					//Sets value of distancef to travel;
					distancef = travel;
					
					/*If statement triggered when distancef is <= 1 i.e. the ball is sunk
					 * else if statement triggered when distancef is >60 i.e. the ball is out of the green
					 * else statement triggered otherwise
					 */
					if (distancef <= 1) {
						//Prints out its in, sets distance to 1 to break while loop and breaks;
						System.out.println();
						System.out.println("Its in!");
						System.out.println();
						distance = 1; 
						break;
					} else if (distancef > 60) {
						/* Tells user ball is out of green and  
						 * reconverts distance to yards breaking while loop
						 */
						System.out.println();
						System.out.println("You are out of the green. ");
						distance = distancef/3;
					} else {
						System.out.println();
						System.out.println("Great shot! Do it again!");
					}
					
				}
				
			}
			
		}
			//parActual is the strokes used by user and expPar is the par of the hole
		
			/*Conditionals to use special scotish vocabulary to add genuinity to game
			 * bogey, double bogey, triple bogey, birdie, eagle, double eagle
			 */
		
			/*if statement triggered if user made par
			 * else if statement triggered if user made underPar
			 * else statement triggered if user made overPar
			 */
			if (parActual == expPar) {
				System.out.println();
				System.out.println("You made par on this round");
				System.out.println();
			
			} else if (parActual < expPar) {
				System.out.println();
				System.out.println("You made under par on this round");
				System.out.println();
			
					/*if expPar is one less than parActual declares birdie
					 * if expPar is two less than parActual declares eagle
					 * if expPar is three less than parActual declares birdie
					 */
					if (parActual + 1 == expPar) {
						System.out.println("That was a birdie!");
						System.out.println();
					} 
					if (parActual + 2 == expPar) {
						System.out.println("That was an eagle!!");
						System.out.println();
					}
					if (parActual + 3 == expPar) {
						System.out.println("That was a double eagle!!");
						System.out.println();
					}
	
			} else {
				System.out.println();
				System.out.println("You made over par on this round");
				System.out.println();
			
				/*if expPar is one more than parActual declares bogey
				 * if expPar is two more than parActual declares double bogey
				 * if expPar is three more than parActual declares triple bogey
				 */
				if (expPar + 1 == parActual) {
					System.out.println("That was a bogey.");
					System.out.println();

				} 
				if (expPar + 2 == parActual) {
					System.out.println("That was a double bogey..");
					System.out.println();

				}
				if (expPar + 3 == parActual) {
					System.out.println("That was a triple bogey...");
					System.out.println();

				}
		}
		
		//returns # of strokes by user
		return parActual;
		
	}
	
	
	

}
