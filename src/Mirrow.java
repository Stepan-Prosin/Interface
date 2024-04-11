import javax.swing.*;

public class Mirrow extends BaseForm{
    private JPanel Mirrow1;
    private JButton mirrow_Big;
    private JCheckBox конфигураторCheckBox;
    public Mirrow() {

        super(1920,1080);

        setContentPane(Mirrow1);
        initButtons();
        setVisible(true);
    }
    private void initButtons() {
        mirrow_Big.addActionListener(e -> {
            new Mirrow_big();
        });

    }
}
