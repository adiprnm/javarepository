import java.util.Scanner;

class LinkedListTest {   
    public static void displayText() {
        System.out.println("\n\n1. Input node");
        System.out.println("2. Delete node");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        int data, answer;

        while (true) {
            linkedList.printNode();
            displayText();
            System.out.print("Answer: ");
            answer = in.nextInt();

            switch (answer) {
                case 1:
                    System.out.print("\nInput data: ");
                    data = in.nextInt();
                    Node nd = new Node(data);
                    linkedList.addNode(nd);
                    break;
                case 2:
                    linkedList.deleteNode();
            }
        }
    }
}
