package scores;

import java.util.ArrayList;
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

public static String GetBestResult(List<String> Results)
{
	String BestResult = null;
	Result resultBean;
	List<Result> resultBeanList = new ArrayList<Result>();
	
	for (String resultString : Results) {
		resultBean = returnResultBeanFromString(resultString);
		resultBeanList.add(resultBean);
	  }
	return BestResult;
	
}

private static int GetGamePoints(String Result){
	int GamePoints = 0;
	int myScore = 0;
	int theirScore = 0;
	int bonusPoint = 0;
	String firstTeam = null;
	String secondTeam = null;
	String HomeOrAway = null;
	int totPoints = 0;
	
	String[] ResultString = Result.split("-");
		try	{
			firstTeam = ResultString[0];
			secondTeam = ResultString[1];
			}
		catch (ArrayIndexOutOfBoundsException err)
		{
			throw new ArrayIndexOutOfBoundsException("Please use format such as '1-1A' as program arguments.");
		}
		secondTeam = secondTeam.substring(0,secondTeam.length()-1);
		HomeOrAway = Result.substring(Result.length() - 1);

try{	
	if (HomeOrAway.equalsIgnoreCase("H")) {
		myScore =  Integer.parseInt(firstTeam);
		theirScore = Integer.parseInt(secondTeam);
	}
	if (HomeOrAway.equalsIgnoreCase("A")) {
		myScore = Integer.parseInt(secondTeam);
		theirScore = Integer.parseInt(firstTeam);
	}
	if (!HomeOrAway.equalsIgnoreCase("A") && !HomeOrAway.equalsIgnoreCase("H")) {
		throw new RuntimeException("Unable to find if game is Home or Away");
	}
}
catch (NumberFormatException err)
{
	throw new NumberFormatException("Unable to convert score to Number");
}



	if (myScore > theirScore) {
		GamePoints = 3;
	}
	else if (myScore == theirScore){
		GamePoints = 1;
	}
	
	if(myScore > 2){bonusPoint=1;}
	
	totPoints = GamePoints+bonusPoint;
	
	return totPoints;
}

private static Result returnResultBeanFromString(String Result){
	int GamePoints = 0;
	int myScore = 0;
	int theirScore = 0;
	int bonusPoint = 0;
	String firstTeam = null;
	String secondTeam = null;
	String HomeOrAway = null;
	int totPoints = 0;
	
	String[] ResultString = Result.split("-");
		try	{
			firstTeam = ResultString[0];
			secondTeam = ResultString[1];
			}
		catch (ArrayIndexOutOfBoundsException err)
		{
			throw new ArrayIndexOutOfBoundsException("Please use format such as '1-1A' as program arguments.");
		}
		secondTeam = secondTeam.substring(0,secondTeam.length()-1);
		HomeOrAway = Result.substring(Result.length() - 1);

try{	
	if (HomeOrAway.equalsIgnoreCase("H")) {
		myScore =  Integer.parseInt(firstTeam);
		theirScore = Integer.parseInt(secondTeam);
	}
	if (HomeOrAway.equalsIgnoreCase("A")) {
		myScore = Integer.parseInt(secondTeam);
		theirScore = Integer.parseInt(firstTeam);
	}
	if (!HomeOrAway.equalsIgnoreCase("A") && !HomeOrAway.equalsIgnoreCase("H")) {
		throw new RuntimeException("Unable to find if game is Home or Away");
	}
}
catch (NumberFormatException err)
{
	throw new NumberFormatException("Unable to convert score to Number");
}



	if (myScore > theirScore) {
		GamePoints = 3;
	}
	else if (myScore == theirScore){
		GamePoints = 1;
	}
	
	if(myScore > 2){bonusPoint=1;}
	
	totPoints = GamePoints+bonusPoint;
	
	Result x = new Result(myScore, theirScore, totPoints);
	return x;
}
}
