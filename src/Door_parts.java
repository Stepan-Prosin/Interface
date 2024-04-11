import javax.swing.*;

public class Door_parts extends BaseForm {
    private JPanel Door_parts;
    private JButton Door_Leaf;
    private JPanel Door_leaf;
    private JCheckBox конфигураторCheckBox;
    private JButton Door_guide;
    public Door_parts() {

        super(1920,1080);

        setContentPane(Door_parts);
        initButtons();
        setVisible(true);
    }
    private void initButtons() {
        Door_Leaf.addActionListener(e -> {
            new Door_parts_Leaf();
        });
        Door_guide.addActionListener(e -> {
            new Door_parts_Guide();
        });

    }
}
