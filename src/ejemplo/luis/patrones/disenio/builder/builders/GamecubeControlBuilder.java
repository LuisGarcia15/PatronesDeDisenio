package ejemplo.luis.patrones.disenio.builder.builders;

import java.time.format.DateTimeFormatter;

import ejemplo.luis.patrones.disenio.builder.models.Bottom;
import ejemplo.luis.patrones.disenio.builder.models.Control;
import ejemplo.luis.patrones.disenio.builder.modelsabstract.BuilderControl;

public class GamecubeControlBuilder implements BuilderControl{

private Control gamecubeControl;
	
	public GamecubeControlBuilder() {
		this.reset();
		this.gamecubeControl = new Control();
	}

	private void reset() {
		this.gamecubeControl = null;
	}
	
	@Override
	public Control getResult() {
		return this.gamecubeControl;
	}

	@Override
	public void setConsole(String console) {
		this.gamecubeControl.setConsole(console);
	}

	@Override
	public void setBluetooth(boolean value) {
		this.gamecubeControl.setBluetooth(value);
	}

	@Override
	public void setNumBottoms(int value) {
		this.gamecubeControl.setNumBottoms(value);
	}

	@Override
	public void setJoystick(boolean value) {
		this.gamecubeControl.setHaveJoystick(value);
	}

	@Override
	public void setoutDate(DateTimeFormatter date) {
		this.gamecubeControl.setOutDate(date);
	}

	@Override
	public void setVibration(boolean value) {
		this.gamecubeControl.setHaveVibration(value);
	}

	@Override
	public void setLedScreen(boolean value) {
		this.gamecubeControl.setHaveLedScreen(value);
	}

	@Override
	public void setInputHeadphones(boolean value) {
		this.gamecubeControl.setHaveInputHeadphones(value);
	}

	@Override
	public void addBottom(Bottom bottom) {
		this.gamecubeControl.addBottom(bottom);
	}
}
