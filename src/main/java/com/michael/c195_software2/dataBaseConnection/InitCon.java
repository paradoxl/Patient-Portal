package com.michael.c195_software2.dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * This class acts as a link between the program and database.
 */
public abstract class InitCon {
    private static final String protocol = "jdbc";
    private static final String vendor = ":mysql:";
    private static final String location = "//localhost/";
    private static final String databaseName = "client_schedule";
    private static final String jdbcUrl = protocol + vendor + location + databaseName; // LOCAL
    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Driver reference
    private static final String userName = "sqlUser"; // Username
    private static String password = "Passw0rd!"; // Password
    public static Connection connection;  // Connection Interface

    /**
     * This method will open a database connection.
     */
    public static void openConnection()
    {
        try {
            Class.forName(driver); // Locate Driver
            connection = DriverManager.getConnection(jdbcUrl, userName, password); // Reference Connection object
            System.out.println("Warp Core Seated!");
        }
        catch(Exception e)
        {

            System.out.println("Warp Core Malfunction" + e.getMessage());
        }
    }

    /**
     * This method will close a database connection
     */
    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Warp Core Ejected");
        }
        catch(Exception e)
        {
            System.out.println("Warp Core Malfunction!" + e.getMessage());
        }
    }
    }

