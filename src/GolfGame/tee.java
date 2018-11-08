package GolfGame;

/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */

/*Purpose: To allow for informative printing of what tee the player is at uses basic if-elseif-else conditional*/

public class tee {
	
	int i;

	
	public tee(int i) {
		this.i = i;
	}

	public String teePlace(int i) {
		if (i == 1) {
			return "You are at the first tee: ";
		}else if (i == 2) {
			return "You are at the second tee: ";
		}else if (i == 3) {
			return "You are at the third tee: ";
		}else if (i == 4) {
			return "You are at the fourth tee: ";
		}else if (i == 5) {
			return "You are at the fifth tee: ";
		}else if (i == 6) {
			return "You are at the sixth tee: ";
		}else if (i == 7) {
			return "You are at the seventh tee: ";
		}else if (i == 8) {
			return "You are at the eight tee: ";
		}else if (i == 9) {
			return "You are at the ninth tee: ";
		}else if (i == 10) {
			return "You are at the tenth tee: ";
		}else if (i == 11) {
			return "You are at the eleventh tee: ";
		}else if (i == 12) {
			return "You are at the twelveth tee: ";
		}else if (i == 13) {
			return "You are at the thirteenth tee: ";
		}else if (i == 14) {
			return "You are at the fourteenth tee: ";
		}else if (i == 15) {
			return "You are at the fifteenth tee: ";
		}else if (i == 16) {
			return "You are at the sixteenth tee: ";
		}else if (i == 17) {
			return "You are at the seventeenth tee: ";
		}else {
			return "You are at the eighteenth tee: ";
		}
	}
}
