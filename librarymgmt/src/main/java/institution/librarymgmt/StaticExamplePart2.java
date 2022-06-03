package institution.librarymgmt;

public class StaticExamplePart2 {
	public static void main (String[] args) {
		StaticClassExample s1 = new StaticClassExample();
		s1.getUserName();
		StaticClassExample.getDatabaseName();
		
		StaticClassExample.Student student = new StaticClassExample.Student();
		student.setName("Anisha");
		student.setRollnum(1);
		
		System.out.println(student.getName());
		System.out.println(student.getRollnum());
	}

}
