package f_arrayandinput;

/*
 * class ReadInteger
 * burton rosenberg
 * March 2004
 * (based on earlier version
 */

public class ReadInteger {

    // magic words to get a buffered reader from system.in
    static java.io.BufferedReader br = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));

    static int readInteger(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        try {
            // get a line of text, parse it as an integer
            return Integer.parseInt(br.readLine());
        } catch (Exception e) {
            return 0;  // hear no evil, see no evil approach to errors
        }
    }

    static int readPosInteger(String prompt, String errorPrompt) {
        int i;
        i = readInteger(prompt);
        while (i <= 0) {
            System.out.print(errorPrompt);
            i = readInteger(null);
        }
        return i;
    }
}


