package com.market.main;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
	
	static JPanel mMenupanel, mPagePanel;
	
	public MainWindow(String title, int x, int y, int width, int height) {
		
		initContainer(title, x, y, width, height);
		
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./images/shop.png").getImage());
	}
	
	private void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height);
		setLayout(null);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750) / 2);
		mMenupanel = new JPanel();
		mMenupanel.setBounds(0, 20, width, 130);
		menuIntroduction();
		add(mMenupanel);
		
		mMenupanel = new JPanel();
		mMenupanel.setBounds(0, 150, width, height);
		add(mMenupanel);
	}
	
	private void menuIntroduction() {
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15);
		
		JButton bt1 = new JButton("고객 정보 확인하기",
				new ImageIcon("./images/1.png"));
		bt1.setBounds(0, 0, 100, 50);
		bt1.setFont(ft);
		mMenupanel.add(bt1);

		JButton bt2 = new JButton("장바구니 상품 목록 보기",
				new ImageIcon("./images/2.png"));
		bt1.setBounds(0, 0, 100, 30);
		bt1.setFont(ft);
		mMenupanel.add(bt2);
		
		JButton bt3 = new JButton("장바구니 비우기",
				new ImageIcon("./images/3.png"));
		bt1.setBounds(0, 0, 100, 30);
		bt1.setFont(ft);
		mMenupanel.add(bt3);
	}
}
