package projects;
import java.util.Scanner;
import java.io.IOException;
class train{
	int train_num;
	int num_of_seats;
	String name;
}

public class railwayTicket {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		train t1=new train();
		ticket();
	
	}

	public static void ticket() {
		int anotherBooking;
		Scanner sc=new Scanner(System.in);
		System.out.println("===========================================================\n");
		System.out.println("                                                           \n");
		System.out.println("    welcome to karnataka railway ticket booking portal     \n");
		System.out.println("                                                           \n");
		System.out.println("===========================================================\n");
		System.out.println("press any key to continue");
		sc.nextLine();
		cls();
		 
		
		login();
		int menu_choice;
		
		System.out.println("===========================================================\n");
		System.out.println("                TRAIN RESERVATION SYSTEM                   \n");
		System.out.println("===========================================================\n");
		System.out.println("1>>RESERVE A TRAIN TICKET\n");
		System.out.println("------------------------------------------------------------\n");
		System.out.println("2>>VIEW AVAILABLE TRAINS\n");
		System.out.println("------------------------------------------------------------\n");
		System.out.println("3>>TO CANCEL RESERVATION\n");
		System.out.println("------------------------------------------------------------\n");
		System.out.println("4>>EXIT\n");
		System.out.println("------------------------------------------------------------\n");
		menu_choice=sc.nextInt();
		switch(menu_choice) {
		case 1:
		{
			reservation();
			System.out.println("do you want another booking ?\n>>1:press 1 to book\n>>2:press 2 to exit.. ");
			 anotherBooking=sc.nextInt();
			 if(anotherBooking==1) {
				 ticket();
			 }
			break;
		}
		case 2:
		{
			veiwdetails();
			System.out.println("press any key to go back to main menu....");
			 sc.nextLine();
			 System.out.println("do you want another booking ?\n>>1:press 1 to book\n>>2:press 2 to exit.. ");
			 anotherBooking=sc.nextInt();
			 if(anotherBooking==1) {
				 ticket();
			 }
			 break;
		}
		case 3:
		{
			cancel();
			System.out.println("do you want another booking ?\n>>1:press 1 to book\n>>2:press 2 to exit.. ");
			 anotherBooking=sc.nextInt();
			 if(anotherBooking==1) {
				 ticket();
			 }
			break;
		}
		case 4:
		{
			System.exit(0);
			break;
		}
		default :
		{
			System.out.println("invalid key");
			System.out.println("\nplease try again...");
			ticket();
		}
	}                                      
		
}

	private static void cancel() {
		train t1=new train();
		Scanner sc=new Scanner(System.in);
		System.out.println("your reservation has been cancelled...thankyou");
		
		System.out.println("\npress any key continue");
		 sc.nextLine();
		
	}

	private static void veiwdetails() {
		System.out.println("===========================================================");
		System.out.println("\n trainno\ttrainname\t\t\tdestinations\t\tcharges\t\ttime\n");
		System.out.println("-----------------------------------------------------------");
		System.out.println("\n1001\tANJATA EXPRESS\tMANMAD TO SECUNDERBAD\t1500\t9AM");
		System.out.println("\n1002\tBAGMATI EXPRESS\tMYSORE TO DARBHANGA\t1500\t10AM");
		System.out.println("\n1003\tCHENNAI EXPRESS\tCHENNAI TO BOMBAY\t1500\t11AM");
		System.out.println("\n1004\tSHATABDI EXPRESS\tBANGLORE TO CHENNAI\t1500\t12AM");
		System.out.println("\n1005\tRAJDHANI EXPRESS\tCHEANNI TO DELHI\t1500\t1PM");
		System.out.println("\n1006\tANJATA EXPRESS\tSECUNDERABAD TO MANMAD\t1500\t9PM");
		System.out.println("\n1007\tBAGMATI EXPRESS\tDARBHANGA TO MYSORE\t1500\t10PM");
		System.out.println("\n1008\tCHENNAI EXPRESS\tBOMBAY TO CHENNAI\t1500\t11PM");
		System.out.println("\n1009\tSHATABDI EXPRESS\tCHENNAI TO BANGLORE\t1500\t12PM");
		System.out.println("\n1010\tRAJDHANI EXPRESS\tDELHI TO CHENNAI\t1500\t1AM\n");
		System.out.println("===========================================================");
		}

	private static void reservation() {
		int charges;
		train t1=new train();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name: ");
		t1.name=sc.nextLine();
		System.out.println("enter number of seats: ");
		t1.num_of_seats=sc.nextInt();
		System.out.println("press any key to view available trains\n");
		sc.nextLine();
		cls();


		veiwdetails();
		
		System.out.println("\n\nenter your train number: ");
		t1.train_num=sc.nextInt();
		System.out.println("press any key to genrate your ticket");
		sc.nextLine();
		cls();
		if(t1.train_num>=1001&&t1.train_num<=1010) {
			System.out.println("--------------------------------------------------\n");
			System.out.println("                  TICKET                          \n");
			System.out.println("--------------------------------------------------\n");
			System.out.println("your name : "+t1.name);
			System.out.println("\nnumber of seats reserved : "+t1.num_of_seats);
			specificTrain(t1.train_num);
			 charges=t1.num_of_seats*1500;
			 System.out.println("\ntotal amount to be paid is: "+charges);
			 System.out.println("--------------------------------------------------\n");
			 System.out.println("\n\nyour reservation has been successfully completed");
		}else {
			System.out.println("\nInvalid train number");
			System.out.println("\n please do try again");
			reservation();
			
		}
		
		
	}

	private static void specificTrain(int train_num) {
		if (train_num==1001)
		{
			System.out.println("\nTrain:\t\t\tANJATA EXPRESS");
			System.out.println("\nDestination:\t\tMANMAD TO SECUNDERBAD");
			System.out.println("\nDeparture:\t\t9am ");
		}
		if (train_num==1002)
		{
			System.out.println("\nTrain:\t\t\tBAGMATI EXPRESS");
			System.out.println("\nDestination:\t\tMYSORE TO DARBHANGA");
			System.out.println("\nDeparture:\t\t10Am");
		}
		if (train_num==1003)
		{
			System.out.println("\nTrain:\t\t\tLA CHENNAI Express");
			System.out.println("\nDestination:\t\tCHENNAI TO BOMBAY");
			System.out.println("\nDeparture:\t\t11am");
		}
		if (train_num==1004)
		{
			System.out.println("\nTrain:\t\t\tLA SHATABDI EXPRESS");
			System.out.println("\nDestination:\t\tBANGLORE TO CHENNAI");
			System.out.println("\nDeparture:\t\t12am ");
		}
		if (train_num==1005)
		{
			System.out.println("\nTrain:\t\t\tRAJDHANI Express");
			System.out.println("\nDestination:\t\tCHENNAI TO DELHI");
			System.out.println("\nDeparture:\t\t1Pm");
		}
		if (train_num==1006)
		{
			System.out.println("\ntrain:\t\t\tANJATA EXPRESS");
			System.out.println("\nDestination:\t\tSECUNDERBAD to MANMAD");
			System.out.println("\nDeparture:\t\t9Pm ");
		}
		if (train_num==1007)
		{
			System.out.println("\ntrain:\t\t\tBAGMATI Express");
			System.out.println("\nDestination:\t\tDARBHANGA TO MYSORE");
			System.out.println("\nDeparture:\t\t10pm ");
		}
		if (train_num==1008)
		{
			System.out.println("\ntrain:\t\t\tCHENNAI Express");
			System.out.println("\n Destination:\t\tBOMBAY TO CHENNAIn");
			System.out.println("\nDeparture:\t\t11pm ");
		}
		if (train_num==1009)
		{
			System.out.println("\ntrain:\t\t\tSHATABDI EXPRESS");
			System.out.println("\nDestination:\t\tCHENNAI TO BANGLORE");
			System.out.println("\nDeparture:\t\t12pm ");
		}
		if (train_num==1010)
		{
			System.out.println("\ntrain:\t\t\tRAJDHANI EXPRESS");
			System.out.println("\nDestination:\t\tDELHI TO CHENNAI");
			System.out.println("\nDeparture:\t\t1AM ");
		}
			
		
	}

	private static void login() {
		Scanner sc=new Scanner(System.in);
		String username,password;
		System.out.println("\n===================login form================\n");
		System.out.println("\nenter username: ");
		username=sc.nextLine();
		System.out.println("\nenter password: ");
		password=sc.nextLine();
		if(username.equals("user")&&password.equals("pass")) {
			System.out.println("your login has been successfull\n");
			System.out.println("\npress any key to continue");
			sc.nextLine();
			cls();
		}else {
			System.out.println("the entered username or password is wrong...please do try again\n");
			login();
		}
		
	}
	public static void cls()
	{
		
		try
		{	
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}catch(Exception E)
			{
				System.out.println(E);           
			}
	}
}

