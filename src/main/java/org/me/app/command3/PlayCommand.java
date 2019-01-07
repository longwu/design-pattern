package org.me.app.command3;

public class PlayCommand implements Command {
	private AudioPlayer audioPlayer;

	public PlayCommand(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	// 播放命令执行播放器中的播放方法
	public void execute() {
       this.audioPlayer.play();
	}
}
