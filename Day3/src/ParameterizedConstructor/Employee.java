package ParameterizedConstructor;

public class Employee {
	int empID;
	String empName;
Employee(int id,String name){
	empID = id;
	empName = name;
}
void info() {
	System.out.println("Id: "+empID+"Name: "+empName);
}
public static void main(String[] args) {
	Employee obj1 = new Employee(10245,"Ravi");
	Employee obj2 = new Employee(92232,"Ram");
	obj1.info();
	obj2.info();
}
}
