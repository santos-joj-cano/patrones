package Singleton; // Puedes mantenerlo en el mismo paquete o crear uno nuevo si prefieres

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventLogger {
    // 1. Instancia estática de la clase EventLogger
    private static EventLogger instance;

    // Formateador para la marca de tiempo
    private final DateTimeFormatter formatter;

    // 2. Constructor privado para prevenir la instanciación externa
    private EventLogger() {
        // Inicializa el formateador de fecha y hora
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("EventLogger: Instancia creada."); // Solo para depuración
    }

    // 2. Método estático público para obtener la única instancia de EventLogger
    public static EventLogger getInstance() {
        // Doble Verificación con Bloqueo para seguridad de hilos
        if (instance == null) {
            synchronized (EventLogger.class) {
                if (instance == null) {
                    instance = new EventLogger();
                }
            }
        }
        return instance;
    }

    // 3. Método para registrar un mensaje de evento
    public void log(String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        // En una aplicación real, esto se escribiría en un archivo, una base de datos, etc.
        System.out.println("[" + timestamp + "] " + message);
    }

    // --- Ejemplo de uso (método main para probar la clase directamente) ---
    public static void main(String[] args) {
        System.out.println("--- Probando EventLogger ---");

        // Obtener la primera instancia
        EventLogger logger1 = EventLogger.getInstance();
        logger1.log("Aplicación iniciada.");

        // Obtener otra referencia, debería ser la misma instancia
        EventLogger logger2 = EventLogger.getInstance();
        logger2.log("Advertencia: Configuración no encontrada.");

        // Tercera referencia
        EventLogger logger3 = EventLogger.getInstance();
        logger3.log("Error crítico: Conexión a la base de datos fallida.");

        // Verificar que todas las referencias apuntan a la misma instancia
        System.out.println("\n¿logger1 y logger2 son la misma instancia? " + (logger1 == logger2));
        System.out.println("¿logger1 y logger3 son la misma instancia? " + (logger1 == logger3));
        System.out.println("¿logger2 y logger3 son la misma instancia? " + (logger2 == logger3));

        System.out.println("\n--- Fin de la prueba ---");
    }
}