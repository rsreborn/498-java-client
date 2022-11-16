/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class11 implements MouseListener, MouseMotionListener, FocusListener
{
	static int anInt214;
	static int anInt215;
	static int anInt216;
	private static RSString aClass16_217 = Class38_Sub6.method1076((byte) 86, "Hidden");
	static int anInt218;
	static int anInt219;
	static RSString aClass16_220 = aClass16_217;
	static int anInt221;
	static int anInt222;
	static RSString aClass16_223;
	static int[] anIntArray224;
	static int anInt225;
	static int anInt226;
	static RSString aClass16_227;
	static RSString aClass16_228;
	static int[] anIntArray229 = new int[200];
	static int anInt230;
	static byte[][] aByteArrayArray231;
	
	public final synchronized void mousePressed(MouseEvent mouseevent) {
		if (CacheIndex.aClass11_264 != null) {
			Class39.anInt605 = 0;
			Class79.anInt1888 = mouseevent.getX();
			Class23_Sub4_Sub23.anInt3289 = mouseevent.getY();
			Class23_Sub4_Sub37.aLong3497 = Class94.method1466(22624);
			if (mouseevent.isMetaDown()) {
				Class59.anInt918 = 2;
				Class19.anInt325 = 2;
			} else {
				Class59.anInt918 = 1;
				Class19.anInt325 = 1;
			}
			int i = mouseevent.getModifiers();
		}
		anInt219++;
		if (mouseevent.isPopupTrigger()) {
			mouseevent.consume();
		}
	}
	
	public final synchronized void focusLost(FocusEvent focusevent) {
		if (CacheIndex.aClass11_264 != null) {
			Class19.anInt325 = 0;
		}
		anInt226++;
	}
	
	public final void focusGained(FocusEvent focusevent) {
		anInt225++;
	}
	
	public final void mouseClicked(MouseEvent mouseevent) {
		anInt215++;
		if (mouseevent.isPopupTrigger()) {
			mouseevent.consume();
		}
	}
	
	public final synchronized void mouseEntered(MouseEvent mouseevent) {
		if (CacheIndex.aClass11_264 != null) {
			Class39.anInt605 = 0;
			Class23_Sub4_Sub34.anInt3449 = mouseevent.getX();
			Class23_Sub26.anInt2469 = mouseevent.getY();
		}
		anInt216++;
	}
	
	public static void method111(byte b) {
		anIntArray224 = null;
		if (b != 51) {
			anIntArray224 = null;
		}
		aClass16_217 = null;
		aClass16_220 = null;
		aClass16_228 = null;
		aByteArrayArray231 = null;
		aClass16_223 = null;
		aClass16_227 = null;
		anIntArray229 = null;
	}
	
	public final synchronized void mouseMoved(MouseEvent mouseevent) {
		anInt214++;
		if (CacheIndex.aClass11_264 != null) {
			Class39.anInt605 = 0;
			Class23_Sub4_Sub34.anInt3449 = mouseevent.getX();
			Class23_Sub26.anInt2469 = mouseevent.getY();
		}
	}
	
	public final synchronized void mouseReleased(MouseEvent mouseevent) {
		anInt222++;
		if (CacheIndex.aClass11_264 != null) {
			Class39.anInt605 = 0;
			Class19.anInt325 = 0;
			int i = mouseevent.getModifiers();
		}
		if (mouseevent.isPopupTrigger()) {
			mouseevent.consume();
		}
	}
	
	public final synchronized void mouseDragged(MouseEvent mouseevent) {
		if (CacheIndex.aClass11_264 != null) {
			Class39.anInt605 = 0;
			Class23_Sub4_Sub34.anInt3449 = mouseevent.getX();
			Class23_Sub26.anInt2469 = mouseevent.getY();
		}
		anInt218++;
	}
	
	public final synchronized void mouseExited(MouseEvent mouseevent) {
		if (CacheIndex.aClass11_264 != null) {
			Class39.anInt605 = 0;
			Class23_Sub4_Sub34.anInt3449 = -1;
			Class23_Sub26.anInt2469 = -1;
		}
		anInt230++;
	}
	
	static {
		aClass16_227 = Class38_Sub6.method1076((byte) 86, "Ausw-=hlen");
		aClass16_228 = Class38_Sub6.method1076((byte) 86, "Anmelde)2Limit -Uberschritten)3");
		aClass16_223 = Class38_Sub6.method1076((byte) 86, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");
		anInt221 = 0;
		anIntArray224 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		aByteArrayArray231 = new byte[250][];
	}
}
