package org.goodreturn.story.exporter;

import java.io.IOException;
import java.util.LinkedList;

import org.apache.commons.csv.CSVUtils;

/**
 * Basic class which performs data loading and exporting as CSV data.
 * Operations performed in a static context.
 * 
 * @author Kyle Pink
 */
public class StoryExporter {

	/**
	 * Retrieves the data required for the csv data export.
	 * 
	 * @return a LinkedList<String[]> data structure which contains the desired
	 */
	public static LinkedList<String[]> loadData() {
		//Loads data from database.
		// TODO REPLACE DUMMY METHOD.
		LinkedList<String[]> data = new LinkedList<String[]>();
		data.add(new String[]{"1","2","3"});
		data.add(new String[]{"1,a","2,a","3,a"});
		data.add(new String[]{"1b","2b","3b"});

		return data;
	}


	/**
	 * Creates a csv file with given data provided, returns String file name
	 * which represents data which has been written.
	 * 
	 * @param disposableListData - data to be written in CSV file, will be discarded from list as used.
	 * @return String as new LinkedList object ready to be written.
	 * @throws IOException if data output fails.
	 */
	public static LinkedList<String> createCsvData(LinkedList<String[]> disposableListData) throws IOException {
		//Holds converted data as whole CSV string.
		LinkedList<String> csvData = new LinkedList<String>();
		
		//Converts lines into csv data.
		String[] currentLine;
		while(disposableListData.size() != 0){
			currentLine = disposableListData.removeFirst();
			csvData.add(CSVUtils.printLine(currentLine));
		}

		//Returns CSV lines as string builder.
		return csvData;
	}
} 
