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
       
        float attack = (float) (ataque * 2);
        float def = (float) (DefensaRival * 0.50);
        vidaRival =  (float) (vidaRival - ((ataque+attack) - (DefensaRival+def))) ;
        return vidaRival;
    
    }
    
    
    
    
    
    
}
