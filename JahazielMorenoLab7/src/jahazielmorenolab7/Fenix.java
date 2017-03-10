package jahazielmorenolab7;


public class Fenix extends Guerrero{

    public Fenix() {
        super();
    }

    public Fenix(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public float Ataque(float DefensaRival, float vidaRival, float AtaqueRival) {
        
        float attack = (float) (ataque * 0.75);
        vidaRival =  (float) (vidaRival - ((ataque+attack) - DefensaRival)) ;
        return vidaRival;
    
    
    }

     
    
    
    
    
}
