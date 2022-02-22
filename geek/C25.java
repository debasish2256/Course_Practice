package geek;

import java.util.Arrays;

/*1.) Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. 
2.)Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'. 
3.) Create a class 'Employee' with String variable 'name' and integer variable 'employee id'. 
Create 4 Employee objects and store in array and display.*/

class Student{
	String name;
	Integer roll;
	String phone;
	String address;
	public Student(String name, Integer roll, String phone, String address) {
		super();
		this.name = name;
		this.roll = roll;
		this.phone = phone;
		this.address = address;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Mobile: "+phone);
		System.out.println("Address: "+address);
	}
	
}
class Employee{
	String name;
	Integer empId;
	public Employee(String name, Integer empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	public void display() {
		System.out.println("Employee id = " + empId);
		System.out.println("Employee name = " + name);
	}
}

public class C25 {
	public static void main(String[] args) {
		/*int[] arr = new int[] { 0, 0, 1, 1, 1, 0, 0, 0, 0 };
		System.out.println(Arrays.toString(sortWithCount(arr)));
		System.out.println(Arrays.toString(sortWithTwoPointer(arr)));*/
		
		Student student1=new Student("John", 5,"9876543210","Agra");
		Student student2=new Student("Sam", 8,"98765456789","Delhi");
		student1.display();
		student2.display();
		
		Employee emp[]=new Employee[4];
		emp[0]=new Employee("Ram", 123);
		emp[1]=new Employee("Sam", 332);
		emp[2]=new Employee("John", 654);
		emp[3]=new Employee("Rock", 899);
		
		for(Employee employee:emp) {
			employee.display();
		}

	}
	
	




	private static int[] sortWithTwoPointer(int[] arr) {
		int low=0,high=arr.length-1;
		while(low<=high){
			if(low==0 && high==1) {
				low++;high--;
			}else if(arr[low]==1 && arr[high]==0) {
				int temp=arr[high];
				arr[high]=arr[low];
				arr[low]=temp;
				low++;high--;
			}else if(arr[low]==0 && arr[high]==0){
				low++;
			}else {
				high--;
			}
		}
		return arr;
	}
	
	

	private static int[] sortWithCount(int[] arr) {
		int count0=0,count1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count0++;
			}else {
				count1++;
			}
		}
		for(int i=0;i<count0;i++) {
			arr[i]=0;
		}
		for(int i=count0;i<arr.length;i++) {
			arr[i]=1;
		}
		return arr;
	}
}
