package Linked_list;

public class Node
{
    int data;
    Node next;//self ref structure
    Node(int data)
    {
        this.data=data;
        this.next=null;//next=null;
    }
}