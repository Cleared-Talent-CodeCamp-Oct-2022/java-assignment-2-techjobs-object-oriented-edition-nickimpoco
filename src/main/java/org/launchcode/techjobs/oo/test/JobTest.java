package org.launchcode.techjobs.oo.test;

import org.junit.After;
import org.junit.Before;
import org.launchcode.techjobs.oo.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;




@RunWith(JUnit4.class)
public class JobTest {
   /* public Job someJob, someOtherJob, emptyJob, emptyJobTwo;
    public String someJobString;

    @Before
    public void setUp(){
        someJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        someOtherJob = new Job("Data Scientist", new Employer("Microsoft"),
                new Location("London"), new PositionType("PART_TIME"),
                new CoreCompetency ("PYTHON"));
        emptyJob = new Job();
        emptyJobTwo = new Job();
        someJobString = someJob.toString();
    }*/
    @Test
    public void testSettingJobId(){
        Job emptyJob = new Job();
        Job emptyJobTwo = new Job();
        assertNotEquals(emptyJob, emptyJobTwo);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job someJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals("Product tester", someJob.getName());
        assertEquals("ACME", someJob.getEmployer().getValue());
        assertEquals("Desert", someJob.getLocation().getValue());
        assertEquals("Quality control", someJob.getPositionType().getValue());
        assertEquals("Persistence", someJob.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality(){
        Job someJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Job someOtherJob = new Job("Data Scientist", new Employer("Microsoft"),
                new Location("London"), new PositionType("PART_TIME"),
                new CoreCompetency ("PYTHON"));


        assertTrue(!someJob.equals(someOtherJob));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job someJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String someJobString = someJob.toString();
        assertEquals('\n', someJobString.charAt(0));
        assertEquals('\n', someJobString.charAt(someJobString.length() - 1));
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job someJobTwo =   new Job("Web Developer", new Employer("LaunchCode"),
                new Location("St. Louis"), new PositionType("Front-end developer"),
                new CoreCompetency("JavaScript"));
        String someJobTwoString = someJobTwo.toString();
        String expected =
                "\nID: " +someJobTwo.getId() + "\n" +
                "Name: Web Developer\n" +
                "Employer: LaunchCode\n" +
                "Location: St. Louis\n" +
                "Position Type: Front-end developer\n" +
                "Core Competency: JavaScript\n";
        assertEquals(expected, someJobTwoString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job someJobTwo = new Job("", new Employer(""),
                new Location(""), new PositionType(""),
                new CoreCompetency(""));
        String expected =
                "\nID: " + someJobTwo.getId() +
                "\nName: Data not available" +
                "\nEmployer: Data not available" +
                "\nLocation: Data not available" +
                "\nPosition Type: Data not available" +
                "\nCore Competency: Data not available\n";
        assertEquals(expected,someJobTwo.toString());
    }


    /*@Test
    public void testHeyIsThisArealJob() {
        assertEquals("OOPS! This job only contains data for the id field.", emptyJob.toString());
    }*/
}
