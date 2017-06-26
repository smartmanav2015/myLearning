
public class HREmployee implements Cloneable {
	
	private String fName;
	
	private long id;

	public HREmployee(String fName, long id) {
		super();
		this.fName = fName;
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public String toString() {
		return "HREmployee [fName=" + fName + ", id=" + id + "]";
	}
	
	
	
	
	
	

}
