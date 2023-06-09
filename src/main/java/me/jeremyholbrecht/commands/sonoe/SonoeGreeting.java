package me.jeremyholbrecht.commands.sonoe;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class SonoeGreeting extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentRaw();
            if (messageSent.equals("!sonoeHello")){
                String userName = event.getAuthor().getAsMention();
                event.getTextChannel().sendMessage(userName +
                        "\n Sonoe is glad to see you and give you a hug").queue();
            }
        }
    }
}
