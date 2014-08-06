public class doubleLinkedList<E> extends AbstractList<E> {

protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;

public doubleLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

 public int size()
   // post: returns number of elements in list
  {
    return count;
  }
 
public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}

public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }

}
