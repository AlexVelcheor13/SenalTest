package Task_6;

import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Заполняем рюкзак!");
		List<Entity> entities = Arrays.asList( new Entity(1, 1),
											   new Entity(2, 2),
											   new Entity(3, 3),
											   new Entity(4, 4),
											   new Entity(5, 4),
											   new Entity(4, 1),
											   new Entity(10, 2),
											   new Entity(9, 1)
		);
		
		Knap knap = new Knap(11, entities);
		knap.lookForEnt();
		StringBuilder sb = new StringBuilder();
		for (Entity ent : knap.ent()) {
			sb.append(ent + "\n");
		}
		System.out.println(sb);
	}

}
