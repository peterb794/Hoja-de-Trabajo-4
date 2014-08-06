/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreabarrera
 */
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
  
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }   
}
