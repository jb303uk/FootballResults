package scores;
import java.util.ArrayList;
import java.util.List;

public class Results {
	static List<String> ResultList = new ArrayList<String>();
	static int PointsTotal = 0;
	
	public static void main(String[] args) {		
		for (String score : args) {
			ResultList.add(score);
		  }
		try{
			PointsTotal = Points.GetTotalPoints(ResultList);
			System.out.println("Input (Results):\t" + ResultList + "\n" + "Output (PointsTotal):\t" + PointsTotal);
		}
		catch (Exception err)
		{
		    System.out.println("Error Found:\n" + err.getMessage());
		}
	}
public void setStringList(List<String> stringList)
	{
		Results.ResultList = stringList;
	}
public List<String> getStringList() 
	{
	    return Results.ResultList;
	}
public int getListCount() 
	{
    	return Results.ResultList.size();
	}
}


