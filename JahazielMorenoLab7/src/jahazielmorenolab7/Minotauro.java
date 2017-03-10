package jahazielmorenolab7;

public class Minotauro extends Guerrero{

    public Minotauro() {
        super();
    }

    public Minotauro(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    

    @Override
    public float Ataque(float DefensaRival, float vidaRival, float AtaqueRival) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
