import javax.swing.*;

public class Door extends BaseForm{
    private JPanel Door;
    private JButton Door_sliding;
    private JPanel sliding;
    private JCheckBox конфигураторCheckBox;
    private JButton Door_swing;
    public Door() {

        super(1920,1080);

        setContentPane(Door);
        initButtons();
        setVisible(true);
    }
    private void initButtons() {
        Door_swing.addActionListener(e -> {
            new Door_Swing();
        });
        Door_sliding.addActionListener(e -> {
            new Door_Sliding();
        });

    }
}
