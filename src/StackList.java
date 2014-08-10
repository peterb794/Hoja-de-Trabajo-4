
import java.util.LinkedList;
import java.util.Scanner;

/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
public class StackList<E> extends AbstractStack<E>  {

    protected LinkedList<E> data;
    private Scanner s;
    private int num;
    
    public StackList(){
        System.out.println("ingrese el numero del tipo de lista que desea usar");
        System.out.println("1. Simple Link\n2.Double Link\n3.Circular Link\n");
        s = new Scanner(System.in);
        num = s.nextInt();
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
