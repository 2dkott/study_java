import java.util.Iterator;
import java.util.Objects;

public class CustomLinkedList <E> implements Iterable<E> {

    private Node<E> headNode;
    private Node<E> currentNode;

    public CustomLinkedList(){
        headNode = null;
    }

    public void add(E data) {
        if(Objects.isNull(headNode)) {
            headNode = new Node<>(data);
        }
        if(Objects.isNull(headNode.getNext())) {
            currentNode = headNode.linkAndReturn(new Node<E>(data));
        }
        currentNode = currentNode.linkAndReturn(new Node<E>(data));
    }

    @Override
    public String toString() {
        Node<E> item = headNode;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while (!Objects.isNull(item)){
            stringBuilder.append(item.data.toString());
            stringBuilder.append(", ");
            item = item.getNext();
        }
        stringBuilder.replace(stringBuilder.length()-2,stringBuilder.length()-1, "]");
        return stringBuilder.toString();
    }
    private class Node<E> {
        private final E data;
        private Node<E> next;
         public Node(E data){
             this.data =data;
             this.next = null;
         }

         public void setNext(Node<E> nexNode) {
             this.next = nexNode;
         }

         public Node<E> linkAndReturn(Node<E> nextNode) {
             this.next = nextNode;
             return nextNode;
         }

        public Node<E> getNext() {
            return next;
        }

        public E getData(){
             return data;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            Node<E> iterNode = headNode;
            @Override
            public boolean hasNext() {
                return !Objects.isNull(iterNode.getNext());
            }

            @Override
            public E next() {
                E data = iterNode.getData();
                iterNode = iterNode.getNext();
                return data;
            }
        };
    }
}
