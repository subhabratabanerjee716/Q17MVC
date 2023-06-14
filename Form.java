package Model;

public class Form {
	
	String title;
	String desc;
	String content;
	
	
	
	public Form(String title, String desc, String content) {
		super();
		this.title = title;
		this.desc = desc;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}
