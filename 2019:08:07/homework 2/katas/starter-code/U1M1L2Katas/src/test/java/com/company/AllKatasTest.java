package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class AllKatasTest {

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
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testAddFiveOutput() throws Exception {
        String[] results = {"75", "191", "104"};
        String[] args = null;

        int iteration = 0;

        while (iteration < results.length) {

            // set input to file stream
            setIn("MultipleInputs", iteration);

            // run main method and capture output
            AddFive.main(args);
            String output = systemOutRule.getLog();

            // make sure none of the results appear except the one we're checking
            for(int i = 1; i < results.length; i++) {
                String next = results[(iteration + i) % results.length];
                assertFalse("\nExpected output to not contain " + next, output.contains(next));
            }

            // check that the current iteration output contains intended result
            String message = "\nExpected output to contain " + results[iteration] + "\n";
            assertTrue(message, output.contains(results[iteration]));

            // clear log and increment iterator
            systemOutRule.clearLog();
            iteration++;
        }
    }

    @Test
    public void testAddFiveAndDoubleOutput() throws Exception {
        String[] results = {"20", "36", "118"};
        String[] args = null;

        int iteration = 0;

        while (iteration < results.length) {

            // set input to file stream
            setIn("SingleInputs", iteration);

            // run main method and capture output
            AddFiveAndDouble.main(args);
            String output = systemOutRule.getLog();

            // make sure none of the results appear except the one we're checking
            for(int i = 1; i < results.length; i++) {
                String next = results[(iteration + i) % results.length];
                assertFalse("\nExpected output to not contain " + next, output.contains(next));
            }

            // check that the current iteration output contains intended result
            String message = "\nExpected output to contain " + results[iteration] + "\n";
            assertTrue(message, output.contains(results[iteration]));

            // clear log and increment iterator
            systemOutRule.clearLog();
            iteration++;
        }
    }

    @Test
    public void testAddThirteenOutput() throws Exception {
        String[] results = {"18", "26", "67"};
        String[] args = null;

        int iteration = 0;

        while (iteration < results.length) {

            // set input to file stream
            setIn("SingleInputs", iteration);

            // run main method and capture output
            AddThirteen.main(args);
            String output = systemOutRule.getLog();

            // make sure none of the results appear except the one we're checking
            for(int i = 1; i < results.length; i++) {
                String next = results[(iteration + i) % results.length];
                assertFalse("\nExpected output to not contain " + next, output.contains(next));
            }

            // check that the current iteration output contains intended result
            String message = "\nExpected output to contain " + results[iteration] + "\n";
            assertTrue(message, output.contains(results[iteration]));

            // clear log and increment iterator
            systemOutRule.clearLog();
            iteration++;
        }
    }

    @Test
    public void testAverageThreeOutput() throws Exception {

        String[] results = {"10.00", "29.33", "1.00"};
        String[] args = null;

        int iteration = 0;

        while (iteration < results.length) {

            // set input to file stream
            setIn("MultipleInputs", iteration);

            // run main method and capture output
            AverageThree.main(args);
            String output = systemOutRule.getLog();

            // make sure none of the results appear except the one we're checking
            for(int i = 1; i < results.length; i++) {
                String next = results[(iteration + i) % results.length];
                assertFalse("\nExpected output to not contain " + next, output.contains(next));
            }

            // check that the current iteration output contains intended result
            String message = "\nExpected output to contain " + results[iteration] + "\n";
            assertTrue(message, output.contains(results[iteration]));

            // clear log and increment iterator
            systemOutRule.clearLog();
            iteration++;
        }
    }

    @Test
    public void testDoubleAndAddFiveOutput() throws Exception {
        String[] results = {"15", "31", "113"};
        String[] args = null;

        int iteration = 0;

        while (iteration < results.length) {

            // set input to file stream
            setIn("SingleInputs", iteration);

            // run main method and capture output
            DoubleAndAddFive.main(args);
            String output = systemOutRule.getLog();

            // make sure none of the results appear except the one we're checking
            for(int i = 1; i < results.length; i++) {
                String next = results[(iteration + i) % results.length];
                assertFalse("\nExpected output to not contain " + next, output.contains(next));
            }

            // check that the current iteration output contains intended result
            String message = "\nExpected output to contain " + results[iteration] + "\n";
            assertTrue(message, output.contains(results[iteration]));

            // clear log and increment iterator
            systemOutRule.clearLog();
            iteration++;
        }
    }

    @Test
    public void testMultiplyThreeOutput() throws Exception {

        String[] results = {"750", "4320", "1"};
        String[] args = null;

        int iteration = 0;

        while (iteration < results.length) {

            // set input to file stream
            setIn("MultipleInputs", iteration);

            // run main method and capture output
            MultiplyThree.main(args);
            String output = systemOutRule.getLog();

            // make sure none of the results appear except the one we're checking
            for(int i = 1; i < results.length; i++) {
                String next = results[(iteration + i) % results.length];
                assertFalse("\nExpected output to not contain " + next, output.contains(next));
            }

            // check that the current iteration output contains intended result
            String message = "\nExpected output to contain " + results[iteration] + "\n";
            assertTrue(message, output.contains(results[iteration]));

            // clear log and increment iterator
            systemOutRule.clearLog();
            iteration++;
        }
    }

    @Test
    public void testSubtractTwoOutput() throws Exception {
        String[] results = {"-5", "-4", "0"};
        String[] args = null;

        int iteration = 0;

        while (iteration < results.length) {

            // set input to file stream
            setIn("MultipleInputs", iteration);

            // run main method and capture output
            SubtractTwo.main(args);
            String output = systemOutRule.getLog();

            // make sure none of the results appear except the one we're checking
            for(int i = 1; i < results.length; i++) {
                String next = results[(iteration + i) % results.length];
                assertFalse("\nExpected output to not contain " + next, output.contains(next));
            }

            // check that the current iteration output contains intended result
            String message = "\nExpected output to contain " + results[iteration] + "\n";
            assertTrue(message, output.contains(results[iteration]));

            // clear log and increment iterator
            systemOutRule.clearLog();
            iteration++;
        }
    }
}
