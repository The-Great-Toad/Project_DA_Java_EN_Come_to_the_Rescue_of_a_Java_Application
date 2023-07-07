package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AnalyticsCounter {
	private ISymptomReader reader;
	private ISymptomWriter writer;
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	public static void main(String args[]) {}

	public List<String> getSymptoms() {
		return reader.GetSymptoms();
	}

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

	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		return new TreeMap<>(symptoms);
	}

	public void writeSymptoms(Map<String, Integer> symptoms) {
		writer.writeSymptoms(symptoms);
	}
}
