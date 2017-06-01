
public class Queue<V> { //just takes States, IS ACTUALLY A DEQUE
    Node<V> head;

    public void append_front(V item) {
        // appends to front of list:
        Node<V> node = new Node<V>(item);
        node.next = head;
        head = node;
    }
    
    public void append_end(V item) {
        // appends to tail of list:
        Node<V> current = head;
        if (current == null) {
            Node<V> node = new Node<V>(item);
            head = node;
        } else {
            while (current.next != null) {
            current = current.next;
        }
        Node<V> node = new Node<V>(item);
        current.next = node;
        }
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
    
    public V pop_front() {
        Node<V> temp = head;
        head = head.next;
        return temp.key;
    }
    
    public V pop_end() {
        Node<V> temp = head;
        Node<V> prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp.key;
    }
        
    public boolean contains(V key) {
        Node<V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return true;               
            }
            current = current.next;
        }
        return false;
    }
    
    public int length() {
        int counter = 0;
        Node<V> start = head;
        while(start != null) {
            counter++;
            start = start.next;
        }
        return counter;
    }
}