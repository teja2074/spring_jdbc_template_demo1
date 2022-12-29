import java.util.LinkedList;

public class School implements java.io.Serializable {

    private int id;
    private String schoolName;
    private String address;
    private String phone;

    private LinkedList<Student> studentListOfSchool = new LinkedList<>();

    public School() {
    }

    public School(int id, String schoolName, String address, String phone) {
        this.id = id;
        this.schoolName = schoolName;
        this.address = address;
        this.phone = phone;
        this.studentListOfSchool = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public  LinkedList<Student> getStudentsList() {
        if(studentListOfSchool == null){
            return new LinkedList<>();
        }
        return studentListOfSchool;
    }

    public  void addStudent(Student student){
        getStudentsList().add(student);
    }


}
