
import java.util.LinkedList;
import java.util.Scanner;

/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
public class StackList<E> extends AbstractStack<E>  {

    protected LinkedList<E> miList;
    private Scanner s;
    private String num;
    private FactoryList<E> list;
    private List<E> miLista;
    
    public StackList(){
        System.out.println("ingrese el numero del tipo de lista que desea usar");
        System.out.println("1.Simple Link\n2.Double Link\n3.Circular Link\n");
        s = new Scanner(System.in);
        num = s.next();
        list = new FactoryList<E>();
        miLista = list.Factory(num);
	miList = new LinkedList<E>();
    }
    
    @Override
    public void push(E item) {
        miList.push(item);
    }

    @Override
    public E pop() {
        return (E) miList.pop();
    }

    @Override
    public E peek() {
        return miList.get(size() - 1);
    }
    @Override
    public int size() {
        return miList.size();
    }
    
    }