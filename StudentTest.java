class Student 
{
    String name;
    int age;
    private static int studentCount = 0;

    public Student()
    {
        this.name="Unknown";
        this.age=0;
        studentCount++;
    }
    public Student(String name, int age)
    {
        this.name=name;   
        this.age=age;     
        studentCount++;
    }
    public void displayInfo() 
    {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Total Number of Students : " +studentCount);
    
    }
    @Override
    public String toString()
    {
        return String.format("Student{name='%s', age=%d}", name, age);
    }
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && name.equals(student.name);
    }
}
public class StudentTest 
{
    public static void main(String[] args) 
    {
        Student student1=new Student();
        Student student2=new Student("Aland ", 19);
        
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }
}


