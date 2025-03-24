public class Plato {
    
    private String codigo;
    private String nombre;
    private Double precio;

    public Plato(String codigo, String nombre, Double precio) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;

    }

    public String getCodigo() {return this.codigo;}
    public String getNombre() {return this.nombre;}
    public Double getPrecio() {return this.precio;}

    public void setCodigo(String codigo) {this.codigo = codigo;} 
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPrecio(Double precio) {this.precio = precio;}

}
