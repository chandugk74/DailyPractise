package basics;

public final class ImmutableClassEx { // declare class as final
	private final int id; // declare variable as private and final
	private final String name;

	public ImmutableClassEx(int id, String name) { // create constructor to perform deep copy
		this.id = id;
		this.name = name;
	}

	public int getId() { // provide only getters to clone the object
		return id;
	}

	public String getName() {
		return name;
	}

}
