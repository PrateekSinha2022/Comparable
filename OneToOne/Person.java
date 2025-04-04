package OneToOne;

public class Person {
	 private String name;
	 private Passport passport;
	 
	 Person(String name,Passport passport)
	 {
		 this.name=name;
		 this.passport=passport;
	 }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passport getPassport() {
		return this.passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	 

}
