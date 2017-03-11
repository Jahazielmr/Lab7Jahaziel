package jahazielmorenolab7;

public class Dragon extends Guerrero{

    public Dragon() {
        super();
    }

    public Dragon(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public float Ataque(float DefensaRival, float vidaRival, float AtaqueRival) {
        
        float attack = (float) (ataque * 0.35);
        vidaRival =  (float) (vidaRival - ((ataque+attack) - defensaRival)) ;
        return vidaRival;
    
    }
    
    
   
    
    
    
    
    
    
}
