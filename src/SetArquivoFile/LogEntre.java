package SetArquivoFile;

import java.util.Date;

public class LogEntre {

	private String usernamo;
	private Date momento;

	public LogEntre(String usernamo, Date momento) {
		this.usernamo = usernamo;
		this.momento = momento;
	}

	public String getUsernamo() {
		return usernamo;
	}

	public void setUsernamo(String usernamo) {
		this.usernamo = usernamo;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usernamo == null) ? 0 : usernamo.hashCode());
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
		LogEntre other = (LogEntre) obj;
		if (usernamo == null) {
			if (other.usernamo != null)
				return false;
		} else if (!usernamo.equals(other.usernamo))
			return false;
		return true;
	}

}
