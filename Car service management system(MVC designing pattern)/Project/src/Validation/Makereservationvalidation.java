package Validation;

import java.awt.event.KeyEvent;

public class Makereservationvalidation {
//    private void checktextfieldset(){
//    
//    }
    public static void checkcustomername(java.awt.event.KeyEvent evt){
    char customername=evt.getKeyChar();

       if(!(Character.isAlphabetic(customername)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD ||evt.getKeyChar()==KeyEvent.VK_SPACE)){
       
       evt.consume();
       }
    }
     public static void getnumber(java.awt.event.KeyEvent evt){
     char c=evt.getKeyChar();

       if(!(Character.isAlphabetic(c)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD ||evt.getKeyChar()==KeyEvent.VK_SPACE)){
       
       evt.consume();
       }
    
    }
     public static  void checkaddresstextfield(java.awt.event.KeyEvent evt){
     char address=evt.getKeyChar();
     if(!(Character.isAlphabetic(address)||Character.isDigit(address)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_COMMA||evt.getKeyChar()==KeyEvent.VK_SLASH||evt.getKeyChar()==KeyEvent.VK_BACK_SLASH)){
     evt.consume();
     }
     
     }
     public static boolean isgood(String vehicleno){
     if(vehicleno.matches("^([A-Z]{1,3}|((?!0*-)[0-9]{1,3}))-[0-9]{4}(?<!0{4})")){
     return true;
     }
     else{
     return false;
     }
     }
     public static void checkbrand(java.awt.event.KeyEvent evt){
     char brand=evt.getKeyChar();
     if(!(Character.isAlphabetic(brand)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE)){
     evt.consume();
     }
     }
     public static void checkmodel(java.awt.event.KeyEvent evt){
     char model=evt.getKeyChar();
     if(!(Character.isAlphabetic(model)||Character.isDigit(model)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_MINUS)){
     evt.consume();
     }
     }
     public static boolean checkenginetype(String enginetype){
     if(enginetype.matches("([0-9]{3,4}(?<!0{4})C{1,2})")){
     return true;
     }
     return false;
     
     }public static void checkvehicletype(java.awt.event.KeyEvent evt){
     char vehicletype=evt.getKeyChar();
     if(!(Character.isAlphabetic(vehicletype)||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_MINUS)){
     evt.consume();
     }
     }
     
}
