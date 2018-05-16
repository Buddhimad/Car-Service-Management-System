package Validation;

import java.awt.event.KeyEvent;

public class Manageordervalidation {
    public static boolean checkorderid(String id){
    if(id.matches("^([O][I][D]{1}((?!0*-)[0-9]{1,3}))")){
        return true;
    }
    return false;
    }
    public static void checkname(java.awt.event.KeyEvent evt){
    char name=evt.getKeyChar();
    if(!(Character.isAlphabetic(name)||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD)){
    
    }
    }
    public static void checkAddress(java.awt.event.KeyEvent evt){
    char address=evt.getKeyChar();
    if(!(Character.isAlphabetic(address)||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_SLASH||evt.getKeyChar()==KeyEvent.VK_COMMA||evt.getKeyChar()==KeyEvent.VK_COLON||evt.getKeyChar()==KeyEvent.VK_MINUS)){
    
    }
    
    }
    public static void checkCompany(java.awt.event.KeyEvent evt){
    char Company=evt.getKeyChar();
    if(!(Character.isAlphabetic(Company)||evt.getKeyChar()==KeyEvent.VK_SPACE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD||evt.getKeyChar()==KeyEvent.VK_SLASH||evt.getKeyChar()==KeyEvent.VK_COMMA||evt.getKeyChar()==KeyEvent.VK_COLON||evt.getKeyChar()==KeyEvent.VK_MINUS)){
    
    }
    
    }
   public static boolean checksupplierid(String id){
    if(id.matches("^([S][P][L]{1}((?!0*-)[0-9]{1,3}))")){
        return true;
    }
    return false;
    }
}
