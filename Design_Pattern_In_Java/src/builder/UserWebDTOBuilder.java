package builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder{
	
	private String firstName;
	
	private String lastName;
	
	private String age;
	
	private String address;
	
	private UserWebDTO webDto;

	@Override
	public UserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() + ", " + address.getStreet()
		+"\n"+ address.getCity() + ", " + address.getState()
		+"\n" + address.getZipcode();
		return this;
	}

	@Override
	public UserDTO build() {
		webDto = new UserWebDTO(firstName +" "+lastName, address, age);
		return webDto;
	}

	@Override
	public UserDTO getUserDTO() {
		return webDto;
	}
	
	
}
