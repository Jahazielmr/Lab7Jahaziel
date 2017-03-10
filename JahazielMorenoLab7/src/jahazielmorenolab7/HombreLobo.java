package jahazielmorenolab7;

public class HombreLobo extends Guerrero{

    @Override
    public float Ataque(float DefensaRival, float vidaRival, float AtaqueRival) {
         vidaRival =  (float) (vidaRival - ((ataque) - DefensaRival)) ;
        return vidaRival;
        
    
    
    }

    public HombreLobo() {
        super();
    }

    public HombreLobo(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
    
    
}
