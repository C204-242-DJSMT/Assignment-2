public class TeachesManager {
	static private TeachesManager singleton = null;
	private LinkedList<Teaches> teaches;
	private TimeOutList<Teaches> deleteedTeaces;
	
	private TeachesManager() {
		assert(singleton == null);
		this.teaches = new LinkedList<Teaches>();
		this.deletedTeaches = new TimeOutList<Teaches>();
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

	/**
	 *
	 */
	public void delete(Teacher t, Class c) {
		if(t != null && c != null){
			Teaches delete = new Teaches(c,t);
			if(teaches.contains(delete)){
				teaches.remove(delete);
				deletedTeaches.add(delete);

				if(!checkEntry(delete, true))
					delete(t,c);
			}
		}
	}

	/*
	* Checks if its in temporary list and not in teaches List if delete is true
	* Checks if its in teaches list anbd not in deleted if delete is false
	*/
	private booleen checkEntry(Teaches e, boolean delete){
		assert(e != null);
		if(delete == true){
			if(!teaches.contains(e) && deletedTeaches.contains(e))
				return true;

			return false;
		}
		else{
		if(teaches.contains(e) && !deletedTeaches.contains(e))
				return true;

			return false;	
		}
	}
	
	/*
	* Restores enrty from deleted list to teaches list
	*/
	public void restore(Teacher t, Class c){
		if(C != null && t != null){
			Teaches restore = new Teaches(c,t);
			if(deletedTeaches.contains(restore)){
				deletedTeaches.remove(restore);
				teaches.add(restore);

				if(!checkEntry(restore, false))
					restore(t,c);
			}
		}
	}
	

}