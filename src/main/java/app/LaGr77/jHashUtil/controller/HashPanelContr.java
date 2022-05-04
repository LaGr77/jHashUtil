package app.LaGr77.jHashUtil.controller;

import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

import app.LaGr77.jHashUtil.model.HashPanelModel;
import app.LaGr77.jHashUtil.util.Algo;
import app.LaGr77.jHashUtil.view.HashPanel;

/**
 * Hash panel controller
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.4.2022-04-13
 * @since 2022-01-27
 */
public class HashPanelContr implements ControllerInterface {
        
    /** Constructor */
    public HashPanelContr() {
        setModel(new HashPanelModel());
        setView(new HashPanel(this.getModel())); 
    }

    /****************************************************************************************************
     *                                                                                            Methods
     ****************************************************************************************************/
    @Override
    public void initController() {
        initView();
    }

    /**
     * Init Panel
     */
    private void initView() {
        btnFileAction();
        btnCalculateAction();
    }

    /**
     * Switch to MainPanel
     * @param event {@link ActionListener}
     */
    public void btnBackAction(ActionListener event) {
        view.btnBackAction(event);
    }

    public void btnCalculateAction() {
        view.btnCalculateAction(event -> {
            getModel().addRow(new Object[] { "Test", "MD5", "12345678901234567890" });
            Algo[] array = view.getAlgo();
        });
    }

    /**
     * JButton FindPath action
     */
    private void btnFileAction() {
        view.btnFileAction(event -> {
            JFileChooser fc = new JFileChooser();
            fc.setCurrentDirectory(new java.io.File("."));
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int returnVal = fc.showSaveDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                getView().setPathText(fc.getSelectedFile().getAbsolutePath());
            }
    });}

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
     * Return model
     * @return {@link HashPanelModel}
     */
    private HashPanelModel getModel() {
        return this.model;
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
