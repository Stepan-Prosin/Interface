import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class test1 extends BaseForm {
    private JPanel interFace;
    private JButton mirrow;
    private JButton wardrobe;
    private JButton built_in_wardrobe;
    private JButton Laminate_flooring;
    private JButton separate_closet;
    private JButton shelf;
    private JButton equipment;
    private JButton handle;
    private JButton door_parts;
    private JButton door;
    private JButton constituent_elements;
    private JButton storage_products;
    private JPanel Shelf;
    private JPanel Storage;
    private JPanel separate;

    public test1() {
        super(1920,1080);


        setContentPane(interFace);
        initButtons();
        setVisible(true);
    }
private void initButtons(){
        wardrobe.addActionListener(e ->{
            new Wardrobe();
        });
        storage_products.addActionListener(e ->{
            new Storage_products();
        });
    shelf.addActionListener(e ->{
        new Shelf();
    });
    separate_closet.addActionListener(e ->{
        new Separate_closet();
    });
    mirrow.addActionListener(e ->{
        new Mirrow();
    });
    Laminate_flooring.addActionListener(e ->{
        new Laminate_flooring();
    });
    handle.addActionListener(e ->{
        new Handle();
    });
    equipment.addActionListener(e ->{
        new Equipment();
    });
    door_parts.addActionListener(e ->{
        new Door_parts();
    });
    door.addActionListener(e ->{
        new Door();
    });
    constituent_elements.addActionListener(e ->{
        new Constituent_elements();
    });
    built_in_wardrobe.addActionListener(e ->{
        new Built_in_wardrobe();
    });
}


}
