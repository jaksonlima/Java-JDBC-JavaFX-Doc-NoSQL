package ConexãoBancoProjeto;

import java.util.List;

public interface SellerDAO {

	public void inserir(Seller obj);

	public void update(Seller obj);

	public void deleteID(Integer id);

	Seller FinalID(Integer id);

	List<Seller> FinalAll();

}
