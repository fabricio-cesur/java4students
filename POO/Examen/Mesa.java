public class Mesa {
    
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {

        this.numero = numero;
        this.capacidad = capacidad;

    } 

    public int getNumero() { return this.numero; }
    public int getCapacidad() { return this.capacidad; }

    public void setNumero(int numero) { this.numero = numero; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

}
