/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class45
{
	static int anInt681;
	static RSString aClass16_682 = Class38_Sub6.method1076((byte) 86, "W-=hlen Sie eine Welt");
	static int anInt683;
	static Applet_Sub1 anApplet_Sub1_684 = null;
	static int anInt685;
	private int anInt686;
	private static RSString aClass16_687;
	private static RSString aClass16_688 = Class38_Sub6.method1076((byte) 86, "Loaded interfaces");
	static Class23_Sub13_Sub19 aClass23_Sub13_Sub19_689;
	static int anInt690;
	static int anInt691;
	private static RSString aClass16_692 = Class38_Sub6.method1076((byte) 86, "This computers address has been blocked");
	static RSString aClass16_693;
	private int[][] anIntArrayArray694;
	static int anInt695;
	static int anInt696;
	static int anInt697;
	static RSString aClass16_698;
	static RSString aClass16_699;
	static RSString aClass16_700;
	private int anInt701;
	
	final int method1130(int i, boolean bool) {
		if (bool != true) {
			anInt701 = 111;
		}
		if (anIntArrayArray694 != null) {
			i = (int) ((long) i * (long) anInt686 / (long) anInt701);
		}
		anInt683++;
		return i;
	}
	
	public static void method1131(boolean bool) {
		aClass16_698 = null;
		aClass16_682 = null;
		aClass16_688 = null;
		aClass16_687 = null;
		aClass16_692 = null;
		aClass23_Sub13_Sub19_689 = null;
		aClass16_699 = null;
		aClass16_693 = null;
		if (bool == true) {
			aClass16_700 = null;
		}
	}
	
	static final void method1132(long l, int i) {
		anInt691++;
		if ((l ^ 0xffffffffffffffffL) != -1L) {
			if (anInt696 >= 100 && Class30.anInt478 != 1 || anInt696 >= 200) {
				Class95.method1468(0, -1, Class97.aClass16_1640, Class23_Sub4_Sub38.aClass16_3509);
			} else {
				RSString class16 = Class83.method1376(-1, l).method154((byte) 59);
				for (int i_0_ = 0; (anInt696 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
					if (Class68.aLongArray1187[i_0_] == l) {
						Class95.method1468(0, i + -32768, Class23_Sub4_Sub14.method322(new RSString[] { class16, Class107.aClass16_1835 }, -104), Class23_Sub4_Sub38.aClass16_3509);
						return;
					}
				}
				if (i != 32767) {
					method1137(-117, false);
				}
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (Class25.anInt383 ^ 0xffffffff); i_1_++) {
					if (l == Class23_Sub4_Sub30.aLongArray3383[i_1_]) {
						Class95.method1468(0, i ^ ~0x7fff, Class23_Sub4_Sub14.method322(new RSString[] { oa.aClass16_1254, class16, Class106.aClass16_1830 }, -36), Class23_Sub4_Sub38.aClass16_3509);
						return;
					}
				}
				if (class16.method183(Class105.aClass38_Sub7_Sub2_1812.aClass16_4389, (byte) -49)) {
					Class95.method1468(0, i ^ ~0x7fff, Class23_Sub8.aClass16_2238, Class23_Sub4_Sub38.aClass16_3509);
				} else {
					Class23_Sub13_Sub25.anInt4285++;
					Class23_Sub4_Sub14.aClass16Array3130[anInt696] = class16;
					Class68.aLongArray1187[anInt696] = l;
					Class23_Sub10_Sub3.anIntArray3658[anInt696] = 0;
					Class87_Sub3.aClass16Array2816[anInt696] = Class23_Sub4_Sub38.aClass16_3509;
					Class11.anIntArray229[anInt696] = 0;
					Class104.aBooleanArray1741[anInt696] = false;
					anInt696++;
					Class75.anInt1372 = Class23_Sub10_Sub2.anInt3589;
					Class23_Sub7.outBuffer.method486(92, 2976);
					Class23_Sub7.outBuffer.method436(l, (byte) -120);
				}
			}
		}
	}
	
	static final void registerNewPlayers(int i) {
		if (i == 0) {
			anInt681++;
			while (Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method488(1693770787, Class23_Sub4_Sub2.anInt2925) >= 11) {
				int i_2_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 113, 11);
				if (i_2_ == 2047) {
					break;
				}
				boolean bool = false;
				if (Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_2_] == null) {
					Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_2_] = new Class38_Sub7_Sub2();
					bool = true;
					if (Class38_Sub7_Sub1.aClass23_Sub5Array4377[i_2_] != null) {
						Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_2_].method1098(12, Class38_Sub7_Sub1.aClass23_Sub5Array4377[i_2_]);
					}
				}
				Class23_Sub13_Sub3.anIntArray3700[Class23_Sub4_Sub11.anInt3067++] = i_2_;
				Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_2_];
				class38_sub7_sub2.anInt2698 = Class89.anInt1511;
				int i_3_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 118, 1);
				if (i_3_ == 1) {
					Class94.anIntArray1603[Class23_Sub2.anInt2048++] = i_2_;
				}
				int i_4_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 124, 5);
				int i_5_ = Class23_Sub4_Sub13.anIntArray3097[Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 118, 3)];
				if (bool) {
					class38_sub7_sub2.anInt2682 = class38_sub7_sub2.anInt2680 = i_5_;
				}
				int i_6_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 121, 1);
				int i_7_ = Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method489((byte) 124, 5);
				if (i_4_ > 15) {
					i_4_ -= 32;
				}
				if (i_7_ > 15) {
					i_7_ -= 32;
				}
				class38_sub7_sub2.method1085(i_7_ + Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], (byte) -116, i_6_ == 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0] - -i_4_);
			}
			Class23_Sub13_Sub4.aClass23_Sub5_Sub1_3711.method485(-110);
		}
	}
	
	final int method1134(int i, int i_8_) {
		anInt697++;
		if (anIntArrayArray694 != null) {
			i = 6 - -(int) ((long) i * (long) anInt686 / (long) anInt701);
		}
		if (i_8_ != 23596) {
			return -69;
		}
		return i;
	}
	
	final byte[] method1135(int i, byte[] bs) {
		if (i != -1694746864) {
			aClass16_692 = null;
		}
		if (anIntArrayArray694 != null) {
			int i_9_ = 0;
			int i_10_ = (int) ((long) anInt686 * (long) bs.length / (long) anInt701) + 14;
			int i_11_ = 0;
			int[] is = new int[i_10_];
			for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (bs.length ^ 0xffffffff); i_12_++) {
				int i_13_ = bs[i_12_];
				int[] is_14_ = anIntArrayArray694[i_9_];
				for (int i_15_ = 0; i_15_ < 14; i_15_++)
					is[i_15_ + i_11_] += i_13_ * is_14_[i_15_];
				i_9_ += anInt686;
				int i_16_ = i_9_ / anInt701;
				i_11_ += i_16_;
				i_9_ -= anInt701 * i_16_;
			}
			bs = new byte[i_10_];
			for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
				int i_18_ = 32768 + is[i_17_] >> 16;
				if (i_18_ < -128) {
					bs[i_17_] = (byte) -128;
				} else if (i_18_ > 127) {
					bs[i_17_] = (byte) 127;
				} else {
					bs[i_17_] = (byte) i_18_;
				}
			}
		}
		anInt690++;
		return bs;
	}
	
	static final void method1136(int i, Component component) {
		component.addMouseListener(Class13.aClass11_264);
		anInt695++;
		if (i != 95) {
			method1132(-55L, -55);
		}
		component.addMouseMotionListener(Class13.aClass11_264);
		component.addFocusListener(Class13.aClass11_264);
	}
	
	static final boolean method1137(int i, boolean bool) {
		anInt685++;
		if (bool != true) {
			method1136(-57, null);
		}
		if ((i & 0x18c68b) >> 20 == 0) {
			return false;
		}
		return true;
	}
	
	Class45(int i, int i_19_) {
		if ((i ^ 0xffffffff) != (i_19_ ^ 0xffffffff)) {
			int i_20_ = Class23_Sub13_Sub24.method852(i, 81, i_19_);
			i_19_ /= i_20_;
			i /= i_20_;
			anInt701 = i;
			anInt686 = i_19_;
			anIntArrayArray694 = new int[i][14];
			for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i ^ 0xffffffff); i_21_++) {
				int[] is = anIntArrayArray694[i_21_];
				double d = 6.0 + (double) i_21_ / (double) i;
				int i_22_ = (int) Math.floor(-7.0 + d + 1.0);
				if ((i_22_ ^ 0xffffffff) > -1) {
					i_22_ = 0;
				}
				int i_23_ = (int) Math.ceil(7.0 + d);
				if (i_23_ > 14) {
					i_23_ = 14;
				}
				double d_24_ = (double) i_19_ / (double) i;
				for (/**/; i_23_ > i_22_; i_22_++) {
					double d_25_ = (-d + (double) i_22_) * 3.141592653589793;
					double d_26_ = d_24_;
					if (d_25_ < -1.0E-4 || d_25_ > 1.0E-4) {
						d_26_ *= Math.sin(d_25_) / d_25_;
					}
					d_26_ *= 0.46 * Math.cos(((double) i_22_ - d) * 0.2243994752564138) + 0.54;
					is[i_22_] = (int) Math.floor(65536.0 * d_26_ + 0.5);
				}
			}
		}
	}
	
	static {
		aClass16_687 = Class38_Sub6.method1076((byte) 86, "You can(Wt add yourself to your own ignore list)3");
		aClass16_693 = aClass16_687;
		anInt696 = 0;
		aClass16_700 = aClass16_692;
		aClass16_698 = Class38_Sub6.method1076((byte) 86, "und Ihr Passwort ein)3");
		aClass16_699 = aClass16_688;
	}
}
