/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class84
{
	private static String aString1474 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| " + String.valueOf('\u00c4') + String.valueOf('\u00cb') + String.valueOf('\u00cf') + String.valueOf('\u00d6') + String.valueOf('\u00dc') + String.valueOf('\u00e4') + String.valueOf('\u00eb') + String.valueOf('\u00ef') + String.valueOf('\u00f6') + String.valueOf('\u00fc') + String.valueOf('\u00ff') + String.valueOf('\u00df');
	private boolean aBoolean1475;
	private int anInt1476 = 0;
	private byte[] aByteArray1477;
	private static int anInt1478 = aString1474.length();
	private static int[] anIntArray1479 = new int[256];
	
	private final void method1380(Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_0_ = fontmetrics.charWidth(c);
		int i_1_ = i_0_;
		if (bool) {
			try {
				if (c == '/') {
					bool = false;
				}
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W') {
					i_0_++;
				}
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_2_ = fontmetrics.getMaxAscent();
		int i_3_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_4_ = fontmetrics.getHeight();
		Image image = Class71_Sub3.aCanvas2740.createImage(i_0_, i_3_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_0_, i_3_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(String.valueOf(c), 0, i_2_);
		if (bool) {
			graphics.drawString(String.valueOf(c), 1, i_2_);
		}
		int[] is = new int[i_0_ * i_3_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_0_, i_3_, is, 0, i_0_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = i_0_;
		int i_8_ = i_3_;
	while_114_:
		for (int i_9_ = 0; i_9_ < i_3_; i_9_++) {
			for (int i_10_ = 0; i_10_ < i_0_; i_10_++) {
				int i_11_ = is[i_10_ + i_9_ * i_0_];
				if ((i_11_ & 0xffffff) != 0) {
					i_6_ = i_9_;
					break while_114_;
				}
			}
		}
	while_115_:
		for (int i_12_ = 0; i_12_ < i_0_; i_12_++) {
			for (int i_13_ = 0; i_13_ < i_3_; i_13_++) {
				int i_14_ = is[i_12_ + i_13_ * i_0_];
				if ((i_14_ & 0xffffff) != 0) {
					i_5_ = i_12_;
					break while_115_;
				}
			}
		}
	while_116_:
		for (int i_15_ = i_3_ - 1; i_15_ >= 0; i_15_--) {
			for (int i_16_ = 0; i_16_ < i_0_; i_16_++) {
				int i_17_ = is[i_16_ + i_15_ * i_0_];
				if ((i_17_ & 0xffffff) != 0) {
					i_8_ = i_15_ + 1;
					break while_116_;
				}
			}
		}
	while_117_:
		for (int i_18_ = i_0_ - 1; i_18_ >= 0; i_18_--) {
			for (int i_19_ = 0; i_19_ < i_3_; i_19_++) {
				int i_20_ = is[i_18_ + i_19_ * i_0_];
				if ((i_20_ & 0xffffff) != 0) {
					i_7_ = i_18_ + 1;
					break while_117_;
				}
			}
		}
		aByteArray1477[i * 9] = (byte) (anInt1476 / 16384);
		aByteArray1477[i * 9 + 1] = (byte) (anInt1476 / 128 & 0x7f);
		aByteArray1477[i * 9 + 2] = (byte) (anInt1476 & 0x7f);
		aByteArray1477[i * 9 + 3] = (byte) (i_7_ - i_5_);
		aByteArray1477[i * 9 + 4] = (byte) (i_8_ - i_6_);
		aByteArray1477[i * 9 + 5] = (byte) i_5_;
		aByteArray1477[i * 9 + 6] = (byte) (i_2_ - i_6_);
		aByteArray1477[i * 9 + 7] = (byte) i_1_;
		aByteArray1477[i * 9 + 8] = (byte) i_4_;
		for (int i_21_ = i_6_; i_21_ < i_8_; i_21_++) {
			for (int i_22_ = i_5_; i_22_ < i_7_; i_22_++) {
				int i_23_ = is[i_22_ + i_21_ * i_0_] & 0xff;
				if (i_23_ > 30 && i_23_ < 230) {
					aBoolean1475 = true;
				}
				aByteArray1477[anInt1476++] = (byte) i_23_;
			}
		}
	}
	
	private final int method1381(RSString class16) {
		int i = 0;
		for (int i_24_ = 0; i_24_ < class16.method171(); i_24_++) {
			if (class16.method166((byte) 99, i_24_) == 64 && i_24_ + 4 < class16.method171() && class16.method166((byte) 91, i_24_ + 4) == 64) {
				i_24_ += 4;
			} else if (class16.method166((byte) 92, i_24_) == 126 && i_24_ + 4 < class16.method171() && class16.method166((byte) 95, i_24_ + 4) == 126) {
				i_24_ += 4;
			} else {
				i += aByteArray1477[anIntArray1479[class16.method166((byte) 116, i_24_)] + 7];
			}
		}
		return i;
	}
	
	private final void method1382(int i, int i_25_, int i_26_, int i_27_, byte[] bs) {
		int i_28_ = i_25_ + bs[i + 5];
		int i_29_ = i_26_ - bs[i + 6];
		int i_30_ = bs[i + 3];
		int i_31_ = bs[i + 4];
		int i_32_ = bs[i] * 16384 + bs[i + 1] * 128 + bs[i + 2];
		int i_33_ = i_28_ + i_29_ * Class20.anInt329;
		int i_34_ = Class20.anInt329 - i_30_;
		int i_35_ = 0;
		if (i_29_ < Class20.anInt332) {
			int i_36_ = Class20.anInt332 - i_29_;
			i_31_ -= i_36_;
			i_29_ = Class20.anInt332;
			i_32_ += i_36_ * i_30_;
			i_33_ += i_36_ * Class20.anInt329;
		}
		if (i_29_ + i_31_ >= Class20.anInt334) {
			i_31_ -= i_29_ + i_31_ - Class20.anInt334 + 1;
		}
		if (i_28_ < Class20.anInt333) {
			int i_37_ = Class20.anInt333 - i_28_;
			i_30_ -= i_37_;
			i_28_ = Class20.anInt333;
			i_32_ += i_37_;
			i_33_ += i_37_;
			i_35_ += i_37_;
			i_34_ += i_37_;
		}
		if (i_28_ + i_30_ >= Class20.anInt330) {
			int i_38_ = i_28_ + i_30_ - Class20.anInt330 + 1;
			i_30_ -= i_38_;
			i_35_ += i_38_;
			i_34_ += i_38_;
		}
		if (i_30_ > 0 && i_31_ > 0) {
			if (aBoolean1475) {
				method1387(Class20.anIntArray328, bs, i_27_, i_32_, i_33_, i_30_, i_31_, i_34_, i_35_);
			} else {
				method1383(Class20.anIntArray328, bs, i_27_, i_32_, i_33_, i_30_, i_31_, i_34_, i_35_);
			}
		}
	}
	
	private final void method1383(int[] is, byte[] bs, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_) {
		int i_45_ = -(i_41_ >> 2);
		i_41_ = -(i_41_ & 0x3);
		for (int i_46_ = -i_42_; i_46_ < 0; i_46_++) {
			for (int i_47_ = i_45_; i_47_ < 0; i_47_++) {
				if (bs[i_39_++] != 0) {
					is[i_40_++] = i;
				} else {
					i_40_++;
				}
				if (bs[i_39_++] != 0) {
					is[i_40_++] = i;
				} else {
					i_40_++;
				}
				if (bs[i_39_++] != 0) {
					is[i_40_++] = i;
				} else {
					i_40_++;
				}
				if (bs[i_39_++] != 0) {
					is[i_40_++] = i;
				} else {
					i_40_++;
				}
			}
			for (int i_48_ = i_41_; i_48_ < 0; i_48_++) {
				if (bs[i_39_++] != 0) {
					is[i_40_++] = i;
				} else {
					i_40_++;
				}
			}
			i_40_ += i_43_;
			i_39_ += i_44_;
		}
	}
	
	final int method1384() {
		return aByteArray1477[8] - 1;
	}
	
	public static void method1385() {
		aString1474 = null;
		anIntArray1479 = null;
	}
	
	final int method1386() {
		return aByteArray1477[6];
	}
	
	private final void method1387(int[] is, byte[] bs, int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		for (int i_55_ = -i_52_; i_55_ < 0; i_55_++) {
			for (int i_56_ = -i_51_; i_56_ < 0; i_56_++) {
				int i_57_ = bs[i_49_++] & 0xff;
				if (i_57_ > 30) {
					if (i_57_ >= 230) {
						is[i_50_++] = i;
					} else {
						int i_58_ = is[i_50_];
						is[i_50_++] = ((i & 0xff00ff) * i_57_ + (i_58_ & 0xff00ff) * (256 - i_57_) & ~0xff00ff) + ((i & 0xff00) * i_57_ + (i_58_ & 0xff00) * (256 - i_57_) & 0xff0000) >> 8;
					}
				} else {
					i_50_++;
				}
			}
			i_50_ += i_53_;
			i_49_ += i_54_;
		}
	}
	
	final void method1388(RSString class16, int i, int i_59_, int i_60_, boolean bool) {
		int i_61_ = method1381(class16) / 2;
		int i_62_ = method1386();
		if (i - i_61_ <= Class20.anInt330 && i + i_61_ >= Class20.anInt333 && i_59_ - i_62_ <= Class20.anInt334 && i_59_ >= 0) {
			method1389(class16, i - i_61_, i_59_, i_60_, bool);
		}
	}
	
	private final void method1389(RSString class16, int i, int i_63_, int i_64_, boolean bool) {
		if (aBoolean1475 || i_64_ == 0) {
			bool = false;
		}
		for (int i_65_ = 0; i_65_ < class16.method171(); i_65_++) {
			int i_66_ = anIntArray1479[class16.method166((byte) 124, i_65_)];
			if (bool) {
				method1382(i_66_, i + 1, i_63_, 0, aByteArray1477);
				method1382(i_66_, i, i_63_ + 1, 0, aByteArray1477);
			}
			method1382(i_66_, i, i_63_, i_64_, aByteArray1477);
			i += aByteArray1477[i_66_ + 7];
		}
	}
	
	Class84(int i, boolean bool, Component component) {
		aBoolean1475 = false;
		aByteArray1477 = new byte[100000];
		anInt1476 = anInt1478 * 9;
		aBoolean1475 = false;
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_67_ = 0; i_67_ < anInt1478; i_67_++)
			method1380(font, fontmetrics, aString1474.charAt(i_67_), i_67_, false);
		if (bool && aBoolean1475) {
			anInt1476 = anInt1478 * 9;
			aBoolean1475 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_68_ = 0; i_68_ < anInt1478; i_68_++)
				method1380(font, fontmetrics, aString1474.charAt(i_68_), i_68_, false);
			if (!aBoolean1475) {
				anInt1476 = anInt1478 * 9;
				aBoolean1475 = false;
				for (int i_69_ = 0; i_69_ < anInt1478; i_69_++)
					method1380(font, fontmetrics, aString1474.charAt(i_69_), i_69_, true);
			}
		}
		byte[] bs = new byte[anInt1476];
		for (int i_70_ = 0; i_70_ < anInt1476; i_70_++)
			bs[i_70_] = aByteArray1477[i_70_];
		aByteArray1477 = bs;
	}
	
	static {
		for (int i = 0; i < 256; i++) {
			int i_71_ = aString1474.indexOf(i);
			if (i_71_ == -1) {
				i_71_ = 74;
			}
			anIntArray1479[i] = i_71_ * 9;
		}
	}
}
