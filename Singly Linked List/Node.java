class Node {
    private int data;
    private Node nextNode;

    public Node() {
        data = 0;
        nextNode = null;
    }

    public Node(int data) {
        this.data = data;
        nextNode = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNextNode(Node node) {
        nextNode = node;
    }

    public Node nextNode() {
        return nextNode;
    }
}
