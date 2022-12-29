import java.util.LinkedList;

public class Main {
   private static LinkedList<Student> students = new LinkedList<>();
   private static LinkedList<School> schools  = new LinkedList<>();



    public static void main(String[] args) throws Task1Exception {
       /* Random random = new Random();
        Supplier<Integer> integerSupplier = ()-> random.nextInt(14);*/

       /* for(int i=1;i<=15;i++){

            addStudent(i,("Name" +i),i,"address"+i,(1234567890+i));
        }*/
        addStudent(1,"FirstNameAAAA LastNameZZZ",15,
                "address:1-20, City.","9234567990");
        addStudent(2,"FirstNameBBBB LastNameYYY",14,
                "address:2-19, City.","8234567991");
        addStudent(3,"FirstNameCCCC LastNameXXX",14,
                "address:3-18, City.","7234567992");
        addStudent(4,"FirstNameDDDD LastNameVVV",14,
                "address:4-17, City.","9234567999");
        addStudent(5,"FirstNameEEEE LastNameUUU",14,
                "address:5-16, City.","8234567998");
        addStudent(6,"FirstNameFFFF LastNameTTT",15,
                "address:6-15, City.","7234567997");
        addStudent(7,"FirstNameGGGG LastNameSSS",14,
                "address:7-14, City.","7234567996");
        addStudent(8,"FirstNameHHHH LastNameRRR",14,
                "address:8-13, City.","8234567995");
        addStudent(9,"FirstNameIIII LastNameQQQ",14,
                "address:9-12, City.","9234567994");
        addStudent(10,"FirstNameJJJJ LastNamePPP",14,
                "address:10-11, City.","9234567993");
        addStudent(11,"FirstNameKKKK LastNameOOO",15,
                "address:11-10, City.","8234567992");
        addStudent(12,"FirstNameLLLL LastNameNNN",14,
                "address:12-09, City.","7234567991");
        addStudent(13,"FirstNameMMMM LastNameMMM",14,
                "address:13-08, City.","7234567992");
        addStudent(14,"FirstNameNNNN LastNameLLL",14,
                "address:14-07, City.","8234567993");
        addStudent(15,"FirstNameOOOO LastNameKKK",14,
                "address:15-06, City.","9234567994");
        addStudent(16,"FirstNamePPPP LastNameJJJ",15,
                "address:16-05, City.","8234567995");
        addStudent(17,"FirstNameQQQQ LastNameIII",14,
                "address:17-04, City.","9234567991");
        addStudent(18,"FirstNameRRRR LastNameHHH",14,
                "address:18-03, City.","7234567992");
        addStudent(19,"FirstNameSSSS LastNameGGG",14,
                "address:19-02, City.","7234567993");
        addStudent(20,"FirstNameTTTT LastNameFFF",14,
                "address:20-01, City.","8234567994");

        System.out.println("=============================");
        printListOfStudents(students);

        System.out.println("=============================");
        deleteStudent(20);

        System.out.println("=============================");
       printListOfStudents(students);

        System.out.println("=============================");
        updateStudentDetails(19,"FirstNameUPDA LastNameTED",15,"address:21-00, City.","9876543210");
        System.out.println(findStudent(19).toString());
        printListOfStudents(students);

        System.out.println("=============================");
        addSchool(1,"SchoolA", "SchoolAddress1",1345678901);
        addSchool(1,"SchoolB", "SchoolAddress2",1345678902);

        System.out.println("=============================");
        for(int i=1;i<=10;i++) {
            assignStudent(i,"SchoolA");
        }

        printStudentList("SchoolA");

        System.out.println("=============================");
        for(int i=11;i<=20;i++) {
            assignStudent(i,"SchoolB");
        }

        printStudentList("SchoolB");

    }



    private static void addStudent(int id, String fullName, int age, String address, String phone) throws Task1Exception{
        Student student= new Student();
        student.setId(id);
        student.setFullName(fullName);
        try{
            student.setAge(age);
        } catch(Task1Exception t){
            System.out.println("Exception Caught" + t);
        }
        student.setAddress(address);
        student.setPhone(phone);

        students.add(student);

    }

    private static void printListOfStudents(LinkedList<Student> students) {
           for(Student student: students){
            System.out.println(student.toString());
        }

    }

    private static Student findStudent(int id){
        for(Student student: students){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }

    private static void deleteStudent(int id){
        System.out.println("Deleted student with id "+ id);
        students.remove(findStudent(id));
    }

    private static void updateStudentDetails(int id, String name,int age,String address, String phone) throws Task1Exception{
        for(Student student: students){
            if(student.getId()==id){
                try{
                student.setAge(age);
                } catch(Task1Exception t){
                    System.out.println("Exception Caught" + t);
                }
                student.setFullName(name);
                student.setAddress(address);
                student.setPhone(phone);
            }
        }
        System.out.println("Updated details of Student id "+ id);
    }
    private static void updateStudentPhoneNumber(int id, String phone) throws Task1Exception{

        for(Student student: students){
            if(student.getId()==id){
                student.setPhone(phone);
                System.out.println("Contact details updated !");
            }
        }
    }
    private static void updateStudentAge(int id, int age){

        for(Student student: students){
            if(student.getId()==id){
                try{
                    student.setAge(age);
                } catch(Task1Exception t){
                    System.out.println("Exception Caught" + t);
                }
                System.out.println("Student's age updated");
            }
        }
    }
    private static void updateStudentAddress(int id, String address) throws Task1Exception{

        for(Student student: students){
            if(student.getId()==id){
                student.setAddress(address);
                System.out.println("Student's new address: " + address);
            }
        }
    }
    private static void addSchool(int id, String schoolName, String address, long phone){

        School school = new School();
        school.setId(id);
        school.setSchoolName(schoolName);
        school.setAddress(address);
        school.setPhone(phone);

        schools.add(school);
        System.out.println(" Added "+ schoolName+ " to Schools list");

    }

    private static School findSchool(String schoolName){
        for(School school: schools){
            if(school.getSchoolName()==schoolName){
                return school;
            }
        }
        return null;
    }

    private static void assignStudent(int id, String schoolName){

        for(Student student: students) {
            if (student.getId() == id) {
                findSchool(schoolName).addStudent(findStudent(id));
               // System.out.println("Student added successfully!");
            }
        }

    }

    private static void printStudentList(String schoolName){

        LinkedList<Student> students = findSchool(schoolName).getStudentsList();
        System.out.println("Students list of "+ schoolName);
        for(Student student: students){
            System.out.println(student);
        }
    }




}