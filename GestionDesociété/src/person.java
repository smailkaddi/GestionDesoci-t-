
public class person {

	 String fname;
	 String lname;
	 String email;
	 String matricule;
	 String tel;
	 double salire;



	public person(String fname, String lname, String email, String matricule, String tel, double salire) {
		// TODO Auto-generated constructor stub
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.matricule = matricule;
		this.tel = tel;
		this.salire = salire;
	}



	public double calculerSalaire() {
		return this.salire;
	}

	public void afficher() {
		// TODO Auto-generated method stub	
		System.out.print(this.fname + " " + this.lname + ", ");

	}
}
