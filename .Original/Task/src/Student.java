import java.util.regex.Pattern;

public class Student implements java.io.Serializable {

    private int id;
    private String fullName;
    private int age;
    private String address;
    private String phone;
    public Student() {
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

    public void setFullName(String fullName) throws Task1Exception {
        if(Pattern.matches("[a-zA-Z ]{25}", fullName)) {
            this.fullName = fullName;
        }else{
            throw new Task1Exception("Only names with 25 chars are allowed");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Task1Exception {
       if(age<16) {
           this.age = age;
       }else{
           throw new Task1Exception("Only below 16 allowed");
       }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws Task1Exception {
        if(Pattern.matches("[a-zA-Z[ .,-:]]*", address)) {
            this.address = address;
        }else{
            throw new Task1Exception("Invalid Address format");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Task1Exception {
        if(Pattern.matches("[789][0-9]{9}", phone)) {
            this.phone = phone;
        }else{
            throw new Task1Exception("Invalid Phone Number");
        }
    }

    @Override
    public String toString() {
         return "Student id = " + getId() +", fullName = " + getFullName();
        /*return "Student id = " + getId() + ",\n "+
                "fullName = " + getFullName() +",\n"+
                "Age = " + getAge() + ",\n"+
                "Address = " + getAddress()+ ",\n"+
                "phone = "+ getPhone();*/
    }
}
