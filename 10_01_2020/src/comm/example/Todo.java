package comm.example;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Todo implements Serializable {
	
	
	private String toDoId;
	private String toDoName;
	private   LocalDate date;
	public Todo(String toDoId, String toDoName, LocalDate date) {
		super();
		this.toDoId = toDoId;
		this.toDoName = toDoName;
		this.date = date;
	}
	public String getToDoId() {
		return toDoId;
	}
	public void setToDoId(String toDoId) {
		this.toDoId = toDoId;
	}
	public String getToDoName() {
		return toDoName;
	}
	public void setToDoName(String toDoName) {
		this.toDoName = toDoName;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	

}
