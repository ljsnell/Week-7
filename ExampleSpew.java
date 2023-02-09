//this program illustrates 3D Temp Array
import java.util.Scanner;
public class ExampleSpew {
	static Scanner userinput = new Scanner(System.in);
	public static void main (String[] args)
	{
	int size;
	double [][][] temp = new double[5][5][5];
	double [][][] tempCopy = new double[5][5][5];
	
	size = temp.length;
	
	//initialize temp
	for (int x=0;x< size;x++) {
		for (int z=0;z< size;z++) {
			for (int y=0; y< size; y++) {
			temp[x][y][z] = Math.random()*50;
			System.out.format("%3.0f",temp[x][y][z]);
			}
			System.out.print (" | ");
		}
		System.out.println();
	}

	
	//compute new temps
	for (int t = 0;t<=20;t++)
	{
	System.out.println();
	int n; // the quantity of temps to averages
		for (int x=0;x< size;x++) {
			for (int z=0;z< size;z++) {
				for (int y=0; y< size; y++) {
				tempCopy[x][y][z] = temp[x][y][z];
				n = 1;
				if (x>0) {tempCopy[x][y][z] += temp[x-1][y][z]; n++;}
				if (x<size -1){tempCopy[x][y][z] += temp[x+1][y][z]; n++;}
				if (y>0){tempCopy[x][y][z] += temp[x][y-1][z]; n++;}
				if (y<size -1){tempCopy[x][y][z] += temp[x][y+1][z]; n++;}
				if (z>0){tempCopy[x][y][z] += temp[x][y][z-1]; n++;}
				if (z<size -1){tempCopy[x][y][z] += temp[x][y][z+1]; n++;}
				tempCopy[x][y][z] = tempCopy[x][y][z]/n;
				System.out.format("%3.0f",tempCopy[x][y][z]);
				}
				System.out.print (" | ");
			}
			System.out.println();		
	}
	temp = tempCopy;
	}
	System.out.println("The program is ending.");
	} //end main line
	
} //end class
