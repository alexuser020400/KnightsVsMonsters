import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGUI extends JFrame {
    private final Map map;
    private final int cellSize = 30;

    public GameGUI(Map map) {
        this.map = map;
        setTitle("Knights vs Monsters");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Ζωγραφίζει το terrain
                for (int y = 0; y < map.getHeight(); y++) {
                    for (int x = 0; x < map.getWidth(); x++) {
                        char c = map.getTerrain(x, y);
                        switch (c) {
                            case '.': g.setColor(new Color(170, 255, 170)); break; // earth
                            case '%': g.setColor(new Color(60, 120, 50));   break; // tree
                            case '~': g.setColor(new Color(50, 180, 255));  break; // water
                            default:  g.setColor(Color.LIGHT_GRAY);
                        }
                        g.fillRect(x * cellSize, y * cellSize, cellSize, cellSize);
                    }
                }

                // Knights
                for (Knight k : map.getKnights()) {
                    g.setColor(Color.BLUE);
                    g.fillOval(k.getX() * cellSize + 6, k.getY() * cellSize + 6, cellSize - 12, cellSize - 12);
                }

                // Monsters
                for (Monster m : map.getMonsters()) {
                    g.setColor(Color.RED);
                    g.fillOval(m.getX() * cellSize + 6, m.getY() * cellSize + 6, cellSize - 12, cellSize - 12);
                }

                // Player
                Player p = map.getPlayer();
                if (p != null) {
                    g.setColor(Color.BLACK);
                    g.fillRect(p.getX() * cellSize + 8, p.getY() * cellSize + 8, cellSize - 16, cellSize - 16);
                }
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(map.getWidth() * cellSize, map.getHeight() * cellSize);
            }
        };

        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);

        // Εδώ προσθέτουμε Key Bindings
        setupKeyBindings(panel);

        setVisible(true);
    }

    /**
     * Key Bindings αντί για KeyListener
     */
    private void setupKeyBindings(JPanel panel) {
        InputMap im = panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = panel.getActionMap();

        // WASD κινήσεις
        im.put(KeyStroke.getKeyStroke('w'), "moveUp");
        im.put(KeyStroke.getKeyStroke('a'), "moveLeft");
        im.put(KeyStroke.getKeyStroke('s'), "moveDown");
        im.put(KeyStroke.getKeyStroke('d'), "moveRight");

        // P = pause/stats
        im.put(KeyStroke.getKeyStroke('p'), "pause");

        // Q = quit
        im.put(KeyStroke.getKeyStroke('q'), "quit");

        // Ενέργειες για κάθε binding
        am.put("moveUp", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { step("w"); }
        });
        am.put("moveLeft", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { step("a"); }
        });
        am.put("moveDown", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { step("s"); }
        });
        am.put("moveRight", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { step("d"); }
        });

        am.put("pause", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GameGUI.this,
                        map.getStatsString(),
                        "Statistics",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        am.put("quit", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GameGUI.this, "Quit game.");
                System.exit(0);
            }
        });
    }

    /**
     * Βοηθητική μέθοδος που κινεί τον παίκτη και τους fighters
     */
    private void step(String dir) {
        if (map.movePlayer(dir)) {
            map.moveFighters();
            map.resolveInteractions();
            repaint();
        }
    }
}
