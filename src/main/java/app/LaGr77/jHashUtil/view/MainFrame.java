package app.LaGr77.jHashUtil.view;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import app.LaGr77.jHashUtil.controller.HashPanelContr;
import app.LaGr77.jHashUtil.controller.MainPanelContr;


/**
 * Main Frame
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.2.2022-04-08
 * @since 2022-01-21
 */
public class MainFrame extends JFrame{
    
    public MainFrame() {
        super("jHashUtil");
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        
        // initialize MainPanel
        mainPanelController = new MainPanelContr();
        mainPanelController.initController();
        add(mainPanelController.getView(), MainPanel.class.getName());
        mainPanelController.btnExitAction(event -> System.exit(0));

        // initialize HashPanel
        hashPanelController = new HashPanelContr();
        hashPanelController.initController();;
        add(hashPanelController.getView(), HashPanel.class.getName());
        hashPanelController.btnBackAction(event -> cardLayout.show(MainFrame.this.getContentPane(), MainPanel.class.getName()));
        mainPanelController.btnHashAction(event -> cardLayout.show(MainFrame.this.getContentPane(), HashPanel.class.getName()));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimensions);
        setMinimumSize(dimensions);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    



    /****************************************************************************************************
     *                                                                                          Variables
     ****************************************************************************************************/
    private CardLayout cardLayout;
    private MainPanelContr mainPanelController;
    private HashPanelContr hashPanelController;
    private final Dimension dimensions = new Dimension(800, 600);
}
