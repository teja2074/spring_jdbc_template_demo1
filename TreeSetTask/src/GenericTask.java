import java.util.ArrayList;

abstract class Sample{
    abstract void printMessage();
}
class Sample1 extends Sample {


    @Override
    void printMessage() {
        System.out.println("sample1 method called");
    }

}
class Sample2 extends Sample1 {
    @Override
    void printMessage() {
        System.out.println("sample2 method called");
    }

}


public class GenericTask {
     private static void m1(ArrayList<? extends Sample> list) {

            list.add(null);
            Sample1 sample = new Sample1();
            sample.printMessage();

            //list.add(a);
        }
    static void m2(ArrayList<? super Sample1> list){
        list.add(null);
        Sample2 sample = new Sample2();
        sample.printMessage();

        list.stream().forEach(System.out::println);
       // list.add(a);

    }


    public static void main(String[] args) {

            ArrayList<Sample1> sample1 = new ArrayList<>();
            sample1.add(new Sample1());
            sample1.add(null);

            ArrayList<Sample2> sample2 = new ArrayList<>();
            sample2.add(new Sample2());

            m1(sample1);
            m1(sample2);
            m2(sample1);

          // m1(Arrays.asList( new Sample[]{sample});



        }

    }

