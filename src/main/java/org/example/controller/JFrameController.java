/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


/**
 *
 * @author ericp
 */
public class JFrameController {
    public static void cambiarPanel(JPanel panelRemover,JPanel panelNuevo, Component o){
        JFrame contenedor = (JFrame) SwingUtilities.getWindowAncestor(o);
        contenedor.remove(panelRemover);
        contenedor.add(panelNuevo);
        contenedor.validate();
        contenedor.repaint();
    }
}
