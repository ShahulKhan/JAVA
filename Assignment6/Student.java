package Assignment6;

public class Student  extends Department {
	
    public void studentName(){
        System.out.println("Student Name - Mohammed Shahul Hameed K");
    }
    
    public void studentDept(){
        System.out.println("Student Department - Computer Application");
    }
    
    public void studentId(){
        System.out.println("Student Id - 10");
    }

    public static void main(String[] args) {
    	
        Student student = new Student();
        
        student.studentName();
        student.studentDept();
        student.studentId();
        
        // Single inheritance
        student.deptName();
        
        // Multi-level Inheritance
        student.collegeName();
        student.collegeCode();
        student.collegeRank();
    }

}
