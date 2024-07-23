package in.sp.beans;

public class Studentsc {
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		String name;
		String mail;
		int age;
		
		public void show() {
			System.out.println("Student--->"+name+"----"+age+"---"+mail);
		}
}
