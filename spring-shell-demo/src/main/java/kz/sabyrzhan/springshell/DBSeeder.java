package kz.sabyrzhan.springshell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @EventListener
    public void seedDB(ContextRefreshedEvent event) {
        var list = jdbcTemplate.queryForList("select * from users");
        if (!list.isEmpty()) {
            return;
        }

        String[] inserts = new String[] {
                "insert into users(name,surname) values('Test1', 'User1')",
                "insert into users(name,surname) values('Test2', 'User2')",
                "insert into users(name,surname) values('Test3', 'User3')"
        };
        jdbcTemplate.batchUpdate(inserts);
    }
}
