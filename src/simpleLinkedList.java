/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
/**
 *
 * @author andreabarrera
 * @param <E>
 */
public class simpleLinkedList<E> extends AbstractList<E> {
    
    /**
     *
     */
    protected int count; // list size
    /**
     *
     */
    protected Node<E> head; // ref. to first element

    /**
     *
     */
    public simpleLinkedList()
   // post: generates an empty list
   {
      head = null;
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
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
    /**
     *
     * @return
     */
    @Override
  public E pop()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }   
}
