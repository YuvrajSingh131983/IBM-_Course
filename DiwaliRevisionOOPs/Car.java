package DiwaliRevisionOOPs;

public class Car {
public String Compaany_Name;
public String Model;
@Override
public String toString() {
	return "Car [Compaany_Name=" + Compaany_Name + ", Model=" + Model + "]";
}
Car(String compaany_Name, String model) {
	super();
	Compaany_Name = compaany_Name;
	Model = model;
}

}
