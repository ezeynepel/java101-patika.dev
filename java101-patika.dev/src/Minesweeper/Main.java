package Minefield;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int row, col;
		
		System.out.println("Welcome to the minesweeper game! \nPlease select the size of the table.");
		System.out.print("Row: ");
		row = sc.nextInt();
		System.out.print("Column: ");
		col = sc.nextInt();
		
		MineField x = new MineField(row,col);
		
		x.run();
	}
	
	
	
	

}
