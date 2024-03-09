package Minefield;

import java.util.Random;
import java.util.Scanner;

public class MineField {
	int row, col, count = 0, size, success=0;
	int[][] map;
	int[][] board;
	boolean game = true;

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	MineField(int row, int col) {
		this.row = row;
		this.col = col;
		this.map = new int[row][col];
		this.board = new int[row][col];
	}

	public void run() {
		prepare();
		//print(map);
		System.out.println("Game has started!");
		while (game) {
			print(board);
			System.out.print("Enter the row you want to select: ");
			int selRow = sc.nextInt() - 1;
			System.out.print("Enter the column you want to select: ");
			int selCol = sc.nextInt() - 1;
			if (map[selRow][selCol] != -1) {
				game = true;
				check(selRow, selCol);
				success++;
				if(success == (size - (size/4))) {
					System.out.println("You have successfully completed the game. Congratulations!");
					break;
				}
			} else {
				System.out.println("You stepped on a mine. You lost!");
				game = false;
			}
		}
	}

	public void check(int r, int c) {
		int val = 0;
		row--;
		col--;
		if (r + 1 <= row && c - 1 >= 0 && map[r + 1][c - 1] == -1) {
			val++;
		}
		if (r + 1 <= row && map[r + 1][c] == -1) {
			val++;
		}
		if (r + 1 <= row && c + 1 <= col && map[r + 1][c + 1] == -1) {
			val++;
		}
		if (c - 1 >= 0 && map[r][c - 1] == -1) {
			val++;
		}
		if (c + 1 <= col && map[r][c + 1] == -1) {
			val++;
		}
		if (r - 1 >= 0 && c - 1 >= 0 && map[r - 1][c - 1] == -1) {
			val++;
		}
		if (r - 1 >= 0 && map[r - 1][c] == -1) {
			val++;
		}
		if (r - 1 >= 0 && c + 1 <= col && map[r - 1][c + 1] == -1) {
			val++;
		}
		board[r][c] = val;
	}

	public void prepare() {
		int randrow, randcol;
		this.size = row * col;
		while (count < size / 4) {
			randrow = rand.nextInt(row);
			randcol = rand.nextInt(col);
			if (map[randrow][randcol] != -1) {
				map[randrow][randcol] = -1;
			}
			count++;
		}
	}

	public void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] >= 0)
					System.out.print(" ");
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
