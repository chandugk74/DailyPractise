package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DummyMain {

	public static void main(String[] args) {
		try {
            testExceptions();
        } catch ( FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void testExceptions() {

    }
	}
