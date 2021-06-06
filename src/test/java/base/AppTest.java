package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_total_and_or_tax() {
        App myApp = new App();
        int amount = 10;
        String state = "WI";
        double tax = 0;
        if(state.equals("WI")){
            tax = .55;
            double total = amount + tax;
            System.out.println("The tax is $0.55.");
            String expectedOutput = "The total is $10.55.";
            String actualOutput = myApp.generateOutputString(total);
            assertEquals(expectedOutput, actualOutput);
        }else{
            double total = amount + tax;
            String expectedOutput = "The total is 10.";
            String actualOutput = myApp.generateOutputString(total);
            assertEquals(expectedOutput, actualOutput);
        }
    }
}