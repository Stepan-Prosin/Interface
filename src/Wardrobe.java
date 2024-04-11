import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.ObjectInputFilter;
import java.net.http.WebSocket;

public class Wardrobe extends BaseForm{
    int a=0;
    int b=4;
    private JPanel wardrobe;
    private JButton wardrobe_small;
    private JCheckBox Config1;
    private JButton wardrobe_standart;
    private JButton wardrobe_grand;
    private JPanel wardrobe1;
    public Wardrobe() {
        super(1920,1080);


        setContentPane(wardrobe);
        initCheckBox();

        setVisible(true);
    }
    private void initCheckBox() {


        Config1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent A) {
                if (A.getStateChange() ==  ItemEvent.SELECTED) {
                    // Действие при снятии выбора с чекбокса
                    if (a==100){
                        return;
                    }
                    if (a == 0 || a==101) {
                        initButtons();
                        a=101;

                    }
                } else if (A.getStateChange() == ItemEvent.DESELECTED) {
                    // Действие при установке выбора на чекбокс
                    wardrobe_grand.addActionListener(e -> {
                        if(a==100){
                            return;
                        }
                        if (a == 0||a== 101) {

                            new Wardrobe_grand();
                            a=100;

                        }

                    });
                }
            }
        });
        wardrobe_grand.addActionListener(e -> {
            if (a==100||a==101) {
                return;
            }

                new Wardrobe_grand();


    });
}





    private void initButtons() {

            wardrobe_standart.addActionListener(e -> {
                new Wardrobe_standart();
            });
            wardrobe_small.addActionListener(e -> {
                new Wardrobe_small();
            });
            wardrobe_grand.addActionListener(e -> {
                new Wardrobe_grand_Config();
            });
        }



    }

