package at.htlleonding.training03;

class Kicker {
	private String mName;
	private String mClub;
	private Integer mYear;
	private Integer mScore;

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public String getClub() {
		return mClub;
	}

	public void setClub(String club) {
		mClub = club;
	}

	public Integer getYear() {
		return mYear;
	}

	public void setYear(Integer year) {
		mYear = year;
	}

	public Integer getScore() {
		return mScore;
	}

	public void setScore(Integer score) {
		mScore = score;
	}

	// further methods
}

class ClubHeroes {
	private String mClubName;
	private List<String> mKickers = new LinkedList<>();
	private List<Integer> mYears = new LinkedList<>();
	private Integer mTotalScore = 0;

	ClubHeroes(String clubName) {
		mClubName = clubName;
	}

	public Integer getTotalScore() {
		return mTotalScore;
	}

	public Integer getYears() {
		return mYears.size();
	}

	void addKicker(Kicker kicker) {
		// implement if you find that useful
	}

	// further methods
}

public class Main {

	// field members

	// singleton c'tor

	// singleton factory method

	private void readKickers() {
		// read data from Path.of("res/austrian_kicker_awards.csv")
		// into a list (of which type?)
	}

	private void clusterByClubs() {
		// should aggregate awards per club
	}

	private void printYears(int firstYear, int lastYear) {
		System.out.printf("Winners from %d to %d%n", firstYear, lastYear);
		// single line implementation
		System.out.println();
	}
	private void printKickersWithFirstName(String firstName) {
		System.out.printf("Winners called %s%n", firstName);
		// single line implementation
		System.out.println();
	}

	private void countDistinctKickers() {
		// single line implementation
		System.out.printf("%d distinct winners in %d years%n", distinctWinners, mKickers.size());
		System.out.println();
	}

	private void printKickerWithTopScore() {
		System.out.printf("Winners with the highest score:%n");
		// single line implementation
		System.out.println();
	}

	private void printClubsAscending() {
		System.out.printf("Clubs ordered by name:%n");
		// single line implementation
		System.out.println();
	}
	private void printTopClubsByScore(int limit, boolean best) {
		System.out.printf("%s %d clubs:%n", best ? "Top" : "Last", limit);
		// single line implementation spanning probably two lines of ~ 80 chars
		System.out.println();
	}

	public static void main(String[] args) {
		Main app = null; // get singleton instance
		app.readKickers();
		app.clusterByClubs();
		app.printYears(1900, 1980);
		app.printYears(1980, 1999);
		app.printYears(2000, 2100);
		app.printKickersWithFirstName("Herbert");
		app.printKickersWithFirstName("Peter");
		app.countDistinctKickers();
		app.printKickerWithTopScore();
		app.printClubsAscending();
		app.printTopClubsByScore(5, true);
		app.printTopClubsByScore(3, false);
	}
}