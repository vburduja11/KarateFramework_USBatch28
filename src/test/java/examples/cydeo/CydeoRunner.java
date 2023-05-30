package examples.cydeo;

import com.intuit.karate.junit5.Karate;

public class CydeoRunner {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("firstKarate").tags("wip").relativeTo(getClass());
    }
}
