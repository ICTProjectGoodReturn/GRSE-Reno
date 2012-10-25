package org.goodreturn.story.exporter;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Basic InputStream which wraps a series of lines to be fed as individual characters
 * to the input stream reader.
 * 
 * @author Kyle Pink
 */
public class LinesInputStream extends InputStream {

	private String currentLine;
	private int currentLineRow;
	private int currentLineCol;

	private List<String> linesData;

	/**
	 * Creates an inputstream that iterates through all lines of a 
	 * list of lines.
	 * 
	 * @param LinesInputData - All lines which will be read through.
	 */
	public LinesInputStream(List<String> LinesInputData) {
		//Sets counters to start.
		currentLineRow = 0;
		currentLineCol = 0;
		linesData = LinesInputData;

		//Sets first line if necessary.
		if (linesData.size() > 0) {
			goNextLine();
		}
	}
	
	private void goNextLine() {
		//Sets nextline to currentline sets associated counters.
		currentLineCol = 0;
		currentLine = linesData.get(currentLineRow);
		currentLineRow++;
	}

	@Override
	public int read() throws IOException {
		//Null/Row check, will only get executed once if list
		//was empty before placing in this class.
		if (currentLine == null && currentLineRow < linesData.size()) {
			goNextLine();
		}
		
		//Processing finished if current line is null.
		if (currentLine == null) {
			return -1;
		}

		//Line portion.
		//Returns current character in line, increments count.
		if (currentLineCol < currentLine.length()) {
			return currentLine.charAt(currentLineCol++);
		}
		
		//Line ending addition/check.
		if (currentLineCol == currentLine.length()) {
			currentLineCol++;
			return '\n';
		}

		//Row portion.
		//Goes to next line if possible.
		if (currentLineRow < linesData.size()) {
			goNextLine();
			return read();
		}
		
		//Finished with current line, no new lines exist.
		return -1;
	}
}
