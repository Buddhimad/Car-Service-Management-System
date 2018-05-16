package Validation;

import java.awt.event.KeyEvent;

public class Stockloadervalidation {
 public static void checkname(java.awt.event.KeyEvent evt){
 char itemname=evt.getKeyChar();

       if(!(Character.isAlphabetic(itemname)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE)){
       
       evt.consume();
       }
 }
public static boolean checkbatchno(String batchno){
    if(batchno.matches("^([B]{1}((?!0*-)[0-9]{1,3}))")){
    return true;
    }
    return false;
}
public static void checkbrand(java.awt.event.KeyEvent evt){
char itembrand=evt.getKeyChar();

       if(!(Character.isAlphabetic(itembrand)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE)){
       
       evt.consume();
       }
}
public static void checkcategory(java.awt.event.KeyEvent evt){
char itemcategory=evt.getKeyChar();

       if(!(Character.isAlphabetic(itemcategory)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE)){
       
       evt.consume();
       }
}
public static void checkmanufacturedcuntry(java.awt.event.KeyEvent evt){
char mcountry=evt.getKeyChar();

       if(!(Character.isAlphabetic(mcountry)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE)){
       
       evt.consume();
       }
}
public static void checkdiscount(java.awt.event.KeyEvent evt){
char discount=evt.getKeyChar();

       if(!(Character.isDigit(discount)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD)){
       
       evt.consume();
       }
}
public static void checkprice(java.awt.event.KeyEvent evt){
char price=evt.getKeyChar();

       if(!(Character.isDigit(price)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD)){
       
       evt.consume();
       }
}
public static void checkitemqty(java.awt.event.KeyEvent evt){
        char qty=evt.getKeyChar();

       if(!(Character.isDigit(qty)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD)){
       
       evt.consume();
       }
}
}
