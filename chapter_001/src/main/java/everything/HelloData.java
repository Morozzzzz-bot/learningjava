package everything;

import java.util.*;

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Burce Eckel
 * @author www.MindView.net
 * @version 4.0
 */

public class HelloData {
    /** Entry poing to class & application.
     * @param args array of string arguments
     * @throws No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.print("Hello, it's: ");
        System.out.println(new Date());
    }
}
