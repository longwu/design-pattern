package org.me.app.component;

/**
 * 叶子为最底层组件,单个节点,无需实现增加组件的功能
 * 
 * @author JasonWu
 *
 */
public class Leaf extends Component {

	@Override
	public void add(Component c) {
	}

	@Override
	public void remove(Component c) {
	}

	@Override
	public void eachChild() {
		System.out.println(name + "执行了");
	}
}
