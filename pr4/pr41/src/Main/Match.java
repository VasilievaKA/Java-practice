package Main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Match{
    private int bclic = 0;
    private int cclic  = 0;
    private String last = "none";
    private JLabel Matchlabel;
    private JLabel WinLabel;
    private JLabel Lastlabel;
    public Match() {
        Matchlabel = new JLabel("Result: " + bclic + " X " + cclic);
        WinLabel = new JLabel("Win: ");
        Lastlabel = new JLabel("Last score: ");
        JFrame Match = new JFrame("Матч");
        JButton b = new JButton("AC Milan");
        JButton c = new JButton("Real Madrid");
        Match.add(b, "West");
        Match.add(c, "East");
        Match.add(WinLabel, BorderLayout.SOUTH);
        Match.add(Matchlabel, BorderLayout.CENTER);
        Match.add(Lastlabel, BorderLayout.NORTH);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                bclic++;
                updateLabel();
                last = "AC Milan";
                winner();
            }
        });
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cclic++;
                updateLabel();
                last = "Real Madrid";
                winner();
            }
        });
        Match.setSize(600,300);
        Match.setVisible(true);
        Match.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void updateLabel (){
        Matchlabel.setText("Result: " + bclic + " X "+ cclic);
    }
    public void winner() {
        Lastlabel.setText("Last score: "+ last);
        String win = "Friendship";
        if (bclic > cclic) {
            win = "AC Milan";;
        } else if (bclic < cclic) {
            win="Real Madrid";;
        } else {
            win="Friendship";
        } WinLabel.setText("Win: "+ win);}}