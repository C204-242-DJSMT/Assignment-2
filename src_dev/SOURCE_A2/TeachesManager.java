public class TeachesManager {
	static private TeachesManager singleton = null;
	private LinkedList<Teaches> teaches;
	
	private TeachesManager() {
		assert(singleton == null);
		this.teaches = new LinkedList<Teaches>();
	}

	public static TeachesManager getInstance() {
		if (singleton == null)
			singleton = new TeachesManager();
		return singleton;
	}

	public boolean add(Class c, Teacher t){
		if(c != null && t != null){
			Teaches teach = new Teaches(c, t);
			if(!teaches.contains(teach){
				teaches.add(teach);
				return true;
			}
		}
		return false;

	}
	

}