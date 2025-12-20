import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

void main() {

    // JFileChooser - Modal dialog for letting the user pick files or directories

    JFrame frame = new JFrame("File Chooser");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    // Create a reusable JFileChooser instance (can be reused across multiple button clicks)
    JFileChooser fileChooser = new JFileChooser(new File(".")); // Sets current directory

    // Restrict visible files to common text formats, improves UX and prevents mistakes
    FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Text files (*.txt, *.md)", "txt", "md");
    fileChooser.setFileFilter(txtFilter);
    fileChooser.setAcceptAllFileFilterUsed(false); // Disable user to switch to "All files"

    // Choose whether the chooser selects files, directories, or both
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

    JButton selectButton = new JButton("Select File");
    selectButton.addActionListener(_ -> {
        fileChooser.setCurrentDirectory(new File(".")); // Sets new directory
        fileChooser.setDialogTitle("Load File"); // Customize dialog title for clarity
        int result = fileChooser.showOpenDialog(null); // Modal "Open" dialog
        if (result == JFileChooser.APPROVE_OPTION) {
            File selected = fileChooser.getSelectedFile();
            // Always validate the selection before using it
            if (selected != null && selected.exists()) {
                System.out.println("Opened: " + selected.getAbsolutePath());
            } else {
                System.out.println("Selected file does not exist or was invalid.");
            }
        } else {
            System.out.println("Open dialog cancelled.");
        }

    });

    JButton saveButton = new JButton("Save File");
    saveButton.addActionListener(_ -> {
        fileChooser.setCurrentDirectory(new File("C:")); // Sets new directory
        fileChooser.setDialogTitle("Save File"); // Customize dialog title for clarity
        int result = fileChooser.showSaveDialog(null); // Modal "Save" dialog
        if (result == JFileChooser.APPROVE_OPTION) {
            File target = fileChooser.getSelectedFile(); // Append extension if user did not state
            if (target != null) {
                System.out.println("Save to: " + target.getAbsolutePath());
            }
        } else {
            System.out.println("Save dialog cancelled.");
        }
    });

    frame.add(selectButton);
    frame.add(saveButton);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}