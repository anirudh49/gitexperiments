package empmgt.beans;

public class Developer extends Employee {
	private String language;

	public Developer(int id, String name, Department department, String language) {
		super(id, name, department);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
