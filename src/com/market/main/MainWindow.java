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
		add(mPagePanel);
	}
	
	private void menuIntroduction() {
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15);

		JButton bt1 = new JButton("고객 정보 확인하기", new ImageIcon("./images/1.png"));
		bt1.setBounds(0, 0, 100, 50);
		bt1.setFont(ft);
		mMenupanel.add(bt1);

		JButton bt2 = new JButton("장바구니 상품 목록 보기", new ImageIcon("./images/2.png"));
		bt2.setBounds(0, 0, 100, 30);
		bt2.setFont(ft);
		mMenupanel.add(bt2);

		JButton bt3 = new JButton("장바구니 비우기", new ImageIcon("./images/3.png"));
		bt3.setBounds(0, 0, 100, 30);
		bt3.setFont(ft);
		mMenupanel.add(bt3);

		JButton bt4 = new JButton("장바구니에 항목 추가하기", new ImageIcon("./images/4.png"));
		bt4.setFont(ft);
		mMenupanel.add(bt4);

		JButton bt5 = new JButton("장바구니의 항목 수량 줄이기", new ImageIcon("./images/5.png"));
		bt5.setFont(ft);
		mMenupanel.add(bt5);

		JButton bt6 = new JButton("장바구니의 항목 삭제하기", new ImageIcon("./images/6.png"));
		bt6.setFont(ft);
		mMenupanel.add(bt6);

		JButton bt7 = new JButton("주문하기", new ImageIcon("./images/7.png"));
		bt7.setFont(ft);
		mMenupanel.add(bt7);

		JButton bt8 = new JButton("종료", new ImageIcon("./images/8.png"));
		bt8.setFont(ft);
		mMenupanel.add(bt8);

		JButton bt9 = new JButton("관리자", new ImageIcon("./images/9.png"));
		bt9.setFont(ft);
		mMenupanel.add(bt9);
	}

	public static void main(String[] args) {
		new MainWindow("도서 쇼핑몰", 0, 0, 1000, 750);
	}
}