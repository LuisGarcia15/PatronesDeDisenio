package ejemplo.luis.patrones.disenio.builder.modelsabstract;

import java.time.format.DateTimeFormatter;

import ejemplo.luis.patrones.disenio.builder.models.Bottom;
import ejemplo.luis.patrones.disenio.builder.models.Control;

public interface BuilderControl {
	public void setConsole(String console);
	public void setBluetooth(boolean value);
	public void setNumBottoms(int value);
	public void setJoystick(boolean value);
	public void setoutDate(DateTimeFormatter dateTimeFormatter);
	public void setVibration(boolean value);
	public void setLedScreen(boolean value);
	public void setInputHeadphones(boolean value);
	public void	addBottom(Bottom bottom);
	public Control getResult();
}
