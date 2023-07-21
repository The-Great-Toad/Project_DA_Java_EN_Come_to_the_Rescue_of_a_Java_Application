package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The ReadSymptomDataFromFile class implements the ISymptomReader interface and is responsible for reading symptom data
 * from a file.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private final String filepath;

	/**
	 * Constructs a new ReadSymptomDataFromFile instance with the provided file path.
	 *
	 * @param filepath The path to the file containing the symptom data.
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Reads symptom data from a file and returns it as a list of strings.
	 *
	 * @return A list of strings representing the symptoms read from the file.
	 *         If an error occurs during the reading process or the file path is invalid, an empty list will be returned.
	 */
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
