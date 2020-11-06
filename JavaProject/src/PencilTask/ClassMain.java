package PencilTask;

public class ClassMain {

	public static void main(String[] args) {

		Pencil p = new Pencil (333,"dof");
		
		Pencil p1 = new Pencil ( 333 , "dof");
		
		System.out.println(p.equals(p1));
		
	}

}