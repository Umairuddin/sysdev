import java.util.ArrayList;
import java.util.List;

public class phoneType {

	private List<Packing> items = new ArrayList<Packing>();

	// packs = brand of the phone
	public void addItem(Packing packs) {
		items.add(packs);
	}

	// getter for cost
	public void getCost() {
		for (Packing packs : items) {
		packs.price();
		}
	}

	// Output
	public void showItems() {
		for (Packing packing : items) {
		System.out.print("Phone name : " + packing.pack());
		System.out.println(", Price : $" + packing.price());
		}
    }
}
