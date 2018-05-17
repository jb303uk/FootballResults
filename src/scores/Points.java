package scores;

import java.util.List;


public class Points {
public static int GetTotalPoints(List<String> Results)
{
	int TotalPoints = 0;
	for (String Result : Results) {
		TotalPoints += GetGamePoints(Result);
	  }
	return TotalPoints;
	
}
private static int GetGamePoints(String Result){
	int GamePoints = 0;
	int HomeScore = 0;
	int AwayScore = 0;
	String HomeScoreString = null;
	String AwayScoreString = null;
	String HomeOrAway = null;
	
	String[] ResultString = Result.split("-");
	HomeScoreString = ResultString[0];
	AwayScoreString = ResultString[1];

	AwayScoreString = AwayScoreString.substring(0,AwayScoreString.length()-1);  //Order of scores indicates result ??
	HomeOrAway = "H";

	System.out.println("HomeScoreString:" + HomeScoreString);
	System.out.println("AwayScoreString:" + AwayScoreString);
	
	HomeScore = Integer.parseInt(HomeScoreString);
	AwayScore = Integer.parseInt(AwayScoreString);

	if (HomeScore < AwayScore) GamePoints = 3;
	
	switch (HomeOrAway) {
    case ("H"):  GamePoints += 1;
             break;     
    default: GamePoints = 0;
             break;
}
	return GamePoints;
}
}
