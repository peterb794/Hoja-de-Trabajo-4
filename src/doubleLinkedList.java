/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
/**
 *
 * @author andreabarrera
 * @param <E>
 */
public class doubleLinkedList<E> extends AbstractList<E> {

    /**
     *
     */
    protected int count;
    /**
     *
     */
    protected DoublyLinkedNode<E> head;
    /**
     *
     */
    protected DoublyLinkedNode<E> tail;

    /**
     *
     */
    public doubleLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

    /**
     *
     * @return
     */
    public int size()
   // post: returns number of elements in list
  {
    return count;
  }
 
    /**
     *
     * @param value
     */
    public void push(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}

    /**
     *
     * @return
     */
    public E pop()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }

}
