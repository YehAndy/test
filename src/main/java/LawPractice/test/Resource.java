package LawPractice.test;

public class Resource {

	private String name;
	private int resource;
	
	public Resource(String name, int resource) {
		super();
		this.name = name;
		this.resource = resource;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getResource() {
		return resource;
	}
	public void setResource(int resource) {
		this.resource = resource;
	}
	
	synchronized int doSome() {
		return ++resource;
	}
	
	synchronized void cooperatate(Resource resource) {
		resource.doSome();
		System.out.printf("%s 整合 %s的資源%n", this.name, resource.getName());
	}
	
	
}
