import javax.swing.*;

public class Separate_closet extends BaseForm {
    private JPanel Separate_closet;
    private JButton Allince;
    private JPanel wardrobe1;
    private JCheckBox конфигураторCheckBox;
    private JButton Mirrow;

    public Separate_closet() {

        super(1920, 1080);

        setContentPane(Separate_closet);
        initButtons();
        setVisible(true);
    }

    private void initButtons() {
        Mirrow.addActionListener(e -> {
            new Separate_closet_Mirrow();
        });
        Allince.addActionListener(e -> {
            new Separate_closet_Allince();
        });
    }
}
