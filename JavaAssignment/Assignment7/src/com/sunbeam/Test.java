package com.sunbeam;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	int choice =0;

	int totalMatchesPlayed=0;
	int totalRuns=0;
	int totalWickets =0;
	
	Player [] arr = new Player[2];
do {
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit\n"
				+ "1. Add team\n"
				+ "2. Find total matches played, total runs scored, total wickets taken by team\n"
				+ "3. Display Individual Player Records\n"
			
				+ "Enter your choice: ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 0:
			break;
		case 1:
	for(int i=0; i<2;i++) {
     arr[i] = new Cricketer();
	 arr[i].accept();
	//System.out.println(arr[i].toString());
	}
	break;
		case 2:
for(Player p :arr)	{
	totalMatchesPlayed += p.getMatchesPlayed();
	System.out.println("total matches played:"+totalMatchesPlayed);
	if(p instanceof Cricketer) {
		Cricketer c = (Cricketer)p;
		totalRuns += c.getRuns();
		totalWickets+=c.getWickets();
	}
}
break;
		case 3:
//			Cricketer c = new Cricketer();
			for(Player p: arr ) {
				System.out.println("all players:"+p.toString());
			}
			break;
		
		}
}
while(choice!=0);
}
}

