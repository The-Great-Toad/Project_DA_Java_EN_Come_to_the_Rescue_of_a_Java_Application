package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

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
