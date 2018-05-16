package Validation;

import java.awt.event.KeyEvent;

public class Makepaymentvalidation {

    public static boolean Grnnochecked(String grnno) {
        if (grnno.matches("^([G][R][N]{1}((?!0*-)[0-9]{1,3}))")) {
            return true;
        }
        return false;
    }

    public static void checktotaldiscount(java.awt.event.KeyEvent evt) {
        char totaldiscount = evt.getKeyChar();
        if (!(Character.isDigit(totaldiscount) || evt.getKeyChar() == KeyEvent.VK_SPACE || evt.getKeyChar() == KeyEvent.VK_PERIOD || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    public static void checktotalamount(java.awt.event.KeyEvent evt) {
        char totaldiscount = evt.getKeyChar();
        if (!(Character.isDigit(totaldiscount) || evt.getKeyChar() == KeyEvent.VK_SPACE || evt.getKeyChar() == KeyEvent.VK_PERIOD || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    public static void checktotalqty(java.awt.event.KeyEvent evt) {
        char totaldiscount = evt.getKeyChar();
        if (!(Character.isDigit(totaldiscount) || evt.getKeyChar() == KeyEvent.VK_SPACE || evt.getKeyChar() == KeyEvent.VK_PERIOD || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }
//    public static boolean checktable(String goodreceiveno,String batchno,String orderid,String paymentid,String totaldiscount1,String amount1,String qty1){
//    if(goodreceiveno.matches("^([G][R][N]{1}((?!0*-)[0-9]{1,3}))")&batchno.matches("^([B]{1}((?!0*-)[0-9]{1,3}))")&orderid.matches("^([O][I][D]{1}((?!0*-)[0-9]{1,3}))")&paymentid.matches("^([P][I][D]{1}((?!0*-)[0-9]{1,3}))")&totaldiscount1.matches("\\d+([?:,\\\\d{1,2}.])?")&qty1.matches("\\d+([?:,\\\\d{1,2}.])?")){
//           return true;
//    }
//        
//        return false;
//    }

    public static boolean checkgrnno(String grnno) {
        if (grnno.matches("^([G][R][N]{1}((?!0*-)[0-9]{1,3}))")) {
            return true;
        }
        return false;
    }

    public static boolean paymentidcheck(String paymentid) {
        if (paymentid.matches("^([S][P]{1}((?!0*-)[0-9]{1,3}))")) {
            return true;
        }
        return false;
    }
}
