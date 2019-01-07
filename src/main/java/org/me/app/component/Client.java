package org.me.app.component;

public class Client {

	public static void main(String[] args) {
		Component root = new Composite();
        root.name = "根节点";
        
        Component leftBranch = new Composite();
        leftBranch.name = "左分支";
        
        Component rightBranch = new Composite();
        rightBranch.name = "右分支";
        
        Component leafOne = new Leaf();
        leafOne.name = "叶子1";
        
        Component leafTwo = new Leaf();
        leafTwo.name = "叶子2";
        
        leftBranch.add(leafOne);
        rightBranch.add(leafTwo);
        
        root.add(leftBranch);
        root.add(rightBranch);
        
        root.eachChild();
	}
}
