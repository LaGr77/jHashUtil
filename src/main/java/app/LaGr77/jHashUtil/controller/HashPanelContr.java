package app.LaGr77.jHashUtil.controller;

import app.LaGr77.jHashUtil.model.HashPanelModel;
import app.LaGr77.jHashUtil.view.HashPanel;

/**
 * Hash panel controller
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.0
 * @since 2022-01-19
 */
public class HashPanelContr implements ControllerInterface {
        
    /**
     * Constructor
     * @param model
     * @param view
     */
    public HashPanelContr(HashPanelModel model, HashPanel view) {
        setModel(model);
        setView(view);
    }

    /****************************************************************************************************
     *                                                                                            Methods
     ****************************************************************************************************/
    @Override
    public void initController() {}

    /****************************************************************************************************
     *                                                                                          Get & Set
     ****************************************************************************************************/
        /**
     * Set model
     * @param model {@link HashPanelModel}
     */
    private void setModel(HashPanelModel model) {
        this.model = model;
    }

    /**
     * Get view
     * @return {@link HashPanel}
     */
    public HashPanel getView() {
        return view;
    }

    /**
     * Set view
     * @param view {@link HashPanel}
     */
    private void setView(HashPanel view) {
        this.view = view;
    }


    /****************************************************************************************************
     *                                                                                          Variables
     ****************************************************************************************************/
    private HashPanelModel model;
    private HashPanel view;  
}
