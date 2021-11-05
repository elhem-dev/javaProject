package jeude;

//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IHMWithRefreshScreen extends JPanel {

    //Composants graphiques
    //Joueur 1
    private JLabel jlJ1;
    private JTextField jtfScoreJ1;
    private JCheckBox jcbTricheurJ1;
    private JButton btLancerJ1;
    //Joueur2
    private JLabel jlJ2;
    private JTextField jtfScoreJ2;
    private JCheckBox jcbTricheurJ2;
    private JButton btLancerJ2;
    //Milieu
    private JLabel jlTourNumber;
    private JTextField jtfD1;
    private JTextField jtfD2;
    private JLabel jlMessage;
    private JButton btRestart;
    //non utilisés
    private JLabel jl;
    private JLabel jcomp11;
    private JLabel jcomp12;
    private JLabel jcomp13;
    private JLabel jcomp17;


    //données
    private PartyBean data = new PartyBean("Toto", "Bob");

    public IHMWithRefreshScreen() {

        //construct components
        btLancerJ1 = new JButton("Lancer");
        btRestart = new JButton("Restart");
        btLancerJ2 = new JButton("Lancer");
        jl = new JLabel("Score : ");
        jcbTricheurJ1 = new JCheckBox("Tricheur");
        jtfScoreJ1 = new JTextField(1);
        jlJ1 = new JLabel("Joueur 1");
        jlJ2 = new JLabel("Joueur 2");
        jtfD1 = new JTextField(1);
        jtfD2 = new JTextField(1);
        jcomp11 = new JLabel("De 1");
        jcomp12 = new JLabel("De 2");
        jcomp13 = new JLabel("Score : ");
        jtfScoreJ2 = new JTextField(1);
        jcbTricheurJ2 = new JCheckBox("Tricheur");
        jlMessage = new JLabel("Le joueur 1 a gagné");
        jcomp17 = new JLabel("Tour : ");
        jlTourNumber = new JLabel("1");

        //adjust size and set layout
        setPreferredSize(new Dimension(627, 446));
        setLayout(null);

        //add components
        add(btLancerJ1);
        add(btRestart);
        add(btLancerJ2);
        add(jl);
        add(jcbTricheurJ1);
        add(jtfScoreJ1);
        add(jlJ1);
        add(jlJ2);
        add(jtfD1);
        add(jtfD2);
        add(jcomp11);
        add(jcomp12);
        add(jcomp13);
        add(jtfScoreJ2);
        add(jcbTricheurJ2);
        add(jlMessage);
        add(jcomp17);
        add(jlTourNumber);

        //set component bounds (only needed by Absolute Positioning)
        btLancerJ1.setBounds(30, 255, 120, 30);
        btRestart.setBounds(220, 345, 135, 50);
        btLancerJ2.setBounds(435, 250, 115, 30);
        jl.setBounds(35, 175, 50, 25);
        jcbTricheurJ1.setBounds(40, 215, 130, 25);
        jtfScoreJ1.setBounds(85, 170, 35, 30);
        jlJ1.setBounds(60, 65, 80, 40);
        jlJ2.setBounds(460, 70, 100, 25);
        jtfD1.setBounds(200, 165, 75, 70);
        jtfD2.setBounds(310, 165, 75, 70);
        jcomp11.setBounds(220, 130, 45, 20);
        jcomp12.setBounds(330, 130, 65, 25);
        jcomp13.setBounds(440, 165, 70, 25);
        jtfScoreJ2.setBounds(500, 165, 45, 25);
        jcbTricheurJ2.setBounds(445, 210, 100, 25);
        jlMessage.setBounds(30, 300, 540, 35);
        jcomp17.setBounds(240, 65, 40, 30);
        jlTourNumber.setBounds(285, 68, 30, 25);

        /* -------------------------------- */
        // Event
        /* -------------------------------- */
        btLancerJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicBtLancerJ1();
            }
        });
        btLancerJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicBtLancerJ2();
            }
        });
        btRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicBtRestart();
            }
        });

        //Cas de départ
        refreshScreen();
    }

    private void clicBtLancerJ1() {
        //Modification des données
        data.getJ1().roll();
        if (data.getJ1().getCup().getScoreDices() >= Constants.SCORE_TO_REACH) {
            data.getJ1().add1point();
        }
        //je change le joueur courant
        data.setCurrentPlayer(data.getJ2());

        //Modifier l'IHM
        refreshScreen();

    }

    private void clicBtLancerJ2() {
        //Modification des données
        data.getJ2().roll();
        if (data.getJ2().getCup().getScoreDices() >= Constants.SCORE_TO_REACH) {
            data.getJ2().add1point();
        }
        data.add1Round();
        //je change le joueur courant
        data.setCurrentPlayer(data.getJ1());

        //Modifier l'IHM
        refreshScreen();

    }

    private void clicBtRestart() {
        data = new PartyBean(data.getJ1().getName(), data.getJ2().getName());
        refreshScreen();
    }

    private void refreshScreen() {
        //A partir de data je mets à jour l'affichage
        //Joueur1
        jlJ1.setText(data.getJ1().getName());
        jtfScoreJ1.setText("" + data.getJ1().getScore());

        //joueur 2
        jlJ2.setText(data.getJ2().getName());
        jtfScoreJ2.setText("" + data.getJ2().getScore());

        //tour
        jlTourNumber.setText(data.getRound() + "");

        btRestart.setVisible(false);
        jlMessage.setText("");

        if (data.getCurrentPlayer() == data.getJ1()) {
            btLancerJ1.setVisible(true);
            btLancerJ2.setVisible(false);
            jtfD1.setText("" + data.getJ2().getCup().getD1().getValue());
            jtfD2.setText("" + data.getJ2().getCup().getD2().getValue());
        } else {
            btLancerJ1.setVisible(false);
            btLancerJ2.setVisible(true);
            jtfD1.setText("" + data.getJ1().getCup().getD1().getValue());
            jtfD2.setText("" + data.getJ1().getCup().getD2().getValue());
        }

        //Fin de partie
        if (data.getRound() == Constants.NB_TOUR) {
            btLancerJ1.setVisible(false);
            btLancerJ2.setVisible(false);
            btRestart.setVisible(true);

            if (data.getJ1().getScore() > data.getJ2().getScore()) {
                jlMessage.setText(data.getJ1().getName() + " a gagné ");
            } else if (data.getJ1().getScore() < data.getJ2().getScore()) {
                jlMessage.setText(data.getJ2().getName() + " a gagné ");
            } else {
                jlMessage.setText("Egalité : ");
            }

        }


    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Jeu de dés");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new IHMWithRefreshScreen());
        frame.pack();
        frame.setVisible(true);
    }

}
