package Validation;

import java.awt.event.KeyEvent;

public class Servicetypevalidation {
    public static void checkvehicletypes(java.awt.event.KeyEvent evt){
        char vehicletype=evt.getKeyChar();
        if(!(Character.isAlphabetic(vehicletype)||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_MINUS)){
            evt.consume();
         }
    }
    public static void checkcharge(java.awt.event.KeyEvent evt){
    char charge=evt.getKeyChar();
    
        if(!(Character.isDigit(charge)||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
         }
    }
    public static void checkdiscription(java.awt.event.KeyEvent evt){
    char description=evt.getKeyChar();
    if(!(Character.isAlphabetic(description)||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_MINUS)){
            evt.consume();
         }
    }
    public static boolean checkservicetype(String serviceid){
    if(serviceid.matches("^([C][T]{1}((?!0*-)[0-9]{1,3}))")){
    return true;
    }
    return false;
    }
}
