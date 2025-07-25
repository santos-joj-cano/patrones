package Singleton;

public class GlobalConfig {
    // 1. Static instance of the GlobalConfig class
    private static GlobalConfig instance;

    // Configuration fields
    private String applicationName;
    private String version;
    private String logFilePath;

    // 2. Private constructor to prevent external instantiation
    private GlobalConfig() {
        // Initialize default values or load from a configuration file if needed
        this.applicationName = "Mi aplicacipon";
        this.version = "1.0.0";
        this.logFilePath = "/var/log/my_application.log";
    }

    // 2. Public static method to get the single instance of GlobalConfig
    public static GlobalConfig getInstance() {
        if (instance == null) {
            synchronized (GlobalConfig.class) {
                if (instance == null) {
                    instance = new GlobalConfig();
                }
            }
        }
        return instance;
    }

    // 3. Getter methods for configurations
    public String getApplicationName() {
        return applicationName;
    }

    public String getVersion() {
        return version;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    // 3. Setter methods for configurations (optional, depending on whether configs can change at runtime)
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    // Example of how to use the GlobalConfig
    public static void main(String[] args) {
        // Get the single instance of GlobalConfig
        GlobalConfig config1 = GlobalConfig.getInstance();
        System.out.println("Application Name (config1): " + config1.getApplicationName());
        System.out.println("Version (config1): " + config1.getVersion());
        System.out.println("Ruta (config1): " + config1.getLogFilePath());

        // Modify some configurations
        config1.setApplicationName("Mi nueva app");
        config1.setVersion("1.0.1-BETA");

        // Get the instance again (it will be the same one)
        GlobalConfig config2 = GlobalConfig.getInstance();
        System.out.println("\nNombre de la aplicacion (config2): " + config2.getApplicationName());
        System.out.println("Version (config2): " + config2.getVersion());
        System.out.println("Ruta (config2): " + config2.getLogFilePath());

        // Verify that both references point to the same instance
        System.out.println("\n¿La config1 y config2 tienen la misma instancia?" + (config1 == config2));
    }
}