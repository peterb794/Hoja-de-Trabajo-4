
import java.util.LinkedList;

/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
public class StackList<E> extends AbstractStack<E>  {

    protected LinkedList<E> data;
    
    public StackList(){
	data = new LinkedList<E>();
    }
    
    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        return data.remove(size()-1);
    }

    @Override
    public E peek() {
        return data.get(size() - 1);
    }
    @Override
    public int size() {
        return data.size();
    }
    
}
