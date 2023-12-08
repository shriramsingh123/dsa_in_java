public class Main{
    public static void main(String[] args) {
        
        CustomDoublyLinkedList list = new CustomDoublyLinkedList();
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(7);
        list.insertAtFirst(8);
        list.insertAtFirst(9);
        list.insertAtLast(99);

        list.display();

        System.out.println(" \n Terminated Successfully");
    }
}