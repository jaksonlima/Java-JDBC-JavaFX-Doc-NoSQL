package modelo.reserva;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numero;
	private Date checkin;
	private Date chechout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/HH/yyyy");

	public Reserva(Integer numero, Date checkin, Date chechout) {
		this.numero = numero;
		this.checkin = checkin;
		this.chechout = chechout;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getChechout() {
		return chechout;
	}

	public long duracao() {
		long diff = chechout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.DAYS);
	}

	public void updateDatas(Date chechout, Date chechin) {
		this.chechout = chechout;
		this.checkin = chechin;
	}

	@Override
	public String toString() {
		return "Room" + numero + ", checkin: " + sdf.format(checkin) + ", chechout" + sdf.format(chechout) + ", " + duracao() + "Nights";
	}

}
