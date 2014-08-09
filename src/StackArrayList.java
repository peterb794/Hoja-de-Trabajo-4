/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E> {
    
    protected ArrayList<E> data;
    

    public StackArrayList(){
        // post: constructs a new, empty stack
	data = new ArrayList<E>();
    }
    
    @Override
    // post: the value is added to the stack
	// will be popped next if no intervening push
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        // pre: stack is not empty
	// post: most recently pushed item is removed and returned
        return data.remove(size()-1);
    }

    @Override
    public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
    @Override
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
      
}