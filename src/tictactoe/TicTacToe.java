package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	static List<Integer> playerMoves = new ArrayList<>();
	static List<Integer> cpuMoves = new ArrayList<>();
	
	static String result;

	public static void main(String[] args) {

// *************** Global variables to keep track of movements

		System.out.println(" \n It is TicTacToe game! \n Please, play with Robot!\n");

		// Create a game board

		char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
		// Print the board
		printBoard(gameBoard);

		while (true) {

// ***************** Player TURN ************************
			// Create Scanner to get input from user
			Scanner scan = new Scanner(System.in);
			

			// Prompt the user to enter position
			System.out.println("\n Your Turn! \n Please enter your placement (1-9): ");
			int playerPosition = scan.nextInt();

			while (playerMoves.contains(playerPosition) || cpuMoves.contains(playerPosition)) {
				System.out.println("\n This place is occupied! Please choose another");
				playerPosition = scan.nextInt();
				;
			}

			// make a Player placement in the Board
			usersPlacement(playerPosition, gameBoard, "player");
			System.out.println();
			// Print the board
			printBoard(gameBoard);

// ***************** CHECK WINNER **********************
			
			result = checkWinner();

			if (result.length() > 0) {
				System.out.println(result);
				break;
			} 
			

// ***************** CPU TURN ************************

			Random random = new Random();
			int cpuPosition = random.nextInt(9) + 1;

			while (playerMoves.contains(cpuPosition) || cpuMoves.contains(cpuPosition)) {
				cpuPosition = random.nextInt(9) + 1;
			}
			usersPlacement(cpuPosition, gameBoard, "comp");
			System.out.println();
			// Print the board
			System.out.println("Robot turn");
			printBoard(gameBoard);

// ***************** CHECK WINNER **********************

			result = checkWinner();

			if (result.length() > 0) {
				System.out.println(result);
				break;
			} 

		}

	}

	private static String checkWinner() {
		// Define the conditions to win
		// Create a list of positions for each win-case
		List<Integer> leftColumn = Arrays.asList(1, 4, 7);
		List<Integer> midColumn = Arrays.asList(2, 5, 8);
		List<Integer> rightColumn = Arrays.asList(3, 6, 9);

		List<Integer> topRow = Arrays.asList(1, 2, 3);
		List<Integer> midRow = Arrays.asList(4, 5, 6);
		List<Integer> bottomRow = Arrays.asList(7, 8, 9);

		List<Integer> deagonal1 = Arrays.asList(1, 5, 9);
		List<Integer> deagonal2 = Arrays.asList(3, 5, 7);

		// Add each case to the common list of win-conditions
		List<List<Integer>> bigWinList = new ArrayList<>();
		bigWinList.add(deagonal2);
		bigWinList.add(deagonal1);
		bigWinList.add(bottomRow);
		bigWinList.add(midRow);
		bigWinList.add(topRow);
		bigWinList.add(rightColumn);
		bigWinList.add(midColumn);
		bigWinList.add(leftColumn);

		// Check if playerMoves or cpuMoves contains one of win cases

		for (List<Integer> winCase : bigWinList) {
			if (playerMoves.containsAll(winCase))
				return "\nCongrats! You won!";
			if (cpuMoves.containsAll(winCase))
				return "\nGAME OVER! \nSorry, you lose!";
		}

		if (playerMoves.size() + cpuMoves.size() == 9)
			return "\nDraw!";

		return "";
	}

	private static void usersPlacement(int position, char[][] gameBoard, String user) {

		char mark;
		if (user.equals("player")) {
			mark = 'X';
			playerMoves.add(position);
		} else {
			mark = 'O';
			cpuMoves.add(position);
		}

		switch (position) {
		case 1:
			gameBoard[0][0] = mark;
			break;
		case 2:
			gameBoard[0][2] = mark;
			break;
		case 3:
			gameBoard[0][4] = mark;
			break;
		case 4:
			gameBoard[2][0] = mark;
			break;
		case 5:
			gameBoard[2][2] = mark;
			break;
		case 6:
			gameBoard[2][4] = mark;
			break;
		case 7:
			gameBoard[4][0] = mark;
			break;
		case 8:
			gameBoard[4][2] = mark;
			break;
		case 9:
			gameBoard[4][4] = mark;
			break;
		default:
			break;
		}

	}

	private static void printBoard(char[][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
