package assignment10;

class Node<Type> {
    Type data;
    Node<Type> next;

    Node() {
        this.data = null;
        this.next = null;
    }

    Node(Type data) {
        this.data = data;
        this.next = null;
    }
}


