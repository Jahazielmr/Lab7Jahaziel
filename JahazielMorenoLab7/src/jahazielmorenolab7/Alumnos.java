package jahazielmorenolab7;

public class Alumnos extends Guerrero{
 
    private String carrera;
    private int NumeroCuenta, edad;

    public Alumnos() {
        super();
    }

    public Alumnos(String carrera, int NumeroCuenta, int edad, String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
        this.carrera = carrera;
        this.NumeroCuenta = NumeroCuenta;
        this.edad = edad;
    }

      
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumnos{" + "carrera=" + carrera + ", NumeroCuenta=" + NumeroCuenta + ", edad=" + edad + '}';
    }

    @Override
    public float Ataque(float DefensaRival, float vidaRival, float AtaqueRival) {
    
    
    }

   
    
    
    
    
    
    
    
}
