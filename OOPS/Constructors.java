public class Constructors {
    public static void main(String[] args) {
//    if any consturcutors are not created then 
//    by default java automatically create the constructors
        Student s1=new Student();
        // Student s2=new Student("Sayan Ghorui");
        // Student s3=new Student(31);    
        s1.name="Sayan Ghorui";
        s1.roll=31;
        s1.password="Sayan123@";
        s1.marks[0]=97; 
        s1.marks[1]=92;
        s1.marks[2]=100;
        Student s2=new Student(s1);
        s2.password="Sayan@123";
        s1.marks[1]=95;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    // Shallow Copy constructors
    Student(Student s1){   
        this.name=s1.name;
        this.roll=s1.roll;
        marks=new int[3];
        this.marks=s1.marks;
    }
    // Deep Copy Constructors
    // Student(Student s1){
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     marks=new int[3];
    //     for(int i=0;i<marks.length;i++){
    //         this.marks[i]=s1.marks[i];
    //     }
    // }
    Student(){    // constructors  -> non - perametarized
        System.out.println("Constructor are called !!!!");
        marks=new int[3];
    }
    Student(String name){   // Parameterized constructors
        this.name=name;
        marks=new int[3];
    }
    Student(int rollno){   // Parameterized constructors
        this.roll=rollno;
        marks=new int[3];
    }
}