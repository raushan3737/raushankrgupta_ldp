package assignment10;


class SList<Type> {
    Node<Type> head;

    SList() {
        this.head = null;
    }

    SList(Type val) {
        this.head = new Node<>(val);
    }

    public SListIterator<Type> getIterator() {
        return new SListIterator<Type>(head);
    }
}
