package app.LaGr77.jHashUtil.view;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import app.LaGr77.jHashUtil.controller.MainPanelContr;
import app.LaGr77.jHashUtil.model.MainPanelModel;


/**
 * Main Frame
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.0
 * @since 2022-01-17
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
    private final Dimension dimensions = new Dimension(800, 600);
}
