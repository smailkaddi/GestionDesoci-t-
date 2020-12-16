
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		profils profils[] = new profils[5];

		profils[0] = new profils("CP", "Chef de projet");
		profils[1] = new profils("MN", "Manager");
		profils[2] = new profils("DP", "Directeur de projet");
		profils[3] = new profils("DRH", "Directeur des ressources humaines");
		profils[4] = new profils("DG", "Directeur général");

		utilisateur utilisateurs[] = new utilisateur[8];

		utilisateurs[0] = new utilisateur("PA1233", "ismail", "kaddi", "hello@gmail.com", "2120698098", 5000, "isamail",
				"123456", "service", profils[0]);
		utilisateurs[1] = new utilisateur("PA2222", "cahrkawii", "yassin", "hello@gmail.com", "2120698098", 5000,
				"charkaawi", "123456", "service", profils[0]);
		utilisateurs[2] = new utilisateur("PA3333", "aboulfat", "ali", "hello@gmail.com", "2120698098", 5000,
				"aboulfat", "123456", "service", profils[1]);
		utilisateurs[3] = new utilisateur("PA3333", "kamli", "zakaria", "mostafa@gmail.com", "2120698098", 5000,
				"kamli", "123456", "service", profils[1]);
		utilisateurs[4] = new utilisateur("PA3333", "Alaoui", "Soufiane", "soufiane@gmail.com", "2120698098", 5000,
				"Alaoui", "123456", "service", profils[2]);
		utilisateurs[5] = new utilisateur("PA3333", "oubouhia", "mohamed", "reda@gmail.com", "2120698098", 5000,
				"ramri", "oubouhia", "service1", profils[3]);
		utilisateurs[6] = new utilisateur("PA3333", "idofakir", "mustfa", "Othman@gmail.com", "0645764233", 5000,
				"ohanini", "123456", "service", profils[4]);
		utilisateurs[7] = new utilisateur("PA3333", "Moustahcine", "Mohammed", "Mohammed@gmail.com", "0645764233", 5000,
				"mmoustahcine", "123456", "service", profils[4]);

		System.out.println("La liste des utilisateurs: ");
		for (utilisateur user : utilisateurs) {
			user.afficher();
		}

		System.out.println("");

		System.out.println("La liste des managers: ");
		for (utilisateur user : utilisateurs) {
			if (user.profile.code.equals("MN")) {
				user.afficher();
			}
		}

	}

}
