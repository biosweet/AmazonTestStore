package navbar;

import Base.Base;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchDropdownItems extends Base {

    @Test
    public void testDropdownMenu() throws InterruptedException {
        homePage.selectFromDropDown("Amazon Devices");
        Thread.sleep(1000);
        List<String> selectedOptions = homePage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect message");
        assertTrue(selectedOptions.contains("Amazon Devices"), "Incorrect selection");
        System.out.println(selectedOptions.size());
        System.out.println(selectedOptions);
        List<String> allOptions = homePage.getAllOptions();
        System.out.println(allOptions);
        System.out.println(homePage.getAllOptions().size());
    }
}
