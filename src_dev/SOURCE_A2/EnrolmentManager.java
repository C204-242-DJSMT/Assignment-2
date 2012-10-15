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
				
				if(!checkDeleted(delete))
					delete(s,c);
			}
		}
	}
	
	private booleen checkDeleted(Enrolment e){
		assert(e != null);
		if(!enrolments.contains(e) && deletedEnrolment.contains(e))
			return true;
		
		return false;
	}

}