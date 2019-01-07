package org.me.app.command2;

public class Keyboard {
    private Command playCommand;
    private Command stopCommand;
    private Command rewindCommand;
    
    public void setPlayCommand(Command command){
    	this.playCommand = command;
    }
    
    public void setStopCommand(Command command){
    	this.stopCommand = command;
    }
    
    public void setRewindCommand(Command command){
    	this.rewindCommand = command;
    }
    
    public void play(){
    	this.playCommand.execute();
    }
    
    public void stop(){
    	this.stopCommand.execute();
    }
    
    public void rewind(){
    	this.rewindCommand.execute();
    }
}
