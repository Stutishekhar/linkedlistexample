/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eglinkedlist;
import java.util.Scanner;
/**
 *
 * @author stuti
 */
public class EgLinkedList 
{
    
    public static void main(String[]  args) //to create a linked list
    {
       
        
        Scanner input = new Scanner(System.in);
        /*System.out.println("Please enter data for first node");
        int a = input.nextInt();
        Node first = new Node(a);
        
        System.out.println("Please enter data for second node");
        a = input.nextInt();
        Node second = new Node(a);
        
        System.out.println("Please enter data for third node");
        a = input.nextInt();
        Node third = new Node(a);
        
        first.link = second;
        second.link = third;
        
        Node current = first;
        while(current != null)
        {
           System.out.print(current.data + "-->");
           current = current.link;
        }
        System.out.print("null");
        System.out.print("\n\n");
        System.out.printf("The data of First Node is %d\n", first.data);
        System.out.printf("The data of Second Node is %d\n", first.link.data);
        System.out.printf("The data of Third Node is %d\n", first.link.link.data);*/
        
        //to make the head node s
        
        
        System.out.println("Please enter data for new node");
        int data = input.nextInt();
        Node s = new Node(data);
        Node t = s;
       
        
        //to make more nodes
        while(true)
        {
            System.out.println("Do you want to make a new next node?");
            char x = input.next().charAt(0);
            if ((x == 'n') || (x == 'N'))
                    {
                        break;
                    }
            System.out.print("Enter the data for the next node");
            data = input.nextInt();
            s.link = new Node(data);
            s = s.link;
            
        }
        Node head = t;
        display(head);
    }
    
    public static void display(Node head)
    {
        
        Node s = head;
        System.out.print("The list is :\n");
        
        while(s != null)
        {
            System.out.print(s.data +"-->");
            s= s.link;
            
        }
        System.out.print("null\n");
    }   
}
            
     

    
    
        

    
    
   
    

