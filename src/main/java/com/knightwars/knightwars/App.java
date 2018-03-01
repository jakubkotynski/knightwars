package com.knightwars.knightwars;

import com.knightwars.knightwars.domain.Knight;
import com.knightwars.knightwars.domain.Quest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Quest goblins = new Quest("Zabij gobliny");

        Knight lancelot = new Knight("Lancelot", 100, 15, 20, goblins);

    }
}
