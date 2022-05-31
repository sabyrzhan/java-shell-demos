package kz.sabyrzhan.springshell.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UsersRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ObjectMapper objectMapper;


    public String fetchUsers() throws Exception {
        var list = jdbcTemplate.query("select * from users limit 10", (rs, rowNum) -> {
            Map<Object, Object> data = new HashMap<>();
            data.put("id", rs.getString("id"));
            data.put("name", rs.getString("name"));
            data.put("surname", rs.getString("surname"));

            return data;
        });

        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
    }
}
