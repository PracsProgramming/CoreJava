package Inheritance;

public class newStudent extends Student{
private long Adharno;

public long getAdharno() {
	return Adharno;
}

public void setAdharno(long adharno) {
	Adharno = adharno;
}

public static void main(String[] args) {
	newStudent s1 = new newStudent();
	s1.setAge(25);
	s1.setName("pqrs");
	s1.setAdharno(12345678l);
	
	System.out.println(s1.getAge());
	System.out.println(s1.getName());
	System.out.println(s1.getAdharno());
	
}
}
