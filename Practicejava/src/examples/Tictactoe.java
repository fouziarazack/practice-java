package examples;

import java.util.Scanner;



public class Tictactoe {
	static char [][]board =new char[3][3];
	static char currentplayer = 'X';
	static boolean gamewon = false;
public static void initializeboard() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			board[i][j]='-';
			
			
		}
		
	}
	
	
}
public static void printboard() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(board[i][j]+" ");
		}
		System.out.println();
	}
	
}
public static void switchplayer() {
	if(currentplayer=='X') {
		currentplayer='O';
	}else {
		currentplayer='X';
	}
}
public static boolean checkWinner() {
	for(int i=0;i<3;i++) {
		if(board[i][0]==currentplayer && board[i][1]==currentplayer && board[1][2] == currentplayer) {
			return true;
		}
		if(board[0][i]==currentplayer && board[1][i]==currentplayer && board[2][i] == currentplayer) {
			return true;
		}
		
	}
	if(board[0][0]==currentplayer && board[1][1]==currentplayer && board[2][2] == currentplayer){
		return true;
	}
	if(board[0][2]==currentplayer && board[1][1]==currentplayer && board[2][0] == currentplayer) {
		return true;
	}
	return false;
}
	

public static boolean tiecheck() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(board[i][j]=='-') {
				return false;
			}
		}
	
	
}
	return true;
 }
public static void playgame() {
	Scanner scanner = new Scanner(System.in);
	while(!gamewon) {
		printboard();
		System.out.println("Player "+ currentplayer +",it's your turn!");
		System.out.println("Enter the row(0-2): ");
		int row= scanner.nextInt();
		System.out.println("Enter the column(0-2): ");
		int column = scanner.nextInt();
		if( 2<row || row<0 || 2<column || column<0 || board[row][column]!= '-' ) {
			System.out.println("Invalid move");
		}else {
			board[row][column]=currentplayer;
		
		
		
		
	}
		if (checkWinner()) {
	        printboard();
	        System.out.println("Player " + currentplayer + " wins!");
	        gamewon = true;
	    } else if (tiecheck()) {
	        printboard();
	        System.out.println("It's a tie!");
	        gamewon = true;
	    } else {
	        switchplayer();
	
		
	}
     
    }
	scanner.close();

}
public static void main(String[]args) {
	initializeboard();
	playgame();


}

}
 

	
	



	
	

	
		
	


