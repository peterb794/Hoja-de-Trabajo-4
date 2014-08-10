
/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

  /**
 *
 * @author andreabarrera
 * @param <E>
 */
public interface List<E> {

    /**
     *
     * @return
     */
    public int size();
   // post: returns number of elements in list

    /**
     *
     * @return
     */
    public boolean isEmpty();
   // post: returns true iff list has no elements

    /**
     *
     * @param value
     */
    public void push(E value);
   // post: value is added to beginning of list

    /**
     *
     * @return
     */
    public E pop();
   // pre: list is not empty
   // post: returns first value in list

}
