/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
/**
 *
 * @author andreabarrera
 * @param <E>
 */
public class FactoryList<E> {
     private List list;
    
      /**
     *
     * @param num
     * @return
     */
    public List Factory(String num){
          switch (num) {
              case "1":
                  list = new simpleLinkedList();
                  break;
              case "2":
                  list = new doubleLinkedList();
                  break;
              default:
                  list = new circularLinkedList();
                  break;
          }
          return list;
   }
}
