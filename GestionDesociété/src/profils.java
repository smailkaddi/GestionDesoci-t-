
public class profils {

      int id;
	 String code;
	 String libellé;
	static int comp = 0;

	public profils( String code ,String libellé) {
		this.code= code;
		this.libellé = libellé;
		this.id = comp++;
		
	}



	
}
