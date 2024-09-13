import java.util.Scanner;

interface Stack {
    void push(int ele);
    int pop();
    void display();
}

interface Queue {
    void enqueue(int ele);
    int dequeue();
    void display();
}

class StackQueueOper implements Stack, Queue {
    private int[] arr;
    private int top;
    private int front, rear;
    private int maxsize;
    
    public StackQueueOper(int size) {
        maxsize = size;
        arr = new int[maxsize];
        top = -1;
        front = 0;
        rear = -1;
    }

    public void push(int ele) {
        if (top == maxsize - 1) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = ele;
            System.out.println("Pushed " + ele + " to stack");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public void enqueue(int ele) {
        if (rear == maxsize - 1) {
            System.out.println("Queue is full");
        } else {
            arr[++rear] = ele;
            System.out.println("Enqueued " + ele + " to queue");
        }
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[front++];
        }
    }

    public void display1() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of stack/queue:");
        int size = scanner.nextInt();
        StackQueueOper sqo = new StackQueueOper(size);
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Stack Push");
            System.out.println("2. Stack Pop");
            System.out.println("3. Stack Display");
            System.out.println("4. Queue Enqueue");
            System.out.println("5. Queue Dequeue");
            System.out.println("6. Queue Display");
            System.out.println("7. Exit");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element to push:");
                    int pushElement = scanner.nextInt();
                    sqo.push(pushElement);
                    break;
                
                case 2:
                    int poppedElement = sqo.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped " + poppedElement + " from stack");
                    }
                    break;
                
                case 3:
                    sqo.display();
                    break;
                
                case 4:
                    System.out.println("Enter element to enqueue:");
                    int enqueueElement = scanner.nextInt();
                    sqo.enqueue(enqueueElement);
                    break;
                
                case 5:
                    int dequeuedElement = sqo.dequeue();
                    if (dequeuedElement != -1) {
                        System.out.println("Dequeued " + dequeuedElement + " from queue");
                    }
                    break;
                
                case 6:
                    sqo.display();
                    break;
                
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please choose again.");
                    break;
            }
        }
    }
}

