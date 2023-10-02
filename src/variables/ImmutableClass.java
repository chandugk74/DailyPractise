package variables;

//create public final class
public final class ImmutableClass {
	private final int num;
	private final String name;
	
//	create constructor to perform deep copy
	public ImmutableClass(int num, String name) {
		this.num=num;
		this.name=name;
	}
//provide only ggetters to perform cloning obj
	public int getnum() {
		return num;
	}
	public String getname() {
		return name;
	}
}
