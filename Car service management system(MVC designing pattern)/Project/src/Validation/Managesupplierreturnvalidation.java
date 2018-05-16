package Validation;

import com.sun.glass.events.KeyEvent;

public class Managesupplierreturnvalidation {
  public static void checksuppliername(java.awt.event.KeyEvent evt){
      char name=evt.getKeyChar();
      if(!(Character.isAlphabetic(name)||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_BACKSPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_COMMA)){
      evt.consume();
      }
  }

public static void checkqty(java.awt.event.KeyEvent evt){
char qty=evt.getKeyChar();
      if(!(Character.isDigit(qty)||evt.getKeyChar()==KeyEvent.VK_BACKSPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD)){
      evt.consume();
      }
}
public static void checkreason(java.awt.event.KeyEvent evt){
char reason=evt.getKeyChar();
      if(!(Character.isAlphabetic(reason)||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_BACKSPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_COMMA||evt.getKeyChar()==KeyEvent.VK_SLASH||evt.getKeyChar()==KeyEvent.VK_BACK_SLASH||evt.getKeyChar()==KeyEvent.VK_MINUS||evt.getKeyChar()==KeyEvent.VK_LEFT_PARENTHESIS||evt.getKeyChar()==KeyEvent.VK_RIGHT_PARENTHESIS)){
      evt.consume();
      }
}
public static boolean checkreturnid(String returnid){
    if(returnid.matches("^([S][R][I][D]{1}((?!0*-)[0-9]{1,3}))")){
         return true;
    }
        return false;
}
}
