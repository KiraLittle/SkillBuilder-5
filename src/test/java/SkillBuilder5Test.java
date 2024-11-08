import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SkillBuilder5Test {

    @Test
    @DisplayName("Testing playCraps method")
    void playCraps() {
        boolean[] expected = {true, true, false, false, false,
            true, false, false, false, false};
        for (int i=0; i < 10; i++){
            assertEquals(expected[i],SkillBuilder5.playCraps());
        }
    }

    @Test
    @DisplayName("Testing Pascals Triangle")
    void pascalsTriangle() {
        String[]expected = {"","1         \n",
                "     1         \n1         1         \n",
                "          1         \n     1         1         \n1         2         1         \n",
                "               1         \n" +
                        "          1         1         \n" +
                        "     1         2         1         \n" +
                        "1         3         3         1         \n"
        };
        for(int level = 0; level < 5; level++) {
            String actual = SkillBuilder5.pascalsTriangle(level);
            assertEquals(expected[level],actual);
        }
    }
}