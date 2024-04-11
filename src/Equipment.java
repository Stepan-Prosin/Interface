import javax.swing.*;

public class Equipment extends BaseForm {
    private JPanel Equipment;
    private JButton Axis;
    private JPanel axis;
    private JCheckBox конфигураторCheckBox;
    private JButton Roller;
    public Equipment() {

        super(1920,1080);

        setContentPane(Equipment);
        initButtons();
        setVisible(true);
    }
    private void initButtons() {
        Axis.addActionListener(e -> {
            new Equipment_Axis();
        });
        Roller.addActionListener(e -> {
            new Equipment_Roller();
        });

    }
}
