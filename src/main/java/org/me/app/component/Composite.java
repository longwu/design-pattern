package org.me.app.component;

import java.util.List;
import java.util.ArrayList;

/**
 * 组合节点,组件的集合,表示层次关系的枝干节点
 * 
 * @author JasonWu
 *
 */
public class Composite extends Component {

	private List<Component> list = new ArrayList<Component>();

	@Override
	public void add(Component c) {
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		if (list.contains(c))
			list.remove(c);
	}

	/**
	 * 深度优先递归 将Component里面所有节点遍历出来
	 */
	@Override
	public void eachChild() {
		System.out.println(name + "执行了");
		for (Component c : list) {
			c.eachChild();
		}
	}
}
