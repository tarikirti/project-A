package Linked_list;

public class Dynamic_stack {
	
		Node tos;
			
		void create_stack() 
		{
			tos = null;
			
			//firstly root is not there
		}
		
		
		void push(int e)
		{
			Node n = new Node(e);
			if(tos==null)
				tos = n;
			else
				n.next = tos;
				tos=n;
		}
		
		void pop()
	    {
	        if(tos==null)//not there then n is root
	            System.out.println("Empty Stack");
	        else
	        {
	            Node t=tos;//1
	            tos=tos.next;//2
	            System.out.println(t.data+" Element delete");
	        }
	    }		
		
		
		void peek() {
			if(tos == null)
				System.out.println("Empty Stack");
			else
				System.out.println(tos.data+ "Peek element");
		}
		
		void print_stack()
	    {  if(tos==null)
	            System.out.println("Empty stack");
	        else
	        {
	            Node t=tos;//1
	            while(t!=null)
	            {
	                System.out.println("|"+t.data+"|->");
	                System.out.println("---------------");
	                t=t.next;
	            }
	        }
	    
	    }
	    
		
		  

}
