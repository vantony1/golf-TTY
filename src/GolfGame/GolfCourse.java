/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */

package GolfGame;

/*Summary of Class's Function:
 * This class is supposed to allow for creation of new GolfCourse and stimulate the game as a hole
 * and its variants
 */

//imports important Java utilities 
import java.util.Scanner;
import java.util.stream.IntStream;

//Creates public class GolfCourse
public class GolfCourse {

	//Declares variables
	private String name;
	private String location;
	private Hole hole1;
	private Hole hole2;
	private Hole hole3;
	private Hole hole4;
	private Hole hole5;
	private Hole hole6;
	private Hole hole7;
	private Hole hole8;
	private Hole hole9;
	private Hole hole10;
	private Hole hole11;
	private Hole hole12;
	private Hole hole13;
	private Hole hole14;
	private Hole hole15;
	private Hole hole16;
	private Hole hole17;
	private Hole hole18;
	
	//GolfCourse constructor which creates new instance, with name, location and 18 holes.
	public GolfCourse(String name, String location, Hole hole1, Hole hole2, Hole hole3, Hole hole4, Hole hole5, Hole hole6, Hole hole7,
			Hole hole8, Hole hole9, Hole hole10, Hole hole11, Hole hole12, Hole hole13, Hole hole14, Hole hole15,
			Hole hole16, Hole hole17, Hole hole18) {
		this.name = name;
		this.location = location;
		this.hole1 = hole1;
		this.hole2 = hole2;
		this.hole3 = hole3;
		this.hole4 = hole4;
		this.hole5 = hole5;
		this.hole6 = hole6;
		this.hole7 = hole7;
		this.hole8 = hole8;
		this.hole9 = hole9;
		this.hole10 = hole10;
		this.hole11 = hole11;
		this.hole12 = hole12;
		this.hole13 = hole13;
		this.hole14 = hole14;
		this.hole15 = hole15;
		this.hole16 = hole16;
		this.hole17 = hole17;
		this.hole18 = hole18;
	}

