package org.launchcode.techjobs_oo.Tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {
//    Job job1 = new Job();
//    Job job2 = new Job();
//    Job job3 = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    Job job4  = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;

    @Before
    public void createJobs(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job ("Software Developer",null,null,null,null);

    }

    @Test
    public void testSettingJobId(){
//        System.out.println(job1.getId()+" "+job2.getId()+" "+job3.getId()+" "+job4.getId());
        Assert.assertTrue(job1.getId()+1 == job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
//        System.out.println(job1.getId()+" "+job2.getId()+" "+job3.getId()+" "+job4.getId());
        Assert.assertEquals(job3.getName(),"Product tester");
        Assert.assertTrue(job3.getEmployer() instanceof Employer);
        Assert.assertEquals(job3.getEmployer().getValue(),"ACME");
        Assert.assertTrue(job3.getLocation() instanceof Location);
        Assert.assertEquals(job3.getLocation().getValue(),"Desert");
        Assert.assertTrue(job3.getPositionType() instanceof PositionType);
        Assert.assertEquals(job3.getPositionType().getValue(),"Quality control");
        Assert.assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals(job3.getCoreCompetency().getValue(),"Persistence");
    }

    @Test
    public void testJobsForEquality(){
//        System.out.println(job1.getId()+" "+job2.getId()+" "+job3.getId()+" "+job4.getId());
        Assert.assertFalse(job3.equals(job4));
    }

    @Test
    public void testToString(){
//        System.out.println(job1.getId()+" "+job2.getId()+" "+job3.getId()+" "+job4.getId());
        Assert.assertEquals(job1.toString(),"OOPS! This job does not seem to exist.");
    }

    @Test
    public void testToString2(){
//        System.out.println(job1.getId()+" "+job2.getId()+" "+job3.getId()+" "+job4.getId());
        Assert.assertEquals(job3.toString(),"\n" +
                "ID: "+18+"\n"+
                "Name: "+"Product tester"+"\n"+
                "Employer: "+"ACME"+"\n"+
                "Location: "+"Desert"+"\n"+
                "Position Type: "+"Quality control"+"\n"+
                "Core Competency: "+"Persistence"+"\n"+
                "\n");
    }

    @Test
    public void testToString3(){
        Assert.assertEquals(job5.toString(),"\n" +
                "ID: "+25+"\n"+
                "Name: "+"Software Developer"+"\n"+
                "Employer: "+"Data not available"+"\n"+
                "Location: "+"Data not available"+"\n"+
                "Position Type: "+"Data not available"+"\n"+
                "Core Competency: "+"Data not available"+"\n"+
                "\n");
    }


}
