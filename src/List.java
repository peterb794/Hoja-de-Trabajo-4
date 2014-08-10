
/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

  public interface List<E> {

   public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements

   public void push(E value);
   // post: value is added to beginning of list

   public E pop();
   // pre: list is not empty
   // post: returns first value in list

}
