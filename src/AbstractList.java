/*  Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

/**
 *
 * @author andreabarrera
 * @author peterbennett
 * @param <E>
 */
public abstract class AbstractList<E> implements List<E>
{
    /**
     *
     */
    public AbstractList()
   // post: does nothing
   {
   }

    /**
     *
     * @return
     */
    public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
}
