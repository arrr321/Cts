package comm.examp;


	import java.util.List;

	public class ToDoServiceImpl implements ToDoService {
		private ToDoDao dao=null;
		{
			dao=new ToDoDaoImpl();
		}

		@Override
		public ToDo createToDo(String toDoName) {
			// TODO Auto-generated method stub
			return dao.createToDo(toDoName);
		}

		@Override
		public List<ToDo> getAllToDos() {
			// TODO Auto-generated method stub
			return dao.getAllToDos();
		}

		@Override
		public ToDo findById(String toDoId) {
			// TODO Auto-generated method stub
			return dao.findById(toDoId);
		}

		@Override
		public void deleteToDo(String toDoId) {
			// TODO Auto-generated method stub
			dao.deleteToDo(toDoId);
		}

		@Override
		public void removeAllToDo() {
			// TODO Auto-generated method stub
			dao.removeAllToDo();
			
		}

		@Override
		public void updatebyid(String toDoId, String data) {
			// TODO Auto-generated method stub
			
		}
		

	}


