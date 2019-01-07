 package org.me.app.command2;

public class User {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		Command playCommand = new PlayCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		
		Keyboard keyboard = new Keyboard();
		keyboard.setPlayCommand(playCommand);
		keyboard.setStopCommand(stopCommand);
		keyboard.setRewindCommand(rewindCommand);
		
		keyboard.play();
		keyboard.stop();
		keyboard.rewind();
	}
}
