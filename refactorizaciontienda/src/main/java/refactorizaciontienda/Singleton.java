package refactorizaciontienda;

public class Singleton {
    // 1. Atributo estático privado
    private static Singleton instance;

    // 2. Constructor privado
    private Singleton() {}

    // 3. Método estático público de acceso
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Creación diferida (Lazy initialization)
        }
        return instance;
    }
    protected void log (){
        System.out.println("[LOG SYSTEM]");
    }
}
