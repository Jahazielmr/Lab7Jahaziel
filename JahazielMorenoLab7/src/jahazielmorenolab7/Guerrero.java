package jahazielmorenolab7;

import java.io.Serializable;
import javax.swing.JOptionPane;

public abstract class Guerrero implements Serializable{
    
    private static final long SerialVersionUID = 777L;

    
    protected String nombre, nickname;
    protected float ataque, defensa, salud, puntos;

    public Guerrero() {

    }
    
    public Guerrero(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        this.nombre = nombre;
        this.nickname = nickname;
        setAtaque(ataque);
        setDefensa(defensa);
        setSalud(salud);
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        
        if(ataque>200&& ataque<300){
        this.ataque = ataque;
        } else{
            JOptionPane.showMessageDialog(null,  "No valido");
        }
    }

    public float getDefensa() {
        return defensa;
    }

    public void setDefensa(float defensa) {
        if (defensa>25& defensa<75){
            this.defensa = defensa;
        } else{
            JOptionPane.showMessageDialog(null, "Incorrecto");
        
        }
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        if(salud >800){
            this.salud = salud;
        } else{
            JOptionPane.showMessageDialog(null, "Mayor que 800");
        }
    }

    public float getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }
    
    public abstract float Ataque(float DefensaRival, float vidaRival, float AtaqueRival);
    
    
    
    
    
}
