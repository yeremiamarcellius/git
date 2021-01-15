package minggu6;

import java.util.Scanner;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
		
//		Mobil mobil1 = new citycar("My Car2", "Xenia", "Daihatsu", 10000000, "Sony", 7);
//		System.out.println(mobil1.getNama());
//		System.out.println(((citycar)mobil1).getSpeakertype());
//		mobil1.testdrive();
//		
//		Mobil mobil2 = new supercar("My Car2", "Xenia", "Daihatsu", 10000000, 200, 7);
//		System.out.println(mobil1.getNama());
//		System.out.println(((citycar)mobil1).getSpeakertype());
//		mobil2.testdrive();
	}
	Scanner scan = new Scanner(System.in);
	
	void clear() {
		for(int a = 0; a < 30; a++)
		{
			System.out.println();
		}
	}
	
	void Menu() {
		int choosemenu;
		do {
			System.out.println("Car Dealer");
			System.out.println("----------\n");
			System.out.println("1. Add new Car");
			System.out.println("2. View All Car");
			System.out.println("3. Update Car");
			System.out.println("4. Delete Car");
			System.out.println("5. Exit");
			System.out.print(">> ");
			choosemenu = scan.nextInt();
			scan.nextLine();
		}while(choosemenu < 1 || choosemenu > 5);
		
		switch (choosemenu) {
		case 1: {
			
			break;
		}
		case 2: {
			
			break;
		}
		case 3: {
	
			break;
		}
		case 4: {
	
			break;
		}
		
		}
	}
	
	void addcar() {
		String carname, cartype, carmanu, carmodel, speakertype;
		int carprice, totalseat;
		clear();
		System.out.println("Add Car");
		System.out.println("------\n");
		
		System.out.println("Insert Car Name: ");
		carname=scan.nextLine();
		
		System.out.println("Insert Car Type: ");
		cartype=scan.nextLine();
		
		System.out.println("Insert Car Manufacture: ");
		carmanu = scan.nextLine();
		
		System.out.println("Insert Car Price: ");
		carprice= scan.nextInt();
		scan.nextLine();
		
		do {
			System.out.println("Insert car model (supercar/citycar): ");
			carmodel=scan.nextLine();
		}while(!(carmodel.contentEquals("supercar")||carmodel.contentEquals("citycar")));
		
		if(carmodel.contentEquals("citycar"))
		{
			System.out.println("Input speaker Type: ");
			speakertype = scan.nextLine();
			
			System.out.println("Input total seat: ");
			totalseat=scan.nextInt();
			scan.nextLine();
		}else if(carmodel.contentEquals("supercar"))
		{
			System.out.println("input car top speed:");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
