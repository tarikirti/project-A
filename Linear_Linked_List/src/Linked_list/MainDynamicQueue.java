package Linked_list;

import java.util.Scanner;

public class MainDynamicQueue {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.create_DyQueue();
		int choice;
		int e;
		do {
			//Menu
			
			System.out.println("\n1.Enqueue \n2.Dequeue \n3.Print Dynamic Queue \n0Exit \n:");
			choice = in.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Data: ");
				e = in.nextInt();
				dq.enqueue(e);
				
				break;
			case 2:
				dq.dequeue();				
				break;
			case 3:
				System.out.println("Data in Dynamic Queue");
				dq.print_DyQueue();
				break;
				
			case 0:
				System.out.println("Thanks for using code, Coded by Kirti");
				break;
				
			default:
				System.out.println("Wrong option is selected: ");
				break;

			}
				
		}
		while(choice !=0);
	}

}
