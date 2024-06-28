package Linked_list;

import java.util.Scanner;

public class MainDynamicStack {

	public static void main(String[] args) {
		Dynamic_stack obj=new Dynamic_stack();
	    Scanner in=new Scanner(System.in);
	    
	    int choice,e;
	    
	    do
	    {
	        //menu
	        System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
	        choice=in.nextInt();
	        switch(choice)
	        {
	            case 1:
	                System.out.println("Enter data: ");
	                e=in.nextInt();
	                obj.push(e);
	                break;
	            case 2:
	                obj.pop();
	                break;
	            case 3:
	            	obj.peek();
	                break;
	            case 4:
	                System.out.println("Elements inn Dynamic Stack: ");
	                obj.print_stack();
	                break;
	            case 0:
	                System.out.println("Thanks for using code , coded by amartechnavigator");
	                break;
	            default:
	                System.out.println("Wrong option selsected:");
	                break;
	        }

	    }
	    while(choice!=0);
	}
}
	

	


