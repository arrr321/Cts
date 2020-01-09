package comm.examp;


	import java.util.List;

	public interface ToDoDao {
		
		public ToDo createToDo(String toDoName);
		public List<ToDo> getAllToDos();
		public ToDo findById(String toDoId);
		void removeAllToDo();
		void deleteToDo(String toDoId);
		void updateId(String toDoId , String data);
		
		
		

	}
