package ejemplo.luis.patrones.disenio.builder.builders;

import java.time.format.DateTimeFormatter;

import ejemplo.luis.patrones.disenio.builder.models.Bottom;
import ejemplo.luis.patrones.disenio.builder.models.Control;
import ejemplo.luis.patrones.disenio.builder.modelsabstract.BuilderControl;

public class AtariControlBuilder implements BuilderControl{
	
	private Control atariControl;
	
	public AtariControlBuilder() {
		this.reset();
		this.atariControl = new Control();
	}

	private void reset() {
		this.atariControl = null;
	}
	
	@Override
	public Control getResult() {
		return this.atariControl;
	}

	@Override
	public void setConsole(String console) {
		this.atariControl.setConsole(console);
	}

	@Override
	public void setBluetooth(boolean value) {
		this.atariControl.setBluetooth(value);
	}

	@Override
	public void setNumBottoms(int value) {
		this.atariControl.setNumBottoms(value);
	}

	@Override
	public void setJoystick(boolean value) {
		this.atariControl.setHaveJoystick(value);
	}

	@Override
	public void setoutDate(DateTimeFormatter date) {
		this.atariControl.setOutDate(date);
	}

	@Override
	public void setVibration(boolean value) {
		this.atariControl.setHaveVibration(value);
	}

	@Override
	public void setLedScreen(boolean value) {
		this.atariControl.setHaveLedScreen(value);
	}

	@Override
	public void setInputHeadphones(boolean value) {
		this.atariControl.setHaveInputHeadphones(value);
	}

	@Override
	public void addBottom(Bottom bottom) {
		this.atariControl.addBottom(bottom);
	}

}
