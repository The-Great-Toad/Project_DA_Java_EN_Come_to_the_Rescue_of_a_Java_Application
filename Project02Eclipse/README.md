# Heme Biotech Symptom Analytics

## Overview

Heme Biotech Symptom Analytics is a Java application developed for analyzing symptom data to verify the effectiveness and safety of pharmaceutical products. The application reads symptom data from a file, counts the occurrences of each symptom, sorts the results alphabetically, and writes the analyzed data to another file.

## Table of Contents

- [Requirements](#requirements)
- [Usage](#usage)
- [File Structure](#file-structure)
- [License](#license)

## Requirements

To run the application, you will need:

- Java Runtime Environment (JRE) 8 or above.
- A text file containing the symptom data, with one symptom per line.

## Usage

1. Clone the repository or download the source code to your local machine.

2. Ensure you have Java Runtime Environment (JRE) 8 or above installed on your system.

3. Prepare a text file containing the symptom data. Each symptom should be on a separate line.

4. Update the `Main.java` file in the `com.hemebiotech.analytics` package with the correct file path to the input file containing symptom data:

   ```java
   String inputFile = "path/to/your/symptoms.txt";

## File Structure
```
.
├── Project02Eclipse/                       # Input file (symptoms.txt) and other Eclipse-related files (if applicable)
├── src/
│   └── com.hemebiotech.analytics/
│       ├── ISymptomReader.java             # Interface for reading symptom data
│       ├── ISymptomWriter.java             # Interface for writing symptom data
│       ├── ReadSymptomDataFromFile.java    # Class for reading symptom data from a file
│       ├── WriteSymptomDataToFile.java     # Class for writing symptom data to a file
│       ├── AnalyticsCounter.java           # Class for analyzing symptom data, counting occurrences, and sorting
│       └── Main.java                       # Main class for running the application
├── .gitignore                              # List of files and directories to be ignored by Git
└── README.md                               # This README file`
```
## License

This project is licensed under the OpenClassrooms License.