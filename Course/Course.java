public class Course {
    private String name;
    private String teacher;
    private int hours;
    private int availableSlots;

    public Course (String name, String teacher, int hours, int availableSlots){
        this.name = name;
        this.teacher = teacher;
        this.hours = hours;
        this.availableSlots = availableSlots;
    }

    public String getName(){return name;}
    public String getTeacher(){return teacher;}
    public int getHours(){return hours;}
    public int getAvailableSlots(){return availableSlots;}

    public void setName(String name){this.name=name;}
    public void setTeacher(String teacher){this.teacher=teacher;}
    public void setHours(int hours){this.hours=hours;}
    public void setAvailableSlots(int availableSlots){this.availableSlots=availableSlots;}

    public boolean enrollStudent(){
        if(getAvailableSlots()>0){
            availableSlots--;
            return true;
        } else {
            return false;
        }
    }
}