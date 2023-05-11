package assignment10;

public class SLinkedList {
    public static void main(String[] args) {
        SList<Integer> list = new SList<>();
        SListIterator<Integer> iterator = list.getIterator();
        iterator.insertNode(10);
        iterator.insertNode(20);
        iterator.insertNode(30);
        iterator.insertNode(40);
        iterator.insertNode(50);
        System.out.println("Linked list before removal: ");
        iterator.displayList();
        int data = 30;
        iterator.deleteNode(data);
        System.out.println("Linked list after removal: " + data + ": ");
        iterator.displayList();
    }
}