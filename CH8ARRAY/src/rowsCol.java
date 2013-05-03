import java.util.*;
public class rowsCol {

	
	public static void main(String[] args) {
		
		int[][] array = new int[100][50];
		for(int row =0; row <100; row++)
			for(int col = 0; col<50; col++)
				array[row][col]=99;
		for(int item : array [0])
			System.out.print(item);
		}
	}


