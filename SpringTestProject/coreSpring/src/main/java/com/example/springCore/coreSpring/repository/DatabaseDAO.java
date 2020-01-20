package com.example.springCore.coreSpring.repository;

public class DatabaseDAO {
    private String dbServer;

    public DatabaseDAO(String dbServer) {
        this.dbServer = dbServer;
    }

    @Override
    public String toString() {
        return "DatabaseDAO{" +
                "dbServer='" + dbServer + '\'' +
                '}';
    }
}
