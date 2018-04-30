package multi_threads.enuns;

public enum Browsers {

	CHROME("CHROME"),
	FIREFOX("FIREFOX");
	
	private final String value;
	
	Browsers(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
