/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berserker
 */
import com.everis.TallerJava.Exception.MiException;

public class Exception {

    /**
     * @param args the command line arguments
     * @throws MiException
     */
    public static void main(String[] args) throws MiException{
        int valorA = 1;
        int valorB = 1;
        
        if (valorA >= valorB) {
            //throw new MiException();
            MiException mE = new MiException();
            MeExce m = new MeExce();
            try {
                //System.out.println("d");
                if(true){
                    throw m;
                }else{
                    throw mE;
                }
            } catch (MiException e) {
                System.out.println("Se generó un error");
                System.out.println(e.getMessage());
            }catch(MeExce e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("No hay exception");
        }
    }
    
}


class MeExce extends java.lang.Exception{
    public String getMessage(){
        return "iror";
    }
}