package DiwaliRevisionOOPs_11to17;

public class Document implements Printable,Showable{

	@Override
	public String Print() {
		return "My name is Ram";
	}
	
	@Override
	public String Show() {
		return "I like to play vollyball";
	}
}
