
package laboratorio2_luisflores;

public class Detectives {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int years;
    private int nivel;
    
    //constructores
    public Detectives(){}

    public Detectives(String nombre, int edad, String nacionalidad, int years, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.years = years;
        this.nivel = nivel;
    }
    //mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    //adm
    public String toString (){
        return "nombre detective: "+nombre+ " , edad: "+edad+ " , nacionalidad: "+ nacionalidad+ ", tiempo laboral: "+years+ " , nivel: " +nivel;
                
    }
    
}
