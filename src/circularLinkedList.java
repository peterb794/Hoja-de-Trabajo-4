/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
/**
 *
 * @author andreabarrera
 * @param <E>
 */
public class circularLinkedList<E> extends AbstractList<E> {

    /**
     *
     */
    protected Node<E> tail; 
    /**
     *
     */
    protected int count;
private E ne;

    /**
     *
     */
    public circularLinkedList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}
 
    /**
     *
     * @return
     */
    @Override
public int size()
   // post: returns number of elements in list
  {
    return count;
  }

    /**
     *
     * @param value
     */
    @Override
public void push(E value)
// pre: value non-null
// post: adds element to head of list
{
   Node<E> temp = new Node<>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}

    /**
     *
     * @return
     */
    @Override
    public E pop() {
      tail.setNext(tail);
      return tail.value();
    }

}
