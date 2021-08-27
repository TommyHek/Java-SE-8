package pro_1;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class c67 extends Frame{
	//create java frame
	public static void main(String[] args) {
		new c67();
	}
	private Button buttonClose;
	c67(){
		setLayout(new FlowLayout());
		buttonClose=new Button("Close");
		add(buttonClose);
		buttonClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		setTitle("AWT_JAVA");
		setSize(600,400);
		setVisible(true);
	}
}
