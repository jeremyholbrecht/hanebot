package me.jeremyholbrecht.commands.chiho;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class ChihoGreeting extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentRaw();
            if (messageSent.equals("!chihoHello")){
                String userName = event.getAuthor().getAsMention();
                event.getTextChannel().sendMessage(userName +
                        "\n Chiho blushes it's not like i'm glad to see you baka").queue();
            }
        }
    }
}
