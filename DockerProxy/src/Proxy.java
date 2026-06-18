import java.time.Duration;
import java.time.LocalDateTime;

public class Proxy implements Service{
	private RealService service;
	private String user;
	private String cache;
	private LocalDateTime time = LocalDateTime.MIN;
	
	public Proxy(String user) {
		this.user = user;
	}
	
	@Override
	public String request(int type) {
		// Test permission
		if (this.testPermission()) {
			if (this.service == null) {
				this.service = new RealService();
			}
			
			// Get cache instead of docker if the requests were sent less then 2 minutes apart
			Duration duration = Duration.between(time,LocalDateTime.now());
			long last_request = duration.toMinutes();
			if (last_request > 2) {
				cache = this.service.request(type);
				if (cache.equals("Error: No database connection"))
				time = LocalDateTime.now();
				System.out.println("Getting from database");
			} else {
				System.out.println("Getting from cache");
			}
			return cache;
		} else {
			return "Error: No permission";
		}
	}
	
	private boolean testPermission() {
		return this.user.equals("admin");
	}

}
