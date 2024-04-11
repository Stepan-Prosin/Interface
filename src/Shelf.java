import javax.swing.*;

public class Shelf extends BaseForm {
    private JButton SRS;
    private JCheckBox конфигураторCheckBox;
    private JPanel Shelf;
    public Shelf() {

        super(1920,1080);

        setContentPane(Shelf);
        initButtons();
        setVisible(true);
    }
    private void initButtons(){
        SRS.addActionListener(e ->{
            new SRS_Shelf();
        });

    }
}
