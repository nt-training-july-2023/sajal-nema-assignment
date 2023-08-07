import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    private String name;
    private int empId;
    private int phnNumber;

    public Employee(String name , int empId ,int phnNumber){
        this.name = name;
        this.empId = empId;
        this.phnNumber = phnNumber;
    }

    public String getName(){
        return name;
    }

    public int getEmpId(){
        return empId;
    }

    public int phnNumber(){
        return phnNumber;
    }

    @Override
    public String toString(){
        return "Employee {" + "name = '" + name + "\'," +  " ID = '" + empId + "\'," + " Phone-Number = '" + phnNumber +  "\'"  + " }";
    }

    @Override
    public int compareTo(Employee obj){
        // System.out.println(this.name);
        // System.out.println(obj);
        return this.empId - obj.empId; 
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Sajal", 1001 , 787676677));
        list.add(new Employee("Ram", 1002 , 67788979));
        list.add(new Employee("John", 1000 , 9890897));
        
        //By Using Comparable Interface
        Collections.sort(list);
        //By Using Comparator
        Collections.sort(list , new ComparatorClass());
        System.out.println(list);
    }
}
