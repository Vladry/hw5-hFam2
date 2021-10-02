package hw5.Family;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class FamilyAddChildrenTest {
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
    public void testAddChildSuccess() {
        Human newChild = new Human("test", "test", 2010);
        int initialCount = module.getChildren().length;
        module.addChild(newChild);
        int finalCount = module.getChildren().length;
        Human addedChild = module.getChildren()[initialCount];
        boolean isAdded = (initialCount == finalCount - 1);
        boolean isEqual = addedChild.equals(newChild);
        assertTrue(isAdded && isEqual);
    }

}


