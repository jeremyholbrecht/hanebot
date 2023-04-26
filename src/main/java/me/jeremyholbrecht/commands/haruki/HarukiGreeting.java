package me.jeremyholbrecht.commands.haruki;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class HarukiGreeting extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentRaw();
            if (messageSent.equals("!harukiHello")){
                String userName = event.getAuthor().getAsMention();
                event.getTextChannel().sendMessage(userName +
                        "\n Haruki looks at you with an alure of superiority and nods").queue();
            }
        }
    }
}
