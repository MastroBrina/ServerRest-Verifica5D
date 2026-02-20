/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteService {
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param 
     * @param 
     * @param 
     * @return 
     * @throws IllegalArgumentException se ...
     */
    public static Boolean logicaDiCalcolo(String giocata, Integer numero) 
            throws IllegalArgumentException {
        Boolean vittoria=false;
        // Controllo se i parametri passati sono validi
        if (!parametriValidi(giocata, numero)) {
            throw new IllegalArgumentException("Operatore non può essere vuoto");
        }
        
        try {
            if(giocata.equals("PARI")&&numero%2==0||giocata.equals("DISPARI")&&numero%2==1){
                vittoria=true;
            }
            else{
                vittoria=false;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(
              "Opzione non valida. Opzione deve essere PARI o DISPARI");
        }
        return vittoria;
    }

    // Metodo di validazione dei parametri (da implementare)
    private static boolean parametriValidi(String giocata, Integer numero)
    {
        Boolean validazione=false;
        if(numero!=0&&!giocata.equals("")){
            validazione=true;
        }else{
            validazione=false;
        }
        return validazione;
    }
}