package multidimensionRay;

public class dimensions {

	public static void main(String[] args) {
		//0th piece of code for array
	 int [] value = {1,2,4,6,7,8,9};
	 System.out.println(value[3]);

	 //1st piece of code for 2D array
	int[][] grid = {
			{1,2,3,456},
			{234,456,765,998},
			{142526,25637,738399,99393}
	};
	
	System.out.println(grid[2][2]);
	System.out.println(grid[0][3]);
	System.out.println(grid[1][3]);
	
	//2nd piece of code String array
	String[][] text = new String[2][3];
	text[1][1]= "hello there";
	
	System.out.println(text[1][1]);
	
	//3rd piece of code printing 2D array with nested for loop
	for(int row=0; row < grid.length; row++) {
		for (int col=0; col< grid[row].length; col++) {
			
			System.out.print(grid[row][col] + "\t" );
			
		}
		System.out.println();
		
	}
	
	}
	
	
	

}
