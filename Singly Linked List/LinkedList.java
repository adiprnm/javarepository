class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    private Node findLastNode() {
        Node temp = head;
        while (temp.nextNode() != null) {
            temp = temp.nextNode();
        }
        return temp;
    }

    public void addNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node lastNode = findLastNode();
            lastNode.setNextNode(node);
        }
    }

    public void deleteNode() {
        if (head == null) {
            System.out.print("List is empty! ");
        } else if (head.nextNode() == null) {
            head = null;
        } else {
            Node next = head;
            Node prev = null;
            while (next.nextNode() != null) {
                prev = next;
                next = next.nextNode();
            }
            prev.setNextNode(null);
        }
    }

    public void printNode() {
        if (head == null) {
            System.out.print("No node available!");
        } else if (head.nextNode() == null) {
            System.out.print(head.getData() + " ");
        } else {
            Node nd = head;
            while (nd != null) {
                System.out.print(nd.getData() + " ");
                nd = nd.nextNode();
            }
        }
    }
}
