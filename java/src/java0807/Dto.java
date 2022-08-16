package java0807;

interface Dto {

	public void aabb();
	
	int a = 1;
	int b = 1;
	
}
class num{
	int a = 1;
	int b = 1;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("num [a=");
		builder.append(a);
		builder.append(", b=");
		builder.append(b);
		builder.append("]");
		return builder.toString();
	}
	public num(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
}