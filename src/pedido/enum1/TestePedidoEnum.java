package pedido.enum1;

import java.util.Date;

import projeto.enum2.Enum;
import projeto.pedido.enum3.PedidosEnum;

public class TestePedidoEnum {
	public static void main(String[] args) {

		PedidosEnum pd = new PedidosEnum(123, new Date(),Enum.AGUARDADO_PAGAMENTO);
		System.out.println(pd);
		
		
		
	}

}