	//Generates getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Hole getHole1() {
		return hole1;
	}

	public void setHole1(Hole hole1) {
		this.hole1 = hole1;
	}

	public Hole getHole2() {
		return hole2;
	}

	public void setHole2(Hole hole2) {
		this.hole2 = hole2;
	}

	public Hole getHole3() {
		return hole3;
	}

	public void setHole3(Hole hole3) {
		this.hole3 = hole3;
	}

	public Hole getHole4() {
		return hole4;
	}

	public void setHole4(Hole hole4) {
		this.hole4 = hole4;
	}

	public Hole getHole5() {
		return hole5;
	}

	public void setHole5(Hole hole5) {
		this.hole5 = hole5;
	}

	public Hole getHole6() {
		return hole6;
	}

	public void setHole6(Hole hole6) {
		this.hole6 = hole6;
	}

	public Hole getHole7() {
		return hole7;
	}

	public void setHole7(Hole hole7) {
		this.hole7 = hole7;
	}

	public Hole getHole8() {
		return hole8;
	}

	public void setHole8(Hole hole8) {
		this.hole8 = hole8;
	}

	public Hole getHole9() {
		return hole9;
	}

	public void setHole9(Hole hole9) {
		this.hole9 = hole9;
	}

	public Hole getHole10() {
		return hole10;
	}

	public void setHole10(Hole hole10) {
		this.hole10 = hole10;
	}

	public Hole getHole11() {
		return hole11;
	}

	public void setHole11(Hole hole11) {
		this.hole11 = hole11;
	}

	public Hole getHole12() {
		return hole12;
	}

	public void setHole12(Hole hole12) {
		this.hole12 = hole12;
	}

	public Hole getHole13() {
		return hole13;
	}

	public void setHole13(Hole hole13) {
		this.hole13 = hole13;
	}

	public Hole getHole14() {
		return hole14;
	}

	public void setHole14(Hole hole14) {
		this.hole14 = hole14;
	}

	public Hole getHole15() {
		return hole15;
	}

	public void setHole15(Hole hole15) {
		this.hole15 = hole15;
	}

	public Hole getHole16() {
		return hole16;
	}

	public void setHole16(Hole hole16) {
		this.hole16 = hole16;
	}

	public Hole getHole17() {
		return hole17;
	}

	public void setHole17(Hole hole17) {
		this.hole17 = hole17;
	}

	public Hole getHole18() {
		return hole18;
	}

	public void setHole18(Hole hole18) {
		this.hole18 = hole18;
	}
	
	
	//Inititate method to start one player version of the game
	public void initiate() {
		
		//Creates new scanner and declares variable parActual which keeps track of # of strokes used by the user in each round
		Scanner input = new Scanner(System.in);
		int parActual = 0;
		
		//Creates instances of table and quit
		Table table = new Table();
		Quit quiter = new Quit();
		
		//Declares variable
		String quit;
		int expPar;
		
		//Creates int array p1score that keeps a record of player one's score
		int[] p1score = new int[18];
		
		//Creates new Player player1 with name Player 1 and p1score
		Player player1 = new Player("Player 1", p1score);
		
		//For loop that guides the user through the 18 holes
		for (int i = 1; i <= 18; i = i + 1) {
			parActual = 0;
			
			//Creates right hole for the round by calling on findHole function with i
			Hole a = findHole(i);
			
			//Gets hole a's par and assigns its value to expPar
			expPar = a.getPar();
			
	
			
			if (i > 1) {
				
				//Provides user option to skip round, or quit whole game or just continue with game
				System.out.println();
				System.out.println("If you want to skip the upcoming round, enter skip;");
				System.out.println("If you want to quit this game, enter quit;");
				System.out.println("If you want to continue with playing, enter continue;");
				System.out.println();
				
				//Assigns user's input as value of String quit
				quit = input.nextLine();
				
				/*If conditional triggered when user input skip
				 * else if conditional triggered when user input quit
				 * else statement triggered otherwise
				 */
				if (quit.equalsIgnoreCase("skip")) {
					//Assigns user score of expPar + 2 for that round
					player1.scoring(i-1, expPar + 2);
					//Calls on quitter's skipRound method for i
					i = i++;
					System.out.println("Okay! You skipped the round");
					System.out.println();
					continue;
				} else if (quit.equalsIgnoreCase("quit")) {
					//Prints out player's forfieture 
					System.out.println("Player 1 has forfietted");
					//Breaks loop
					break;
				} else {
					//Prints continuation and continues;
					System.out.println("Great! Let's continue");
				}
				
				}
			
			
			//Prints out list of all clubs in a tabular format
			table.clubTable();
			System.out.println();
			
			//Creates new tee temp with int i 
			tee temp = new tee(i);
		
			//Prints out the calling of teePlace method of temp
			//Essentially printing out which tee the user is in.
			System.out.println();
			System.out.println(temp.teePlace(i));
			System.out.println();
			
			
			//Calls on playHole method with hole a and player1 and assigns returned value to parActual
			parActual = a.playHole(a, player1);
			
			//Allows player to quit game at any point 
			if (parActual == 0) {
				System.out.println("Player 1 has forfietted");
				break;	
			}
			
			
			//Assigns value parActual to p1score's ith element
			p1score[i-1] = parActual;

			//Prints out result of the game informatively
			System.out.println("You took " + parActual + " shots to finish the round.");
			System.out.println();
			
			
			
			
		}
		
		//Prints out user's final results informatively for the selected course
		System.out.println("You have finsished the selected course");
		System.out.println("Your scoring was as follows: ");
		System.out.print("Player 1 Record: " );
		player1.printScore();
		System.out.println();

		
		
	}
	
	//TwoPlayerInitiate method to start two player version of the game
	public void TwoPlayerInitiate() {
		
		//Creates neccesary instances and variables similar to those of initiate 
		Scanner input = new Scanner(System.in);
		int parActual1;
		int parActual2;
		Table table = new Table();
		String quit;
		Quit quiter = new Quit();
		int expPar;
		
		//Creates two int arrays to keep track of the player's score for each round
		int[] p1score = new int[18];
		int[] p2score = new int[18];
		
		//Creates two player
		Player player1 = new Player("Player 1", p1score);
		Player player2 = new Player("Player 2", p2score);
	
		//Creates two booleans for purposes of controlling response in time of quitting by a player
		boolean p1quit = false;
		boolean p2quit = false;
		boolean p1skip = false;
		
		
		//For loop that guides the user through the 18 holes
		for (int i = 1; i <= 18; i = i + 1) {
			
			//Creates right hole for the round by calling on findHole function with i
			Hole a = findHole(i);
			

			//Gets hole a's par and assigns its value to expPar
			expPar = a.getPar();
				
			if (i > 1) {
				
				//Provides user option to skip round, or quit whole game or just continue with game
				System.out.println();
				System.out.println("Player 1: If you want to skip the upcoming round, enter skip;");
				System.out.println("If you want to quit this game, enter quit;");
				System.out.println("If you want to continue with playing, enter continue;");
				System.out.println();
				
				//Assigns user's input as value of String quit
				quit = input.nextLine();
				
				/*If conditional triggered when user input skip
				 * else if conditional triggered when user input quit
				 * else statement triggered otherwise
				 */
				if (quit.equalsIgnoreCase("skip")) {
					//Assigns user score of expPar + 2 for that round
					player1.scoring(i-1, expPar + 2);
					player2.scoring(i-1, expPar - 1);
					//Calls on quitter's skipRound method for i
					//quiter.skipRound(i);
					i = i++;
					System.out.println("Okay! You skipped the round");
					System.out.println();
					p1skip = true;
					continue;
				} else if (quit.equalsIgnoreCase("quit")) {
					//Prints out player's forfieture 
					System.out.println("Player 1 has forfietted");
					System.out.println();
					//Breaks loop
					break;
				} else {
					//Prints continuation and continues;
					System.out.println("Great! Let's continue");
					System.out.println();
					
				}
				
				if (i > 1 && p1skip == true) {
					
					//Provides user option to skip round, or quit whole game or just continue with game
					System.out.println();
					System.out.println("Player 2: If you want to skip the upcoming round, enter skip;");
					System.out.println("If you want to quit this game, enter quit;");
					System.out.println("If you want to continue with playing, enter continue;");
					System.out.println();
					
					//Assigns user's input as value of String quit
					quit = input.nextLine();
					
					/*If conditional triggered when user input skip
					 * else if conditional triggered when user input quit
					 * else statement triggered otherwise
					 */
					if (quit.equalsIgnoreCase("skip")) {
						//Assigns user score of expPar + 2 for that round
						player2.scoring(i-1, expPar + 2);
						player1.scoring(i-1, expPar - 1);
						//Calls on quitter's skipRound method for i
						//quiter.skipRound(i);
						i = i++;
						System.out.println("Okay! You skipped the round");
						System.out.println();
					} else if (quit.equalsIgnoreCase("quit")) {
						//Prints out player's forfieture 
						System.out.println("Player 2 has forfietted");
						System.out.println();
						//Breaks loop
						break;
					} else {
						//Prints continuation and continues;
						System.out.println("Great! Let's continue");
						System.out.println();
						
					}
					
					}
				
				}
			
			
				
			
			//Prints out list of all clubs in a tabular format
			table.clubTable();
			System.out.println();
			
			//Creates new tee temp with int i 
			tee temp = new tee(i);
	
			//Prints out the calling of teePlace method of temp
			//Essentially printing out which tee the user is in.
			System.out.println();
			System.out.println("Its player one's turn");
			System.out.println(temp.teePlace(i));
			System.out.println();
			
			
			//Calls on playHole method with hole a and player1 and assigns returned value to parActual1
			parActual1 = a.playHole(a, player1);
			
			//Allows player to quit game at any point 
			if (parActual1 == 0) {
				System.out.println("Player 1 has forfietted");
				System.out.println("Player 2 Wins!");
				p1quit = true;
				break;	
			}
			
			
			//Prints out result of the player 1's play informatively
			System.out.println("Player 1 took " + parActual1 + " shots to finish the round.");
			System.out.println();
			
			//Assigns value parActual1 to p1score's ith element
			p1score[i-1] = parActual1;
			
			//Prints out that its player 2's turn and the tee.
			System.out.println();
			System.out.println("Its player two's turn");
			
			
			
			System.out.println(temp.teePlace(i));
			System.out.println();
			
			
			//Calls on playHole method with hole a and player2 and assigns returned value to parActual1
			parActual2 = a.playHole(a, player2);
			
			//Allows player to quit game at any point 
			if (parActual2 == 0) {
				System.out.println("Player 2 has forfietted");
				System.out.println("Player 1 Wins!");
				p2quit = true;
				break;	
			}
			
			//Assigns value parActual2 to p2score's ith element
			p2score[i-1] = parActual2;
			
			//Prints out result of Player2's game
			System.out.println("Player 2 took " + parActual2 + " shots to finish the round.");
			System.out.println();
		
		
		}
		
		//Prints out final result of the game informatively
		System.out.println("You have finsished the selected course");
		System.out.println("THe scoring was as follows: ");
		System.out.print("Player 1 Record: " );
		player1.printScore();
		System.out.println();
		System.out.print("Player 2 Record: " );
		player2.printScore();
		
		//Totals both players' score i.e. total number of strokes taken
		int total_scorep1 = IntStream.of(p1score).sum();
		int total_scorep2 = IntStream.of(p2score).sum();
		
		System.out.println();
		//Triggered if niether player quit
		if (p1quit != true && p2quit != true) { 
			
			//Prints out who won based on who used less strokes or else declares a tie
			if (total_scorep2 < total_scorep1) {
			System.out.println("Player Two Wins!");
			} else if (total_scorep1 < total_scorep2) {
			System.out.println("Player One Wins!");
			} else {
			System.out.println("Its a Tie!");
			}
		}
		
	}
	
	//Creates method AIinitiate to launch the human vs computer version of the game
	public void AIinitiate() {
			//Creates required instances of classes and declares variables
			Scanner input = new Scanner(System.in);
			int parActual;
			int parAI;
			int expPar;
			Table table = new Table();
			String quit;
			Quit quiter = new Quit();
			boolean p1quit = false;
			
			//Creates a Player named Player 1 and a int array to keep track of his score
			int[] p1score = new int[18];
			Player player1 = new Player("Player 1", p1score);
			
			//Creates an OpponentAI and an int array to keep track of its score
			OpponentAI AI = new OpponentAI();
			int[] AIscore = new int[18];
			
			//For loop that guides the user through the 18 holes
			for (int i = 1; i <= 18; i = i + 1) {
				
				//Creates right hole for the round by calling on findHole function with i
				Hole n = findHole(i);
				
				//Gets the par of hole n and sets the value of expPar to it
				expPar = n.getPar();
				
				if (i > 1) {
					
					//Provides user option to skip round, or quit whole game or just continue with game
					System.out.println();

					System.out.println("Player 1: If you want to skip the upcoming round, enter skip;");
					System.out.println("If you want to quit this game, enter quit;");
					System.out.println("If you want to continue with playing, enter continue;");
					
					System.out.println();
					//Assigns user's input as value of String quit
					quit = input.nextLine();
					
					/*If conditional triggered when user input skip
					 * else if conditional triggered when user input quit
					 * else statement triggered otherwise
					 */
					if (quit.equalsIgnoreCase("skip")) {
						//Assigns user score of expPar + 2 for that round
						player1.scoring(i-1, expPar + 2);
						//Calls on quitter's skipRound method for i
						quiter.skipRound(i);
						System.out.println();
						continue;
					} else if (quit.equalsIgnoreCase("quit")) {
						//Prints out player's forfieture 
						System.out.println("Player 1 has forfietted");
						System.out.println();
						//Breaks loop
						break;
					} else {
						//Prints continuation and continues;
						System.out.println("Great! Let's continue");
						System.out.println();
						}
					
					}
				
				//Prints out list of all clubs in a tabular format
				table.clubTable();
				System.out.println();
				
				//Creates new tee temp with int i 
				tee temp = new tee(i);
				
				//Prints out the calling of teePlace method of temp
				//Essentially printing out which tee the user is in.
				System.out.println();
				System.out.println(temp.teePlace(i));
				System.out.println();
				
				
				
				//Calls on playHole method with hole a and player1 and assigns returned value to parActual
				parActual = n.playHole(n, player1);
				
				//Player can quit at any time
				if (parActual == 0) {
					System.out.println("Player 1 has forfietted");
					System.out.println("The AI Wins!");
					p1quit = true;
					break;	
				}
				
				
				//Assigns value parActual to p1score's ith element
				p1score[i-1] = parActual;
				
				//Prints out result of round informatively 
				System.out.println("You took " + parActual + " shots to finish the round.");
				
				
				//Calls on Golfer method with hole n and assigns returned value to parAI
				parAI = AI.Golfer(n);
							
				//Assigns value parAI to p1score's ith element
				AIscore[i-1] = parAI;
				
				//Prints out result of round's AI play informatively
				System.out.println("The AI took " + parAI + " shots to finish the round.");
				
				
			}
			
			//Prints out final result of the game informatively
			System.out.println("You have finsished the selected course");
			System.out.println("Your scoring was as follows: ");
			System.out.print("Player 1 Record: " );
			player1.printScore();
			System.out.println();
			System.out.print("AI Record: " );
			AI.printArray(AIscore);
			System.out.println();
			System.out.println();
			
			//Totals both players' score i.e. total number of strokes taken
			int total_scorep1 = IntStream.of(p1score).sum();
			int total_scoreAI = IntStream.of(AIscore).sum();
			
			System.out.println();
			
			if (p1quit != true) {
			//Prints out who won based on who used less strokes or else declares a tie
			if (total_scoreAI < total_scorep1) {
				System.out.println("AI Wins!");
			} else if (total_scorep1 < total_scoreAI) {
				System.out.println("Player One Wins!");
			} else {
				System.out.println("Its a Tie!");
			}
			}
		}
		
		//findHole method that finds the right hole for ith loop of for loop
		public Hole findHole(int i) {
			
			if (i == 1) {
				return hole1;
			}else if (i == 2) {
				return hole2;
			}else if (i == 3) {
				return hole3;
			}else if (i == 4) {
				return hole4;
			}else if (i == 5) {
				return hole5;
			}else if (i == 6) {
				return hole6;
			}else if (i == 7) {
				return hole7;
			}else if (i == 8) {
				return hole8;
			}else if (i == 9) {
				return hole9;
			}else if (i == 10) {
				return hole10;
			}else if (i == 11) {
				return hole11;
			}else if (i == 12) {
				return hole12;
			}else if (i == 13) {
				return hole13;
			}else if (i == 14) {
				return hole14;
			}else if (i == 15) {
				return hole15;
			}else if (i == 16) {
				return hole16;
			}else if (i == 17) {
				return hole17;
			}else {
				return hole18;
			}
			
		}
		
	
	
	
}
