package myreality.development.magicwizard.components;

import myreality.development.magicwizard.R;
import android.app.Activity;
import android.graphics.Typeface;

/**
 * Simple implementation of {@see ComponentHandlerFactory}
 * 
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 1.2
 * @version 1.2
 *
 */
public class SimpleComponentHandlerFactory implements ComponentHandlerFactory {
	
	private Typeface typeface;
	
	public SimpleComponentHandlerFactory(Activity context) {
		typeface = Typeface.createFromAsset(context.getAssets(), "fonts/fritzbold.ttf");
	}

	@Override
	public ComponentHandler create() {
		
		ComponentHandler handler = new ComponentHandler();
		
		handler.add(R.id.btn_reset, new ResetComponent());  
		handler.add(R.id.btn_rate, new RateComponent());
		handler.add(R.id.btn_close, new CloseComponent());
		handler.add(R.id.btn_info, new InfoComponent(typeface));
		handler.add(R.id.btn_timeout, new DisplayTimeoutComponent());
		
		return handler;
	}

}
