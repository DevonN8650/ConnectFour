package com.midwestoxidation.ConnectFour;
import java.util.*;
public class Runner{
	static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args){
		System.out.println("What size board would you like?");
		Board board = new Board(scanner.nextInt());
	}
}