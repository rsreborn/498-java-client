/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, ComponentListener, WindowListener
{
	//Resizable Client Shit
	static int newH;
	static int newW;
	
	static int anInt1;
	static int anInt2;
	static int anInt3;
	static RSString aClass16_4 = Class38_Sub6.method1076((byte) 86, "Art");
	static int anInt5;
	static int anInt6;
	static int anInt7;
	static int anInt8;
	static int anInt9;
	static RSString[] aClass16Array10;
	static int anInt11;
	static int anInt12;
	static int anInt13;
	static int anInt14;
	static int anInt15;
	static RSString aClass16_16;
	static int anInt17;
	static int anInt18;
	static int anInt19;
	static int anInt20;
	static int anInt21;
	static int anInt22;
	static int anInt23;
	static int anInt24;
	static int anInt25;
	static int anInt26;
	static int anInt27;
	static Class38_Sub4[] aClass38_Sub4Array28 = new Class38_Sub4[4];
	static int anInt29;
	static int anInt30;
	private boolean aBoolean31 = false;
	static RSString aClass16_32 = Class38_Sub6.method1076((byte) 86, "Registrierter Benutzer");
	static int anInt33;
	static int anInt34;
	private static RSString aClass16_35;
	static int anInt36;
	static int anInt37;
	static int anInt38;
	static int anInt39;
	static int anInt40;
	static int anInt41;
	static int[] anIntArray42;
	static RSString aClass16_43;
	public static int anInt44;
	
	final void method15(int i, int i_0_, int i_1_, int i_2_, String string, boolean bool, int i_3_) {
		try {
			Class45.anApplet_Sub1_684 = this;
			Class51.anInt801 = i_2_;
			Class23_Sub13_Sub25.anInt4295 = i_0_;
			Class23_Sub4_Sub19.anInt3205 = i_3_;
			Class23_Sub19.aFrame2385 = new Frame();
			Class23_Sub19.aFrame2385.setTitle("Jagex");
			Class23_Sub19.aFrame2385.setResizable(true);//false originally
			Class23_Sub19.aFrame2385.addWindowListener(this);
			Class23_Sub19.aFrame2385.setVisible(bool);
			Class23_Sub19.aFrame2385.toFront();
			Insets insets = Class23_Sub19.aFrame2385.getInsets();
			Class23_Sub19.aFrame2385.setSize(insets.right + i_2_ + insets.left, insets.bottom + (i_3_ - -insets.top));
			Class23_Sub4_Sub28.aClass9_3348 = Class23_Sub4_Sub3.aClass9_2939 = new Class9(true, null, i, string, i_1_);
			Class23_Sub4_Sub3.aClass9_2939.method104(1, this, (byte) 72);
		} catch (Exception exception) {
			Class26.method925(95, exception, null);
		}
		anInt5++;
	}
	
	public final void start() {
		anInt7++;
		if (this == Class45.anApplet_Sub1_684 && !Class23_Sub13_Sub1.aBoolean3665) {
			Class27.aLong417 = 0L;
		}
	}
	
	public final void focusLost(FocusEvent focusevent) {
		Class7.aBoolean166 = false;
		anInt11++;
	}
	
	public final void focusGained(FocusEvent focusevent) {
		Class7.aBoolean166 = true;
		anInt3++;
		Class23_Sub13_Sub18.aBoolean4085 = true;
	}
	
	abstract void method16(byte b);
	
	abstract void method17(int i);
	
	public final URL getDocumentBase() {
		anInt33++;
		if (Class23_Sub19.aFrame2385 != null) {
			return null;
		}
		if (Class23_Sub4_Sub3.aClass9_2939 != null && Class23_Sub4_Sub3.aClass9_2939.anApplet188 != this) {
			return Class23_Sub4_Sub3.aClass9_2939.anApplet188.getDocumentBase();
		}
		return super.getDocumentBase();
	}
	
	public final AppletContext getAppletContext() {
		anInt27++;
		if (Class23_Sub19.aFrame2385 != null) {
			return null;
		}
		if (Class23_Sub4_Sub3.aClass9_2939 != null && this != Class23_Sub4_Sub3.aClass9_2939.anApplet188) {
			return Class23_Sub4_Sub3.aClass9_2939.anApplet188.getAppletContext();
		}
		return super.getAppletContext();
	}
	
	public final void stop() {
		anInt38++;
		if (this == Class45.anApplet_Sub1_684 && !Class23_Sub13_Sub1.aBoolean3665) {
			Class27.aLong417 = Class94.method1466(22624) - -4000L;
		}
	}
	
	public final String getParameter(String string) {
		anInt19++;
		if (Class23_Sub19.aFrame2385 != null) {
			return null;
		}
		if (Class23_Sub4_Sub3.aClass9_2939 != null && Class23_Sub4_Sub3.aClass9_2939.anApplet188 != this) {
			return Class23_Sub4_Sub3.aClass9_2939.anApplet188.getParameter(string);
		}
		return super.getParameter(string);
	}
	
	public abstract void init();
	
	private final void method18(int i) {
		anInt23++;
		long l = Class94.method1466(22624);
		long l_4_ = Class23_Sub14.aLongArray2334[Class23_Sub4_Sub15.anInt3139];
		Class23_Sub14.aLongArray2334[Class23_Sub4_Sub15.anInt3139] = l;
		Class23_Sub4_Sub15.anInt3139 = 0x1f & Class23_Sub4_Sub15.anInt3139 - -1;
		if ((l_4_ ^ 0xffffffffffffffffL) != -1L && l > l_4_) {
			int i_5_ = (int) (-l_4_ + l);
			Class2.anInt79 = ((i_5_ >> 1) + 32000) / i_5_;
		}
		if (i >= -5) {
			anIntArray42 = null;
		}
		if (Class27.anInt415++ > 50) {
			Class23_Sub13_Sub18.aBoolean4085 = true;
			Class27.anInt415 -= 50;
			Class71_Sub3.aCanvas2740.setSize(Class51.anInt801, Class23_Sub4_Sub19.anInt3205);
			Class71_Sub3.aCanvas2740.setVisible(true);
			if (Class23_Sub19.aFrame2385 != null) {
				Insets insets = Class23_Sub19.aFrame2385.getInsets();
				Class71_Sub3.aCanvas2740.setLocation(insets.left, insets.top);
			} else {
				Class71_Sub3.aCanvas2740.setLocation(0, 0);
			}
		}
		method28(true);
	}
	
	private final void method19(boolean bool, int i) {
		anInt18++;
		synchronized (this) {
			if (Class23_Sub13_Sub1.aBoolean3665) {
				return;
			}
			Class23_Sub13_Sub1.aBoolean3665 = true;
		}
		if (Class23_Sub4_Sub3.aClass9_2939.anApplet188 != null) {
			Class23_Sub4_Sub3.aClass9_2939.anApplet188.destroy();
		}
		if (Class71_Sub3.aCanvas2740 != null) {
			try {
				Class71_Sub3.aCanvas2740.removeFocusListener(this);
				Container container;
				if (Class23_Sub19.aFrame2385 != null) {
					container = Class23_Sub19.aFrame2385;
				} else {
					container = Class23_Sub4_Sub3.aClass9_2939.anApplet188;
				}
				container.remove(Class71_Sub3.aCanvas2740);
			} catch (Exception exception) {
				/* empty */
			}
		}
		try {
			method22((byte) 20);
		} catch (Exception exception) {
			/* empty */
		}
		if (Class23_Sub4_Sub3.aClass9_2939 != null) {
			try {
				Class23_Sub4_Sub3.aClass9_2939.method99(65);
			} catch (Exception exception) {
				/* empty */
			}
		}
		method16((byte) 56);
		if (Class23_Sub19.aFrame2385 != null) {
			try {
				System.exit(0);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (i == 0) {
			System.out.println("Shutdown complete - clean:" + bool);
		}
	}
	
	public static void method20(boolean bool) {
		aClass16_32 = null;
		aClass16Array10 = null;
		aClass16_43 = null;
		aClass38_Sub4Array28 = null;
		if (bool == false) {
			aClass16_16 = null;
			aClass16_4 = null;
			aClass16_35 = null;
			anIntArray42 = null;
		}
	}
	
	public final void update(Graphics graphics) {
		anInt14++;
		paint(graphics);
	}
	
	abstract void method21(byte b);
	
	abstract void method22(byte b);
	
	static final Class23_Sub13_Sub4 method23(int i, boolean bool) {
		anInt41++;
		Class23_Sub13_Sub4 class23_sub13_sub4 = (Class23_Sub13_Sub4) Class23_Sub4_Sub18.aClass5_3195.method62(-77, (long) i);
		if (class23_sub13_sub4 != null) {
			return class23_sub13_sub4;
		}
		byte[] bs = Class71.aClass105_1281.method1544(i, 0, 4);
		class23_sub13_sub4 = new Class23_Sub13_Sub4();
		if (bs != null) {
			class23_sub13_sub4.method619(3, new Buffer(bs), i);
		}
		if (bool != true) {
			providesignlink(null);
		}
		Class23_Sub4_Sub18.aClass5_3195.method67((long) i, class23_sub13_sub4, bool);
		return class23_sub13_sub4;
	}
	
	private final void method24(boolean bool) {
		if (bool != true) {
			aClass16_16 = null;
		}
		anInt26++;
		long l = Class94.method1466(22624);
		long l_6_ = Class27.aLongArray421[Class23_Sub13_Sub6.anInt3735];
		Class27.aLongArray421[Class23_Sub13_Sub6.anInt3735] = l;
		Class23_Sub13_Sub6.anInt3735 = Class23_Sub13_Sub6.anInt3735 + 1 & 0x1f;
		if (l_6_ != 0L && l_6_ < l) {
			/* empty */
		}
		synchronized (this) {
			Class23_Sub13_Sub25.aBoolean4294 = Class7.aBoolean166;
		}
		method17(45);
	}
	
	public final void destroy() {
		anInt2++;
		if (Class45.anApplet_Sub1_684 == this && !Class23_Sub13_Sub1.aBoolean3665) {
			Class27.aLong417 = Class94.method1466(22624);
			Class105.method1545((byte) -98, 5000L);
			Class23_Sub4_Sub28.aClass9_3348 = null;
			method19(false, 0);
		}
	}
	
	public final void windowDeactivated(WindowEvent windowevent) {
		anInt25++;
	}
	
	public final URL getCodeBase() {
		anInt36++;
		if (Class23_Sub19.aFrame2385 != null) {
			return null;
		}
		if (Class23_Sub4_Sub3.aClass9_2939 != null && this != Class23_Sub4_Sub3.aClass9_2939.anApplet188) {
			return Class23_Sub4_Sub3.aClass9_2939.anApplet188.getCodeBase();
		}
		return super.getCodeBase();
	}
	
	private final synchronized void method25(int i) {
		anInt17++;
		Container container;
		if (Class23_Sub19.aFrame2385 == null) {
			container = Class23_Sub4_Sub3.aClass9_2939.anApplet188;
		} else {
			container = Class23_Sub19.aFrame2385;
		}
		if (Class71_Sub3.aCanvas2740 != null) {
			Class71_Sub3.aCanvas2740.removeFocusListener(this);
			container.remove(Class71_Sub3.aCanvas2740);
		}
		Class71_Sub3.aCanvas2740 = new Canvas_Sub1(this);
		container.add(Class71_Sub3.aCanvas2740);
		Class71_Sub3.aCanvas2740.setSize(Class51.anInt801, Class23_Sub4_Sub19.anInt3205);
		Class71_Sub3.aCanvas2740.setVisible(true);
		if (Class23_Sub19.aFrame2385 != null) {
			Insets insets = Class23_Sub19.aFrame2385.getInsets();
			Class71_Sub3.aCanvas2740.setLocation(insets.left, insets.top);
		} else {
			Class71_Sub3.aCanvas2740.setLocation(0, 0);
		}
		Class71_Sub3.aCanvas2740.addFocusListener(this);
		if (i == 0) {
			Class71_Sub3.aCanvas2740.requestFocus();
			Class23_Sub13_Sub18.aBoolean4085 = true;
			Class40.aLong631 = Class94.method1466(22624);
		}
	}
	
	static final boolean method26(int i, int i_7_, int i_8_) {
		int i_9_ = -113 / ((i_8_ - -13) / 62);
		if (i_7_ == 11) {
			i_7_ = 10;
		}
		if (i_7_ >= 5 && i_7_ <= 8) {
			i_7_ = 4;
		}
		anInt21++;
		ObjectDefinition class23_sub13_sub7 = Class38_Sub2.loadObjectDefinition(i, -21035);
		return class23_sub13_sub7.method647(i_7_, 5836);
	}
	
	static final void method27(boolean bool, int i, Class23_Sub25 class23_sub25) {
		anInt12++;
		if (i != -28361) {
			aClass16_32 = null;
		}
		int i_10_ = class23_sub25.anInt2456;
		int i_11_ = (int) class23_sub25.aLong358;
		class23_sub25.method228(0);
		if (bool) {
			Class23_Sub13_Sub10.method703((byte) 9, i_10_);
		}
		Class23_Sub13_Sub2.method609(0, i_10_);
		Class64 class64 = Class23_Sub24.method905(i_11_, (byte) 111);
		if (class64 != null) {
			Class91.method1450((byte) 29, class64);
		}
		Class53.aBoolean840 = false;
		Class23_Sub13_Sub9.anInt3863 = 0;
		RuntimeException_Sub1.method1589(Class71_Sub3.anInt2746, Class69.anInt1216, Class23_Sub27.anInt2475, Class23_Sub4_Sub3.anInt2950, true);
		if (Class69.anInt1218 != -1) {
			Class23_Sub13_Sub13.method757(Class69.anInt1218, 1, false);
		}
	}
	
	public final void windowClosing(WindowEvent windowevent) {
		destroy();
		anInt13++;
	}
	
	abstract void method28(boolean bool);
	
	static final void method29(Color color, int i, int i_12_, boolean bool, RSString class16) {
		try {
			Graphics graphics = Class71_Sub3.aCanvas2740.getGraphics();
			if (Class23_Sub4_Sub6.aFont2988 == null) {
				Class23_Sub4_Sub6.aFont2988 = new Font("Helvetica", 1, 13);
				Class13.aFontMetrics267 = Class71_Sub3.aCanvas2740.getFontMetrics(Class23_Sub4_Sub6.aFont2988);
			}
			if (bool) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, Class51.anInt801, Class23_Sub4_Sub19.anInt3205);
			}
			if (color == null) {
				color = new Color(140, 17, 17);
			}
			try {
				if (Class23_Sub27.anImage2481 == null) {
					Class23_Sub27.anImage2481 = Class71_Sub3.aCanvas2740.createImage(304, 34);
				}
				Graphics graphics_13_ = Class23_Sub27.anImage2481.getGraphics();
				graphics_13_.setColor(color);
				graphics_13_.drawRect(0, 0, 303, 33);
				graphics_13_.fillRect(2, 2, i_12_ * 3, 30);
				graphics_13_.setColor(Color.black);
				if (i != 5000) {
					anIntArray42 = null;
				}
				graphics_13_.drawRect(1, 1, 301, 31);
				graphics_13_.fillRect(3 * i_12_ + 2, 2, -(3 * i_12_) + 300, 30);
				graphics_13_.setFont(Class23_Sub4_Sub6.aFont2988);
				graphics_13_.setColor(Color.white);
				class16.method164(22, 22218, graphics_13_, (-class16.method141(Class13.aFontMetrics267, -32) + 304) / 2);
				graphics.drawImage(Class23_Sub27.anImage2481, Class51.anInt801 / 2 - 152, Class23_Sub4_Sub19.anInt3205 / 2 + -18, null);
			} catch (Exception exception) {
				int i_14_ = -152 + Class51.anInt801 / 2;
				int i_15_ = -18 + Class23_Sub4_Sub19.anInt3205 / 2;
				graphics.setColor(color);
				graphics.drawRect(i_14_, i_15_, 303, 33);
				graphics.fillRect(i_14_ - -2, i_15_ - -2, i_12_ * 3, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(i_14_ - -1, i_15_ - -1, 301, 31);
				graphics.fillRect(i_12_ * 3 + (2 + i_14_), i_15_ - -2, -(3 * i_12_) + 300, 30);
				graphics.setFont(Class23_Sub4_Sub6.aFont2988);
				graphics.setColor(Color.white);
				class16.method164(i_15_ + 22, 22218, graphics, i_14_ - -((304 + -class16.method141(Class13.aFontMetrics267, -32)) / 2));
			}
			if (Class23_Sub19.aClass16_2393 != null) {
				graphics.setFont(Class23_Sub4_Sub6.aFont2988);
				graphics.setColor(Color.white);
				Class23_Sub19.aClass16_2393.method164(Class23_Sub4_Sub19.anInt3205 / 2 + -26, i ^ 0x4542, graphics, Class51.anInt801 / 2 - Class23_Sub19.aClass16_2393.method141(Class13.aFontMetrics267, i ^ ~0x1397) / 2);
			}
		} catch (Exception exception) {
			Class71_Sub3.aCanvas2740.repaint();
		}
		anInt9++;
	}
	
	public final void windowDeiconified(WindowEvent windowevent) {
		anInt40++;
	}
	
	final void method30(int i, int i_16_, int i_17_, int i_18_, int i_19_) {
		anInt29++;
		try {
			if (Class45.anApplet_Sub1_684 != null) {
				Class59.anInt946++;
				if (Class59.anInt946 >= 3) {
					method33(i ^ ~0x3faa, "alreadyloaded");
				} else {
					getAppletContext().showDocument(getDocumentBase(), "_self");
				}
			} else {
				if (i != -16273) {
					method30(-64, 20, -124, 30, -79);
				}
				Class23_Sub4_Sub19.anInt3205 = i_18_;
				Class51.anInt801 = i_19_;
				Class45.anApplet_Sub1_684 = this;
				Class23_Sub13_Sub25.anInt4295 = i_16_;
				if (Class23_Sub4_Sub3.aClass9_2939 == null) {
					Class23_Sub4_Sub28.aClass9_3348 = Class23_Sub4_Sub3.aClass9_2939 = new Class9(false, this, i_17_, null, 0);
				}
				Class23_Sub4_Sub3.aClass9_2939.method104(1, this, (byte) 72);
			}
		} catch (Exception exception) {
			Class26.method925(95, exception, null);
			method33(-82, "crash");
		}
	}
	
	public final void windowClosed(WindowEvent windowevent) {
		anInt22++;
	}
	
	public static final void providesignlink(Class9 class9) {
		Class23_Sub4_Sub28.aClass9_3348 = Class23_Sub4_Sub3.aClass9_2939 = class9;
		anInt39++;
	}
	
	final boolean method31(boolean bool) {
		anInt1++;
		String string = getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com")) {
			return true;
		}
		if (string.equals("runescape.com") || string.endsWith(".runescape.com")) {
			return true;
		}
		if (bool != true) {
			return false;
		}
		if (string.endsWith("127.0.0.1")) {
			return true;
		}
		for (/**/; string.length() > 0 && string.charAt(-1 + string.length()) >= '0' && string.charAt(-1 + string.length()) <= '9'; string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1.")) {
			return true;
		}
		method33(101, "invalidhost");
		return false;
	}
	
	public final void windowOpened(WindowEvent windowevent) {
		anInt15++;
	}
	
	public final void windowActivated(WindowEvent windowevent) {
		anInt24++;
	}
	
	static final boolean method32(Class105 class105, int i, int i_20_) {
		if (i_20_ != 3) {
			method27(false, -105, null);
		}
		anInt30++;
		byte[] bs = class105.method1532(i, 18808);
		if (bs == null) {
			return false;
		}
		Class14.method129(bs, 1);
		return true;
	}
	
	final void method33(int i, String string) {
		anInt20++;
		if (!aBoolean31) {
			aBoolean31 = true;
			System.out.println("error_game_" + string);
			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + string + ".ws"), "_self");
			} catch (Exception exception) {
				/* empty */
			}
			int i_21_ = 106 % ((17 - i) / 38);
		}
	}
	
	public final void run() {
		anInt6++;
		addComponentListener(this);
		try {
			if (Class9.aString198 != null) {
				String string = Class9.aString198.toLowerCase();
				if (string.indexOf("sun") == -1 && string.indexOf("apple") == -1) {
					if ((string.indexOf("ibm") ^ 0xffffffff) != 0 && (Class9.aString184 == null || Class9.aString184.equals("1.4.2"))) {
						method33(85, "wrongjava");
						return;
					}
				} else {
					String string_22_ = Class9.aString184;
					if (string_22_.equals("1.1") || string_22_.startsWith("1.1.") || string_22_.equals("1.2") || string_22_.startsWith("1.2.")) {
						method33(-103, "wrongjava");
						return;
					}
					Class23_Sub4_Sub17.anInt3167 = 5;
				}
			}
			if (Class23_Sub4_Sub3.aClass9_2939.anApplet188 != null) {
				Method method = Class9.aMethod183;
				if (method != null) {
					try {
						method.invoke(Class23_Sub4_Sub3.aClass9_2939.anApplet188, new Object[] { Boolean.TRUE });
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			}
			method25(0);
			Class23_Sub13_Sub25.aClass78_4290 = Class23_Sub4_Sub24.method371(Class71_Sub3.aCanvas2740, false, Class51.anInt801, Class23_Sub4_Sub19.anInt3205);
			method21((byte) 121);
			Class23_Sub4_Sub9.aClass17_3041 = Class29.method951((byte) -88);
			while ((Class27.aLong417 ^ 0xffffffffffffffffL) == -1L || Class27.aLong417 > Class94.method1466(22624)) {
				Class23_Sub4_Sub22.anInt3267 = Class23_Sub4_Sub9.aClass17_3041.method186(Class91.anInt1556, (byte) 66, Class23_Sub4_Sub17.anInt3167);
				for (int i = 0; Class23_Sub4_Sub22.anInt3267 > i; i++)
					method24(true);
				method18(-70);
				Class87.method1405(Class71_Sub3.aCanvas2740, 0, Class23_Sub4_Sub3.aClass9_2939);
			}
		} catch (Exception exception) {
			Class26.method925(95, exception, null);
			method33(-112, "crash");
		}
		method19(true, 0);
	}
	
	public final synchronized void paint(Graphics graphics) {
		anInt8++;
		if (Class45.anApplet_Sub1_684 == this && !Class23_Sub13_Sub1.aBoolean3665) {
			Class23_Sub13_Sub18.aBoolean4085 = true;
			if (Class9.aString184 != null && Class9.aString184.startsWith("1.5") && (-Class40.aLong631 + Class94.method1466(22624) ^ 0xffffffffffffffffL) < -1001L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (rectangle == null || rectangle.width >= Class51.anInt801 && rectangle.height >= Class23_Sub4_Sub19.anInt3205) {
					/* empty */
				}
			}
		}
	}
	
	public final void windowIconified(WindowEvent windowevent) {
		anInt37++;
	}
	
	public void componentShown(ComponentEvent e) {}
	
	public void componentHidden(ComponentEvent e) {}
	
	public void componentMoved(ComponentEvent e) {}
	
	public void componentResized(ComponentEvent e) {
		newH = e.getComponent().getSize().height  - 508 - 23 - 12 / 2;
		newW = e.getComponent().getSize().width  - 768 - 9 / 2;
	}
	
	static {
		aClass16Array10 = new RSString[100];
		anInt34 = 0;
		aClass16_35 = Class38_Sub6.method1076((byte) 86, "Select");
		aClass16_16 = aClass16_35;
		anIntArray42 = new int[] { 2, 2, 4, 0, 1, 8, 0 };
		aClass16_43 = Class38_Sub6.method1076((byte) 86, "hitmarks");
	}
}
