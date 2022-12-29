public class Student implements java.io.Serializable {

    private int id;
    private String fullName;
    private int age;

    private String address;
    private String phone;

    public Student() {
    }

    public Student(int id, String fullName, int age, String address, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address)  {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student id = " + getId() + ", fullName = " + getFullName();
        /*return "Student id = " + getId() + ",\n "+
                "fullName = " + getFullName() +",\n"+
                "Age = " + getAge() + ",\n"+
                "Address = " + getAddress()+ ",\n"+
                "phone = "+ getPhone();*/
    }
}
