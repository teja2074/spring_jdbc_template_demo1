import java.util.LinkedList;

public class School implements java.io.Serializable {

    private int id;
    private String schoolName;
    private String address;
    private long phone;

    private LinkedList<Student> studentListOfSchool = new LinkedList<>();

    public School() {
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    public  LinkedList<Student> getStudentsList() {
        return studentListOfSchool;
    }

    public  void addStudent(Student student){
        studentListOfSchool.add(student);
    }


}
