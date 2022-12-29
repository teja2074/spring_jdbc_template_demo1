import java.util.Iterator;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
        Integer id;
        String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee e) {
        if(id==e.id){
            return 0;
        }else if(id<e.id){
            return -1;
        }else{
            return 1;
        }
    }

   /* public int compareTo(Integer id) {
        return this.id - id;
    }*/
    public void getDetails(){
        System.out.println("getDetails() called");
        System.out.println(this.id + " " + this.name);

    }

    public static void main(String[] args) {


        Employee e = new Employee(100, "x");
        Employee e1= new Employee(-100,"y");
        Employee e2= new Employee(200,"z");

        TreeSet ts = new TreeSet();
        ts.add(e);
        ts.add(e1);
        ts.add(e2);


        //ts.stream().forEach(System.out::println);

        Iterator<Employee> itr = ts.iterator();
        while(itr.hasNext()){
           Employee sample = itr.next();
            System.out.println(sample.id + " " + sample.name);
        }
        m1(e);
    }

    public static void m1(Employee emp){
        try{
            emp.getDetails();
            System.out.println("Hello1");
            //return;
            throw new Exception();

        } catch(Exception e){
            System.out.println("Hello2");
        }
        System.out.println("Hello3");
    }

   // ConcurrentModificationException

       //     CopyOnWriteArrayList

    // transient and static?
    // transient and final?

}
