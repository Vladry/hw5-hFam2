package hw5.Family;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

public class FamilyDeleteChildTest1 {
    Family module;
    Human kid1, kid2,kid3,kid4,kid5,kid6;
    String[][] schedule = new String[7][2];

    @Before
    public void setUp() {
        schedule[0][0] = DayOfWeek.SUNDAY.name().toLowerCase();
        schedule[0][0] = "First day born";
        schedule[1][0] = DayOfWeek.MONDAY.name().toLowerCase();
        schedule[1][0] = "Second day born";
        module = new Family(new Human("Mother", "Ryab", 1960),
                new Human("Father", "Ryab", 1960)
        );
        kid1 = new Human("Kid1", "Kidovich1", 2000,
                1, schedule, module);
        kid2 = new Human("Kid2", "Kidovich2", 2000,
                2, schedule, module);
        kid3 = new Human("Kid3", "Kidovich3", 2000,
                3, schedule, module);
        kid4 = new Human("Kid4", "Kidovich4", 2000,
                4, schedule, module);
        kid5 = new Human("Kid5", "Kidovich5", 2000,
                5, schedule, module);
        kid6 = new Human("Kid6", "Kidovich6", 2000,
                6, schedule, module);
        module.setChildren(kid1);
        module.setChildren(kid2);
        module.setChildren(kid3);
        module.setChildren(kid4);
        module.setChildren(kid5);
        module.setChildren(kid6);
    }

    @Test
    public void testDeleteChild() {
        System.out.println(Arrays.toString(module.getChildren()));
        boolean isDeleted = module.deleteChild(2);
        Human[] freshChildren = module.getChildren();
        boolean remainedFirstElem = freshChildren[0].getName().equals("Kid1");
        boolean secondElemDeleted = freshChildren[1] == null;
        boolean testResult = isDeleted && remainedFirstElem && secondElemDeleted;
        System.out.println(Arrays.toString(module.getChildren()));
        assertTrue(testResult);
    }

}
