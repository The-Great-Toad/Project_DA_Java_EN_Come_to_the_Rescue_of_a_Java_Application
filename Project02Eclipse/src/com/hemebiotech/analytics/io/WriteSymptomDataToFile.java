package com.hemebiotech.analytics.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The WriteSymptomDataToFile class implements the ISymptomWriter interface and is responsible for writing symptom data
 * to a file.
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

    /**
     * Writes symptom data to a file.
     *
     * @param symptoms A map containing symptoms as keys and their occurrence count as values.
     *                 The map represents the symptom data to be written.
     *                 The keys are the names of the symptoms, and the values are the number of occurrences of each symptom.
     */
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {

        try {
            FileWriter writer = new FileWriter ("result.out");

            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write("%s : %d %n".formatted(entry.getKey(), entry.getValue()));
            }
            writer.close();
        } catch (IOException e) {
            System.out.printf("[ERROR] %s %n", e.getMessage());
        }
    }
}
