import java.util.Vector;

/**
 *
 * @author andreabarrera
 * @param <E>
 */
public class StackVector<E> extends AbstractStack<E> 
{
	/**
     *
     */
    protected Vector<E> data;

	/**
     *
     */
    public StackVector()
	{
	// post: constructs a new, empty stack
                
		data = new Vector<E>();
	}

	/**
     *
     * @param item
     */
    public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	/**
     *
     * @return
     */
    public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	/**
     *
     * @return
     */
    public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	/**
     *
     * @return
     */
    public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
}
