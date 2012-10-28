package org.goodreturn.story.exporter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/**
 * Basic InputStream which wraps a series of lines to be fed as individual characters
 * to the input stream reader.
 * 
 * @author Kyle Pink
 */
public class LinesInputStream extends InputStream {

	private String currentLine;
	private int currentLineCol;

	private Iterator<String> linesData;

	/**
	 * Creates an inputstream that iterates through all lines of a 
	 * list of lines.
	 * 
	 * @param LinesInputData - All lines which will be read through.
	 */
	public LinesInputStream(List<String> LinesInputData) {
		//Sets counters to start.
		currentLineCol = 0;
		linesData = LinesInputData.iterator();

		//Sets first line if possible.
		goNextLine();
	}

	private void goNextLine() {
		//Sets currentline and associated counters. Cl null if no lines.
		currentLineCol = 0;
		if (linesData.hasNext()) {
			currentLine = linesData.next();
		} else {
			currentLine = null;
		}
	}

	@Override
	public int read() throws IOException {
		//Processing finished if current line is null.
		if (currentLine == null) {
			return -1;
		}

		//Line ending addition/check.
		if (currentLineCol == currentLine.length()) {
			goNextLine();
			return '\n';
		}

		//Line portion.
		//Returns current character in line, increments count.
		if (currentLineCol < currentLine.length()) {
			return currentLine.charAt(currentLineCol++);
		}

		//Should never occur but.
		return -1;
	}
}
