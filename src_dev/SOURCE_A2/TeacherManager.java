public class TeacherManager {
	static private TeacherManager singleton = null;
	
	private TeacherManager() {

	}

	public static TeacherManager getInstance() {
		if (singleton == null)
			singleton = new TeacherManager();
		return singleton;
	}
}