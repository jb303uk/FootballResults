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
	int myScore = 0;
	int theirScore = 0;
	String firstTeam = null;
	String secondTeam = null;
	String HomeOrAway = null;
	
	String[] ResultString = Result.split("-");
	firstTeam = ResultString[0];
	secondTeam = ResultString[1];

	secondTeam = secondTeam.substring(0,secondTeam.length()-1);  //Order of scores indicates result ??
	HomeOrAway = Result.substring(Result.length() - 1);
	
	switch (HomeOrAway) {
    case ("H"): 
		myScore = Integer.parseInt(secondTeam);
		theirScore = Integer.parseInt(firstTeam);
		break;   
    case ("A"):
		myScore = Integer.parseInt(firstTeam);
		theirScore = Integer.parseInt(secondTeam);
		break;	
    default: GamePoints = 0;
	}
	
	if (myScore < theirScore) {
		GamePoints = 3;
	}
	else if (myScore == theirScore){
		GamePoints = 1;
	}
	
	System.out.println("From:" + Result);
	System.out.println("RCDTS Points:" + GamePoints);
	System.out.println("=====================================");
	return GamePoints;
}
}
