import javax.swing.*;

public class Handle extends BaseForm {
    private JPanel Handle;
    private JButton Door_handle;
    private JCheckBox конфигураторCheckBox;
    public Handle(){
        super(1920,1080);

        setContentPane(Handle);
        initButtons();
        setVisible(true);
    }
    private void initButtons() {
        Door_handle.addActionListener(e -> {
            new Handle_Door();
        });

    }
}
