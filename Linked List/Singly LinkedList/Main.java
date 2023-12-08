public class Main {
    public static void main(String[] args) {
        

        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);

        list.insertAtLastIndex(99);
        list.insert(100, 3);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println("Terminated Successfully");
    }
}
