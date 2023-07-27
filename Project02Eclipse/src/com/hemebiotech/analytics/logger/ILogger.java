package com.hemebiotech.analytics.logger;

/**
 * The ILogger interface represents a contract for classes that handle logging of error messages.
 * Implementing classes should provide a method to log error messages.
 */
public interface ILogger {

    /**
     * Logs an error message.
     *
     * @param message The error message to be logged.
     */
    void logError(String message);
}
