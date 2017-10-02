import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MainFrame extends Frame{
    public MainFrame(){
        initComp(); }
    private Button btnL = new Button("<<<");
    private Button btnR = new Button(">>>");
    private Button btnA = new Button("Attack");
    private Label LaA = new Label("OAO");
    private Label LaB = new Label("   A   ");
    private Label LaC = new Label(" QAQ");
    Random ran = new Random();
    private int LaX = 485;
    private int LaY = 400;
    private javax.swing.Timer t1;
    private void initComp() {
        this.setLayout(null);
        this.setBounds(450, 200, 1000, 600);
        btnL.setBounds(225, 450, 150, 50);
        btnR.setBounds(625, 450, 150, 50);
        btnA.setBounds(425, 450, 150, 50);
        LaA.setBounds(LaX, 400, 30, 30);
        LaB.setBounds(LaX, LaY, 30, 30);
        LaC.setBounds(ran.nextInt(1000), 100, 30, 30);
        this.add(btnL);
        this.add(btnR);
        this.add(btnA);
        this.add(LaA);
        this.add(LaB);
        this.add(LaC);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btnL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LaA.setBounds(LaX -= 10, 400, 30, 30);
                LaB.setBounds(LaX, 400, 30, 30);
            }
        });
        btnR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LaA.setBounds(LaX += 10, 400, 30, 30);
                LaB.setBounds(LaX, 400, 30, 30);
            }
        });
        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });
        t1 = new javax.swing.Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LaB.setBounds(LaX, LaY-=10, 30, 30);
            }
        });
    }
}
