package me.jeremyholbrecht.commands.tetsu;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class TetsuGreeting extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentRaw();
            if (messageSent.equals("!tetsuHello")){
                String userName = event.getAuthor().getAsMention();
                event.getTextChannel().sendMessage(userName +
                        "\n Tetsu is glad to see you and waves at you").queue();
            }
        }
    }
}
