/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.FontMetrics;

public class CacheIndex
{
	static Class23_Sub13_Sub8 aClass23_Sub13_Sub8_240;
	private static RSString aClass16_241;
	static int anInt242;
	private CacheFileChannel aClass29_243 = null;
	private static RSString aClass16_244;
	private int anInt245;
	private static RSString aClass16_246 = Class38_Sub6.method1076((byte) 86, "Unexpected loginserver response)3");
	static RSString aClass16_247;
	static RSString aClass16_248;
	private CacheFileChannel aClass29_249 = null;
	static int anInt250;
	static RSString aClass16_251;
	static int anInt252;
	static int anInt253;
	static int anInt254;
	static Class43 aClass43_255;
	private int anInt256 = 65000;
	static boolean aBoolean257;
	static Class43[] aClass43Array258;
	static RSString aClass16_259;
	static int anInt260;
	static RSString aClass16_261;
	private static RSString aClass16_262;
	static RSString aClass16_263;
	static Class11 aClass11_264;
	static Class105 aClass105_265;
	static int anInt266;
	static FontMetrics aFontMetrics267;
	static int anInt268;
	
	public static void method118(int i) {
		aClass43_255 = null;
		aClass16_261 = null;
		aClass11_264 = null;
		aClass16_244 = null;
		aClass16_241 = null;
		aClass16_248 = null;
		aClass43Array258 = null;
		aClass16_247 = null;
		aClass16_263 = null;
		aClass105_265 = null;
		aClass16_251 = null;
		aFontMetrics267 = null;
		aClass16_262 = null;
		aClass23_Sub13_Sub8_240 = null;
		aClass16_259 = null;
		aClass16_246 = null;
		if (i > -72) {
			method118(101);
		}
	}
	
	public final String toString() {
		anInt254++;
		return "Cache:" + anInt245;
	}
	
	static final boolean method119(int i, int i_0_) {
		anInt242++;
		if (i_0_ != 1) {
			aClass43Array258 = null;
		}
		if ((i & 0x1) == 0) {
			return false;
		}
		return true;
	}
	
