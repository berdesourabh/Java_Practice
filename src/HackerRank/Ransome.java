package HackerRank;

public class Ransome {

	public static void main(String[] args) {

		String[] magazine = "give me one grand today night".split(" ");
		String[] note = "give one grand today".split(" ");

		checkMagazine(magazine, note);
	}

	static void checkMagazine(String[] magazine, String[] note) {
		boolean matched = false;
		for (int i = 0; i < note.length; i++, matched = false) {
			for (int j = 0; j < magazine.length; j++) {
				if (note[i].equals(magazine[j])) {
					magazine[j] = null;
					matched = true;
					break;
				}
				if (!matched) {
					matched = false;
					return;
				}

			}

		}
		if (!matched) {
			System.out.print("No");
		} else
			System.out.print("Yes");
	}

}
