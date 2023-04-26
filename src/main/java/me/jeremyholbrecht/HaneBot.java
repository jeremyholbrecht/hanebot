package me.jeremyholbrecht;

import me.jeremyholbrecht.commands.tetsu.TetsuGreeting;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import javax.security.auth.login.LoginException;

public class HaneBot extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {

        // add token here
        JDA haneBot = JDABuilder.createDefault("")
                .setActivity(Activity.playing("Hane Visual Novel"))
                .addEventListeners(
                        new TetsuGreeting()
                )
                .build();
    }
}
