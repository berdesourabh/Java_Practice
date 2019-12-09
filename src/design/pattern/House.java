package design.pattern;

public class House {

	// Required parameters for the object
	private String address;
	private int sqft;

	// The optional parameters for the object
	private int bedrooms;
	private Boolean haslawn;

	// Create the getters for all the parameters
	public String getAddress() {
		return address;
	}

	public int getSqft() {
		return sqft;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public Boolean doesHaveLawn() {
		return haslawn;
	}

	// Create a constructor for the House
	private House(HouseBuilder builder) {
		this.address = builder.address;
		this.sqft = builder.sqft;
		this.bedrooms = builder.bedrooms;
		this.haslawn = builder.hasLawn;
	}

	public static class HouseBuilder {
		// Required parameters for the object ... again
		private String address;
		private int sqft;
		// The optional parameters for the object ... again
		private Boolean hasLawn;
		private int bedrooms;

		// This is the builder object we'll call initially
		// and it must include the required params
		public HouseBuilder(String address, int sqft) {
			this.address = address;
			this.sqft = sqft;
		}

		// We use setter methods on the optional parameters
		public HouseBuilder setBedrooms(int bedrooms) {
			this.bedrooms = bedrooms;
			return this;
		}

		public HouseBuilder setHasLawn(boolean haslawn) {
			this.hasLawn = haslawn;
			return this;
		}

		// The final method called when you want the object to
		// instantiate
		public House build() {
			return new House(this);
		}

	}

	// Here is the builder in action. Notice how after the
	// required parameters are passed into HouseBuilder you then
	// 'build' additional optional parameters onto the object.
	// Finally call the .build() method to create the object
	public static void main(String[] args) {
		House house = new House.HouseBuilder("123 Fake St.", 900).setBedrooms(3).setHasLawn(true).build();
		System.out.println(house.getBedrooms());
	}

}