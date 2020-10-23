
package laboratorio2_luisflores;


public class casos {
    private String lugar;
    private String descripcion;
    private String tipo;
    private String detective;
    private String estado;
    //constructores
    public casos(){}

    public casos(String lugar, String descripcion, String tipo, String detective, String estado) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.detective = detective;
        this.estado = estado;
    }

    public String getDetective() {    
        return detective;
    }

    public void setDetective(String detective) {
        this.detective = detective;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //adm
    public String toString(){
        return "lugar caso: "+lugar+ " descripcion: "+descripcion+ " tipo: "+ tipo+ " detective: "+detective+ " estado: "+estado;
    }
}

