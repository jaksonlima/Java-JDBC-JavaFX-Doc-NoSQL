package projeto.pedido.enum3;

import java.util.Date;

import projeto.enum2.Enum;

public class PedidosEnum {

	private Integer id;
	private Date moment;
	private Enum Status;

	public PedidosEnum() {
	}

	public PedidosEnum(Integer id, Date moment, Enum status) {
		this.id = id;
		this.moment = moment;
		this.Status = status;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Seu numero: " + id + " Sua Data: " + moment + " Status pedido: " + Status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Enum getStatus() {
		return Status;
	}

	public void setStatus(Enum status) {
		Status = status;
	}

}
