
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class EmployeeDB {
    
    public void readData(HashMap<String, Employee> db, ArrayList<Employee> EmployeeList){
        
        String path = "C:\\Users\\USER\\Documents\\NetBeansProjects\\JavaApplication10\\src\\EMPLOYEE DB 2.csv";
        String line = "";
        BufferedReader br = null;

        
//        boolean con = true;
         try {
             br = new BufferedReader(new FileReader(path));
             int c = 0;
             while ((line = br.readLine()) != null) {
                 String temp[] = line.split(",");
                 EmployeeList.add(new Employee());
                 EmployeeList.get(c).setId(temp[0]);
                 EmployeeList.get(c).setName(temp[1]);
                 EmployeeList.get(c).setAge(temp[2]);
                 EmployeeList.get(c).setSex(temp[3]);
                 EmployeeList.get(c).setAddress(temp[4]);
//                 EmployeeList.get(c).setAddress(temp[5]);
//                 EmployeeList.get(c).setPhone(temp[6]);
//                 EmployeeList.get(c).setAllowance(temp[7]);
//                 EmployeeList.get(c).setBonus(temp[8]);
//                 EmployeeList.get(c).setPresent(temp[9]);

                db.put(temp[0], EmployeeList.get(c));
                c++;
             }
        } catch (FileNotFoundException e) {
//            con = false;
            e.printStackTrace();
        }
        catch (IOException e) {
//            con = false;
            e.printStackTrace();
        }
        
    }
}
