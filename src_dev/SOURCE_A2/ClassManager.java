public class ClassManager {
	static private ClassManager singleton = null;
	
	private ClassManager() {

	}

	public static ClassManager getInstance() {
		if (singleton == null)
			singleton = new ClassManager();
		return singleton;
	}
}