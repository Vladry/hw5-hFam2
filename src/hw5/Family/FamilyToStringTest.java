package hw5.Family;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
//import org.junit.Assert;

public class FamilyToStringTest {
    Family module;
    Human kid1, kid2;
    String[][] schedule = new String[7][2];


    @Before
    public void setUp() {
        schedule[0][0] = DayOfWeek.SUNDAY.name().toLowerCase();
        schedule[0][1] = "First day born";
        schedule[1][0] = DayOfWeek.MONDAY.name().toLowerCase();
        schedule[1][1] = "Second day born";
        module = new Family(new Human("Mother", "Ryab", 1960),
                new Human("Father", "Ryab", 1960)
        );
        kid1 = new Human("Kid1", "Kidovich1", 2000,
                1, schedule, module);
        kid2 = new Human("Kid2", "Kidovich2", 2000,
                2, schedule, module);
        module.setChildren(kid1);
        module.setChildren(kid2);
    }

    @Test
    public void testToStringSuccess() {
        String substr1 = module.getChildren()[0].toString();
        String substr2 = module.getChildren()[1].toString();
        boolean k1 = substr1.contains("Kid1")
                && substr1.contains("Kidovich1")
                && substr1.contains("2000")
                && substr1.contains("First day born");
        boolean k2 = substr2.contains("Kid2")
                && substr2.contains("Kidovich2")
                && substr2.contains("2000")
                && substr2.contains("Second day born");
        boolean kidTestPass = k1 && k2;
        boolean motherTestPass = module.toString().contains("Mother");
        boolean fatherTestPass = module.toString().contains("Father");
        boolean parentsToStringPass = motherTestPass && fatherTestPass;

        assertTrue(kidTestPass && parentsToStringPass);

    }
    @Test
    public void testToStringFailingChildrenArray() {
        String substr1 = module.getChildren()[0].toString();
        String substr2 = module.getChildren()[1].toString();
        boolean k1 = substr1.contains("blablabla")
                && substr1.contains("Kidovich1")
                && substr1.contains("2000")
                && substr1.contains("First day born");
        boolean k2 = substr2.contains("Kid2")
                && substr2.contains("Kidovich2")
                && substr2.contains("2000")
                && substr2.contains("Second day born");
        boolean kidTestPass = k1 && k2;
        boolean motherTestPass = module.toString().contains("Mother");
        boolean fatherTestPass = module.toString().contains("Father");
        boolean parentsToStringPass = motherTestPass && fatherTestPass;

        assertTrue(kidTestPass && parentsToStringPass);
    }

    @Test
    public void testToStringFailingMotherField() {
        String substr1 = module.getChildren()[0].toString();
        String substr2 = module.getChildren()[1].toString();
        boolean k1 = substr1.contains("Kid1")
                && substr1.contains("Kidovich1")
                && substr1.contains("2000")
                && substr1.contains("First day born");
        boolean k2 = substr2.contains("Kid2")
                && substr2.contains("Kidovich2")
                && substr2.contains("2000")
                && substr2.contains("Second day born");
        boolean kidTestPass = k1 && k2;
        boolean motherTestPass = module.toString().contains("blablabla");
        boolean fatherTestPass = module.toString().contains("Father");
        boolean parentsToStringPass = motherTestPass && fatherTestPass;

        assertTrue(kidTestPass && parentsToStringPass);
    }
}
