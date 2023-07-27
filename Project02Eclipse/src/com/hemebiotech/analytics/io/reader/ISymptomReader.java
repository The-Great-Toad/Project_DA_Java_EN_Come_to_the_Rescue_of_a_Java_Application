package com.hemebiotech.analytics.io.reader;

import java.io.IOException;
import java.util.List;

/**
 * The ISymptomReader interface represents a contract for classes that read symptom data from a file.
 */
public interface ISymptomReader {

	/**
	 * Reads symptom data from a file and returns it as a list of strings.
	 *
	 * @return A list of strings representing the symptom data read from the file.
	 *         Each string in the list represents a symptom.
	 */
	List<String> GetSymptoms () throws IOException;
}
