public class StudentManager {
	static private StudentManager singleton = null;
	
	private StudentManager() {

	}

	public static StudentManager getInstance() {
		if (singleton == null)
			singleton = new StudentManager();
		return singleton;
	}
}