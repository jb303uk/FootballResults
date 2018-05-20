package scores;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class ResultsTest {

@Test
public void ScoresCount()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("4-1H");
		testScoresData.add("1-1H");
		testScoresData.add("3-1A");
		testScoresData.add("0-0H");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(4,jbScores.getListCount());

	}
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
public void HomeDefeatPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("1-2H");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(0,Points.GetTotalPoints(testScoresData));

	}
@Test
public void AwayDefeatPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("2-1A");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(0,Points.GetTotalPoints(testScoresData));

	}
@Test
public void AwayWinPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("1-2A");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(3,Points.GetTotalPoints(testScoresData));

	}
@Test
public void AwayDrawPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("1-1A");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(1,Points.GetTotalPoints(testScoresData));

	}
@Test
public void HomeDrawPointsCheck()
{
		List<String> testScoresData = new ArrayList<String>();
		testScoresData.add("1-1H");
		
		Results jbScores = new Results();
		jbScores.setStringList(testScoresData);
		assertEquals(1,Points.GetTotalPoints(testScoresData));

	}
@Test
public void InvalidScoreCheck() {
    	List<String> testScoresData = new ArrayList<String>();
    	testScoresData.add("A-1H");	
    	Results jbScores = new Results();
    	jbScores.setStringList(testScoresData);	
    try {
    	Points.GetTotalPoints(testScoresData);
        fail("Expected NumberFormatException error but none detected");
    } catch (NumberFormatException e) {
        // Exception not handled to pass JUnit test
    }  	
}
@Test
public void InvalidHomeOrAwayIdentifier() {
    	List<String> testScoresData = new ArrayList<String>();
    	testScoresData.add("1-1");	
    	Results jbScores = new Results();
    	jbScores.setStringList(testScoresData);	
    try {
    	Points.GetTotalPoints(testScoresData);
        fail("Expected RuntimeException error but none detected");
    } catch (RuntimeException e) {
        // Exception not handled to pass JUnit test
    }  	
}
@Test
public void InvalidScoreArrayIdentifier() {
    	List<String> testScoresData = new ArrayList<String>();
    	testScoresData.add("1_1H");	
    	Results jbScores = new Results();
    	jbScores.setStringList(testScoresData);	
    try {
    	Points.GetTotalPoints(testScoresData);
        fail("Expected ArrayIndexOutOfBoundsException error but none detected");
    } catch (ArrayIndexOutOfBoundsException e) {
        // Exception not handled to pass JUnit test
    }  	
}

}
