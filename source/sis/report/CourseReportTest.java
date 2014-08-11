package sis.report;

import junit.framework.TestCase;
import java.util.*;
import sis.studentinfo.*;
import static sis.report.ReportConstant.NEWLINE;

public class CourseReportTest extends TestCase{
	public void testReport() {
		final Date date = new Date();
		CourseReport report = new CourseReport();
		report.add(CourseSession.create("ENGL", "101", date));
		report.add(CourseSession.create("CZEC", "200", date));
		report.add(CourseSession.create("ITAL", "410", date));
		
		assertEquals(
			"ENGL 101" + NEWLINE +
			"CZEC 300" + NEWLINE +
			"ITAL 410" + NEWLINE, report.text());
	}
}