package singletonPackage;

public class Persona {
	
	private String nombre;
	private static Persona persona;
	
	   private Persona(String nombre)
	    {
		   this.nombre = nombre;
	    }
	   
	    public static Persona getPersona(String nombre)
	    {
	    	if(persona == null) {
	    		Persona persona = new Persona(nombre);
	    	}
	        return persona;
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public static void setPersona(Persona persona) {
			Persona.persona = persona;
		}
 
}
