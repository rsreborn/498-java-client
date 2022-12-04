/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class51
{
	private long aLong786;
	static int anInt787;
	static int anInt788;
	static int anInt789;
	static Class64 aClass64_790;
	static int anInt791;
	private long aLong792;
	static int anInt793;
	static int anInt794;
	static int anInt795;
	static int anInt796;
	protected boolean aBoolean797;
	static int anInt798;
	static int anInt799 = 0;
	static int[] anIntArray800;
	static int anInt801;
	static int anInt802;
	private int[] anIntArray803;
	static RSString aClass16_804;
	static int anInt805;
	private int[] anIntArray806;
	private static RSString aClass16_807;
	private int anInt808;
	
	final Class38_Sub1 method1160(Class23_Sub13_Sub22 class23_sub13_sub22, int i, int i_0_) {
		anInt787++;
		if ((anInt808 ^ 0xffffffff) != 0) {
			return Class25.method922(false, anInt808).method824(i, class23_sub13_sub22, 0);
		}
		Class38_Sub1 class38_sub1 = (Class38_Sub1) Class23_Sub4_Sub36.aClass81_3469.method1366(aLong792, (byte) 98);
		if (class38_sub1 == null) {
			boolean bool = false;
			for (int i_1_ = 0; i_1_ < 12; i_1_++) {
				int i_2_ = anIntArray803[i_1_];
				if ((i_2_ & 0x40000000 ^ 0xffffffff) != -1) {
					if (!Class23_Sub13_Sub24.method853(127, i_2_ & 0x3fffffff).method739(aBoolean797, -82)) {
						bool = true;
					}
				} else if ((i_2_ & ~0x7fffffff ^ 0xffffffff) != -1 && !Class34.method975(0x3fffffff & i_2_, i_0_ ^ ~0x7fffff9b).method801((byte) -8)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			Class38_Sub4[] class38_sub4s = new Class38_Sub4[12];
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < 12; i_4_++) {
				int i_5_ = anIntArray803[i_4_];
				if ((0x40000000 & i_5_ ^ 0xffffffff) != -1) {
					Class38_Sub4 class38_sub4 = Class23_Sub13_Sub24.method853(-38, 0x3fffffff & i_5_).method728(-92, aBoolean797);
					if (class38_sub4 != null) {
						class38_sub4s[i_3_++] = class38_sub4;
					}
				} else if ((i_5_ & ~0x7fffffff) != 0) {
					Class38_Sub4 class38_sub4 = Class34.method975(i_5_ & 0x3fffffff, i_0_ ^ ~0x7fffff9b).method792(-17);
					if (class38_sub4 != null) {
						class38_sub4s[i_3_++] = class38_sub4;
					}
				}
			}
			Class38_Sub4 class38_sub4 = new Class38_Sub4(class38_sub4s, i_3_);
			for (int i_6_ = 0; i_6_ < 5; i_6_++) {
				if ((Class44.aShortArrayArray679[i_6_].length ^ 0xffffffff) < (anIntArray806[i_6_] ^ 0xffffffff)) {
					class38_sub4.method1065(Class23_Sub4_Sub32.aShortArray3417[i_6_], Class44.aShortArrayArray679[i_6_][anIntArray806[i_6_]]);
				}
				if (Class68.aShortArrayArray1189[i_6_].length > anIntArray806[i_6_]) {
					class38_sub4.method1065(Class42.aShortArray655[i_6_], Class68.aShortArrayArray1189[i_6_][anIntArray806[i_6_]]);
				}
			}
			class38_sub1 = class38_sub4.method1064(64, 768, -50, -10, -50);
			Class23_Sub4_Sub36.aClass81_3469.method1365(0, aLong792, class38_sub1);
		}
		if (class23_sub13_sub22 != null) {
			class38_sub1 = class23_sub13_sub22.method839(class38_sub1, i, (byte) 99);
		}
		if (i_0_ != -2147483648) {
			method1166(-21, 4, (byte) 123, null, null);
		}
		return class38_sub1;
	}
	
	public static void method1161(int i) {
		aClass16_807 = null;
		aClass64_790 = null;
		if (i > -48) {
			anInt793 = -24;
		}
		aClass16_804 = null;
		anIntArray800 = null;
	}
	
	private final void method1162(byte b) {
		anInt789++;
		long l = aLong792;
		long[] ls = Class47.aLongArray738;
		aLong792 = -1L;
		for (int i = 0; i < 12; i++) {
			aLong792 = ls[(int) (0xffL & ((long) (anIntArray803[i] >> 24) ^ aLong792))] ^ aLong792 >>> 8;
			aLong792 = ls[(int) (0xffL & (aLong792 ^ (long) (anIntArray803[i] >> 16)))] ^ aLong792 >>> 8;
			aLong792 = aLong792 >>> 8 ^ ls[(int) (0xffL & (aLong792 ^ (long) (anIntArray803[i] >> 8)))];
			aLong792 = ls[(int) ((aLong792 ^ (long) anIntArray803[i]) & 0xffL)] ^ aLong792 >>> 8;
		}
		for (int i = 0; i < 5; i++)
			aLong792 = ls[(int) (0xffL & (aLong792 ^ (long) anIntArray806[i]))] ^ aLong792 >>> 8;
		if (b < 126) {
			method1160(null, -95, -13);
		}
		aLong792 = ls[(int) (0xffL & (aLong792 ^ (long) (!aBoolean797 ? 0 : 1)))] ^ aLong792 >>> 8;
		if ((l ^ 0xffffffffffffffffL) != -1L && l != aLong792) {
			Class7.aClass81_161.method1370(73, l);
		}
	}
	
	static final void method1163(byte b) {
		if (b >= -87) {
			method1163((byte) -43);
		}
		anInt805++;
		for (int i = -1; (Class23_Sub4_Sub11.anInt3067 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			int i_7_;
			if ((i ^ 0xffffffff) == 0) {
				i_7_ = 2047;
			} else {
				i_7_ = Class23_Sub13_Sub3.anIntArray3700[i];
			}
			Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i_7_];
			if (class38_sub7_sub2 != null) {
				Class27.method928((byte) 111, class38_sub7_sub2, class38_sub7_sub2.anInt2668);
			}
		}
	}
	
	final void method1164(boolean bool, int i, int[] is, int i_8_, int[] is_9_) {
		anInt791++;
		if (i == -13) {
			if (is_9_ == null) {
				is_9_ = new int[12];
				for (int i_10_ = 0; i_10_ < 7; i_10_++) {
					for (int i_11_ = 0; Class23_Sub4_Sub10.anInt3046 > i_11_; i_11_++) {
						Class23_Sub13_Sub18 class23_sub13_sub18 = Class34.method975(i_11_, 100);
						if (class23_sub13_sub18 != null && !class23_sub13_sub18.aBoolean4096 && class23_sub13_sub18.anInt4102 == (bool ? 7 : 0) + i_10_) {
							is_9_[Class40.anIntArray628[i_10_]] = Class65.method1230(i_11_, -2147483648);
							break;
						}
					}
				}
			}
			anIntArray803 = is_9_;
			anIntArray806 = is;
			aBoolean797 = bool;
			anInt808 = i_8_;
			method1162((byte) 127);
		}
	}
	
	final void method1165(int i, int i_12_, int i_13_) {
		anInt788++;
		int i_14_ = Class40.anIntArray628[i_13_];
		if (i_12_ != (anIntArray803[i_14_] ^ 0xffffffff) && Class34.method975(i, 100) != null) {
			anIntArray803[i_14_] = Class65.method1230(i, -2147483648);
			method1162((byte) 127);
		}
	}
	
	final Class38_Sub1 method1166(int i, int i_15_, byte b, Class23_Sub13_Sub22 class23_sub13_sub22, Class23_Sub13_Sub22 class23_sub13_sub22_16_) {
		anInt794++;
		if ((anInt808 ^ 0xffffffff) != 0) {
			return Class25.method922(false, anInt808).method815(class23_sub13_sub22_16_, b ^ ~0x37, i, i_15_, class23_sub13_sub22);
		}
		if (b != -52) {
			anIntArray806 = null;
		}
		long l = aLong792;
		int[] is = anIntArray803;
		if (class23_sub13_sub22_16_ != null && ((class23_sub13_sub22_16_.anInt4206 ^ 0xffffffff) <= -1 || class23_sub13_sub22_16_.anInt4209 >= 0)) {
			is = new int[12];
			for (int i_17_ = 0; i_17_ < 12; i_17_++)
				is[i_17_] = anIntArray803[i_17_];
			if ((class23_sub13_sub22_16_.anInt4206 ^ 0xffffffff) <= -1) {
				if ((class23_sub13_sub22_16_.anInt4206 ^ 0xffffffff) != -65536) {
					is[5] = Class65.method1230(1073741824, class23_sub13_sub22_16_.anInt4206);
					l ^= (long) is[5] << 32;
				} else {
					l ^= ~0xffffffffL;
					is[5] = 0;
				}
			}
			if (class23_sub13_sub22_16_.anInt4209 >= 0) {
				if ((class23_sub13_sub22_16_.anInt4209 ^ 0xffffffff) != -65536) {
					is[3] = Class65.method1230(1073741824, class23_sub13_sub22_16_.anInt4209);
					l ^= (long) is[3];
				} else {
					is[3] = 0;
					l ^= 0xffffffffL;
				}
			}
		}
		Class38_Sub1 class38_sub1 = (Class38_Sub1) Class7.aClass81_161.method1366(l, (byte) 125);
		if (class38_sub1 == null) {
			boolean bool = false;
			for (int i_18_ = 0; i_18_ < 12; i_18_++) {
				int i_19_ = is[i_18_];
				if ((0x40000000 & i_19_) == 0) {
					if ((~0x7fffffff & i_19_) != 0 && !Class34.method975(i_19_ & 0x3fffffff, b + 152).method794(true)) {
						bool = true;
					}
				} else if (!Class23_Sub13_Sub24.method853(127, 0x3fffffff & i_19_).method730(b + -9886, aBoolean797)) {
					bool = true;
				}
			}
			if (bool) {
				if ((aLong786 ^ 0xffffffffffffffffL) != 0L) {
					class38_sub1 = (Class38_Sub1) Class7.aClass81_161.method1366(aLong786, (byte) 115);
				}
				if (class38_sub1 == null) {
					return null;
				}
			}
			if (class38_sub1 == null) {
				Class38_Sub4[] class38_sub4s = new Class38_Sub4[12];
				int i_20_ = 0;
				for (int i_21_ = 0; i_21_ < 12; i_21_++) {
					int i_22_ = is[i_21_];
					if ((0x40000000 & i_22_ ^ 0xffffffff) == -1) {
						if ((~0x7fffffff & i_22_ ^ 0xffffffff) != -1) {
							Class38_Sub4 class38_sub4 = Class34.method975(0x3fffffff & i_22_, b + 152).method796(-6);
							if (class38_sub4 != null) {
								class38_sub4s[i_20_++] = class38_sub4;
							}
						}
					} else {
						Class38_Sub4 class38_sub4 = Class23_Sub13_Sub24.method853(117, i_22_ & 0x3fffffff).method732((byte) 117, aBoolean797);
						if (class38_sub4 != null) {
							class38_sub4s[i_20_++] = class38_sub4;
						}
					}
				}
				int i_23_ = is[0];
				if ((0x40000000 & i_23_) != 0) {
					ItemDefinition class23_sub13_sub11 = Class23_Sub13_Sub24.method853(-25, 0x3fffffff & i_23_);
					if (class23_sub13_sub11.anIntArrayArray3906 != null) {
						for (int i_24_ = 0; i_24_ < class23_sub13_sub11.anIntArrayArray3906.length; i_24_++) {
							int i_25_ = class23_sub13_sub11.anIntArrayArray3906[i_24_][0];
							int i_26_ = class23_sub13_sub11.anIntArrayArray3906[i_24_][1];
							int i_27_ = class23_sub13_sub11.anIntArrayArray3906[i_24_][2];
							int i_28_ = class23_sub13_sub11.anIntArrayArray3906[i_24_][3];
							int i_29_ = class23_sub13_sub11.anIntArrayArray3906[i_24_][4];
							int i_30_ = class23_sub13_sub11.anIntArrayArray3906[i_24_][5];
							class38_sub4s[i_24_ + 1].method1042(i_25_, i_26_, i_27_);
							class38_sub4s[1 + i_24_].method1055(i_28_, i_29_, i_30_);
						}
					}
				}
				Class38_Sub4 class38_sub4 = new Class38_Sub4(class38_sub4s, i_20_);
				for (int i_31_ = 0; i_31_ < 5; i_31_++) {
					if ((anIntArray806[i_31_] ^ 0xffffffff) > (Class44.aShortArrayArray679[i_31_].length ^ 0xffffffff)) {
						class38_sub4.method1065(Class23_Sub4_Sub32.aShortArray3417[i_31_], Class44.aShortArrayArray679[i_31_][anIntArray806[i_31_]]);
					}
					if ((Class68.aShortArrayArray1189[i_31_].length ^ 0xffffffff) < (anIntArray806[i_31_] ^ 0xffffffff)) {
						class38_sub4.method1065(Class42.aShortArray655[i_31_], Class68.aShortArrayArray1189[i_31_][anIntArray806[i_31_]]);
					}
				}
				class38_sub1 = class38_sub4.method1064(64, 850, -30, -50, -30);
				Class7.aClass81_161.method1365(0, l, class38_sub1);
				aLong786 = l;
			}
		}
		Class38_Sub1 class38_sub1_32_;
		if (class23_sub13_sub22_16_ != null || class23_sub13_sub22 != null) {
			if (class23_sub13_sub22_16_ != null && class23_sub13_sub22 != null) {
				class38_sub1_32_ = class23_sub13_sub22_16_.method842(class23_sub13_sub22, i_15_, class38_sub1, -125, i);
			} else if (class23_sub13_sub22_16_ != null) {
				class38_sub1_32_ = class23_sub13_sub22_16_.method835(i, (byte) -12, class38_sub1);
			} else {
				class38_sub1_32_ = class23_sub13_sub22.method835(i_15_, (byte) -12, class38_sub1);
			}
		} else {
			return class38_sub1;
		}
		return class38_sub1_32_;
	}
	
	final int method1167(int i) {
		anInt802++;
		if (i != 64) {
			aLong792 = -29L;
		}
		if (anInt808 == -1) {
			return anIntArray803[1] + (anIntArray803[11] << 5) + ((anIntArray806[0] << 25) - (-(anIntArray806[4] << 20) + -(anIntArray803[0] << 15) - (anIntArray803[8] << 10)));
		}
		return Class25.method922(false, anInt808).anInt4159 + 305419896;
	}
	
	final void method1168(int i, int i_33_, byte b) {
		if (b != -101) {
			aClass16_807 = null;
		}
		anIntArray806[i] = i_33_;
		method1162((byte) 127);
		anInt796++;
	}
	
	final void method1169(boolean bool, boolean bool_34_) {
		if (bool != true) {
			aClass64_790 = null;
		}
		aBoolean797 = bool_34_;
		anInt795++;
		method1162((byte) 127);
	}
	
	static {
		anInt793 = 0;
		anIntArray800 = new int[25];
		anInt798 = 0;
		aClass16_807 = Class38_Sub6.method1076((byte) 86, "Loading title screen )2 ");
		aClass16_804 = aClass16_807;
	}
}
