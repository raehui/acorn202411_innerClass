package test.dto;

public class ToDoDto {
	private int num;
	private String todo;
	private String content;
	
	public ToDoDto() {}
	

	public ToDoDto(int num, String todo, String content) {
		this.num = num;
		this.todo = todo;
		this.content = content;
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
