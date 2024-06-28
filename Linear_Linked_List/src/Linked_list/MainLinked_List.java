/*package Linked_list;

import java.util.Scanner;

public class MainLinked_List {

	public static void main(String[] args) {
		list obj= new list();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Linked List: ");
		int size = sc.nextInt();
		obj.create_list();
		
		int choice,e;
	
		do {
			
			System.out.println("\n1.Insert Left \n2.Insert Right \n3.Delete Left \n4.Delete Right \n5.Print LinkedList");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println("Insert Left data elements: ");
					e = sc.nextInt();
					obj.insert_left(e);
				
				break;
				case 2:
					System.out.println("Insert Right data elements: ");
					e = sc.nextInt();
					obj.insert_right(e);
					break;
					
				case 3:
					obj.delete_left()
					System.out.println("Delete Element from left ");
					break;
					
				case 4:
					obj.delete_right();
					System.out.println("Delete Element from Right ");
					break;
					
				case 5:
					
					System.out.println("Print List: ");
					obj.print_list();
					break;
				case 6:
					System.out.println("Enter data");
					e = sc.nextInt();
					
					
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
*/