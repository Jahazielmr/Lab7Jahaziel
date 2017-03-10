package jahazielmorenolab7;

import java.io.Serializable;

public class Batalla extends Thread implements Serializable{
    
    Guerrero jugador1, jugador2;
    String idB;

    public Batalla(Guerrero jugador1, Guerrero jugador2, String id) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.idB = id;
    }

    public Batalla() {
        super();
    }

    public Guerrero getJugador1() {
        return jugador1;
    }

    public void setJugador1(Guerrero jugador1) {
        this.jugador1 = jugador1;
    }

    public Guerrero getJugador2() {
        return jugador2;
    }

    public void setJugador2(Guerrero jugador2) {
        this.jugador2 = jugador2;
    }

    public String getIdB() {
        return idB;
    }

    public void setId(String id) {
        this.idB = id;
    }
    
    @Override
    public void run(){
        
        while(true){
            
            try {
                
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
               
            
        }
        
    } 
    
    
    
    
    
    
}
