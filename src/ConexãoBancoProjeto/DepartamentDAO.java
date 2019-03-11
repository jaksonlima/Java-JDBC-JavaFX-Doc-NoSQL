package ConexãoBancoProjeto;

import java.util.List;

public interface DepartamentDAO {

	public void inserir(Departament obj);

	public void update(Departament obj);

	public void deleteID(Integer id);

	Departament FinalID(Integer id);
	
	List<Departament> FinalAll(); 

}
