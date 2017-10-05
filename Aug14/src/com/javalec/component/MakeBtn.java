package com.javalec.component;

import java.awt.Button;
import java.awt.Frame;

public class MakeBtn extends Frame {//Frame 상속 받는다.
	public MakeBtn() {
		Button btn = new Button("Click me");
		add(btn);//Frame에 붙인다.
	}
}
