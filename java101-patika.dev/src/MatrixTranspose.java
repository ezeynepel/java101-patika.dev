
public class MatrixTranspose {
	public static void main(String[] args) {
		int [][] matrix = {
				{1, 2, 3},
				{4, 5, 6}
				};
		transpose(matrix);
		
	}
	
	public static void transpose (int[][] arr) {
		int a = arr.length;
		int b = arr[0].length;
		
		int[][] array = new int[b][a];
		
		for(int i =0; i<a; i++) {
			for (int j = 0; j < b; j++) {
                array[j][i] = arr[i][j];
            }
		}
		
		System.out.println("Matris : ");
		for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("\nTranspoze: ");
        for(int i = 0; i < arr.length+1; i++) {
            for (int j = 0; j < arr.length; j++) {
                 array[i][j] = arr[j][i];
                System.out.print(array[i][j] + "    ");
            }
            System.out.println();

	}
	}	

}
