/*
 * Copyright (C) 2010 Christian Gawron
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.cgawron.agoban.view;

import android.content.res.Resources;
import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import de.cgawron.agoban.GobanEvent;
import de.cgawron.go.Point;

public class GobanEventHandler /*extends MultiTouchController<Object> */ implements
		View.OnLongClickListener, View.OnTouchListener
{
	private static int MIN_STILL_TIME = 10;

	private final GobanView gobanView;
	private long time;
	private boolean armed;

	public GobanEventHandler(GobanView gobanView, Resources res)
	{
		//super(gobanView, res, false);
		this.gobanView = gobanView;
	}

	public boolean onTouch(View view, MotionEvent event)
	{
		Log.d("GobanEventHandler",
				String.format("onTouchEvent: %s %d", event,
						event.getEventTime() - time));
		GobanEvent gobanEvent = new GobanEvent(gobanView, event);
		Log.d("GobanEventHandler", "gobanEvent: " + gobanEvent);

		switch (event.getAction()) {
		case MotionEvent.ACTION_UP:
			gobanView.setBlowup(gobanEvent);
			gobanView.setCursorPosition(null);
			if (armed && event.getEventTime() - time > MIN_STILL_TIME) {
				gobanView.fireGobanEvent(gobanEvent);
			}
			break;

		case MotionEvent.ACTION_DOWN:
			time = event.getEventTime();
			armed = true;
			gobanView.setBlowup(gobanEvent);
			gobanView.setCursorPosition(gobanEvent.getPointF());
			return true;

		case MotionEvent.ACTION_MOVE:
			gobanView.setBlowup(gobanEvent);
		default:
			time = event.getEventTime();
			gobanView.setCursorPosition(gobanEvent.getPointF());
			break;
		}
		return true;
	}

	public boolean onTrackballEvent(MotionEvent event)
	{
		Log.d("GobanEventHandler", "onTrackballEvent: " + event);
		PointF pF = gobanView.getCursorPosition();
		Point p;
		if (pF == null)
			p = new Point(9, 9);
		else
			p = new Point((int) pF.x, (int) pF.y);

		switch (event.getAction()) {
		case MotionEvent.ACTION_UP:
			gobanView.setCursorPosition(null);
			if (event.getEventTime() - time > MIN_STILL_TIME) {
				GobanEvent gobanEvent = new GobanEvent(gobanView, p);
				Log.d("GobanEventHandler", "gobanEvent: " + gobanEvent);
				gobanView.fireGobanEvent(gobanEvent);
			}
			break;

		case MotionEvent.ACTION_MOVE:
			float dx = event.getX();
			float dy = event.getY();
			int x = (int) (p.getX() + Math.signum(dx));
			int y = (int) (p.getY() + Math.signum(dy));
			if (x < 0)
				x = 0;
			else if (x >= gobanView.getBoardSize())
				x = gobanView.getBoardSize() - 1;
			if (y < 0)
				y = 0;
			else if (y >= gobanView.getBoardSize())
				y = gobanView.getBoardSize() - 1;
			p = new Point(x, y);
			Log.d("GobanEventHandler",
					String.format("onTrackballEvent: %s (%f, %f)", p, dx, dy));
			/* fall through */
		default:
			time = event.getEventTime();
			GobanEvent gobanEvent = new GobanEvent(gobanView, p);
			Log.d("GobanEventHandler", "gobanEvent: " + gobanEvent);
			gobanView.setCursorPosition(gobanEvent.getPointF());
			break;
		}

		return true;
	}

	public boolean onLongClick(View view)
	{
		Log.d("GobanEventHandler", "onLongClick");
		armed = false;
		boolean shown = gobanView.showContextMenu();
		Log.d("GobanEventHandler", "onLongClick: " + shown);
		return true;
	}
}
