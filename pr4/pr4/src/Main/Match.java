package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Match {
    private int bclic = 0;
    private int cclic = 0;
    private String last = "none";
    private JLabel Matchlabel;
    private JLabel WinLabel;
    private JLabel Lastlabel;

    public Match() {
        this.Matchlabel = new JLabel("Result: " + this.bclic + " X " + this.cclic);
        this.WinLabel = new JLabel("Win: ");
        this.Lastlabel = new JLabel("Last score: ");
        JFrame Match = new JFrame("Матч");
        JButton b = new JButton("AC Milan");
        JButton c = new JButton("Real Madrid");
        Match.add(b, "West");
        Match.add(c, "East");
        Match.add(this.WinLabel, "South");
        Match.add(this.Matchlabel, "Center");
        Match.add(this.Lastlabel, "North");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ++Match.this.bclic;
                Match.this.updateLabel();
                Match.this.last = "AC Milan";
                Match.this.winner();
            }
        });
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ++Match.this.cclic;
                Match.this.updateLabel();
                Match.this.last = "Real Madrid";
                Match.this.winner();
            }
        });
        Match.setSize(600, 300);
        Match.setVisible(true);
        Match.setDefaultCloseOperation(3);
    }

    public void updateLabel() {
        this.Matchlabel.setText("Result: " + this.bclic + " X " + this.cclic);
    }

    public void winner() {
        this.Lastlabel.setText("Last score: " + this.last);
        String win = "Friendship";
        if (this.bclic > this.cclic) {
            win = "AC Milan";
        } else if (this.bclic < this.cclic) {
            win = "Real Madrid";
        } else {
            win = "Friendship";
        }

        this.WinLabel.setText("Win: " + win);
    }
}
