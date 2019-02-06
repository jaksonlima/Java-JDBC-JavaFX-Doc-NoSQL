package projeto.Autentica;

public class GitHubAutenticaUser {

	private double condigo;
	private String nomeuser;
	private Integer iduser;

	public GitHubAutenticaUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GitHubAutenticaUser(double condigo, String nomeuser, Integer iduser) {
		super();
		this.condigo = condigo;
		this.nomeuser = nomeuser;
		this.iduser = iduser;
	}

	@Override
	public String toString() {
		return "GitHubAutenticaUser [condigo=" + condigo + ", nomeuser=" + nomeuser + ", iduser=" + iduser + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(condigo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((iduser == null) ? 0 : iduser.hashCode());
		result = prime * result + ((nomeuser == null) ? 0 : nomeuser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitHubAutenticaUser other = (GitHubAutenticaUser) obj;
		if (Double.doubleToLongBits(condigo) != Double.doubleToLongBits(other.condigo))
			return false;
		if (iduser == null) {
			if (other.iduser != null)
				return false;
		} else if (!iduser.equals(other.iduser))
			return false;
		if (nomeuser == null) {
			if (other.nomeuser != null)
				return false;
		} else if (!nomeuser.equals(other.nomeuser))
			return false;
		return true;
	}

	public byte byteValue() {
		return iduser.byteValue();
	}

	public short shortValue() {
		return iduser.shortValue();
	}

	public int intValue() {
		return iduser.intValue();
	}

	public long longValue() {
		return iduser.longValue();
	}

	public float floatValue() {
		return iduser.floatValue();
	}

	public double doubleValue() {
		return iduser.doubleValue();
	}

	public int compareTo(Integer anotherInteger) {
		return iduser.compareTo(anotherInteger);
	}

	public double getCondigo() {
		return condigo;
	}

	public void setCondigo(double condigo) {
		this.condigo = condigo;
	}

	public String getNomeuser() {
		return nomeuser;
	}

	public void setNomeuser(String nomeuser) {
		this.nomeuser = nomeuser;
	}

	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	

}
