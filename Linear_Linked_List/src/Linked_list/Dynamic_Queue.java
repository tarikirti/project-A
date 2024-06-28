package Linked_list;

public class Dynamic_Queue {
	
	Node front, rear;
	
	void create_DyQueue() {
		rear = front = null;
	}
	
	void enqueue(int e) {
		Node n=new Node(e);//created
        if(rear==null)//not there then n is root
        	rear= front =n;
        else
        {
            rear.next=n;
            rear=n;
            
        }
        System.out.println(e+" Enqueued");
	}
	
	void dequeue() {

        if(front==null)//front for insert
            System.out.println("Empty Queue");
        else
        {
            Node t=front;//1
            if(front == rear)
            	front = rear = null;
            else
            	front=front.next;//2
            System.out.println(t.data+" Dequeued");
        }
	}
	
	void print_DyQueue()
    {  
		if(front==null)
            System.out.println("Empty Dynamic Queue");
        else
        {
            Node t=front;//1
            while(t!=null)
            {
            	
                System.out.println("|"+t.data+"|->");
                t=t.next;
            }
        }
    }
	
	
}
