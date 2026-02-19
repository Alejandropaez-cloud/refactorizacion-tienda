package refactorizaciontienda;

public class Productos {
    // no hay metodo main en esta clase ya que esta clase sera para hacer constructores,
    // getters, setters y para eso no hace falta metodo main.
    
    // Creacion de los atributos.
    private final String nombre;
    private double precio;
    private int stock;

    // Constructor:
    public Productos(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    

    
    
    
    

    
    

}
