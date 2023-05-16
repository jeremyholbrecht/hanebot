package me.jeremyholbrecht.commands.aoshi;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Random;

public class AoshiPicrew extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentRaw();
            if (messageSent.equals("!aoshi")){
                String userName = event.getAuthor().getAsMention();
                File filePath = new File("C:\\Users\\jere\\Downloads\\aoshi\\aoshi\\");
                File[] files = filePath.listFiles();
                Random random = new Random();
                assert files != null;
                File file = files[random.nextInt(files.length)];
                event.getTextChannel().sendMessage(userName).addFile(file).queue();
            }
        }
    }
}
