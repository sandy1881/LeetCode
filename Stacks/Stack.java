package Stacks;


public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    Stack(int size){
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int el){
        if(top == capacity-1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = el;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is UnderFlow");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

     public void display(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int size = 10;
        Stack obj = new Stack(size);
        obj.push(1);
        obj.display();
        obj.pop();
        obj.peek();
    }

   
}
