package pratice;

public class StudentToString {

	int rollNo;
	String name;
	String city;
	
	public StudentToString(int rollNo, String name, String city) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}

//	@Override
//	public String toString() {
//		return "StudentToString [rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
//	}
	
	public static void main(String args[])
	{
		StudentToString s1 = new StudentToString(101,"Mahesh","pune");
		StudentToString s2 = new StudentToString(102,"Jagdish","nanded");
		System.out.println(s1);
		System.out.println(s2);
	}
}
