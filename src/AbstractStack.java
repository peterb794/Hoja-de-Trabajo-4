/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

public abstract class AbstractStack<E> implements Stack<E> {
    
    @Override
    public boolean empty(){
        return size() == 0;
    }
}
