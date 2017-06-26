
public class REmployee implements Comparable<REmployee> {
	
	private Salary sal;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "REmployee [sal=" + sal + ", name=" + name + "]";
	}

	private String name;

	public REmployee(Salary sal, String name) {
		super();
		this.sal = sal;
		this.setName(name);
	}

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}

	/*@Override
	public int compareTo(Salary o) {
		// TODO Auto-generated method stub
		return (int) (this.sal.getSal() - o.getSal());
	}*/

	@Override
	public int compareTo(REmployee o) {
		// TODO Auto-generated method stub
		Long l1 = this.getSal().getSal();
		Long l2 = o.getSal().getSal();
		return (int) ( l1-l2);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sal == null) ? 0 : sal.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		REmployee other = (REmployee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sal == null) {
			if (other.sal != null)
				return false;
		} else if (!sal.equals(other.sal))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
