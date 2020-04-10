public class SLL {
    public Node head;
    public SLL() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove() {
        Node runner = this.head;
        while(runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
    }
    public void printValues() {
        Node runner = this.head;
        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
    public Node findNode(int value) {
        Node runner = this.head;
        while(runner != null) {
            if(runner.value == value) {
                return runner;
            }
            runner = runner.next;
        }
        return null;
    }
    public void removeAt(int num) {
        Node runner = this.head;
        int count = 0;
        while(runner != null && count < num-1) {
            runner = runner.next;
            count += 1;
        }
        if(runner.next != null) {
            runner.next = runner.next.next;
        } else {
            runner.next = null;
        }
    }
}