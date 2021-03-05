/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Employee {
   private String id;
   private String password;
   private String Name;
   private String age;
   private String Sex;
   private String Address;
   private String phone;
   private String allowance;
   private String bonus;
   private String present;

 //  public Employee()
   
//   public Employee(String id){
//       this.id = id;
//   }
   
    public void setId(String ID){this.id = ID;}
    public void setPassword(String password) {this.password=password;}
    public void setName(String Name) {this.Name = Name;}
    public void setAge(String age){this.age = age;}
    public void setSex(String Sex){this.Sex=Sex;}
    public void setAddress(String Address){this.Address=Address;}
    public void setPhone(String phone){this.phone=phone;}
    public void setAllowance(String allowance){this.allowance=allowance;}
    public void setBonus(String bonus){this.bonus=bonus;}
    public void setPresent(String present){this.present=present;}

   public String getid(){return id;}
   public String getPassword(){return password;}
   public String getName(){return Name;}
   public String getAge(){  return age;}
   public String getSex(){return Sex;}
   public String getAddress(){return Address;}
   public String getPhone(){return phone;}
   public String getAllowance(){return allowance;}
   public String getBonus(){return bonus;}
   public String getPresent(){return present;}
}
