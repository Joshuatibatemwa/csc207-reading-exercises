public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private int age;
    
    public Student (String firstName, String lastName, int id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }
    
    public void setName(String firstName, String lastName){
        this.firstname=firstname;
        this.lastname=lastname;
    }
    
    public void setID(int ID){
        this.id=id;
    }
    
    public void setAge(int age){
        if(age>0){
            this.age=age;}else{
            throw new IllegalArgumentException();}
    }
    
    public void viewStudentDetails(){
 
        System.out.println("Student name:"+this.FirstName +" Lastname:"+this.lastName" Age:"+this.age " ID:" +this.id)
            }
}
