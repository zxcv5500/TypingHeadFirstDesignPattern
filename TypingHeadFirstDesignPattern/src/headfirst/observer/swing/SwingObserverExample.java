package headfirst.observer.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;

	public static void main(String[] args) {
		SwingObserverExample swingObserverExample = new SwingObserverExample();
		swingObserverExample.go();
		
	}

	public void go() {
		frame = new JFrame();
		JButton button = new JButton("정말 해도 될까?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		// 프레임 속성 설정
		frame.setSize(200, 200);
		frame.setVisible(true);
		
	}
	
	class AngelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("안 돼. 분명 나중에 후회할거야");
		}
		
	}
	
	class DevilListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("당연하지 저질러 버려!");
		}
		
	}

}
