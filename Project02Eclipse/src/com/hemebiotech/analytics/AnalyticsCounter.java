package com.hemebiotech.analytics;

import com.hemebiotech.analytics.io.ISymptomReader;
import com.hemebiotech.analytics.io.ISymptomWriter;

import java.util.*;

/**
 * The AnalyticsCounter class is responsible for analyzing symptom data and counting the occurrences of each symptom.
 * It also provides methods for sorting and writing the analyzed data.
 */
public class AnalyticsCounter {
	private final ISymptomReader reader;
	private final ISymptomWriter writer;

	/**
	 * Constructs a new AnalyticsCounter instance with the provided ISymptomReader and ISymptomWriter.
	 *
	 * @param reader The ISymptomReader implementation used to read symptom data from a file.
	 * @param writer The ISymptomWriter implementation used to write symptom data to a file destination.
	 */
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	/**
	 * Retrieves the list of symptoms by reading data from a file using the ISymptomReader implementation.
	 *
	 * @return A list of strings representing the symptoms read from the file.
	 */
	public List<String> getSymptoms() {
		return reader.GetSymptoms();
	}

	/**
	 * Counts the occurrences of each symptom in the provided list of symptoms and returns the results as a map.
	 *
	 * @param symptoms A list of strings representing the symptoms to be analyzed.
	 * @return A map containing symptoms as keys and their occurrence count as values.
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> mapSymptoms = new HashMap<>();

		for (String symptom : symptoms) {
			if (mapSymptoms.containsKey(symptom)) {
				mapSymptoms.put(symptom, mapSymptoms.get(symptom) + 1);
			} else {
				mapSymptoms.put(symptom, 1);
			}
		}
		return mapSymptoms;
	}

	/**
	 * Sorts the map of symptoms in ascending order based on the symptom names and returns the sorted map.
	 *
	 * @param symptoms A map containing symptoms as keys and their occurrence count as values.
	 * @return A sorted map containing symptoms in ascending order based on their names.
	 */
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		return new TreeMap<>(symptoms);
	}

	/**
	 * Writes symptom data to a data destination using the ISymptomWriter implementation.
	 *
	 * @param symptoms A map containing symptoms as keys and their occurrence count as values.
	 *                 The map represents the symptom data to be written.
	 */
	public void writeSymptoms(Map<String, Integer> symptoms) {
		writer.writeSymptoms(symptoms);
	}
}
