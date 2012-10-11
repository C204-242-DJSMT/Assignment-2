public class TeachesManager {
	static private TeachesManager singleton = null;
	
	private TeachesManager() {

	}

	public static TeachesManager getInstance() {
		if (singleton == null)
			singleton = new TeachesManager();
		return singleton;
	}
}