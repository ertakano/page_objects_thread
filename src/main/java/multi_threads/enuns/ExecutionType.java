package multi_threads.enuns;

public enum ExecutionType {

	LOCAL("LOCAL"),
	GRID("GRID"),
	NUVEM("NUVEM");
	
	private final String value;
	
	ExecutionType(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
