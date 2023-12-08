public class CustomDoublyLinkedList {

    private Node head;
    private Node tail;


    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.previous=null; 
            
        if (head != null) {
            head.previous=node;
        }
        head=node;
    }

    public void insertAtLast(int value){
        Node node = new Node(value);
        Node last = head;

        node.next=null;

        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
            
        }

        last.next=node;
        node.previous=last;
    }

    public void display(){
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node=node.next;
        }
        System.out.print("END");
    }






    
    private class Node {
        private int value;
        private Node next;
        private Node previous;
        
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, CustomDoublyLinkedList.Node next, CustomDoublyLinkedList.Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

}
