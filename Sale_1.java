package Report03;

public class Sale_1 {
		public static void main(String srgs[]) {
				int sale[] = new int[]{157,209,251,312};
			
			for(int i = 0; i<5; i++)
				System.out.printf("%d/4분기 : sale[%d]= %d %n",i+1,i,sale[i]);
		}
}