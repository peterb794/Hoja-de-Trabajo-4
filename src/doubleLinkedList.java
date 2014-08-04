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


public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}

public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }

public E getLast(){
    return tail.value();
}

public E removeFirst(){
    DoublyLinkedNode<E> temp = tail;
    tail.setNext(null);
    count--;
    return temp.value();
}
public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previous();
   tail.setNext(null);
   count--;
   return temp.value();
}
}
