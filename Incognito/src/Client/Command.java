package Client;

import java.util.ArrayList;

public class Command {

    private ArrayList<String> commands;

    public Command() {
        getCommands();
    }

    private void getCommands() {
        commands = new ArrayList<>();
        commands.add("help");
        commands.add("scan");
        commands.add("ping");
        commands.add("map");
        commands.add("clear");
        commands.add("report");
        commands.add("exit");
    }

    public boolean isCommand(String command) {
        return commands.contains(command);
    }
}