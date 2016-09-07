package seedu.addressbook.data.tag;

public class Tagging {
	private String tagName;
	private String personName;
	private boolean isAdd;
	
	public Tagging(String tagName, String personName, boolean isAdd){
		this.tagName = tagName;
		this.personName = personName;
		this.isAdd = isAdd;
	}
	
	@Override
	public String toString(){
		return (isAdd ? "+" : "-") + personName + " [" + tagName + "]"; 
	}
}
