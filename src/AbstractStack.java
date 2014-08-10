/* @ author Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

/**
 *
 * @author andreabarrera
 * @author peterbennett
 * @param <E>
 */
public abstract class AbstractStack<E> implements Stack<E> {
    
    /**
     *
     * @return
     */
    @Override
    public boolean empty(){
        return size() == 0;
    }
}
