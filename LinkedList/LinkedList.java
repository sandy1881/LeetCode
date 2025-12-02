package LinkedList;
//10->20->30->40
//add-> 10
//10->20->30->40 add ->50
//delete(50) 10->20->30->40
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Linked{
    Node head;

    public void addFirst(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void delete(int key){
        if(head == null ) return;
        if(head.data == key){
            head = head.next;
            return;
         }

            Node curr = head;
            while(curr.next != null && curr.next.data != key){
                curr =curr.next;
               
            }
            if(curr.next !=null){
                curr.next = curr.next.next;
            }
    }
    public void display(){
        Node curr= head;
        while(curr != null){
         System.out.print(curr.data + "->");
         curr = curr.next;
        }
        System.out.println("null");
    }

}


public class LinkedList {

    public static void main(String[] args) {
        Linked lists = new Linked();
        lists.addFirst(20);
        lists.addFirst(10);
        lists.addLast(30);
        lists.addLast(40);
        lists.display();
        lists.delete(30);
        lists.display();
    }
}
