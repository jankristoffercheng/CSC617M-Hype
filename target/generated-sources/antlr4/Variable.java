
public class Variable {
	private String dataType;
	private String value;
	
	public Variable(String dataType, String value) {
		this.dataType = dataType;
		this.value = value;
	}
	
	public String getDataType() {
		return dataType;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
