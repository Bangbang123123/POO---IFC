
public class RealService implements Service{

	@Override
	public String request(int type) {
		return DatabaseConnection.getAll();
	}
	
}
