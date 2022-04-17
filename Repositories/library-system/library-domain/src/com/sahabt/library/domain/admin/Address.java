package com.sahabt.library.domain.admin;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;
@ValueObject
public  final class Address {
 
	private String country;
	private String city;
	private String district;
	private String neighbourdhood;
	private String buldingNumber ;
	private String apartmentNumber;
	private AddressType addressType;
	
	public static Address of(String country,
			                String city,
							String district,
	                        String neighbourdhood,
							String buldingNumber,
							String apartmentNumber,
							AddressType addressType) {
		return new Address(country,
						   city,
						   district,
						   neighbourdhood,
						   buldingNumber,
						   apartmentNumber,
						   addressType);
	}

	private Address(String country, String city, String district, String neighbourdhood, String buldingNumber,
			String apartmentNumber, AddressType addressType) {
		super();
		this.country = country;
		this.city = city;
		this.district = district;
		this.neighbourdhood = neighbourdhood;
		this.buldingNumber = buldingNumber;
		this.apartmentNumber = apartmentNumber;
		this.addressType = addressType;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getDistrict() {
		return district;
	}

	public String getNeighbourdhood() {
		return neighbourdhood;
	}

	public String getBuldingNumber() {
		return buldingNumber;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(addressType, apartmentNumber, buldingNumber, city, country, district, neighbourdhood);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return addressType == other.addressType && Objects.equals(apartmentNumber, other.apartmentNumber)
				&& Objects.equals(buldingNumber, other.buldingNumber) && Objects.equals(city, other.city)
				&& Objects.equals(country, other.country) && Objects.equals(district, other.district)
				&& Objects.equals(neighbourdhood, other.neighbourdhood);
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", district=" + district + ", neighbourdhood="
				+ neighbourdhood + ", buldingNumber=" + buldingNumber + ", apartmentNumber=" + apartmentNumber
				+ ", addressType=" + addressType + "]";
	}
	
	
	
	
	
}
