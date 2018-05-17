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
}
