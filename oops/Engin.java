package oops;

public class Engin {
private String Type;
private int horsePower;
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public int getHorsePower() {
	return horsePower;
}
public void setHorsePower(int horsePower) {
	this.horsePower = horsePower;
}
@Override
public String toString() {
	return "Engin [Type=" + Type + ", horsePower=" + horsePower + "]";
}
public Engin(String type, int horsePower) {
	super();
	Type = type;
	this.horsePower = horsePower;
}
public Engin(String type, int horsePower) {
	super();
	Type = type;
	this.horsePower = horsePower;
}

}
