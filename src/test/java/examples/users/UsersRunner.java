package examples.users;

import com.intuit.karate.junit5.Karate;

class UsersRunner {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("classpath:examples/cydeo/firstKarate.feature").tags("@wip").relativeTo(getClass());
    }

}