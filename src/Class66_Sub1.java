/* Class66_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class66_Sub1 extends Class66 implements MouseWheelListener
{
	private int anInt2722 = 0;
	
	final synchronized int method1236(int i) {
		int i_0_ = anInt2722;
		anInt2722 = 0;
		if (i >= -56) {
			anInt2722 = -69;
		}
		return i_0_;
	}
	
	final void method1238(Component component, byte b) {
		if (b != 124) {
			mouseWheelMoved(null);
		}
		component.removeMouseWheelListener(this);
	}
	
	final void method1240(int i, Component component) {
		if (i == 13474) {
			component.addMouseWheelListener(this);
		}
	}
	
	Class66_Sub1() {
		/* empty */
	}
	
	public final synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		anInt2722 += mousewheelevent.getWheelRotation();
	}
}
