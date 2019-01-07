package org.me.app.command2;

public class StopCommand implements Command {

	private AudioPlayer audioPlayer;

	public StopCommand(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	/**
	 * 音乐停止
	 */
	public void execute() {
		this.audioPlayer.stop();
	}
}
