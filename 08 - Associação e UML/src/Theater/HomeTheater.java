package Theater;

public class HomeTheater {
	protected SistemaDeSom som;
	protected SistemaDeVideo video;
	
	public HomeTheater(SistemaDeSom som, SistemaDeVideo video) {
		setSom(som);
		setVideo(video);
	}
	
	public SistemaDeSom getSom() {
		return som;
	}
	public SistemaDeVideo getVideo() {
		return video;
	}
	public void setSom(SistemaDeSom som) {
		this.som = som;
	}
	public void setVideo(SistemaDeVideo video) {
		this.video = video;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomeTheater:\\n[som: ");
		builder.append(som);
		builder.append("]\\n[video: ");
		builder.append(video);
		builder.append("]\\n[toString(): ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
