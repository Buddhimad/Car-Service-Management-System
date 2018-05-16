package Validation;
public class Viewinvoicedetailsvalidation {
public static boolean checkgrnno(String grnno){
    if(grnno.matches("^([G][R][N]{1}((?!0*-)[0-9]{1,3}))")){
    return true;
    }
    return false;
}    

}
