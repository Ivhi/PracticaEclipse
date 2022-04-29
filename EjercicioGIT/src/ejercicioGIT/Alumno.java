package ejercicioGIT;

public class Alumno {
	private String nombre;
	private String apellido;
	private int DNI;
	
	public Alumno(String nom, String ape, int identificador) {
		nombre = nom;
		apellido = ape;
		DNI = identificador;
	}
	public String toString() {
        return "Nombre: "+nombre+" Apellido: "+apellido+" DNI:"+DNI;
    }
}
