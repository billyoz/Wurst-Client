/*
 * Copyright � 2014 - 2015 | Alexander01998 | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.clickgui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;

public class MinimizeButton extends ClickGuiButton
{
	@Override
	protected void drawIcon(Graphics2D g)
	{
		g.setColor(new Color(64, 64, 64, 128));
		g.fillRect(0, 0, 28, 28);
		g.setColor(Color.BLACK);
		g.drawPolygon(new int[]{2, 26, 14}, new int[]{8, 8, 22}, 3);
		g.setColor(new Color(0, 255, 0, 64));
		g.fillPolygon(new int[]{2, 26, 14}, new int[]{8, 8, 22}, 3);
	}
	
	@Override
	protected void click(ActionEvent e)
	{
		
	}	

	@Override
	protected void drawHoverIcon(Graphics2D g)
	{
		
	}

	@Override
	protected void drawPressedIcon(Graphics2D g)
	{
		
	}
}