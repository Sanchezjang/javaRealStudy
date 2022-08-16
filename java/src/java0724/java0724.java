package java0724;

public class java0724 {
	
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		
		
		java0724 java = new java0724();
		java.setName("산체스");
		java.setAge(35);
		String name = java.getName();
		int age = java.getAge();
		System.out.println("이름"+name+"나이"+age);
		
		
		
		
	}

	@Override
	public String toString() {
		return "java0724 [name=" + name + ", age=" + age + "]";
	}

}
