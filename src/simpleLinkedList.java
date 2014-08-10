/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
public class simpleLinkedList<E> extends AbstractList<E> {
    
   protected int count; // list size
   protected Node<E> head; // ref. to first element

   public simpleLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
  public void push(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
   @Override
  public E pop()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }   
}
