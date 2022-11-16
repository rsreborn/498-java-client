/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68
{
	static Class23_Sub19[] aClass23_Sub19Array1186;
	static long[] aLongArray1187;
	static int anInt1188;
	static short[][] aShortArrayArray1189;
	static int anInt1190;
	static RSString aClass16_1191 = Class38_Sub6.method1076((byte) 86, "Ihr Spielkonto wird bereits benutzt)3");
	static int anInt1192;
	static int anInt1193;
	static int anInt1194;
	static int anInt1195;
	static int anInt1196;
	static int anInt1197;
	static RSString aClass16_1198 = Class38_Sub6.method1076((byte) 86, "rect_debug=");
	static int anInt1199;
	static int anInt1200;
	static Class60 aClass60_1201;
	static int anInt1202;
	static int anInt1203 = -1;
	private int[] anIntArray1204;
	static int anInt1205;
	
	static final int method1247(int i, byte b) {
		if (b != -122) {
			return 24;
		}
		anInt1188++;
		return i >>> 10;
	}
	
	final int method1248(int i, int i_0_) {
		int i_1_ = 3 / ((i - -52) / 57);
		anInt1205++;
		int i_2_ = -1 + (anIntArray1204.length >> 1);
		int i_3_ = i_2_ & i_0_;
		for (;;) {
			int i_4_ = anIntArray1204[i_3_ + (i_3_ + 1)];
			if ((i_4_ ^ 0xffffffff) == 0) {
				return -1;
			}
			if (i_0_ == anIntArray1204[i_3_ + i_3_]) {
				return i_4_;
			}
			i_3_ = 1 + i_3_ & i_2_;
		}
	}
	
	static final Class43[] method1249(Class105 class105, int i, int i_5_, int i_6_) {
		anInt1194++;
		if (!Class23_Sub4_Sub29.method385(class105, i_6_, i_5_, i)) {
			return null;
		}
		return Class23_Sub4_Sub13.method317(-16037);
	}
	
	static final void method1250(int i, int i_7_, int[] is, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, byte[] bs, int i_13_) {
		anInt1192++;
		int i_14_ = -(i_13_ >> 2);
		i_13_ = -(0x3 & i_13_);
		int i_15_ = -i_11_;
		if (i >= -80) {
			method1249(null, 118, -100, 52);
		}
		for (/**/; i_15_ < 0; i_15_++) {
			for (int i_16_ = i_14_; (i_16_ ^ 0xffffffff) > -1; i_16_++) {
				if (bs[i_8_++] == 0) {
					i_9_++;
				} else {
					is[i_9_++] = i_12_;
				}
				if (bs[i_8_++] == 0) {
					i_9_++;
				} else {
					is[i_9_++] = i_12_;
				}
				if (bs[i_8_++] != 0) {
					is[i_9_++] = i_12_;
				} else {
					i_9_++;
				}
				if ((bs[i_8_++] ^ 0xffffffff) == -1) {
					i_9_++;
				} else {
					is[i_9_++] = i_12_;
				}
			}
			for (int i_17_ = i_13_; i_17_ < 0; i_17_++) {
				if (bs[i_8_++] != 0) {
					is[i_9_++] = i_12_;
				} else {
					i_9_++;
				}
			}
			i_9_ += i_10_;
			i_8_ += i_7_;
		}
	}
	
	static final Class23_Sub13_Sub8 method1251(Class105 class105, RSString class16, Class105 class105_18_, byte b, RSString class16_19_) {
		anInt1200++;
		int i = class105_18_.method1540(102, class16_19_);
		if (b <= 83) {
			method1249(null, 64, -88, 39);
		}
		int i_20_ = class105_18_.method1543(class16, -121, i);
		return Class23_Sub4_Sub11.method307(class105_18_, 21095, i_20_, i, class105);
	}
	
	static final int method1252(boolean bool, int i) {
		if (bool != false) {
			return -112;
		}
		anInt1195++;
		if ((i ^ 0xffffffff) == -16711936) {
			return -1;
		}
		return Class23_Sub4_Sub25.method376(i, 4);
	}
	
	static final Class23_Sub13_Sub16 method1253(byte b, int i, Class105 class105, boolean bool, Class105 class105_21_) {
		anInt1197++;
		if (b <= 14) {
			method1254(-95, -65, 115);
		}
		boolean bool_22_ = true;
		int[] is = class105.method1537(i, false);
		for (int i_23_ = 0; i_23_ < is.length; i_23_++) {
			byte[] bs = class105.method1555(is[i_23_], 15059, i);
			if (bs == null) {
				bool_22_ = false;
			} else {
				int i_24_ = 0xff00 & bs[0] << 8 | bs[1] & 0xff;
				byte[] bs_25_;
				if (!bool) {
					bs_25_ = class105_21_.method1555(0, 15059, i_24_);
				} else {
					bs_25_ = class105_21_.method1555(i_24_, 15059, 0);
				}
				if (bs_25_ == null) {
					bool_22_ = false;
				}
			}
		}
		if (!bool_22_) {
			return null;
		}
		try {
			return new Class23_Sub13_Sub16(class105, class105_21_, i, bool);
		} catch (Exception exception) {
			return null;
		}
	}
	
	static final int method1254(int i, int i_26_, int i_27_) {
		anInt1193++;
		Class23_Sub17 class23_sub17 = (Class23_Sub17) Class23_Sub4_Sub7.anOa2997.a((byte) -91, (long) i_27_);
		if (i_26_ != -1) {
			return -93;
		}
		if (class23_sub17 == null) {
			return -1;
		}
		if (i < 0 || (class23_sub17.anIntArray2373.length ^ 0xffffffff) >= (i ^ 0xffffffff)) {
			return -1;
		}
		return class23_sub17.anIntArray2373[i];
	}
	
	public static void method1255(int i) {
		aClass16_1198 = null;
		aClass60_1201 = null;
		if (i != 0) {
			method1247(56, (byte) 21);
		}
		aShortArrayArray1189 = null;
		aClass16_1191 = null;
		aClass23_Sub19Array1186 = null;
		aLongArray1187 = null;
	}
	
	Class68(int[] is) {
		int i;
		for (i = 1; i <= is.length + (is.length >> 1); i <<= 1) {
			/* empty */
		}
		anIntArray1204 = new int[i - -i];
		for (int i_28_ = 0; i_28_ < i + i; i_28_++)
			anIntArray1204[i_28_] = -1;
		for (int i_29_ = 0; (is.length ^ 0xffffffff) < (i_29_ ^ 0xffffffff); i_29_++) {
			int i_30_;
			for (i_30_ = i + -1 & is[i_29_]; anIntArray1204[1 + i_30_ + i_30_] != -1; i_30_ = i - 1 & i_30_ - -1) {
				/* empty */
			}
			anIntArray1204[i_30_ + i_30_] = is[i_29_];
			anIntArray1204[i_30_ - -i_30_ - -1] = i_29_;
		}
	}
	
	static {
		anInt1190 = 0;
		anInt1202 = 0;
		aLongArray1187 = new long[200];
	}
}
