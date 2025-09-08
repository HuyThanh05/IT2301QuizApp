/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nht.ultils.theme;

import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public class ThemeManager {

    private static ThemeFactory themeFactory = new DefaultFactory();

    /**
     * @param aThemeFactory the themeFactory to set
     */
    public static void setThemeFactory(ThemeFactory aThemeFactory) {
        themeFactory = aThemeFactory;
    }

    public static void appltTheme(Scene scene) {
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(themeFactory.getStyleSheet());
    }
}
