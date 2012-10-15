import java.util.LinkedList;

/**
 *
 */
public class EnrolmentManager {
	static private EnrolmentManager singleton = null;
	private LinkedList<Enrolment> enrolments;
	private TimeOutList<Enrolment> deletedEnrolments;

	/**
	 *
	 */
	public static EnrolmentManager getInstance() {
		if (singleton == null)
			singleton = new EnrolmentManager();
		return singleton;
	}

	/**
	 *
	 */
	private EnrolmentManager() {
		assert (singleton == null);

		this.enrolments = new LinkedList<Enrolment>();
		this.deletedEnrolments = new TimeOutList<Enrolment>();
	}

	/**
	 *
	 */
	public boolean add(Student s, Class c) {
		if(s != null && c != null){
		Enrolment enrol = new Enrolment(s, c);
		if (!enrolments.contains(enrol)) {
			enrolments.add(enrol)
			return true;
		}
		}
		return false;
	}

	/**
	 *
	 */
	public void delete(Student s, Class c) {
		if(s != null & c != null){
			Enrolment delete = new Enrolment(s,c);
			if(enrolments.contains(delete)){
				enrolments.remove(delete);
				deletedEnrolments.add(delete);
				
				if(!checkDeleted(delete, true))
					delete(s,c);
			}
		}
	}
	
/*
	* Checks if its in temporary list and not in enrolment List if delete is true
	* Checks if its in enrolment list anbd not in deleted if delete is false
	*/
	private booleen checkEntry(Enrolment e, boolean delete){
		assert(e != null);
		boolean isThere = false;
		if(!enrolment.contains(e) && deletedEnrolments.contains(e))
			isThere = true;
		else
			isThere =false;
		}
		if(delete)
			return isThere;
	
		return !isThere;
		
	}

	/*
	* Restores enrty from deleted list to enrolments list
	*/
	public void restore(Student s, Class c){
		if(C != null && s != null){
			Enrolment restore = new Enrolment(c,s);
			if(deletedEnrolments.contains(restore)){
				deletedEnrolments.remove(restore);
				enrolments.add(restore);

				if(!checkEntry(restore, false))
					restore(s,c);
			}
		}
	}
	
}