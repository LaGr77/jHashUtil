package app.LaGr77.jHashUtil.view;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import app.LaGr77.jHashUtil.model.HashPanelModel;

/**
 * Main panel
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.6.2022-04-12
 * @since 2022-02-02
 */
public class HashPanel extends JPanel {

    /**
     * Constructor
     */
    public HashPanel(HashPanelModel hpm) {
        lblPath = new JLabel("Cesta");
        lblAlgorithm = new JLabel("Algoritmus");

        cbMd2 = new JCheckBox("MD2");
        cbMd2.setPreferredSize(CK_DIMENSION);

        cbMd5 = new JCheckBox("MD5");
        cbMd5.setPreferredSize(CK_DIMENSION);

        cbSha1 = new JCheckBox("SHA-1");
        cbSha1.setPreferredSize(CK_DIMENSION);

        cbSha224 = new JCheckBox("SHA-224");
        cbSha224.setPreferredSize(CK_DIMENSION);

        cbSha256 = new JCheckBox("SHA-256");
        cbSha256.setPreferredSize(CK_DIMENSION);

        cbSha384 = new JCheckBox("SHA-384");
        cbSha384.setPreferredSize(CK_DIMENSION);

        cbSha512 = new JCheckBox("SHA-512");
        cbSha512.setPreferredSize(CK_DIMENSION);
        
        tfPath = new JTextField();

        //předělat
        //taHash = new JTable(new String [][] {}, new String[] {"Algo","Hash"});
        taHash = new JTable(hpm);
        scPane=new JScrollPane(taHash);
        scPane.setPreferredSize(TA_SIZE);
        taHash.getColumnModel().getColumn(0).setMinWidth(80);
        taHash.getColumnModel().getColumn(0).setMaxWidth(80);
        taHash.getColumnModel().getColumn(1).setMinWidth(80);
        taHash.getColumnModel().getColumn(1).setMaxWidth(80);

        btnCalculate = new JButton("Počítej");
        btnCalculate.setPreferredSize(CK_DIMENSION);

        btnFile = new JButton("...");

        btnBack = new JButton("Zpět");
        btnBack.setPreferredSize(CK_DIMENSION);

        buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        buttonsPanel.add(btnCalculate);
        buttonsPanel.add(btnBack);

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
        gridBagConstraints.gridwidth = 6;
        panelCenter.add(tfPath, gridBagConstraints);
        gridBagConstraints.gridwidth = 1;
        panelCenter.add(btnFile, gridBagConstraints);
        
        gridBagConstraints.gridy = 1; //second row
        panelCenter.add(lblAlgorithm, gridBagConstraints);
        panelCenter.add(cbMd2, gridBagConstraints);
        panelCenter.add(cbMd5, gridBagConstraints);
        panelCenter.add(cbSha1, gridBagConstraints);
        panelCenter.add(cbSha224, gridBagConstraints);
        panelCenter.add(cbSha256, gridBagConstraints);
        panelCenter.add(cbSha384, gridBagConstraints);
        panelCenter.add(cbSha512, gridBagConstraints);

//        gridBagConstraints.gridy = 2; //third row
//        gridBagConstraints.gridx = 1 ;
//        gridBagConstraints.gridx = GridBagConstraints.RELATIVE;
                
        //TODO bigger area
        gridBagConstraints.gridy = 3; //fourth-seventh row
        gridBagConstraints.gridwidth=8;
        gridBagConstraints.gridheight=4;
        panelCenter.add(scPane, gridBagConstraints);
        gridBagConstraints.gridwidth=1;
        gridBagConstraints.gridheight=1;

        gridBagConstraints.gridy = 8; //8th row
        gridBagConstraints.gridwidth = 8;
        panelCenter.add(buttonsPanel, gridBagConstraints);

        add(panelCenter, BorderLayout.CENTER);

        jProgressBar = new JProgressBar();

        add(jProgressBar, BorderLayout.SOUTH);
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
     *                                                                                          Get & Set
     ****************************************************************************************************/
    /**
     * Return text from tfPath fields
     * @return {@link String} - Trimmed
     */
    public String getPathText() {
        return tfPath.getText().trim();
    }
    
    /**
     * Set text to tfPath fiels
     * @param path {@link String} - Trimmed
     */
    public void setPathText(String path) {
        tfPath.setText(path.trim());
    }

    /****************************************************************************************************
     *                                                                                          Variables
     ****************************************************************************************************/
    private JLabel lblPath, lblAlgorithm;
    private JTextField tfPath;
    private JCheckBox cbMd2, cbMd5, cbSha1, cbSha224, cbSha256, cbSha384, cbSha512;
    //private JTextArea taHash;
    private JTable taHash;
    private JScrollPane scPane;
    private JButton btnFile, btnCalculate, btnBack;
    private JPanel panelCenter, buttonsPanel;
    private GridBagConstraints gridBagConstraints;
    private JProgressBar jProgressBar;
    private final Dimension CK_DIMENSION = new Dimension(90, 30);
    private final Dimension TA_SIZE = new Dimension(300, 400);
}
