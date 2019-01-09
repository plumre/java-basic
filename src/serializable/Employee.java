package serializable;

/*
 * Created by renhongjiang on 2019/1/8.
 */

import java.io.Serializable;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/8 18:31
 */
public class Employee implements Serializable {

    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }

}