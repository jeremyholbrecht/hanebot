package me.jeremyholbrecht;

import me.jeremyholbrecht.commands.aoshi.AoshiGreeting;
import me.jeremyholbrecht.commands.aoshi.AoshiPicrew;
import me.jeremyholbrecht.commands.chiho.ChihoGreeting;
import me.jeremyholbrecht.commands.chiho.ChihoPicrew;
import me.jeremyholbrecht.commands.haruki.HarukiGreeting;
import me.jeremyholbrecht.commands.haruki.HarukiPicrew;
import me.jeremyholbrecht.commands.sonoe.SonoeGreeting;
import me.jeremyholbrecht.commands.sonoe.SonoePicrew;
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
                        new AoshiGreeting(),
                        new AoshiPicrew(),
                        new ChihoGreeting(),
                        new ChihoPicrew(),
                        new HarukiGreeting(),
                        new HarukiPicrew(),
                        new SonoeGreeting(),
                        new SonoePicrew(),
                        new TetsuGreeting()
                )
                .build();
    }
}
