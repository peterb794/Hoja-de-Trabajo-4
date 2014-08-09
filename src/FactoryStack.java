/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
public class FactoryStack {
      private Stack list;
    
      public Stack Factory(String num){
          switch (num) {
              case "1":
                  list = new StackArrayList();
                  break;
              case "2":
                  list = new StackVector();
                  break;
              default:
                  list = new StackList();
                  break;
          }
          return list;
   }
}
