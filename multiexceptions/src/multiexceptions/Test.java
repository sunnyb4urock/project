package multiexceptions;

import java.io.IOException;
import java.text.ParseException;

public class Test {
	public void run() throws IOException, ParseException {
		//throw new IOException();
		throw new ParseException("error in command",2);
	}

}
