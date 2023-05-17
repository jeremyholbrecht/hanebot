package me.jeremyholbrecht.commands.haruki;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Random;

public class HarukiPicrew extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentRaw();
            if (messageSent.equals("!haruki")){
                String userName = event.getAuthor().getAsMention();
                File filepath = new File("C:\\Users\\jere\\Downloads\\haruki\\haruki\\");
                File[] files = filepath.listFiles();
                assert files != null;
                Random random = new Random();
                File file = files[random.nextInt(files.length)];
                event.getTextChannel().sendMessage(userName).addFile(file).queue();
            }
        }
    }
}
