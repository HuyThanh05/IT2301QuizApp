/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.nht.ultils.theme;

import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public enum Theme {
    DEFAULT {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setThemeFactory(new DefaultFactory());
            ThemeManager.appltTheme(scene);
        }
    }, DARK {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setThemeFactory(new DarkFactory());
            ThemeManager.appltTheme(scene);
        }
    }, LIGHT {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setThemeFactory(new LightFactory());
            ThemeManager.appltTheme(scene);
        }
    };

    public abstract void updateTheme(Scene scene);
}
