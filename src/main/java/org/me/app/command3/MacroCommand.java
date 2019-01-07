package org.me.app.command3;

/**
 * 扩展接口
 * 
 * @author JasonWu
 *
 */
public interface MacroCommand extends Command {
	void add(Command command);

	void remove(Command command);
}
