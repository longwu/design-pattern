package org.me.app.command3;

import java.util.ArrayList;
import java.util.List;

public class AudioMacroCommand implements MacroCommand {

	private List<Command> commands = new ArrayList<Command>();

	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

	public void add(Command command) {
		commands.add(command);
	}

	public void remove(Command command) {
		if (commands.contains(command))
			commands.remove(command);
	}
}
