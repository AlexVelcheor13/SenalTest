package Task_6;

import java.util.ArrayList;
import java.util.List;

public class Knap {
	private List<Entity> entity;
	private final int maxKnapWeight;
	private List<List<Integer>> m;
	private List<Entity> ent;
	
	public Knap( int maxKnapWeight, List<Entity> entity) {
		super();
		this.entity = entity;
		this.maxKnapWeight = maxKnapWeight;
	}
	
	
	private void generateM() {
		for (int i = 0; i < entity.size(); i++) {
			m.add(new ArrayList<>());
			m.get(i).add(0,0);
		}
		
		for (int i = 0; i < maxKnapWeight; i++) {
			m.get(0).add(i,0);
		}
		
		for (int a = 1; a < entity.size(); a++) {
			for (int b = 1; b <= maxKnapWeight; b++) {
				if (b >=entity.get(a).getWeight()) {
					m.get(a).add(b, Math.max(m.get(a-1).get(b), m.get(a-1).get(b - entity.get(a).getWeight()) + entity.get(a).getPrice()));
				} else {
					m.get(a).add(b, m.get(a-1).get(b));
				}
			}
		}
	}
	
	public void lookForEnt() {
		m = new ArrayList<>(entity.size());
		generateM();
		ent = new ArrayList<>();
		lookForEnt(entity.size() - 1, maxKnapWeight);
	}
	
	private void lookForEnt(int a, int b) {
		if (m.get(a).get(b) != 0) {
			if (m.get(a-1).get(b).equals(m.get(a).get(b))) {
				lookForEnt(a-1, b);
			} else {
				ent.add(entity.get(a));
				lookForEnt(a - 1, b - entity.get(a).getWeight());
			}
		}
	}
	public List<Entity> ent(){
		return ent;
	}
}
