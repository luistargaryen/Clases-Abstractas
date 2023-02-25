package clase7;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
	public static void main(String[] args) {
		
		Persona[] personas = new Persona[5];
		
		personas[0] = new Empleado("Wanfredo", 5000, 2002, 10, 2);
		personas[1] = new Empleado("Leidys", 3000, 2003, 4, 28);
		personas[2] = new Empleado("Gabriela", 4500, 2001, 8, 9);
		personas[3] = new Empleado("Tomasa", 5000, 1977, 3, 18);
		personas[4] = new Empleado("Diego", 2500, 1988, 1, 7);
		
		for(Persona persona: personas) {
			System.out.println(persona.dameNombre() + ", " + persona.dameDescripcion());
		}
	}
}

abstract class Persona{
	private String nombre;
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
}

class Empleado extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	public Empleado(String nom, double sue, int agno, int mes,int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
	}
	
	public String dameDescripcion() {
		return "Este empleado tiene un Id = "+ Id + " con un sueldo = "+sueldo;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public void subSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
}

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}
	
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	
	
}