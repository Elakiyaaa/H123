package GUVI;

import java.util.Scanner;

public class P35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str ="*";
String str1 = "**********";
int MAX = 10;
for (int row = 0; row <= MAX; row += 1 ) {
    for (int col = 0; col <= MAX ; col += 10) {
        if (row == 0 && col == 0)
            System.out.println(str1);
        if (row >= 1 && row <= 4)
            System.out.println(str + "        " + str);
        if (row == 10 && col == 10)
            System.out.println(str1);
    }
}
}


	}


