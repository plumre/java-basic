package serializable;

/*
 * Created by renhongjiang on 2019/1/8.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/8 18:51
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        Employee employee;
        try {
            FileInputStream fis = new FileInputStream("E:\\tmp\\employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            employee = (Employee) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
            e.printStackTrace();
            return;
        }
        System.out.println("Deserialize Employee..");
        System.out.println("Name: " + employee.name);
        System.out.println("Address: " + employee.address);
        System.out.println("SSN: " + employee.SSN);
        System.out.println("Number: " +employee.number);

        System.out.println();
        System.out.println(employee);
    }

}