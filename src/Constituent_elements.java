import javax.swing.*;

public class Constituent_elements extends BaseForm{
    private JPanel Constituent_elements;
    private JButton gutter;
    private JCheckBox конфигураторCheckBox;

    public Constituent_elements() {

        super(1920,1080);

        setContentPane(Constituent_elements);
        initButtons();
        setVisible(true);
    }
    private void initButtons() {
        gutter.addActionListener(e -> {
            new Constituent_elements_Gutter();
        });


    }
}
