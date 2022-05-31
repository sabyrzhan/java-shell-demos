package kz.sabyrzhan.springshell;

import kz.sabyrzhan.springshell.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
@RequiredArgsConstructor
public class DbCommands {
    private final UsersRepository usersRepository;

    @ShellMethod("Fetches users")
    public String fetchUsers() throws Exception {
        return usersRepository.fetchUsers();
    }

    @ShellMethod("Just says hello with parameter")
    public String hello(@ShellOption(help = "Some text") String text) {
        return "Hello " + text;
    }
}
