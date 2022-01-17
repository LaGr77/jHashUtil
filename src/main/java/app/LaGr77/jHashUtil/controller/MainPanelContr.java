package app.LaGr77.jHashUtil.controller;

import java.awt.event.ActionListener;

import app.LaGr77.jHashUtil.model.MainPanelModel;
import app.LaGr77.jHashUtil.view.MainPanel;

/**
 * Main panel controller
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.0
 * @since 2022-01-17
 */
public class MainPanelContr implements ControllerInterface{

   /**
     * Constructor
     * @param model {@link MainPanelModel} 
     * @param view {@link MainMenuView}
      */
      public MainPanelContr(MainPanelModel model, MainPanel view) {
        setModel(model);
        setView(view);
    }
    
    /****************************************************************************************************
     *                                                                                            Methods
     ****************************************************************************************************/
    @Override
    public void initController() {}

    /**
     * Exit action
     * @param event {@link ActionListener}
     */
    public void btnExitAction(ActionListener event) {
        view.btnExitAction(event);
    }

    /**
     * @param event {@link ActionListener}
     */
    public void btnHashAction(ActionListener event) {
        view.btnHashAction(event);
    }

    /**
     * Switch to DictionaryPanel Ru-Cz
     * @param event {@link ActionListener}
     */
    public void btnHashCheckAction(ActionListener event) {
        view.btnHashCheckAction(event);
    }

    /**
     * Switch to SettingsPanel
     * @param event {@link ActionListener}
     */
    public void btnSettingsAction(ActionListener event) {
        view.btnSettingsAction(event);
    }

    /****************************************************************************************************
     *                                                                                          Get & Set
     ****************************************************************************************************/
    /**
     * Set model
     * @param model {@link MainPanelModel}
     */
    private void setModel(MainPanelModel model) {
        this.model = model;
    }

    /**
     * Get view
     * @return {@link MainPanel}
     */
    public MainPanel getView() {
        return view;
    }

    /**
     * Set view
     * @param view {@link MainPanel}
     */
    private void setView(MainPanel view) {
        this.view = view;
    }

    /****************************************************************************************************
     *                                                                                          Variables
     ****************************************************************************************************/
    private MainPanelModel model;
    private MainPanel view;    
}
