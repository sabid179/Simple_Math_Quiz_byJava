import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UI_Frame frame = new UI_Frame();
        frame.launch();
        frame.setVisible(true);
        JOptionPane.showMessageDialog(null,
                "You have to answer at least 6 " +
                "\ncorrect ans among 10 Questions!",
                "Quiz Rule", JOptionPane.INFORMATION_MESSAGE);

    }
}