/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */


package GolfGame;

/*Summary of Class's Function:
 * Allows for selection of club & putt based on user's input
 */

//Creates public class findClub
public class findClub {
	
	//Declares variables
	club x;
	putt y;
	
	//Creates clubCurrent method which returns the club of number i;
	public club clubCurrent(int i) {
		
		//if-elseif-else conditional 
		if (i == 1) {
			x = new club(1,"Driver", 230, 30);
			return x;
		}else if (i == 2) {
			x = new club(2,"3-wood", 215, 20);
			return x;
		}else if (i == 3) {
			x = new club(3,"3-iron", 180, 20);
			return x;
		}else if (i == 4) {
			x = new club(4,"4-iron", 170, 17);
			return x;
		}else if (i == 5) {
			x = new club(5,"5-iron", 155, 15);
			return x;
		}else if (i == 6) {
			x = new club(6,"6-iron", 145, 15);
			return x;
		}else if (i == 7) {
			x = new club(7,"7-iron", 135, 15);
			return x;
		}else if (i == 8) {
			x = new club(8,"8-iron", 125, 15);
			return x;
		}else if (i == 9) {
			x = new club(9,"9-iron", 110, 10);
			return x;
		}else {
			x = new club(10,"Wedge", 50, 10);
			return x;
		}
	
	}
	
	//Creates puttCurrent method which returns the putt with power i;
	public putt puttCurrent(int i) {
		
		//if-elseif-else conditional 
		if (i == 1) {
			y = new putt(1, 1, 1);
			return y;
		}else if (i == 2) {
			y = new putt(2, 2, 1);
			return y;
		}else if (i == 3) {
			y = new putt(3, 4, 2);
			return y;
		}else if (i == 4) {
			y = new putt(4, 8, 3);
			return y;
		}else if (i == 5) {
			y = new putt(5, 12, 3);
			return y;
		}else if (i == 6) {
			y = new putt(6, 16, 3);
			return y;
		}else if (i == 7) {
			y = new putt(7, 20, 4);
			return y;
		}else if (i == 8) {
			y = new putt(8, 25, 4);
			return y;
		}else if (i == 9) {
			y = new putt(9, 30, 5);
			return y;
		}else {
			y = new putt(10, 40, 5);
			return y;
		}
	
	}

}
