package Architectural.MVP;

import java.util.ArrayList;
import java.util.List;

public class MyModel {

    List<Customer> customerList;

    MyModel() {
        customerList = new ArrayList<>();

        customerList.add(new Customer("Denis",15));
        customerList.add(new Customer("Olena",22, false, true, "m.Odesa"));
        customerList.add(new Customer("Ihor",4));
        customerList.add(new Customer("Baby",32, false, false, "NYC"));
        customerList.add(new Customer("Default customer",20));
    }

    public void add(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> getList (){
        return customerList;
    }


   public class Customer {

        public String name;
        public int age;
        public boolean isMale;
        public boolean isFemale;
        public String address;

       public Customer(String name, int age) {
           this.name = name;
           this.age = age;
       }

       public Customer(String name, int age, boolean isMale, boolean isFemale, String address) {
           this.name = name;
           this.age = age;
           this.isMale = isMale;
           this.isFemale = isFemale;
           this.address = address;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           this.age = age;
       }

       public boolean isMale() {
           return isMale;
       }

       public void setMale(boolean male) {
           isMale = male;
       }

       public boolean isFemale() {
           return isFemale;
       }

       public void setFemale(boolean female) {
           isFemale = female;
       }

       public String getAddress() {
           return address;
       }

       public void setAddress(String address) {
           this.address = address;
       }

       @Override
       public String toString() {
           return "Customer{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   ", isMale=" + isMale +
                   ", isFemale=" + isFemale +
                   ", address='" + address + '\'' +
                   '}';
       }
   }

}
