import java.awt.*;
import javax.swing.*;

public class AllComponentsDemo {
    public static void main(String[] args) {
        // Main Frame
        JFrame frame = new JFrame("All Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLayout(new BorderLayout());

        // ---------- MENU BAR ----------
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("Exit"));
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // ---------- TOOLBAR ----------
        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("New"));
        toolBar.add(new JButton("Edit"));
        toolBar.add(new JButton("Delete"));
        frame.add(toolBar, BorderLayout.NORTH);

        // ---------- MAIN PANEL ----------
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(8, 3, 10, 10));
        mainPanel.setBackground(Color.LIGHT_GRAY);

        // Components
        mainPanel.add(new JLabel("Name:"));
        mainPanel.add(new JTextField("Enter name here", 15));
        mainPanel.add(new JButton("Submit"));

        mainPanel.add(new JLabel("Choose Color:"));
        JColorChooser colorChooser = new JColorChooser();
        mainPanel.add(colorChooser.getChooserPanels()[0]); // mini color chooser panel
        // File chooser button
        JButton fileBtn = new JButton("Open File");
        fileBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(frame,
                        "Selected File: " + fileChooser.getSelectedFile());
            }
        });
        mainPanel.add(fileBtn);

        mainPanel.add(new JLabel("Select Gender:"));
        mainPanel.add(new JComboBox<>(new String[]{"Male", "Female", "Other"}));
        mainPanel.add(new JCheckBox("Agree?"));

        mainPanel.add(new JLabel("List Example:"));
        mainPanel.add(new JScrollPane(new JList<>(new String[]{"Apple", "Banana", "Mango"})));
        mainPanel.add(new JButton("Show Message"));
        JButton msgBtn = new JButton("Show JOptionPane");
        msgBtn.addActionListener(e -> JOptionPane.showMessageDialog(frame,
                "This is a JOptionPane message!"));
        mainPanel.add(msgBtn);

        mainPanel.add(new JLabel("Progress:"));
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(70);
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.GREEN);
        mainPanel.add(progressBar);

        mainPanel.add(new JLabel("Scrollbar:"));
        mainPanel.add(new JScrollBar(JScrollBar.HORIZONTAL, 30, 10, 0, 100));
        mainPanel.add(new JSlider(0, 100, 50));

        mainPanel.add(new JLabel("Spinner:"));
        mainPanel.add(new JSpinner(new SpinnerNumberModel(5, 0, 10, 1)));
        mainPanel.add(new JTextArea("This is a JTextArea", 3, 15));

        mainPanel.add(new JLabel("Split Pane:"));
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JTextField("Left"), new JTextField("Right"));
        mainPanel.add(splitPane);

        mainPanel.add(new JLabel("Tree:"));
        JTree tree = new JTree();
        mainPanel.add(new JScrollPane(tree));

        mainPanel.add(new JLabel("Table:"));
        String[][] data = {{"1", "Aman", "22"}, {"2", "Siddharth", "25"}};
        String[] cols = {"ID", "Name", "Age"};
        JTable table = new JTable(data, cols);
        mainPanel.add(new JScrollPane(table));

        // ---------- TAB PANE ----------
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Main Components", new JScrollPane(mainPanel));

        // Extra panel with popup menu
        JPanel popupPanel = new JPanel();
        popupPanel.setBackground(Color.CYAN);
        JPopupMenu popupMenu = new JPopupMenu("Options");
        popupMenu.add("Cut");
        popupMenu.add("Copy");
        popupMenu.add("Paste");
        popupPanel.setComponentPopupMenu(popupMenu);
        tabbedPane.addTab("Popup Menu", popupPanel);

        frame.add(tabbedPane, BorderLayout.CENTER);

        // ---------- STATUS BAR ----------
        JLabel statusBar = new JLabel("Status: Ready");
        statusBar.setOpaque(true);
        statusBar.setBackground(Color.DARK_GRAY);
        statusBar.setForeground(Color.WHITE);
        frame.add(statusBar, BorderLayout.SOUTH);

        // Show Frame
        frame.setVisible(true);

        // ---------- EXTRA: DIALOG ----------
        JDialog dialog = new JDialog(frame, "Sample JDialog", true);
        dialog.add(new JLabel("This is a dialog box"));
        dialog.setSize(200, 100);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
    }
}