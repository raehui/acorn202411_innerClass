package test.mypac;

public class PostDto {
	private int no;
	private String name;
	private String title;
	
	public PostDto() {}

	public PostDto(int no, String name, String title) {
		this.no = no;
		this.name = name;
		this.title = title;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
