package scores;

public class Result {
	static int HomeScore = 0;
	static int AwayScore = 0;
	static int Points = 0;
	public Result(int myScore, int theirScore, int pointsGiven) {
		HomeScore = myScore;
		AwayScore = theirScore;
		Points = pointsGiven;
	}
}
