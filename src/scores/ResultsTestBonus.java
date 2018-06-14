package scores;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class ResultsTestBonus {


@Test
public void HomeWinPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("2-1H");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(3,Points.GetTotalPoints(testScoresData));

	}
@Test
public void HomeBigWinPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("4-1H");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(4,Points.GetTotalPoints(testScoresData));

	}


@Test
public void BigDrawPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("4-4H");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(2,Points.GetTotalPoints(testScoresData));

	}
@Test
public void BigScoreDefeatPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("6-3A");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(1,Points.GetTotalPoints(testScoresData));

	}
@Test
public void BigDefeatPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("6-0A");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(0,Points.GetTotalPoints(testScoresData));

	}

}