public class Bus {

    private int id;
    private School school;
    private Student student;
    private long contactNumber;
    private String busNumber;

    public Bus(int id , long contactNumber, String busNumber) {
        this.id = id;
        this.school = new School();
        this.student = new Student();
        this.contactNumber = contactNumber;
        this.busNumber = busNumber;
    }


}
