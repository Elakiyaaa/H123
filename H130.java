package GUVI;

import java.util.Scanner;

public class H130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String b=s.next();
String a[]={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
for(int i=0;i<a.length;i++){
if(b.equals("SUNDAY")){
	System.out.println("FALSE");
	break;
}
else{
	System.out.println("TRUE");
	break;
	}
}
	}

}
