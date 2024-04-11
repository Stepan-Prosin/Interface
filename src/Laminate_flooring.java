import javax.swing.*;

public class Laminate_flooring extends BaseForm {
    private JButton DSP;
    private JCheckBox конфигураторCheckBox;
    private JPanel Laminate_flooring;
    public Laminate_flooring(){
        super(1920,1080);

        setContentPane(Laminate_flooring);
        initButtons();
        setVisible(true);
    }
    private void initButtons() {
        DSP.addActionListener(e -> {
            new Laminate_flooring_DSP();
        });

    }
}
