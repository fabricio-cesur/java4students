import java.io.*;
import java.util.LinkedList;

public class Datos {

    private static final String PATH = "POO/Examen/datos.dat";
    
    public static void guardarDatos(LinkedList<Object>[] datos) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH))) {
            out.writeObject(datos[0]); // LinkedList<Mesa> 10001
            out.writeObject(datos[1]); // cartaPlatos
            out.writeObject(datos[2]); // pedidos
            System.out.println("Datos guardados correctamente!");
        } catch (Exception ex) {
            System.out.println("Error al guardar los datos: " + ex.getMessage());
        }
    }

    public static LinkedList<?>[] cargarDatos() {
        LinkedList<Mesa> listaMesas = null;
        LinkedList<Plato> listaPlatos = null;
        LinkedList<Pedido> listaPedidos = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH))) {
            listaMesas = (LinkedList<Mesa>) in.readObject();
            listaPlatos = (LinkedList<Plato>) in.readObject();
            listaPedidos = (LinkedList<Pedido>) in.readObject();
            System.out.println("Datos cargados correctamente!");
        } catch (Exception error) {
            System.out.println("Error al cargar los datos: " + error.getMessage());
        }

        LinkedList<?>[] result = new LinkedList<?>[3];
        result[0] = listaMesas;
        result[1] = listaPlatos;
        result[2] = listaPedidos;
        return result;
    }
}