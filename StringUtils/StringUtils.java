/*⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤
 Copyright (C) 2020-2021 developed by Oppyusa

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License v3.0.
 
 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License v3.0 for more details.

 You should have received a copy of the GNU General Public License v3.0
 along with this program.  If not, see https://github.com/NOcode1/OppyClient-Utils/blob/main/LICENSE.

 Contact: 
 	Discord: @Oppyusa#9297 or https:discord.gg/CZYww6T
 	Github: Submit issue
 ⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤⏤*/

package oppyclient.utils;

import net.minecraft.client.gui.FontRenderer;
import oppyclient.gui.UnicodeFontRenderer;

/** Some functions for drawing strings with custom fonts.
 * @author Oppyusa at discord.gg/CZYww6T
 * @version 1.0.0 **/
public class StringUtils {
	
	/** {@link UnicodeFontRenderer} font renderer.
     * @param ufr custom font renderer
     * @param text text
     * @param width text width
     * @param height text height **/
	public void drawCenteredString(UnicodeFontRenderer fontRendererIn, String text, int width, int height, int color)
    {
		try {
			fontRendererIn.drawStringWithShadow(text, (float)(width - fontRendererIn.getStringWidth(text) / 2), (float)height, color);
		}
		catch (NullPointerException e) {
			fontRendererIn = UnicodeFontRenderer.getFontOnPC("Arial", 24);
			fontRendererIn.drawStringWithShadow(text, (float)(width - fontRendererIn.getStringWidth(text) / 2), (float)height, color);
		}
    }
	
	/** {@link UnicodeFontRenderer} font renderer.
     * @param ufr custom font renderer
     * @param text text
     * @param width text width
     * @param height text height **/
	public void drawString(UnicodeFontRenderer fontRendererIn, String text, int width, int height, int color)
    {
		try {
			fontRendererIn.drawStringWithShadow(text, (float)width, (float)height, color);
		}
		catch (NullPointerException e) {
			fontRendererIn = UnicodeFontRenderer.getFontOnPC("Arial", 24);
			fontRendererIn.drawStringWithShadow(text, (float)width, (float)height, color);
		}
    }

}
