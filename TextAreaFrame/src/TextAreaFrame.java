

public class TextAreaFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.WindowAdapter;
		import java.awt.event.WindowEvent;
		import java.io.File;

		import javax.swing.JButton;
		import javax.swing.JFileChooser;
		import javax.swing.JFrame;
		import javax.swing.JPanel;
		import javax.swing.JScrollPane;
		import javax.swing.JTextArea;
		import javax.swing.JMenuBar;
		import javax.swing.JMenu;
		import javax.swing.JMenuItem;

		public class TextAreaFrame extends JFrame implements ActionListener {

		private JMenuBar menuBar = new JMenuBar();

		private JButton insertButton = new JButton("Insert");

		private JButton wrapButton = new JButton("Wrap");

		private JButton noWrapButton = new JButton("No wrap");
		 
		private JButton save = new JButton("Save");

		private JTextArea textArea = new JTextArea(8, 40);

		private JScrollPane scrollPane = new JScrollPane(textArea);

		private final JFileChooser fc = new JFileChooser();

		public TextAreaFrame() {
		 
		 menuBar();
		 textArea.setEditable(false);
		 
		 JPanel p = new JPanel();
		 JPanel b = new JPanel();
		   
		 b.add(save);
		 save.addActionListener(this);
		   
		 p.add(insertButton);
		 insertButton.addActionListener(this);

		 p.add(wrapButton);
		    wrapButton.addActionListener(this);

		    p.add(noWrapButton);
		    noWrapButton.addActionListener(this);

		    getContentPane().add(b, "North");
		   
		    getContentPane().add(p, "South");
		   
		    getContentPane().add(scrollPane, "Center");
		   
		   

		    setTitle("TextAreaTest");
		    setSize(300, 300);
		    addWindowListener(new WindowAdapter() {
		     public void windowClosing(WindowEvent e) {
		      System.exit(0);
		     }
		    });
		}

		public void actionPerformed(ActionEvent evt) {
		 Object source = evt.getSource();
		 if (source == insertButton)
		  textArea
		   .append("The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.");
		 else if (source == wrapButton) {
		  textArea.setLineWrap(true);
		  textArea.setWrapStyleWord(true);
		  scrollPane.validate();
		 } else if (source == noWrapButton) {
		  textArea.setLineWrap(false);
		  scrollPane.validate();
		 }
		}

		public void menuBar() {
		 setJMenuBar(menuBar);
		 
		 JMenu fileMenu = new JMenu("File");
		 JMenu editMenu = new JMenu("Edit");
		 
		 menuBar.add(fileMenu);
		 menuBar.add(editMenu);
		 
		 JMenuItem newAction = new JMenuItem("New");
		 JMenuItem openAction = new JMenuItem("Open");
		 JMenuItem exitAction = new JMenuItem("Exit");
		 JMenuItem saveAction = new JMenuItem("Save");
		 
		 JMenuItem clearAction = new JMenuItem("Clear");
		 
		 fileMenu.add(newAction);
		 fileMenu.add(openAction);
		 fileMenu.add(saveAction);
		 fileMenu.addSeparator();
		 fileMenu.add(exitAction);
		 
		 editMenu.add(clearAction);
		 
		 newAction.addActionListener(new ActionListener() {
		           public void actionPerformed(ActionEvent arg0) {
		               textArea.append("You have clicked on the new action");
		           }
		 });
		 clearAction.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent arg0) {
		   textArea.setText("");
		  }
		 });
		 openAction.addActionListener(new ActionListener() {
		  
		  @Override
		  public void actionPerformed(ActionEvent e) {
		   int returnVal = fc.showOpenDialog(TextAreaFrame.this);
		   File file = fc.getSelectedFile();
		  }
		 });
		 saveAction.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent arg0) {
		   // TODO Auto-generated method stub
		   
		  }
		 });
		 exitAction.addActionListener(new ActionListener() {
		  
		  @Override
		  public void actionPerformed(ActionEvent e) {
		   System.exit(0);
		  }
		 });
		}

		public static void main(String[] args) {
		 JFrame f = new TextAreaFrame();
		 f.show();
		}

		}
	}

}
