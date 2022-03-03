public class BuilderPattern {

	public static void main(String args[]) {
		phoneBuilder phoneBuilder = new phoneBuilder();
		phoneType phoneType1 = phoneBuilder.buildSonyphone();
		phoneType1.showItems();

		phoneType phoneType2 = phoneBuilder.buildSamsungphone();
		phoneType2.showItems();
  }
}
