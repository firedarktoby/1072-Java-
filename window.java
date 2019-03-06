import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel {
	// draw rectangles and Strings in different colors
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // call superclass's paintComponent

		this.setBackground(Color.BLACK);

		// set new drawing color using integers
		g.setColor(new Color(255, 0, 0));
		g.drawRect( 200,200,200,200 );
//		g.drawLine(開始X,開始Y, 結束Ｘ, 結束Ｙ );
//		g.drawArc(開始X,開始Y, 長, 寬, 開始角度, 延伸角度 );
//		g.drawOval(開始X,開始Y, 長, 寬);

	}
}
