package app.LaGr77.jHashUtil.view;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import app.LaGr77.jHashUtil.controller.HashPanelContr;
import app.LaGr77.jHashUtil.controller.MainPanelContr;
import app.LaGr77.jHashUtil.model.HashPanelModel;
import app.LaGr77.jHashUtil.model.MainPanelModel;


/**
 * Main Frame
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.1.2022-01-21
 * @since 2022-01-21
 */
public class MainFrame extends JFrame{
    
    public MainFrame() {
        super("jHashUtil");
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        
        // initialize MainPanel
        mainPanelController = new MainPanelContr(new MainPanelModel(), new MainPanel());
        mainPanelController.initController();
        add(mainPanelController.getView(), MainPanel.class.getName());
        mainPanelController.btnExitAction(event -> System.exit(0));

        // initialize HashPanel
        hashPanelController = new HashPanelContr(new HashPanelModel(), new HashPanel());
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
