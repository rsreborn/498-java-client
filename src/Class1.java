/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1
{
	private Class23_Sub4 aClass23_Sub4_56;
	private Class23_Sub4[] aClass23_Sub4Array57;
	static Class5 aClass5_58 = new Class5(64);
	private int[] anIntArray59;
	private Class23_Sub4 aClass23_Sub4_60;
	static int anInt61;
	static int anInt62;
	private int[] anIntArray63;
	static Class5 aClass5_64 = new Class5(64);
	static RSString aClass16_65;
	static RSString aClass16_66 = Class38_Sub6.method1076((byte) 86, "scrollen:");
	static int anInt67;
	
	public static void method44(int i) {
		int i_0_ = 117 % ((i - -51) / 37);
		aClass16_65 = null;
		aClass5_64 = null;
		aClass5_58 = null;
		aClass16_66 = null;
	}
	
	final boolean method45(Interface1 interface1, Class105 class105, int i) {
		anInt61++;
		for (int i_1_ = i; i_1_ < anIntArray63.length; i_1_++) {
			if (!class105.method1549(-13114, anIntArray63[i_1_])) {
				return false;
			}
		}
		for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (anIntArray59.length ^ 0xffffffff); i_2_++) {
			if (!interface1.method5(anIntArray59[i_2_], 105)) {
				return false;
			}
		}
		return true;
	}
	
	final int[] method46(boolean bool, int i, Class105 class105, int i_3_, boolean bool_4_, Interface1 interface1, byte b, double d) {
		anInt62++;
		int[] is = new int[i * i_3_];
		Class65.method1235((byte) -108, d);
		Class53.aClass105_847 = class105;
		Class38.anInterface1_589 = interface1;
		Class23_Sub4.method266(4096, i_3_, i);
		for (int i_5_ = 0; i_5_ < aClass23_Sub4Array57.length; i_5_++)
			aClass23_Sub4Array57[i_5_].method253(i, i_3_, -21809);
		int i_6_;
		int i_7_;
		int i_8_;
		if (bool) {
			i_8_ = -1 + i_3_;
			i_6_ = -1;
			i_7_ = -1;
		} else {
			i_6_ = 1;
			i_7_ = i_3_;
			i_8_ = 0;
		}
		int i_9_ = 0;
		for (int i_10_ = 0; i > i_10_; i_10_++) {
			if (bool_4_) {
				i_9_ = i_10_;
			}
			int[] is_11_;
			int[] is_12_;
			int[] is_13_;
			if (!aClass23_Sub4_56.aBoolean2117) {
				int[][] is_14_ = aClass23_Sub4_56.method258(i_10_, (byte) 9);
				is_11_ = is_14_[0];
				is_13_ = is_14_[2];
				is_12_ = is_14_[1];
			} else {
				int[] is_15_ = aClass23_Sub4_56.method260(0, i_10_);
				is_11_ = is_15_;
				is_12_ = is_15_;
				is_13_ = is_15_;
			}
			for (int i_16_ = i_8_; (i_16_ ^ 0xffffffff) != (i_7_ ^ 0xffffffff); i_16_ += i_6_) {
				int i_17_ = is_11_[i_16_] >> 4;
				if (i_17_ > 255) {
					i_17_ = 255;
				}
				if (i_17_ < 0) {
					i_17_ = 0;
				}
				int i_18_ = is_13_[i_16_] >> 4;
				if (i_18_ > 255) {
					i_18_ = 255;
				}
				int i_19_ = is_12_[i_16_] >> 4;
				if ((i_18_ ^ 0xffffffff) > -1) {
					i_18_ = 0;
				}
				i_17_ = Class23_Sub4_Sub32.anIntArray3420[i_17_];
				i_18_ = Class23_Sub4_Sub32.anIntArray3420[i_18_];
				if (i_19_ > 255) {
					i_19_ = 255;
				}
				if ((i_19_ ^ 0xffffffff) > -1) {
					i_19_ = 0;
				}
				i_19_ = Class23_Sub4_Sub32.anIntArray3420[i_19_];
				is[i_9_++] = (i_19_ << 8) + (i_17_ << 16) + i_18_;
				if (bool_4_) {
					i_9_ += -1 + i_3_;
				}
			}
		}
		for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (aClass23_Sub4Array57.length ^ 0xffffffff); i_20_++)
			aClass23_Sub4Array57[i_20_].method254(-1339);
		if (b >= -94) {
			aClass5_58 = null;
		}
		return is;
	}
	
	static final boolean method47(int i, int i_21_, int i_22_, int i_23_, int i_24_) {
		int i_25_ = i_23_ * Class58.anInt906 + i * Class87.anInt1495 >> 16;
		int i_26_ = i_23_ * Class87.anInt1495 - i * Class58.anInt906 >> 16;
		int i_27_ = i_21_ * Class25.anInt381 + i_26_ * Class23_Sub4_Sub6.anInt2980 >> 16;
		int i_28_ = i_21_ * Class23_Sub4_Sub6.anInt2980 - i_26_ * Class25.anInt381 >> 16;
		if (i_27_ < 1) {
			i_27_ = 1;
		}
		int i_29_ = (i_25_ << 9) / i_27_;
		int i_30_ = (i_28_ << 9) / i_27_;
		int i_31_ = i_22_ * Class25.anInt381 + i_26_ * Class23_Sub4_Sub6.anInt2980 >> 16;
		int i_32_ = i_22_ * Class23_Sub4_Sub6.anInt2980 - i_26_ * Class25.anInt381 >> 16;
		if (i_31_ < 1) {
			i_31_ = 1;
		}
		int i_33_ = (i_25_ << 9) / i_31_;
		int i_34_ = (i_32_ << 9) / i_31_;
		if (i_27_ < 50 && i_31_ < 50) {
			return false;
		}
		if (i_27_ > i_24_ && i_31_ > i_24_) {
			return false;
		}
		if (i_29_ < Class46.anInt715 && i_33_ < Class46.anInt715) {
			return false;
		}
		if (i_29_ > Class21.anInt335 && i_33_ > Class21.anInt335) {
			return false;
		}
		if (i_30_ < Class23_Sub4_Sub35.anInt3459 && i_34_ < Class23_Sub4_Sub35.anInt3459) {
			return false;
		}
		if (i_30_ > Class23_Sub4_Sub7.anInt3023 && i_34_ > Class23_Sub4_Sub7.anInt3023) {
			return false;
		}
		return true;
	}
	
	public Class1() {
		anIntArray59 = new int[0];
		anIntArray63 = new int[0];
		aClass23_Sub4_56 = new Class23_Sub4_Sub20();
		aClass23_Sub4_56.anInt2118 = 1;
		aClass23_Sub4_60 = new Class23_Sub4_Sub20();
		aClass23_Sub4_60.anInt2118 = 1;
		aClass23_Sub4Array57 = new Class23_Sub4[] { aClass23_Sub4_56, aClass23_Sub4_60 };
	}
	
	Class1(Buffer class23_sub5) {
		int i = class23_sub5.readUByte();
		int i_35_ = 0;
		aClass23_Sub4Array57 = new Class23_Sub4[i];
		int i_36_ = 0;
		int[][] is = new int[i][];
		for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (i ^ 0xffffffff); i_37_++) {
			Class23_Sub4 class23_sub4 = Class23_Sub4_Sub23_Sub1.method364((byte) -114, class23_sub5);
			if ((class23_sub4.method262(120) ^ 0xffffffff) <= -1) {
				i_35_++;
			}
			if (class23_sub4.method264((byte) 15) >= 0) {
				i_36_++;
			}
			int i_38_ = class23_sub4.aClass23_Sub4Array2120.length;
			is[i_37_] = new int[i_38_];
			for (int i_39_ = 0; i_38_ > i_39_; i_39_++)
				is[i_37_][i_39_] = class23_sub5.readUByte();
			aClass23_Sub4Array57[i_37_] = class23_sub4;
		}
		anIntArray63 = new int[i_35_];
		i_35_ = 0;
		anIntArray59 = new int[i_36_];
		i_36_ = 0;
		for (int i_40_ = 0; i_40_ < i; i_40_++) {
			Class23_Sub4 class23_sub4 = aClass23_Sub4Array57[i_40_];
			int i_41_ = class23_sub4.aClass23_Sub4Array2120.length;
			for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > (i_41_ ^ 0xffffffff); i_42_++)
				class23_sub4.aClass23_Sub4Array2120[i_42_] = aClass23_Sub4Array57[is[i_40_][i_42_]];
			int i_43_ = class23_sub4.method262(-117);
			int i_44_ = class23_sub4.method264((byte) 15);
			if ((i_43_ ^ 0xffffffff) < -1) {
				anIntArray63[i_35_++] = i_43_;
			}
			if ((i_44_ ^ 0xffffffff) < -1) {
				anIntArray59[i_36_++] = i_44_;
			}
			is[i_40_] = null;
		}
		Object object = null;
		aClass23_Sub4_56 = aClass23_Sub4Array57[class23_sub5.readUByte()];
		aClass23_Sub4_60 = aClass23_Sub4Array57[class23_sub5.readUByte()];
	}
	
	static {
		aClass16_65 = Class38_Sub6.method1076((byte) 86, "Gegenstand f-Ur Mitglieder");
	}
}
