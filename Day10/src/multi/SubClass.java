package multi;

public class SubClass extends Abstract {

	 String Name;
	 String gender;
	 String city;
	 String country;

	@Override
	void getCity(String city) {
		// TODO Auto-generated method stub
		this.city = city;
	}

	@Override
	void getCountry(String country) {
		// TODO Auto-generated method stub
		this.country = country;
	}

	@Override
	void getName(String Name) {
		// TODO Auto-generated method stub
		this.Name = Name;
	}

	@Override
	void getGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;
	}
	
	void display() {
		System.out.println("Name:"+Name);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+city);
		System.out.println("Country:"+country);
	}
	
	
}
