package QRcode07232021;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class UI extends JFrame {
	char[][] binaryStringCharArray;

	public void UIInit() {
		this.setSize(800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		QRcode myQRcode = new QRcode();
		String baseString = "Hello World";
		binaryStringCharArray = myQRcode.init(baseString);
		Thread thread = new Thread();
		try {
			thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		for (int i = 0; i < binaryStringCharArray.length; i++) {
			for (int j = 0; j < binaryStringCharArray[0].length; j++) {
				System.out.println(binaryStringCharArray[i][j]);
				if (binaryStringCharArray[i][j] == '0') {
					g.setColor(Color.WHITE);
				} else {
					g.setColor(Color.BLACK);
				}
				g.fillRect(j * 50 + 100, i * 50 + 100, 50, 50);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UI myUI = new UI();
		myUI.UIInit();
	}

}
