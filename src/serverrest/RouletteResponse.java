/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteResponse {
    private String giocata;
    private String numero;
    private String vittoria;
    
    // Costruttore vuoto necessario per GSON
    public RouletteResponse() {
    }
    
    // Costruttore con parametri
    public RouletteResponse(String giocata, String numero, String vittoria) {
        this.giocata = giocata;
        this.numero = numero;
        this.vittoria = vittoria;
    }
    
    // Getter
   public String getGiocata() {
        return giocata;
    }

    public String getNumero() {
        return numero;
    }

    public String getVittoria() {
        return vittoria;
    }
    
    // Setter

    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setVittoria(String vittoria) {
        this.vittoria = vittoria;
    }
    
    

    
    
}