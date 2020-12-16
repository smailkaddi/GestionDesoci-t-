
public class utilisateur extends person {

	String login;
	String password;
	String service;
	profils profile;
	
	

	public utilisateur(String fname, String lname, String email, String matricule, String tel, double salire,
			String login, String password, String service, profils profile) {
		super(fname, lname, email, matricule, tel, salire);
		this.login = login;
		this.password = password;
		this.service = service;
		this.profile = profile;
	}



	public double calculerSalaire() {
		if (this.profile.code.equals("MN")) {
			return salire * 1.08;
		} else if (this.profile.code.equals("DG")) {
			return salire * 1.15;
		}
		return super.calculerSalaire();
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Le " + this.profile.libellé + " le salaire est: " + this.calculerSalaire());
	}



	

}
