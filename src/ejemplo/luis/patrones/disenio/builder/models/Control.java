package ejemplo.luis.patrones.disenio.builder.models;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Control {
	
	private String console;
	private boolean isBluetooth;
	private int numBottoms;
	private boolean haveJoystick;
	private DateTimeFormatter outDate;
	private boolean haveVibration;
	private boolean haveLedScreen;
	private boolean haveInputHeadphones;
	private List<Bottom> bottoms;
	
	public Control() {
		super();
		this.console = "None";
		this.isBluetooth = false;
		this.numBottoms = 0;
		this.haveJoystick = false;
		this.outDate = null;
		this.haveVibration = false;
		this.haveLedScreen = false;
		this.haveInputHeadphones = false;
		this.bottoms = new ArrayList<Bottom>();
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public boolean isBluetooth() {
		return isBluetooth;
	}
	public void setBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}
	public int getNumBottoms() {
		return numBottoms;
	}
	public void setNumBottoms(int numBottoms) {
		this.numBottoms = numBottoms;
	}
	public boolean isHaveJoystick() {
		return haveJoystick;
	}
	public void setHaveJoystick(boolean haveJoystick) {
		this.haveJoystick = haveJoystick;
	}
	public DateTimeFormatter getOutDate() {
		return outDate;
	}
	public void setOutDate(DateTimeFormatter outDate) {
		this.outDate = outDate;
	}
	public boolean isHaveVibration() {
		return haveVibration;
	}
	public void setHaveVibration(boolean haveVibration) {
		this.haveVibration = haveVibration;
	}
	public boolean isHaveLedScreen() {
		return haveLedScreen;
	}
	public void setHaveLedScreen(boolean haveLedScreen) {
		this.haveLedScreen = haveLedScreen;
	}
	public boolean isHaveInputHeadphones() {
		return haveInputHeadphones;
	}
	public void setHaveInputHeadphones(boolean haveInputHeadphones) {
		this.haveInputHeadphones = haveInputHeadphones;
	}	
	public void addBottom(Bottom bottom) {
		this.bottoms.add(bottom);
	}	
	@Override
	public String toString() {
		return "Control [consol=" + console + ", isBluetooth=" + isBluetooth + ", numBotones=" + numBottoms
				+ ", haveJoystick=" + haveJoystick + ",\n anioSalida=" + outDate + ", haveVibration=" + haveVibration
				+ ", haveLedScreen=" + haveLedScreen + ", haveInputHeadphones=" + haveInputHeadphones + ",\n bottoms="
				+ bottoms + "\n]";
	}
}
