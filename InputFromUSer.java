package helloworld;

import java.util.Scanner;

public class InputFromUSer {

	public static void main(String[] args) {
		System.out.print("enter the name:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("The name is " + s);
	}

}
