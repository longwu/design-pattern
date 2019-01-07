package org.me.app.command3;

public class RewindCommand implements Command {

	private AudioPlayer audioPlayer;

	public RewindCommand(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	/**
	 * 音乐倒带
	 */
	public void execute() {
		this.audioPlayer.rewind();
	}
}
