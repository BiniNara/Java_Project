package main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import logins.LoginFrame;
 
public class main extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
  
    
    
    public main() {
        icon = new ImageIcon("./resources/img/main2.jpg");
        ImageIcon icon2 = new ImageIcon("./resources/img/main1.jpg");
        Image img = icon.getImage();
        
        
        //배경 Panel 생성후 컨텐츠페인으로 지정      
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                // Approach 1: Dispaly image at at full size
                g.drawImage(icon.getImage(), 0, 0, null);
                // Approach 2: Scale image to size of component
                // Dimension d = getSize();
                // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                // Approach 3: Fix the image position in the scroll pane
                // Point p = scrollPane.getViewport().getViewPosition();
                // g.drawImage(icon.getImage(), p.x, p.y, null);
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };
       
        JButton button = new JButton("로그인화면으로");
        background.add(button);
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
        
//button.setPreferredSize(new Dimension(200,100));


        background.setLayout(null);
        button.setBounds(0, 370, 600, 100);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.setFont(new Font("맑은고딕",Font.BOLD,30));
       
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				 new LoginFrame();
			}
		});
        
        
        JLabel lbl = new JLabel();
        lbl.setBounds(100, 10, 500, 300);

        //lbl.setPreferredSize(new Dimension(300,300));
        lbl.setText("메인 화면 입니다.");
        lbl.setFont(new Font("맑은고딕",Font.BOLD,50));
        background.add(lbl);
        
        
        

        setFocusable(true);
        background.addMouseListener(new MouseAdapter() {
        	
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (img == icon.getImage()) {
//        			System.out.println("출력테스트전");
//        			   icon = new ImageIcon("./random_restaurant/resources/img/main.jpg");
//        		        ImageIcon icon2 = new ImageIcon("./random_restaurant/resources/img/main2.jpg");
//        		        Image img = icon.getImage();
//        			img = icon2.getImage();
        			System.out.println("리페인트호출전");
        		       icon = new ImageIcon("./resources/img/main.jpg");
        		        ImageIcon icon2 = new ImageIcon("./resources/img/main2.jpg");
        		        Image img = icon.getImage();
        		        repaint();
        		        
        		        //배경 Panel 생성후 컨텐츠페인으로 지정      
//        		        JPanel background = new JPanel() {
//        		            public void paintComponent(Graphics g) {
//        		                // Approach 1: Dispaly image at at full size
//        		                g.drawImage(icon2.getImage(), 0, 0, null);
//        		                // Approach 2: Scale image to size of component
//        		                // Dimension d = getSize();
//        		                // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
//        		                // Approach 3: Fix the image position in the scroll pane
//        		                // Point p = scrollPane.getViewport().getViewPosition();
//        		                // g.drawImage(icon.getImage(), p.x, p.y, null);
//        		                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
//        		                super.paintComponent(g);
//        		            }
//        		        };
        			System.out.println("리페인트호출후");
        			
        		}
        		else {
        			System.out.println("2리페인트호출전");
        			   icon = new ImageIcon("./resources/img/main2.jpg");
        		        ImageIcon icon2 = new ImageIcon("./resources/img/main1.jpg");
        		        Image img = icon.getImage();
        			img = icon.getImage();
        			repaint();
        		}
        		
        	}
		});

        
        
        
    }
    
    
    

    
    
    
    

    public static void main(String[] args) {
    	
    	
        main frame = new main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

    }
    
}