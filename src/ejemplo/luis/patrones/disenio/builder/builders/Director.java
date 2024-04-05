package ejemplo.luis.patrones.disenio.builder.builders;

import java.time.format.DateTimeFormatter;

import ejemplo.luis.patrones.disenio.builder.models.Bottom;
import ejemplo.luis.patrones.disenio.builder.models.Control;
import ejemplo.luis.patrones.disenio.builder.modelsabstract.BuilderControl;

public class Director {

	private BuilderControl builder;

	public Director(BuilderControl builder) {
		super();
		this.builder = builder;
	}
	
	public void changeBuilder(BuilderControl builder) {
		this.builder = builder;
	}

	public void make() {
		if(this.builder.getClass() == AtariControlBuilder.class) {
			this.builder.setConsole("Atari 2600");
			this.builder.setBluetooth(false);
			this.builder.setNumBottoms(1);
			this.builder.setJoystick(true);
			this.builder.setoutDate(DateTimeFormatter.ofPattern("01/01/1977"));
			this.builder.setVibration(false);
			this.builder.setLedScreen(false);
			this.builder.setInputHeadphones(false);
			this.builder.addBottom(new Bottom("Red", "None", false));
		}else {
			if(this.builder.getClass() == NesControlBuilder.class) {
				this.builder.setConsole("Nintendo Entreteinment System");
				this.builder.setBluetooth(false);
				this.builder.setNumBottoms(4);
				this.builder.setJoystick(true);
				this.builder.setoutDate(DateTimeFormatter.ofPattern("01/01/1985"));
				this.builder.setVibration(false);
				this.builder.setLedScreen(false);
				this.builder.setInputHeadphones(false);
				this.builder.addBottom(new Bottom("Red", "A", false));
				this.builder.addBottom(new Bottom("Red", "B", false));
				this.builder.addBottom(new Bottom("Black", "Start", false));
				this.builder.addBottom(new Bottom("Black", "Select", false));
			}else {
				if(this.builder.getClass() == GamecubeControlBuilder.class) {
					this.builder.setConsole("Nintendo Gamecube");
					this.builder.setBluetooth(false);
					this.builder.setNumBottoms(8);
					this.builder.setJoystick(true);
					this.builder.setoutDate(DateTimeFormatter.ofPattern("01/01/2001"));
					this.builder.setVibration(true);
					this.builder.setLedScreen(false);
					this.builder.setInputHeadphones(false);
					this.builder.addBottom(new Bottom("Green", "A", false));
					this.builder.addBottom(new Bottom("Red", "B", false));
					this.builder.addBottom(new Bottom("Grey", "X", false));
					this.builder.addBottom(new Bottom("Grey", "Y", false));
					this.builder.addBottom(new Bottom("Grey", "Start/Pause", false));
					this.builder.addBottom(new Bottom("Blue", "Z", true));
					this.builder.addBottom(new Bottom("Grey", "R", true));
					this.builder.addBottom(new Bottom("Grey", "L", true));
				}
			}
		}
	}

	public Control getResult() {
		return this.builder.getResult();
	}
	
}
