package Report03;

public class Sale_2_col {
	public static void main(String[] args) {
		int sale[][] = new int[][]
				{{63,84,140,130},{157,209,251,312}};
	
		for(int j=0; j<4; j++){
			for(int i=0; i<2; i++)
				System.out.printf("%d/4분기 : sale[%d][%d]= %d %n",i+1,j,i,sale[i][j]);
			System.out.println();
		}
	}
}