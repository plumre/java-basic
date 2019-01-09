package serializable;

/*
 * Created by renhongjiang on 2019/1/8.
 */

import java.io.*;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/8 18:34
 */
public class SerializeDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Ray Ali";
        employee.address = "Phokka Kuan, MA";
        employee.SSN = 112233;
        employee.number = 101;

        try {
            FileOutputStream fos = new FileOutputStream("E:\\tmp\\employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.close();
            fos.close();
            System.out.println("Serialized data is saved in E:\\tmp\\employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}