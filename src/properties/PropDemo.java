package properties;

/*
 * Created by renhongjiang on 2019/1/7.
 */

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/7 9:19
 */
public class PropDemo {

    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String string;
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");
        // show all states and capitals in hashtable
        states = capitals.keySet();
        Iterator iterator = states.iterator();
        while (iterator.hasNext()) {
            string = (String) iterator.next();
            System.out.println("The capital of " + string + " is " + capitals.getProperty(string) + ".");
        }
        System.out.println();
        // look for state not in the list -- specify default
        string = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of " + string + " is " + capitals.getProperty(string) + ".");

    }

}