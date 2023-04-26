package me.jeremyholbrecht.commands.aoshi;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class AoshiGreeting extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentRaw();
            if (messageSent.equals("!aoshiHello")){
                String userName = event.getAuthor().getAsMention();
                event.getTextChannel().sendMessage(userName +
                        "\n Aoshi looks at you menacingly and grabs a knife").queue();
            }
        }
    }
}
