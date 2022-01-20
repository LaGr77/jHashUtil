package app.LaGr77.jHashUtil.view;

import java.awt.event.ActionListener;
import java.net.http.WebSocket;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Main panel
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.1
 * @since 2022-01-20
 */
public class HashPanel extends JPanel {

    /**
     * Constructor
     */
    public HashPanel() {
        lblPath = new JLabel("Cesta");
        lblAlgorithm = new JLabel("Algoritmus");
        lblHash = new JLabel("Hash");

        cbMd2 = new JCheckBox("MD2");
        cbMd5 = new JCheckBox("MD5");
        cbSha1 = new JCheckBox("Sha 1");
        cbSha256 = new JCheckBox("Sha 256");
        cbSha384 = new JCheckBox("Sha 384");
        cbSha512 = new JCheckBox("sha 512");

        tfPath = new JTextField();

        taHash = new JTextArea();

        btnCalculate = new JButton("Počítej");
        btnFile = new JButton("...");
        btnBack = new JButton("Zpět");

        setLayout(new BorderLayout());

        //Create panel for fields
        panelCenter = new JPanel();
        panelCenter.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(0,0,10,10);
        gridBagConstraints.gridx = GridBagConstraints.RELATIVE;

        gridBagConstraints.gridy = 0; //first row
        panelCenter.add(lblPath, gridBagConstraints);
        gridBagConstraints.gridwidth = 3;
        panelCenter.add(tfPath, gridBagConstraints);
        gridBagConstraints.gridwidth = 1;
        panelCenter.add(btnFile, gridBagConstraints);
        
        gridBagConstraints.gridy = 1; //second row
        panelCenter.add(lblAlgorithm, gridBagConstraints);
        panelCenter.add(cbMd2, gridBagConstraints);
        panelCenter.add(cbMd5, gridBagConstraints);
        panelCenter.add(cbSha1, gridBagConstraints);
        panelCenter.add(cbSha256, gridBagConstraints);

        gridBagConstraints.gridy = 2; //third row
        panelCenter.add(cbSha384, gridBagConstraints);
        panelCenter.add(cbSha512, gridBagConstraints);
        
        gridBagConstraints.gridy = 3; //fourth row
        panelCenter.add(lblHash, gridBagConstraints);
        //TODO text AREA

    }
    /****************************************************************************************************
     *                                                                                            Methods
     ****************************************************************************************************/
    /**
     * Switch to MainPanel
     * @param event {@link ActionListener}
     */
    public void btnBack(ActionListener event) {
        btnBack.addActionListener(event);
    }

    /**
     * Calculate hash
     * @param event {@link ActionListener}
     */
    public void btnCalculateAction (ActionListener event) {
        btnCalculate.addActionListener(event);
    }

    /**
     * Find file
     * @param event {@link ActionListener}
     */
    public void btnFileAction (ActionListener event) {
        btnFile.addActionListener(event);
    }

    /****************************************************************************************************
     *                                                                                          Variables
     ****************************************************************************************************/
    private JLabel lblPath, lblAlgorithm, lblHash;
    private JTextField tfPath;
    private JCheckBox cbMd2, cbMd5, cbSha1, cbSha256, cbSha384, cbSha512;
    private JTextArea taHash;
    private JButton btnFile, btnCalculate, btnBack;
    private JPanel panelCenter, buttonsPanel;
    private GridBagConstraints gridBagConstraints;
   
}
