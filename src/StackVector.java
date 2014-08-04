/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

import java.util.Vector;


public class StackVector<E> extends AbstractStack<E>{
    
    protected Vector<E> data;

	public StackVector()
	{
                
		data = new Vector<E>();
	}

        @Override
	public void push(E item)
	{
		data.add(item);
	}

        @Override
	public E pop()
	{
		return data.remove(size()-1);
	}

        @Override
	public E peek()
	{
		return data.get(size() - 1);
	}
	
    @Override
	public int size()
	{
		return data.size();
	} 
}
