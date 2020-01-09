package comm.examp;


	import lombok.AllArgsConstructor;
	import lombok.EqualsAndHashCode;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	import lombok.ToString;

	@NoArgsConstructor
	@AllArgsConstructor
	@Setter
	@Getter
	@ToString
	@EqualsAndHashCode
	public class ToDo {
		
		private String toDoId;
		private String toDoName;
		
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
		public ToDo(String toDoId, String toDoName) {
			super();
			this.toDoId = toDoId;
			this.toDoName = toDoName;
		}
		
		
		

	
}
