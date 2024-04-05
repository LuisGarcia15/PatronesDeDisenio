package ejemplo.luis.patrones.disenio.builder.builders;

import java.time.format.DateTimeFormatter;

import ejemplo.luis.patrones.disenio.builder.models.Bottom;
import ejemplo.luis.patrones.disenio.builder.models.Control;
import ejemplo.luis.patrones.disenio.builder.modelsabstract.BuilderControl;

public class NesControlBuilder implements BuilderControl{

	private Control nesControl;
	
	public NesControlBuilder() {
		this.reset();
		this.nesControl = new Control();
	}

	private void reset() {
		this.nesControl = null;
	}
	
	@Override
	public Control getResult() {
		return this.nesControl;
	}

	@Override
	public void setConsole(String console) {
		this.nesControl.setConsole(console);
	}

	@Override
	public void setBluetooth(boolean value) {
		this.nesControl.setBluetooth(value);
	}

	@Override
	public void setNumBottoms(int value) {
		this.nesControl.setNumBottoms(value);
	}

	@Override
	public void setJoystick(boolean value) {
		this.nesControl.setHaveJoystick(value);
	}

	@Override
	public void setoutDate(DateTimeFormatter date) {
		this.nesControl.setOutDate(date);
	}

	@Override
	public void setVibration(boolean value) {
		this.nesControl.setHaveVibration(value);
	}

	@Override
	public void setLedScreen(boolean value) {
		this.nesControl.setHaveLedScreen(value);
	}

	@Override
	public void setInputHeadphones(boolean value) {
		this.nesControl.setHaveInputHeadphones(value);
	}

	@Override
	public void addBottom(Bottom bottom) {
		this.nesControl.addBottom(bottom);
	}
}
