package me.jeremyholbrecht;

import me.jeremyholbrecht.commands.aoshi.AoshiGreeting;
import me.jeremyholbrecht.commands.aoshi.AoshiPicrew;
import me.jeremyholbrecht.commands.chiho.ChihoGreeting;
import me.jeremyholbrecht.commands.haruki.HarukiGreeting;
import me.jeremyholbrecht.commands.sonoe.SonoeGreeting;
import me.jeremyholbrecht.commands.tetsu.TetsuGreeting;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import javax.security.auth.login.LoginException;

public class HaneBot extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {

        // add token here
        JDA haneBot = JDABuilder.createDefault("MTEwMDQ4Nzg0MDI4NDAyNDkxMw.GvEqJd.fnkg2KvM_-d7otbTKssNIV-xjQFFfanspkYzq0")
                .setActivity(Activity.playing("Hane Visual Novel"))
                .addEventListeners(
                        new AoshiGreeting(),
                        new AoshiPicrew(),
                        new ChihoGreeting(),
                        new HarukiGreeting(),
                        new SonoeGreeting(),
                        new TetsuGreeting()
                )
                .build();
    }
}
