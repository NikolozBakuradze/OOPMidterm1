import java.util.ArrayList;
import java.util.List;
public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName = "Claude"; // Set your name here

    @Override
    public String getSoftware1() {
        return "Software 1 Implementation";
    }

    @Override
    public String getInvestment2() {
        return "Investment 2 Implementation";
    }

    @Override
    public String methodMinivan3(String argBubble5) {
        if (argBubble5 == null) {
            argBubble5 = "Default Bubble";
        }
        return "Minivan Method Implementation: " + argBubble5;
    }

    @Override
    public List<String> methodGuitar4(String argFish6) {
        List<String> result = new ArrayList<>();
        result.add("Guitar Method Implementation");
        if (argFish6 != null) {
            result.add(argFish6);
        } else {
            result.add("Default Fish");
        }
        return result;
    }

    @Override
    public String toString() {
        return "Fantasy{" +
                "studentName='" + studentName + '\'' +
                '}';
    }
}