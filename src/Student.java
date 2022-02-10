
public class Student {
	
	//initialize instance variable "marks" (Can be accessed anywhere in the Student Class.)
	int marks= 60;
	public void takeExam() {
		//initialize local variable "marksScored" (Can only be used within the code block specified)
		int marksScored;
		marksScored= 0;
		
			if(marks>50) {
				marksScored=50;
			}
			System.out.println(marksScored);
		}
	
	public void examResults() {
		System.out.println(marks);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.takeExam();

	}

}
