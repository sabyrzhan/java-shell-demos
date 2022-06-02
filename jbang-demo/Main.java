//DEPS org.apache.commons:commons-lang3:3.12.0
//DEPS com.google.guava:guava:31.1-jre
//SOURCES User.java

import org.apache.commons.lang3.StringUtils;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.isBlank("   "));
        var map = ImmutableMap.builder()
                                .put("key1", "value1")
                                .put("key2", "value2")
                                .build();
        System.out.println(map);
        var user = new User();
        user.id = 1;
        user.firstName = "Firstname";
        user.lastName = "Lastname";
        System.out.println("User: " + user);
    }
}