	private final boolean method120(int i, boolean bool, byte[] bs, int i_1_, int i_2_) {
		anInt266++;
		synchronized (aClass29_243) {
			try {
				int i_3_;
				if (bool) {
					if ((long) (6 + i_1_ * 6) > aClass29_249.method946(true)) {
						return false;
					}
					aClass29_249.method948((long) (i_1_ * 6), -11320);
					aClass29_249.method953(6, Class71_Sub1.aByteArray2726, 11524, 0);
					i_3_ = (Class71_Sub1.aByteArray2726[4] << 8 & 0xff00) + (0xff0000 & Class71_Sub1.aByteArray2726[3] << 16) + (0xff & Class71_Sub1.aByteArray2726[5]);
					if ((i_3_ ^ 0xffffffff) >= -1 || ((long) i_3_ ^ 0xffffffffffffffffL) < (aClass29_243.method946(true) / 520L ^ 0xffffffffffffffffL)) {
						return false;
					}
				} else {
					i_3_ = (int) ((aClass29_243.method946(true) + 519L) / 520L);
					if (i_3_ == 0) {
						i_3_ = 1;
					}
				}
				Class71_Sub1.aByteArray2726[3] = (byte) (i_3_ >> 16);
				Class71_Sub1.aByteArray2726[4] = (byte) (i_3_ >> 8);
				Class71_Sub1.aByteArray2726[0] = (byte) (i_2_ >> 16);
				Class71_Sub1.aByteArray2726[5] = (byte) i_3_;
				Class71_Sub1.aByteArray2726[2] = (byte) i_2_;
				Class71_Sub1.aByteArray2726[1] = (byte) (i_2_ >> 8);
				int i_4_ = 0;
				int i_5_ = 124 % ((48 - i) / 49);
				aClass29_249.method948((long) (6 * i_1_), -11320);
				aClass29_249.method955(0, Class71_Sub1.aByteArray2726, -1, 6);
				int i_6_ = 0;
				int i_7_;
				for (/**/; (i_2_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_ += i_7_) {
					int i_8_ = 0;
					if (bool) {
						aClass29_243.method948((long) (520 * i_3_), -11320);
						try {
							aClass29_243.method953(8, Class71_Sub1.aByteArray2726, 11524, 0);
						} catch (java.io.EOFException eofexception) {
							break;
						}
						i_8_ = (0xff00 & Class71_Sub1.aByteArray2726[5] << 8) + (Class71_Sub1.aByteArray2726[4] << 16 & 0xff0000) - -(Class71_Sub1.aByteArray2726[6] & 0xff);
						i_7_ = (Class71_Sub1.aByteArray2726[1] & 0xff) + (Class71_Sub1.aByteArray2726[0] << 8 & 0xff00);
						int i_9_ = (0xff00 & Class71_Sub1.aByteArray2726[2] << 8) - -(0xff & Class71_Sub1.aByteArray2726[3]);
						int i_10_ = 0xff & Class71_Sub1.aByteArray2726[7];
						if ((i_1_ ^ 0xffffffff) != (i_7_ ^ 0xffffffff) || (i_9_ ^ 0xffffffff) != (i_6_ ^ 0xffffffff) || (anInt245 ^ 0xffffffff) != (i_10_ ^ 0xffffffff)) {
							return false;
						}
						if ((i_8_ ^ 0xffffffff) > -1 || aClass29_243.method946(true) / 520L < (long) i_8_) {
							return false;
						}
					}
					if ((i_8_ ^ 0xffffffff) == -1) {
						bool = false;
						i_8_ = (int) ((519L + aClass29_243.method946(true)) / 520L);
						if (i_8_ == 0) {
							i_8_++;
						}
						if ((i_8_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff)) {
							i_8_++;
						}
					}
					Class71_Sub1.aByteArray2726[1] = (byte) i_1_;
					i_7_ = -i_4_ + i_2_;
					Class71_Sub1.aByteArray2726[2] = (byte) (i_6_ >> 8);
					Class71_Sub1.aByteArray2726[0] = (byte) (i_1_ >> 8);
					if (-i_4_ + i_2_ <= 512) {
						i_8_ = 0;
					}
					Class71_Sub1.aByteArray2726[6] = (byte) i_8_;
					Class71_Sub1.aByteArray2726[5] = (byte) (i_8_ >> 8);
					Class71_Sub1.aByteArray2726[4] = (byte) (i_8_ >> 16);
					Class71_Sub1.aByteArray2726[3] = (byte) i_6_;
					if (i_7_ > 512) {
						i_7_ = 512;
					}
					i_6_++;
					Class71_Sub1.aByteArray2726[7] = (byte) anInt245;
					aClass29_243.method948((long) (520 * i_3_), -11320);
					i_3_ = i_8_;
					aClass29_243.method955(0, Class71_Sub1.aByteArray2726, -1, 8);
					aClass29_243.method955(i_4_, bs, -1, i_7_);
				}
				return true;
			} catch (java.io.IOException ioexception) {
				return false;
			}
		}
	}
	
	final byte[] method121(byte b, int i) {
		anInt252++;
		synchronized (aClass29_243) {
			try {
				if ((long) (6 + 6 * i) > aClass29_249.method946(true)) {
					return null;
				}
				aClass29_249.method948((long) (6 * i), -11320);
				aClass29_249.method953(6, Class71_Sub1.aByteArray2726, 11524, 0);
				if (b != -32) {
					method120(-30, false, null, -101, 77);
				}
				int i_11_ = (0xff0000 & Class71_Sub1.aByteArray2726[0] << 16) + ((0xff00 & Class71_Sub1.aByteArray2726[1] << 8) + (0xff & Class71_Sub1.aByteArray2726[2]));
				int i_12_ = (Class71_Sub1.aByteArray2726[4] << 8 & 0xff00) + ((0xff0000 & Class71_Sub1.aByteArray2726[3] << 16) + (0xff & Class71_Sub1.aByteArray2726[5]));
				if ((i_11_ ^ 0xffffffff) > -1 || (anInt256 ^ 0xffffffff) > (i_11_ ^ 0xffffffff)) {
					return null;
				}
				if (i_12_ <= 0 || aClass29_243.method946(true) / 520L < (long) i_12_) {
					return null;
				}
				int i_13_ = 0;
				int i_14_ = 0;
				byte[] bs = new byte[i_11_];
				while (i_13_ < i_11_) {
					if (i_12_ == 0) {
						return null;
					}
					aClass29_243.method948((long) (520 * i_12_), -11320);
					int i_15_ = i_11_ + -i_13_;
					if (i_15_ > 512) {
						i_15_ = 512;
					}
					aClass29_243.method953(8 + i_15_, Class71_Sub1.aByteArray2726, 11524, 0);
					int i_16_ = ((0xff & Class71_Sub1.aByteArray2726[2]) << 8) - -(0xff & Class71_Sub1.aByteArray2726[3]);
					int i_17_ = Class71_Sub1.aByteArray2726[7] & 0xff;
					int i_18_ = (Class71_Sub1.aByteArray2726[1] & 0xff) + (0xff00 & Class71_Sub1.aByteArray2726[0] << 8);
					int i_19_ = (0xff00 & Class71_Sub1.aByteArray2726[5] << 8) + ((Class71_Sub1.aByteArray2726[4] << 16 & 0xff0000) + (Class71_Sub1.aByteArray2726[6] & 0xff));
					if ((i_18_ ^ 0xffffffff) != (i ^ 0xffffffff) || (i_14_ ^ 0xffffffff) != (i_16_ ^ 0xffffffff) || (anInt245 ^ 0xffffffff) != (i_17_ ^ 0xffffffff)) {
						return null;
					}
					if (i_19_ < 0 || (aClass29_243.method946(true) / 520L ^ 0xffffffffffffffffL) > ((long) i_19_ ^ 0xffffffffffffffffL)) {
						return null;
					}
					for (int i_20_ = 0; (i_15_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++)
						bs[i_13_++] = Class71_Sub1.aByteArray2726[i_20_ - -8];
					i_14_++;
					i_12_ = i_19_;
				}
				return bs;
			} catch (java.io.IOException ioexception) {
				return null;
			}
		}
	}
	
	final boolean method122(int i, byte[] bs, int i_21_, int i_22_) {
		anInt253++;
		synchronized (aClass29_243) {
			if ((i_21_ ^ 0xffffffff) > -1 || (i_21_ ^ 0xffffffff) < (anInt256 ^ 0xffffffff)) {
				throw new IllegalArgumentException();
			}
			if (i_22_ != -9168) {
				return true;
			}
			boolean bool = method120(-110, true, bs, i, i_21_);
			if (!bool) {
				bool = method120(101, false, bs, i, i_21_);
			}
			return bool;
		}
	}
	
	static final void method123(int i, Component component) {
		component.removeMouseListener(aClass11_264);
		anInt260++;
		component.removeMouseMotionListener(aClass11_264);
		component.removeFocusListener(aClass11_264);
		if (i >= -58) {
			aClass16_262 = null;
		}
		Class19.anInt325 = 0;
	}
	
	CacheIndex(int i, CacheFileChannel class29, CacheFileChannel class29_23_, int i_24_) {
		aClass29_243 = class29;
		anInt245 = i;
		anInt256 = i_24_;
		aClass29_249 = class29_23_;
	}
	
	static final boolean method124(int i, RSString class16) {
		anInt268++;
		if (class16 == null) {
			return false;
		}
		if (i <= 126) {
			aClass16_247 = null;
		}
		for (int i_25_ = 0; i_25_ < Class25.anInt383; i_25_++) {
			if (class16.method140(Applet_Sub1.aClass16Array10[i_25_], 40)) {
				return true;
			}
		}
		return false;
	}
	
	static {
		aClass16_244 = Class38_Sub6.method1076((byte) 86, "Invalid loginserver requested)3");
		aClass16_248 = Class38_Sub6.method1076((byte) 86, "Benutzen");
		aClass16_241 = Class38_Sub6.method1076((byte) 86, "Please reload this page)3");
		aClass16_262 = Class38_Sub6.method1076((byte) 86, "scroll:");
		aClass16_263 = aClass16_246;
		aClass16_251 = aClass16_262;
		aClass16_247 = aClass16_244;
		aClass16_259 = aClass16_241;
		aClass16_261 = aClass16_262;
		aClass11_264 = new Class11();
	}
}
