package com.hemebiotech.analytics.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * The LoggerFile class implements the ILogger interface to log error messages to a file.
 * This class uses a PrintWriter to write formatted error messages to the specified file path.
 */
public class LoggerFile implements ILogger {
    private final String filePath;

    /**
     * Constructs a LoggerFile object with the specified file path.
     *
     * @param filePath The path of the file where error messages will be logged.
     */
    public LoggerFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Logs an error message to the file specified during the construction of the LoggerFile object.
     * The error message is formatted with "[ERROR]" prefix and is written on a new line in the file.
     *
     * @param message The error message to be logged.
     */
    @Override
    public void logError(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println("[ERROR] " + message);
        } catch (IOException e) {
            // If logging to the file fails, log the error message to the console.
            System.err.println("[ERROR] Failed to log the error message to the file: " + message);
        }
    }
}

