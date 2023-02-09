import java.util.Scanner;
public class ExampleLogarithmTable {	    
	public static void main(String [] args) {
		double [][] sheet = new double[10][10];
		int size = sheet.length;
		for (int i=0;i< size;i++) {
			for (int j=0;j< size;j++) {
				if ((i>1) && (j>1))
					{sheet[i][j] = Math.log(i)/Math.log(j);
						// 5 character for the number with 2 after the decimal point
						System.out.format("log%1d(%1d)=%5.2f ",j,i,sheet[i][j]);}
			}
			System.out.println();
		}
		System.out.println("The program is ending.");
} //end main line
} //end class




