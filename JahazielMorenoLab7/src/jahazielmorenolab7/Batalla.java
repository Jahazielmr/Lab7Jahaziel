package jahazielmorenolab7;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Batalla extends Thread implements Serializable{
    
    Guerrero jugador1, jugador2;
    String idB;
    private String bitacora = "";
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
        
        while (jugador1.getSalud()>0&&jugador2.getSalud()>0) {
            jugador2.setSalud(jugador1.Ataque(jugador2.getDefensa(), jugador2.getSalud(), jugador2.getAtaque()));
            jugador1.setSalud(jugador2.Ataque(jugador1.getDefensa(), jugador1.getSalud(), jugador1.getAtaque()));
            
            
            System.out.println(this);
            bitacora+=this+"\n";
        }
        if (jugador1.getSalud()>0) {
            System.out.println("El ganador es: "+jugador1);
            bitacora+="El ganador es: "+jugador1;
        }else{
            System.out.println("El ganador es: "+jugador2);
            bitacora+="El ganador es: "+jugador2;
        }
        
        
        
        
        /*
        while(jugador1.getSalud()>0 || jugador2.getSalud()>0){
            
            jugador2.setSalud(jugador1.Ataque(jugador2.getDefensa(), jugador2.getSalud(), jugador2.getAtaque()));
            
            jugador1.setSalud(jugador2.Ataque(jugador1.getDefensa(), jugador1.getSalud(), jugador1.getAtaque()));
            
        }
        
        if (jugador1.getSalud()> jugador2.getSalud()){
                JOptionPane.showMessageDialog(null, jugador1.getNickname()+"Ha ganado");
            } else if (jugador2.getSalud()> jugador1.getSalud()){
                JOptionPane.showMessageDialog(null, jugador2.getNickname()+"Ha ganado");
            }
            */
        
    } 
    
    
    
    
    
    
}
