/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreabarrera
 */
public abstract class AbstractStack<E> implements Stack<E> {
   
    @Override
    public boolean empty(){
        return size() == 0;
    }
}
