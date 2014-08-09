/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

public abstract class AbstractStack<E> implements Stack<E> {
   private Stack list;
   
    public void AbstractStack(int num){
       if(num==1){
           list = new StackArrayList();
       }
       else if(num==2){
        list = new StackVector();
    }
       else{
           list = new StackList();
       }
   }
    @Override
    public boolean empty(){
        return size() == 0;
    }
}
