
public class TestString {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		HREmployee hr =  new HREmployee("aakash", 100L);
		
		HREmployee hr2 = (HREmployee)hr.clone();
		
		hr2.setfName("saxena");
		hr2.setId(200L);
		
		System.out.println(hr2.toString());
		System.out.println(hr.toString());

	}

}
