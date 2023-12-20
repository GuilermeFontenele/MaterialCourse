package vetor;

public class Vetor14Product {

	private String name;
	private String email;
	
	public void Vetor2Product(){
	}

	public Vetor14Product(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return name + ", " + email;
	}
	
}
