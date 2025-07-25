import Singleton.GlobalConfig;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // --- Using the GlobalConfig Singleton ---
//
//        // Get the single instance of GlobalConfig
//        GlobalConfig appConfig = GlobalConfig.getInstance();
//
//
//        // Access configuration properties
//        System.out.println("\n--- Confuguracion de aplicacion ---");
//        System.out.println("Nombre de la aplicacion: " + appConfig.getApplicationName());
//        System.out.println("Version: " + appConfig.getVersion());
//        System.out.println("Ruta: " + appConfig.getLogFilePath());
//
//        // You can also change configurations if setters are provided
//        appConfig.setApplicationName("Mi aplicacion en JAVA");
//        appConfig.setVersion("2.0.0");
//        appConfig.setLogFilePath("/app/logs/awesome_app.log");
//
//        // Get the instance again (it will be the same one, and reflect the changes)
//        GlobalConfig anotherConfigReference = GlobalConfig.getInstance();
//        System.out.println("\n--- Actualización de la aplicacion (utilizando otra referencia) ---");
//        System.out.println("Nombre de la aplicacion: " + anotherConfigReference.getApplicationName());
//        System.out.println("Version: " + anotherConfigReference.getVersion());
//        System.out.println("Ruta: " + anotherConfigReference.getLogFilePath());
//
//        // Prove it's the same instance
//        System.out.println("\n¿Ambas son la misma instancia? " + (appConfig == anotherConfigReference));
//    }
        // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // --- Using the GlobalConfig Singleton ---

        // Get the single instance of GlobalConfig
        GlobalConfig appConfig = GlobalConfig.getInstance();


        // Access configuration properties
        System.out.println("\n--- Confuguracion de aplicacion ---");
        System.out.println("Nombre de la aplicacion: " + appConfig.getApplicationName());
        System.out.println("Version: " + appConfig.getVersion());
        System.out.println("Ruta: " + appConfig.getLogFilePath());

        // You can also change configurations if setters are provided
        appConfig.setApplicationName("Mi aplicacion en JAVA");
        appConfig.setVersion("2.0.0");
        appConfig.setLogFilePath("/app/logs/awesome_app.log");

        // Get the instance again (it will be the same one, and reflect the changes)
        GlobalConfig anotherConfigReference = GlobalConfig.getInstance();
        System.out.println("\n--- Actualización de la aplicacion (utilizando otra referencia) ---");
        System.out.println("Nombre de la aplicacion: " + anotherConfigReference.getApplicationName());
        System.out.println("Version: " + anotherConfigReference.getVersion());
        System.out.println("Ruta: " + anotherConfigReference.getLogFilePath());

        // Prove it's the same instance
        System.out.println("\n¿Ambas son la misma instancia? " + (appConfig == anotherConfigReference));
    }
}