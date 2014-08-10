/**
 *
 * @author andreabarrera
 * @author peterbennett
 * @param <E>
 */
public class DoublyLinkedNode<E>{

    /**
     *
     */
    protected E data;
    /**
     *
     */
    protected DoublyLinkedNode<E> nextElement;
    /**
     *
     */
    protected DoublyLinkedNode<E> previousElement;

    /**
     *
     * @param v
     * @param next
     * @param previous
     */
    public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

    /**
     *
     * @param v
     */
    public DoublyLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}

    /**
     *
     * @param next
     */
    public void setNext(DoublyLinkedNode<E> next){
    nextElement = next;
}

    /**
     *
     * @return
     */
    public DoublyLinkedNode<E> previous(){
    return previousElement;
}
    /**
     *
     * @return
     */
    public E value()
   // post: returns value associated with this element
   {
      return data;
   }
}