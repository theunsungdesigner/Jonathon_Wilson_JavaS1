package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RangeCheckerTest {

    private InputStream original;

    private static void setIn(String dir, int iteration) throws FileNotFoundException  {
        final FileInputStream fips = new FileInputStream(new File("testfiles/" + dir + "/input" + iteration + ".txt"));
        System.setIn(fips);
    }

    @Before
    public void saveIn() {
        original = System.in;
    }

    @After
    public void resetIn() {
        System.setIn(original);
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testRangeCheckerOutput() throws Exception {
        String[] args = null;
        String expected = "30";

        setIn("RangeChecker", 0);
        String newLine = System.lineSeparator();
        RangeChecker.main(args);
        String[] lines = systemOutRule.getLog().split(newLine);

        String failMessage =  "Expected to have multiple input prompts and 1 output line";
        assertEquals(failMessage, lines.length, 15);

        failMessage = "Expected output to contain the number which passed the range check";
        assertTrue(failMessage, lines[lines.length - 1].contains(expected));
    }
}

