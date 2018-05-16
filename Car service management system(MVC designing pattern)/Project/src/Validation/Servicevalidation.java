package Validation;

import com.sun.glass.events.KeyEvent;

public class Servicevalidation {
   public static void checkdiscount(java.awt.event.KeyEvent evt){
   Character discount=evt.getKeyChar();
       if(!(Character.isDigit(discount)||evt.getKeyChar()==KeyEvent.VK_BACKSPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD)){
           evt.consume();
   }
   } 
   public static void checkitemprice(java.awt.event.KeyEvent evt){
    Character itemprice=evt.getKeyChar();
       if(!(Character.isDigit(itemprice)||evt.getKeyChar()==KeyEvent.VK_BACKSPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD)){
           evt.consume();
   }
   }
   public static void checkitemqty(java.awt.event.KeyEvent evt){
    Character itemqty=evt.getKeyChar();
       if(!(Character.isDigit(itemqty)||evt.getKeyChar()==KeyEvent.VK_BACKSPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD)){
           evt.consume();
   }
   }
   public static void checkmilage(java.awt.event.KeyEvent evt){
   char milage=evt.getKeyChar();
   if(!(Character.isDigit(milage)||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_BACKSPACE)){
   evt.consume();
   }
   }
   public static void checkservicetypecharge(java.awt.event.KeyEvent evt){
       char stcharge=evt.getKeyChar();
   if(!(Character.isDigit(stcharge)||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_BACKSPACE)){
   evt.consume();
   }
   }
   public static void checktotalitemprice(java.awt.event.KeyEvent evt){
   char totalitemprice=evt.getKeyChar();
   if(!(Character.isDigit(totalitemprice)||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_BACKSPACE)){
   evt.consume();
   }
   }
   public static void checktotalserviceprice(java.awt.event.KeyEvent evt){
   char totalstcharge=evt.getKeyChar();
   if(!(Character.isDigit(totalstcharge)||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_BACKSPACE)){
   evt.consume();
   }
   }
   public static boolean checkgrnno(String grnno){
   if(grnno.matches("^([I][N][O]{1}((?!0*-)[0-9]{1,3}))")){
        return true;
   }
       return false;
   }
   public static boolean checkpaymentid(String paymentid){
   if(paymentid.matches("^([P][I][D]{1}((?!0*-)[0-9]{1,3}))")){
   return true;
   }
   return false;
   }
}
