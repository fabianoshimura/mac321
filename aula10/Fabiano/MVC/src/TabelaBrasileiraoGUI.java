import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class TabelaBrasileiraoGUI {
    private TabelaBrasileirao model;
    private JFrame frame;
    private JPanel panel;
    private JButton addResultButton;
    private JTextArea tableTextArea;
    private JTextField time1TextField;
    private JTextField time2TextField;
    private JTextField gols1TextField;
    private JTextField gols2TextField;

    public TabelaBrasileiraoGUI() {
        model = new TabelaBrasileirao();

        frame = new JFrame("Tabela do Brasileirão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Time 1:"));
        time1TextField = new JTextField();
        panel.add(time1TextField);

        panel.add(new JLabel("Gols Time 1:"));
        gols1TextField = new JTextField();
        panel.add(gols1TextField);

        panel.add(new JLabel("Time 2:"));
        time2TextField = new JTextField();
        panel.add(time2TextField);

        panel.add(new JLabel("Gols Time 2:"));
        gols2TextField = new JTextField();
        panel.add(gols2TextField);

        addResultButton = new JButton("Adicionar Resultado");
        panel.add(addResultButton);
        addResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time1 = time1TextField.getText();
                int gols1 = Integer.parseInt(gols1TextField.getText());
                String time2 = time2TextField.getText();
                int gols2 = Integer.parseInt(gols2TextField.getText());

                model.adicionarResultado(time1, gols1, time2, gols2);

                exibirTabela();
            }
        });

        frame.add(panel, BorderLayout.NORTH);

        tableTextArea = new JTextArea();
        tableTextArea.setEditable(false);
        frame.add(new JScrollPane(tableTextArea), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void exibirTabela() {
        StringBuilder table = new StringBuilder("Tabela do Brasileirão:\n");
        table.append("Time\t\tV\tE\tD\tPts\tGP\tGC\tSG\n");

        Map<String, int[]> times = model.getTimes();
        for (Map.Entry<String, int[]> entry : times.entrySet()) {
            String time = entry.getKey();
            int[] stats = entry.getValue();
            table.append(String.format("%s\t\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
                    time, stats[0], stats[1], stats[2], stats[3], stats[4], stats[5], stats[6]));
        }

        tableTextArea.setText(table.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TabelaBrasileiraoGUI();
            }
        });
    }
}
