public class App {
    public static void main(String[] args) {
    Persona persona = new Persona();
    
    persona.setNombre("Franco");
    persona.setEdad(25);
    persona.setTelefono(123456789);


    System.out.println("Nombre = "+persona.getNombre());
    System.out.println("Edad = "+persona.getEdad());
    System.out.println("Telefono = "+persona.getTelefono());

    }

}
class Persona{
    private String nombre;
    private int edad;
    private int telefono;

/////////Nombre//////////////

public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getNombre(){
    return this.nombre;
}
///////////Edad///////////

public void setEdad(int edad){
    this.edad = edad;
}

public int getEdad(){
    return this.edad;
}
//////////Telefono////////////

public void setTelefono(int telefono){
    this.telefono = telefono;
}

public int getTelefono(){
    return this.telefono;
}


}
