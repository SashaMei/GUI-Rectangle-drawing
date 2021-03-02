
public class Professor extends Person{
	private int years;
	
	public Professor() {
		super();
	}
	public Professor(String name, int years) {
		super(name);
		this.years= years;
	}
	//getter and setter for years
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		if (years>0) {
			this.years= years;
		}
	}
	@Override
	public String toString() {
		return "Name: "+this.getName()+"\nYears Taught: "+years;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Professor) {
			Professor anotherProfessor = (Professor)obj;
			return super.getName().equalsIgnoreCase(anotherProfessor.getName())&& this.years==anotherProfessor.years;
		}else {
			return false;
		}
	}

}
