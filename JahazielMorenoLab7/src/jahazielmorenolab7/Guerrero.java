package jahazielmorenolab7;

import java.io.Serializable;

public abstract class Guerrero implements Serializable{
    
    private static final long SerialVersionUID = 777L;

    
    private String nombre, nickname;
    private float ataque, defensa, salud, puntos;

    public Guerrero() {

    }
    
    public Guerrero(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.ataque = ataque;
        this.defensa = defensa;
        this.salud = salud;
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
        this.ataque = ataque;
    }

    public float getDefensa() {
        return defensa;
    }

    public void setDefensa(float defensa) {
        this.defensa = defensa;
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        this.salud = salud;
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
