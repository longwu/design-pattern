package org.me.app.builder2;

import java.util.Date;

/**
 * 创建者,负责创建消息
 * @author JasonWu
 *
 */
public abstract class Builder {
    protected AutoMessage msg = null;
    
    public void buildTo(String to) {
    	this.msg.setTo(to);
    }
    
    public void buildFrom(String from) {
    	this.msg.setFrom(from);
    }
    
    protected abstract void buildSubject();
    
    protected abstract void buildBody();
    
    public void buildSendDate(Date date) {
    	this.msg.setSendDate(date);
    }
    
    public void sendMessage() {
    	this.msg.send();
    }
}
