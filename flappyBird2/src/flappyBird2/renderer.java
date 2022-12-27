package flappyBird2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class renderer extends JPanel
{
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);	
		
		flappyBird.flappybird.repaint(g);
	}
}
