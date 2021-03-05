/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
public class EmployeeManager {
    public static ArrayList<Employee> EmployeeList = new ArrayList<>();
    public static HashMap<String, Employee> db = new HashMap<String, Employee>();
    String path = "EMPLOYEE DB 2.csv";

//    public EmployeeManager()
//    {
//        this.EmployeeList= new ArrayList<>();
//
//    }


//     public boolean readdata()  {
//        String line = "";
//        BufferedReader br = null;
//
//        
//        boolean con = true;
//         try {
//             br = new BufferedReader(new FileReader(path));
//             int c = 0;
//             while ((line = br.readLine()) != null) {
//                 String temp[] = line.split(",");
////                 EmployeeList.add(new Employee(temp[0]));
//////                 EmployeeList.get(c).getId(temp[0]);
////                 EmployeeList.get(c).setPassword(temp[1]);
////                 EmployeeList.get(c).setName(temp[2]);
////                 EmployeeList.get(c).setAge(temp[3]);
////                 EmployeeList.get(c).setSex(temp[4]);
////                 EmployeeList.get(c).setAddress(temp[5]);
////                 EmployeeList.get(c).setPhone(temp[6]);
////                 EmployeeList.get(c).setAllowance(temp[7]);
////                 EmployeeList.get(c).setBonus(temp[8]);
////                 EmployeeList.get(c).setPresent(temp[9]);
//
//                   Employee employee = new Employee(temp[0]);
//                   employee.setName(temp[1]);
//                   employee.setAge(temp[2]);
//                   employee.setSex(temp[3]);
//                   employee.setAddress(temp[4]);
//          
//                
//                 db.put(temp[0], employee);
//                 c++;
//             }
//        } catch (FileNotFoundException e) {
//            con = false;
//        }
//        catch (IOException e) {
//            con = false;
//            e.printStackTrace();
//        }
//        return con;
//    }

    public String getEmployeeDetails(String id) {
        var s = " Name - " + db.get(id).getName() +
                "\n Employee Id - " + db.get(id).getid() +
                "\n Sex - " + db.get(id).getSex() +
                "\n Contact no - " + db.get(id).getPhone() +
                "\n Bonus - $" + db.get(id).getBonus() +
                "\n Attendence Precentage -- " + ((Double.parseDouble(db.get(id).getPresent()) / 240) * 100) + "%";
        return s;
    }

    public boolean updateEmployeeDetails(String input){

        boolean con = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fw = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(input);
            pw.flush();
            pw.close();
            System.out.println("NEW EMPLOYEE ADDED");
        } catch (FileNotFoundException e) {
            con = false;
        } catch (IOException e) {
            con =  false;
        }
            return con;
    }
//    public int getOneAge()
//    {
////        System.out.println(Integer.parseInt(EmployeeList.get(1).getAge()));
//        return Integer.parseInt(db.get(3).getAge());
//
//    }
    public static void main(String [] args)
    {
//        EmployeeManager emp = new EmployeeManager();
        //emp.readdata();
        //int age =emp.getVal();
        EmployeeDB call = new EmployeeDB();
        call.readData(db, EmployeeList);
        String e_id = "123456";
        
        String e_name = db.get(e_id).getName();
      
        String e_age = db.get(e_id).getAge();
        
        
        System.out.println(e_age);
        System.out.println(e_name);

        //String newEmployee = "6868,123456,Subham Daniels,100,F,Siliguri,9474588932,2056099,85713,139";
        //emp.updateEmployeeDetails(newEmployee);
        //String age[] = newEmployee.split(",");
        //String ages = age[3];
        //Employee temp = emp.db.get("6969A");
//        assert (100<60) : "Time For Retirement";
        //assert (Integer.parseInt(temp.printAge())<60):"Time for Retirement";
    }

}

