/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreabarrera
 */
public class circularLinkedList<E> extends AbstractList<E> {

protected Node<E> tail; 
protected int count;

public circularLinkedList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}
 
public int size()
   // post: returns number of elements in list
  {
    return count;
  }

public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Node<E> temp = new Node<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
