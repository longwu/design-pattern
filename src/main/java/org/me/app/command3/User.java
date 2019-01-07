 package org.me.app.command3;

public class User {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		Command playCommand = new PlayCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		
		MacroCommand commandCollection = new AudioMacroCommand(); 
		
		commandCollection.add(playCommand);
		commandCollection.add(stopCommand);
		commandCollection.add(rewindCommand);
		commandCollection.execute();

		System.out.println("--------------");
		
		commandCollection.remove(stopCommand);
		commandCollection.execute();
	}
}
