package Stacks;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class StackLL {
    private Node top;

    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top == null){
            System.out.println("Stack Under Flow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack Under Flow");
            return -1;
        }
        return top.data;
    }

    public void display(){
        Node curr = top;
        while(curr != null){
            System.out.print(curr.data +"->");
            curr = curr.next;
        }
        System.out.println("nul");
    }
    public static void main(String[] args) {

        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);

        st.display();
        st.peek();
        st.pop();
        st.display();
    }
}
