package org.example.repository.jdbcimpl;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionCreator {
    private static final Properties properties = new Properties();
    private static final String DATABASE_URL;
    private static final String DATABASE_USER;
    private static final String DATABASE_PASS;

    static {
        try {
            properties.load(new FileReader(getFileFromResource("application.properties")));
            String driverName = (String) properties.get("spring.datasource.driver-class-name");
            Class.forName(driverName);
        } catch (ClassNotFoundException | IOException | URISyntaxException e) {
            e.printStackTrace(); // fatal exception
        }

        DATABASE_URL = (String) properties.get("spring.datasource.url");
        DATABASE_USER = (String) properties.get("spring.datasource.username");
        DATABASE_PASS = (String) properties.get("spring.datasource.password");
    }

    private ConnectionCreator() {
    }

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASS);
    }

    public static File getFileFromResource(final String fileName)
            throws URISyntaxException {
        ClassLoader classLoader = ConnectionCreator.class.getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource != null) {
            return new File(resource.toURI());
        } else {
            throw new URISyntaxException(fileName, ": couldn't be parsed.");
        }
    }
}
