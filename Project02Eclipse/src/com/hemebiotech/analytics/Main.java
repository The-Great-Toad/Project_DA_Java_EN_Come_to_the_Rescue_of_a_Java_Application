package com.hemebiotech.analytics;

import com.hemebiotech.analytics.io.reader.ISymptomReader;
import com.hemebiotech.analytics.io.writer.ISymptomWriter;
import com.hemebiotech.analytics.io.reader.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.io.writer.WriteSymptomDataToFile;

import java.util.List;
import java.util.Map;

/**
 * The Main class is the entry point of the application. It demonstrates how to use the classes and interfaces
 * to read symptom data from a file, analyze the data, sort the results, and write the analyzed data to another file.
 */
public class Main {

    public static void main(String[] args) {
        // Define the path to the input file containing symptom data
        String inputFile = "Project02Eclipse/symptoms.txt";

        // Create an instance of ReadSymptomDataFromFile to read symptom data from the file
        ISymptomReader reader = new ReadSymptomDataFromFile(inputFile);

        // Create an instance of WriteSymptomDataToFile to write analyzed symptom data to a file
        ISymptomWriter writer = new WriteSymptomDataToFile();

        // Create an instance of AnalyticsCounter with the reader and writer instances
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);

        // Get the list of symptoms by reading data from the input file
        List<String> symptoms = analyticsCounter.getSymptoms();

        // Count the occurrences of each symptom and store the results in a map
        Map<String, Integer> mapSymptoms = analyticsCounter.countSymptoms(symptoms);

        // Sort the symptoms in ascending order based on their names
        Map<String, Integer> sortedSymptoms = analyticsCounter.sortSymptoms(mapSymptoms);

        // Write the analyzed symptom data to the output file
        analyticsCounter.writeSymptoms(sortedSymptoms);
    }
}