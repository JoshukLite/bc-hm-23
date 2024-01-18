package org.simple.manager;

import org.simple.exception.EntityManagerException;

import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomEntityManagerFactory {
    private final String url;
    private final String user;
    private final String password;

    public CustomEntityManagerFactory(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public CustomEntityManager createEntityManager() {
        try {
            return new CustomEntityManager(DriverManager.getConnection(url, user, password));
        } catch (SQLException e) {
            throw new EntityManagerException("Could not create DB connection for entity manager instance", e);
        }
    }
}
