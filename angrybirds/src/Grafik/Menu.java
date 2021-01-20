package Grafik;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Builder.Builder;
import Controller.Gravite;
import Main.Main;
import Model.Bird;
import View.Dekor;



public class Menu extends JPanel{

	private static final long serialVersionUID = 1L;
	protected Image img;
	protected JLabel baslik , image, copyr;
	protected JButton jouer;
	
	
	public Menu(){

		super();
		setLayout(null);
		
		//this.setResizable(false);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		baslik = new JLabel(" ");
		baslik.setBounds(50,25,500,35);
		baslik.setFont(new Font("", Font.BOLD, 30));
		baslik.setForeground(Color.RED);
		add(baslik);
		
		baslik = new JLabel("Cumhuriyet Universitesi");
		baslik.setBounds(650,40,500,30);

		baslik.setFont(new Font("", Font.BOLD, 30));
		baslik.setForeground(Color.DARK_GRAY);
		add(baslik);
		
	
		
		jouer = new JButton("Oyna");
		jouer.setBounds(110,160,200,60);
		jouer.setFont(new Font("", Font.CENTER_BASELINE, 20));
		jouer.setForeground(Color.RED);
		jouer.setFocusPainted(false);
		jouer.setContentAreaFilled(false);
		jouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				Dekor decor = new Dekor(Main.getFenetre().getContentPane().getWidth(),Main.getFenetre().getContentPane().getHeight(),40,125,100);
				decor.ajouterOiseau(new Bird(decor));
				decor.ajouterOiseau(new Bird(decor));
				decor.ajouterOiseau(new Bird(decor));				
				Builder b = new Builder(decor);
				b.tur();
				new Gravite(decor);
				Main.getFenetre().changerFond(decor);
			}
		});
		add(jouer);
		
	
		copyr = new JLabel("Angry Birds");
		copyr.setBounds(700, 520, 290, 20);
		copyr.setFont(new Font("",Font.ITALIC, 12));
		copyr.setForeground(Color.WHITE);
		add(copyr);
		
	
	}
	

	@Override
	public void paintComponent(Graphics g){
		try {
			BufferedImage img = ImageIO.read(new File("img/fd.jpg"));	
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
		} catch (IOException e){}
	}
	
}
