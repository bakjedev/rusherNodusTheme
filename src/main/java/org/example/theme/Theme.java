package org.example.theme;

import org.jetbrains.annotations.Nullable;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.client.api.ui.theme.ThemeBase;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;

import java.awt.*;

public class Theme extends ThemeBase {
    public ColorSetting fontColor = new ColorSetting("FontColor", new Color(255, 255, 255));
    public ColorSetting categoryColor = new ColorSetting("CategoryColor", new Color(0, 0, 0, 209));
    public ColorSetting backColor = new ColorSetting("BackColor", new Color(64, 64, 64, 202));
    public ColorSetting outlineColor = new ColorSetting("OutlineColor", new Color(128, 128, 128, 134));
    public ColorSetting moduleOutlineColor = new ColorSetting("ModuleOutlineColor", new Color(128, 128, 128, 117));
    public NumberSetting<Float> outlineWidth = new NumberSetting<>("OutlineWidth", 8F, 0.1F, 9F);
    public NumberSetting<Float> scrollSpeed = new NumberSetting<>("ScrollSpeed", 15F, 1F, 20F);
    public BooleanSetting settingsOutline = new BooleanSetting("SettingsOutline", false);

    public Theme(String name, String description, Color defaultColor) {
        super(name, description, defaultColor);
        getColorSetting().setValue(new Color(0, 255, 0));
        registerSettings(
                categoryColor,
                fontColor,
                backColor,
                outlineColor,
                moduleOutlineColor,
                settingsOutline,
                outlineWidth,
                scrollSpeed
        );
    }

    @Override
    public @Nullable PanelHandlerBase<?> getClickGuiHandler() {
        return ExamplePlugin.handler;
    }

}
