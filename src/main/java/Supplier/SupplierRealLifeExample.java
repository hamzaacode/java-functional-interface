package Supplier;

import java.util.function.Supplier;

class ConfigurationManager {
    private Supplier<String> configLoader;

    public ConfigurationManager(Supplier<String> configLoader) {
        this.configLoader = configLoader;
    }

    public String getConfig() {
        return configLoader.get();
    }
}

public class SupplierRealLifeExample {
    public static void main(String[] args) {
        // Simulate a configuration loader that reads a configuration file
        Supplier<String> fileConfigLoader = () -> {
            // In a real application, this would read from a file or external source.
            return "DatabaseURL=example.com;Port=3306;Username=myuser;Password=mypassword";
        };

        ConfigurationManager configManager = new ConfigurationManager(fileConfigLoader);

        // Access the configuration parameter when needed
        String databaseConfig = configManager.getConfig();
        System.out.println("Database Configuration: " + databaseConfig);
    }
}
