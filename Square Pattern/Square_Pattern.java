import java.util.*;
public class Solution {


	public static void main(String[] args) {
		// scanner class object for taking input from user
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		// print square that have n value in every cell
		for(int row =1; row<=n; row++) {
			for(int col =1; col<=n; col++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}

}
