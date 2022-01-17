package app.LaGr77.jHashUtil.view;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Main panel view
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.0
 * @since 2022-01-17
 */
public class MainPanel extends JPanel {
    
    /** Constructor */
    public MainPanel() {
        btnHash = new JButton("Vytvoření HASHe");
        btnHash.setPreferredSize(MIN_PREF_BUTTON);
        btnHash.setMinimumSize(MIN_PREF_BUTTON);

        btnHashCheck = new JButton("Kontrola HASHe");
        btnHashCheck.setPreferredSize(MIN_PREF_BUTTON);
        btnHashCheck.setMinimumSize(MIN_PREF_BUTTON);

        btnSettings = new JButton("Nastavení");
        btnSettings.setPreferredSize(MIN_PREF_BUTTON);
        btnSettings.setMinimumSize(MIN_PREF_BUTTON);

        btnExit = new JButton("Konec");
        btnExit.setPreferredSize(MIN_PREF_BUTTON);
        btnExit.setMinimumSize(MIN_PREF_BUTTON);

        setLayout(new BorderLayout());

        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = GridBagConstraints.RELATIVE; // columns gradually
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(0, 0, 10, 10);
        gridBagConstraints.gridy = 0; //first row
        buttonsPanel.add(btnHash, gridBagConstraints);
        buttonsPanel.add(btnHashCheck, gridBagConstraints);

        gridBagConstraints.gridy = 1; //second row
        buttonsPanel.add(btnSettings, gridBagConstraints);
        buttonsPanel.add(btnExit, gridBagConstraints);

        add(buttonsPanel, BorderLayout.CENTER);
    }

    /****************************************************************************************************
     *                                                                                            Methods
     ****************************************************************************************************/
    /**
     * @param event {@link ActionListener}
     */
    public void btnHashAction(ActionListener event) {
        btnHash.addActionListener(event);
    }

    /**
     * @param event {@link ActionListener}
     */
    public void btnHashCheckAction(ActionListener event) {
        btnHashCheck.addActionListener(event);
    }

    /**
     * Exit action
     * @param event {@link ActionListener}
     */
    public void btnExitAction (ActionListener event) {
        btnExit.addActionListener(event);
    }

    /**
     * Switch to SettingsPanel
     * @param event {@link ActionListener}
     */
    public void btnSettingsAction (ActionListener event) {
        btnSettings.addActionListener(event);
    }    

    /****************************************************************************************************
     *                                                                                          Variables
     ****************************************************************************************************/
    private JButton btnExit, btnSettings, btnHash, btnHashCheck;
    private JPanel buttonsPanel;
    private GridBagConstraints gridBagConstraints;
    private final Dimension MIN_PREF_BUTTON = new Dimension(150, 80);
}
