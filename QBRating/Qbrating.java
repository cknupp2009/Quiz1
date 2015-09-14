package main;

import java.util.Scanner;

public class Qbrating {
	public static void main(String args[]){
		System.out.println("Welcome to QB Rating. Please follow the directions to input all five statistics so we can calculate your QB rating");
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Input the number of touchdowns: ");
		double touchdowns = scnr.nextInt();
		
		System.out.println("Input total yards: ");
		double totalYards = scnr.nextInt();
		
		System.out.println("Input the number of interceptions thrown: ");
		double interceptions = scnr.nextInt();
		
		System.out.println("Input the number of completions: ");
		double comp = scnr.nextInt();
		
		System.out.println("Insert number of attempted passes: ");
		double attemptedPasses = scnr.nextInt();
		
		
		double a =((comp / attemptedPasses) - .3) * 5;
		
		double b = ((totalYards / attemptedPasses) - 3) * .25;
		
		double c = (touchdowns / attemptedPasses) * 20;
		
		double d = 2.375 - ((interceptions / attemptedPasses)* 25);
		
		double passerRating = (a + b + c + d) / 6;
		
		System.out.println("Your passer rating is " + passerRating);
		
		

	}


}
