package flashcards.controller;

import java.sql.*;

public class Connector {
    private final String dBFile;

    public Connector(String dBFile) {
        this.dBFile = dBFile;
    }

    /**
     * est. connection to a database file
     */
    Connection connect() throws SQLException {
        String url = "jdbc:sqlite:" + dBFile;
        return DriverManager.getConnection(url);
    }
}
