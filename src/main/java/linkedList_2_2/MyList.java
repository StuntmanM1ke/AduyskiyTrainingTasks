package linkedList_2_2;

public class MyList {
    private ListElement head;
    private ListElement tail;
    private int size = 0;


    public void add(int data){
        ListElement a = new ListElement(size);
        a.data = data;
        if (tail == null){
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
        size++;
    }
    public int get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        ListElement res = head;
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res.data;
    }
    public int size(){
        return this.size;
    }
}

