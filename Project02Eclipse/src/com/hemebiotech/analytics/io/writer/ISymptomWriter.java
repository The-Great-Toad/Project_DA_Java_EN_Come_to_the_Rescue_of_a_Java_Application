package com.hemebiotech.analytics.io.writer;

import java.util.Map;

/**
 * The ISymptomWriter interface represents a contract for classes that write symptom data to file destination.
 */
public interface ISymptomWriter {

    /**
     * Writes symptom data to a data destination.
     *
     * @param symptoms A map containing symptoms as keys and their occurrence count as values.
     *                 The map represents the symptom data to be written.
     *                 The keys are the names of the symptoms, and the values are the number of occurrences of each symptom.
     */
    void writeSymptoms(Map<String, Integer> symptoms);
}
