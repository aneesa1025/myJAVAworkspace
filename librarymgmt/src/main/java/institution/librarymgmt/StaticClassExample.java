package institution.librarymgmt;

public class StaticClassExample {
	
	private static final String DATABASE_NAME = "Library";
	
	public static class Student{
		
		private String name;
		private int rollnum;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollnum() {
			return rollnum;
		}
		public void setRollnum(int rollnum) {
			this.rollnum = rollnum;
		}
		
	}
			
	public static void main(String[] args) {
		System.out.println("hello world");
	}
	
	public  static String getDatabaseName() {
		return DATABASE_NAME;
	}
	
	public String getUserName() {
		return "Anisha";
	}
	
	
	
	
	
	
	

}
