import java.util.*;
import java.util.regex.Pattern;

public class Main {
    private static final LinkedList<Student> students = new LinkedList<>();
    private static final LinkedList<School> schools = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("Available actions : \npress ");
            System.out.println(" 0 - to quit\n" +
                    " 1 - to Add 20 Students\n" +
                    " 2 - Update Student details\n" +
                    " 3 - View All Students\n" +
                    " 4 - to Add Schools\n" +
                    " 5 - Assign Student to a School\n" +
                    " 6 - Get Students by School\n" +
                    " 7 - delete Student from School");
            int i = scanner.nextInt();
            scanner.nextLine();

            switch (i) {

                case 0:
                    quit = true;
                    break;
                case 1:
                        // 1: addStudent(0, null,0,null,null);
                        addStudent(1, "FirstNameAAAA LastNameZZZ", 15,
                                "address:1-20, City.", "9234567990");
                        addStudent(2, "FirstNameBBBB LastNameYYY", 14,
                                "address:2-19, City.", "8234567991");
                        addStudent(3, "FirstNameCCCC LastNameXXX", 14,
                                "address:3-18, City.", "7234567992");
                        addStudent(4, "FirstNameDDDD LastNameVVV", 14,
                                "address:4-17, City.", "9234567999");
                        addStudent(5, "FirstNameEEEE LastNameUUU", 14,
                                "address:5-16, City.", "8234567998");
                        addStudent(6, "FirstNameFFFF LastNameTTT", 15,
                                "address:6-15, City.", "7234567997");
                        addStudent(7, "FirstNameGGGG LastNameSSS", 14,
                                "address:7-14, City.", "7234567996");
                        addStudent(8, "FirstNameHHHH LastNameRRR", 14,
                                "address:8-13, City.", "8234567995");
                        addStudent(9, "FirstNameIIII LastNameQQQ", 14,
                                "address:9-12, City.", "9234567994");
                        addStudent(10, "FirstNameJJJJ LastNamePPP", 14,
                                "address:10-11, City.", "9234567993");
                        addStudent(11, "FirstNameKKKK LastNameOOO", 15,
                                "address:11-10, City.", "8234567992");
                        addStudent(12, "FirstNameLLLL LastNameNNN", 14,
                                "address:12-09, City.", "7234567991");
                        addStudent(13, "FirstNameMMMM LastNameMMM", 14,
                                "address:13-08, City.", "7234567992");
                        addStudent(14, "FirstNameNNNN LastNameLLL", 14,
                                "address:14-07, City.", "8234567993");
                        addStudent(15, "FirstNameOOOO LastNameKKK", 14,
                                "address:15-06, City.", "9234567994");
                        addStudent(16, "FirstNamePPPP LastNameJJJ", 15,
                                "address:16-05, City.", "8234567995");
                        addStudent(17, "FirstNameQQQQ LastNameIII", 14,
                                "address:17-04, City.", "9234567991");
                        addStudent(18, "FirstNameRRRR LastNameHHH", 14,
                                "address:18-03, City.", "7234567992");
                        addStudent(19, "FirstNameSSSS LastNameGGG", 14,
                                "address:19-02, City.", "7234567993");
                        addStudent(20, "FirstNameTTTT LastNameFF", 14,
                                "address:20-01, City.", "8234567994");
                    System.out.println("20 Students added to Student's list");
                        break;
                case 2:
                        System.out.println("=============================");
                        updateStudentDetails(1,"FirstNameAAAA LastNameZZZ",8,"Updated Address","7234567890");
                        break;
                case 3:
                        System.out.println("=============================");
                        printListOfStudents(students);
                        break;
                case 4:
                        System.out.println("=============================");
                        addSchool(1, "SchoolA", "SchoolAAddress:2-1, City.", "9785678901");
                        addSchool(2, "SchoolB", "SchoolBAddress:3-1, City.", "9875678902");
                        addSchool(3,"SchoolC","School Address","8529637410");
                        break;

                case 5:
                        System.out.println("=============================");

                        ListIterator<Student> li= students.listIterator(10);
                        while(li.hasNext()){
                            Student student = li.next();
                            assignStudent(student.getFullName(),"SchoolA");
                        }
                        System.out.println("Students assigned to SchoolA");
                        break;
                case 6:
                        System.out.println("=============================");
                        printStudentList("SchoolA");
                        break;
                case 7:
                        System.out.println("=============================");
                        deleteStudent("FirstNameTTTT LastNameFF");
                        break;

            }
        }
    }

    private static void addStudent(Integer id, String fullName, Integer age, String address, String phone) {
        Student student = new Student();
        student.setId(id);
        student.setFullName(validateFullName(fullName));
        student.setAge(validateStudentAge(age));
        student.setAddress(validateAddress(address));
        student.setPhone(validatePhoneNumber(phone));
        students.add(student);
    }
    private static void printListOfStudents(LinkedList<Student> students) {
             students.stream()
                .forEach(student -> System.out.println(student.toString()));
    }
    private static Student findStudent(String fullName) {
        return students.stream().filter(st -> st.getFullName().equals(fullName)).findFirst().get();
    }
    private static void deleteStudent(String fullName) {
        System.out.println("Deleted : " + fullName);
        students.remove(findStudent(fullName));
    }
    private static void updateStudentDetails(Integer id, String fullName, Integer age, String address, String phone) {
            Student student = findStudent(fullName);
            if (student.getFullName().equals(fullName)) {
                student.setId(id);
                student.setFullName(validateFullName(fullName));
                student.setAge(validateStudentAge(age));
                student.setAddress(validateAddress(address));
                student.setPhone(validatePhoneNumber(phone));
            }

        System.out.println("Updated details of Student id " + id);
    }
    private static String validateFullName(String fullName) {
        try {
            if (Pattern.matches("[a-zA-Z ]{6,25}", fullName)) {
                return fullName;
            } else {
                throw new Task1Exception("Only names with 25 chars are allowed");
            }

        } catch (Task1Exception t) {
            System.out.println("Name Exception Caught " + t);
        }
        return null;
    }
    private static Integer validateStudentAge( Integer age) {
        try {
            if (age > 5 && age < 16) {
                return age;
            } else {
                throw new Task1Exception("Only below 16 allowed");
            }

        } catch (Task1Exception t) {
            System.out.println("Age Exception Caught " + t);
        }
        return null;
    }
    private static String validateAddress(String address) {

        try {
            if (Pattern.matches("[a-zA-Z .,-:]*", address)) {
                return address;
            } else {
                throw new Task1Exception("Invalid Address format");
            }

        } catch (Task1Exception t) {
            System.out.println("Address Exception Caught " + t);
        }
        return null;
    }
    private static String validatePhoneNumber(String phone) {
        try {
            if (Pattern.matches("[789][0-9]{9}", phone)) {
                return phone;
            } else {
                throw new Task1Exception("Invalid Phone Number");
            }
        } catch (Task1Exception t) {
            System.out.println("Phone number Exception Caught " + t);
        }
        return null;
    }
    private static void addSchool(Integer id, String schoolName, String address, String phone) {
        School school = new School();
        school.setId(id);
        school.setSchoolName(validateFullName(schoolName));
        school.setAddress(validateAddress(address));
        school.setPhone(validatePhoneNumber(phone));
        schools.add(school);
        System.out.println(" Added " + schoolName + " to Schools list");
    }
    private static School findSchool(String schoolName) {
      return schools.stream()
                .filter(school -> school.getSchoolName().equals(schoolName))
                .findFirst()
                .get();
    }
    private static void assignStudent(String fullName, String schoolName) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFullName().equals(fullName)) {
                findSchool(schoolName).addStudent(findStudent(fullName));
            }
        }
    }
    // transient and static?
    // transient and final?
    private static void printStudentList(String schoolName) {

        LinkedList<Student> students = findSchool(schoolName).getStudentsList();
        System.out.println("Students list of " + schoolName);
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}