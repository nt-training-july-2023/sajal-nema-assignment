import java.util.Comparator;

public class ComparatorClass implements Comparator<Employee>{
    @Override
    public int compare(Employee obj1 ,Employee obj2){
        return Math.max(obj1.getEmpId() - obj2.getEmpId() , obj1.getName().compareTo(obj2.getName()));
    }

}
