import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {

	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList<String> garnitures = new ArrayList<String>();

	public void preparer() {
		// TODO Auto-generated method stub
		System.out.println("Étalage de la pâte...\n" +
				"Ajout de la sauce...\n" +
				"Ajout des garnitures:");

		for(int i=0; i<garnitures.size();i++){
			System.out.println(garnitures.get(i));
		}

	}

	public void cuire() {
		// TODO Auto-generated method stub
		
	}

	public void couper() {
		// TODO Auto-generated method stub
		
	}

	public void emballer() {
		// TODO Auto-generated method stub
		
	}

	public  String getNom(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGarnitures(ArrayList<String> garnitures) {
		this.garnitures = garnitures;
	}
}
