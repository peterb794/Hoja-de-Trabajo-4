/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
/**
 *
 * @author andreabarrera
 * @param <E>
 */
public class FactoryStack<E> {
      private Stack Stack;
    
      /**
     *
     * @param num
     * @return
     */
    public Stack Factory(String num){
          switch (num) {
              case "1":
                  Stack = new StackArrayList();
                  break;
              case "2":
                  Stack = new StackVector();
                  break;
              default:
                  Stack = new StackList();
                  break;
          }
          return Stack;
   }
}
