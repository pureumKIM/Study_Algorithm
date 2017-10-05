package com.javalec.component.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeFrame extends Frame implements ActionListener{
	private List list;
	private Panel panel;
	private TextField textField;
	private Button okBtn;
	private Button exitBtn;
	
	public MakeFrame() {
		// TODO Auto-generated constructor stub
		list = new List();
		panel = new Panel();//패널은 아래 요소를 붙이려고
		textField = new TextField(20);
		okBtn = new Button("OK");
		exitBtn = new Button("EXIT");
		
		setLayout(new BorderLayout());//일단 크게 BorderLayout으로 잡고
		add(panel, BorderLayout.NORTH);//위쪽에 패널을
		add(list, BorderLayout.CENTER);//중앙에 리스트를 붙인다.
		
		panel.add(new Label("write"));
		panel.add(textField);
		panel.add(okBtn);
		panel.add(exitBtn);
		
		okBtn.addActionListener(this);//나 자신을 가르킴, actionPerformed을 자동으로 찾음
		exitBtn.addActionListener(this);
		}
	
	
	
	//이벤트 발생시, 그것이 매개변수가 되면서 이벤트 발생
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == okBtn){
			list.add(textField.getText());
		}else if(e.getSource() == exitBtn){
			setVisible(false);
			dispose();
			System.exit(0);
		}
		
	}

}
