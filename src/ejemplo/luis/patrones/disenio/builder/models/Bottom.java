package ejemplo.luis.patrones.disenio.builder.models;

public class Bottom {
	
	private String color;
	private String simbol;
	private boolean isTrigger;
	
	public Bottom(String color, String simbol, boolean isTrigger) {
		super();
		this.color = color;
		this.simbol = simbol;
		this.isTrigger = isTrigger;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSimbol() {
		return simbol;
	}
	public void setSimbol(String simbol) {
		this.simbol = simbol;
	}
	public boolean isTrigger() {
		return isTrigger;
	}
	public void setTrigger(boolean isTrigger) {
		this.isTrigger = isTrigger;
	}
	@Override
	public String toString() {
		return "{\nBottom [color=" + color + ", simbol=" + simbol + ", isTrigger=" + isTrigger + "}";
	}

}
