/* Class23_Sub10_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub10_Sub3 extends Class23_Sub10
{
	static int anInt3643;
	static int anInt3644;
	static int anInt3645;
	private Class23_Sub10_Sub2 aClass23_Sub10_Sub2_3646;
	static int anInt3647;
	static int anInt3648;
	static Class5 aClass5_3649;
	static int anInt3650;
	static int anInt3651;
	static int anInt3652;
	protected Class89 aClass89_3653 = new Class89();
	static int anInt3654;
	static RSString aClass16_3655 = Class38_Sub6.method1076((byte) 86, "oberen Rand der Webseite ausw-=hlen)3");
	protected Class23_Sub10_Sub4 aClass23_Sub10_Sub4_3656 = new Class23_Sub10_Sub4();
	static RSString aClass16_3657;
	static int[] anIntArray3658;
	static RSString aClass16_3659;
	static int anInt3660;
	
	final Class23_Sub10 method502() {
		anInt3648++;
		Class23_Sub7 class23_sub7;
		do {
			class23_sub7 = (Class23_Sub7) aClass89_3653.method1431((byte) -89);
			if (class23_sub7 == null) {
				return null;
			}
		} while (class23_sub7.aClass23_Sub10_Sub1_2198 == null);
		return class23_sub7.aClass23_Sub10_Sub1_2198;
	}
	
	final Class23_Sub10 method503() {
		anInt3647++;
		Class23_Sub7 class23_sub7 = (Class23_Sub7) aClass89_3653.method1437(32);
		if (class23_sub7 == null) {
			return null;
		}
		if (class23_sub7.aClass23_Sub10_Sub1_2198 != null) {
			return class23_sub7.aClass23_Sub10_Sub1_2198;
		}
		return method502();
	}
	
	final int method501() {
		anInt3644++;
		return 0;
	}
	
	final void method507(int i) {
		anInt3652++;
		aClass23_Sub10_Sub4_3656.method507(i);
	while_105_:
		for (Class23_Sub7 class23_sub7 = (Class23_Sub7) aClass89_3653.method1437(86); class23_sub7 != null; class23_sub7 = (Class23_Sub7) aClass89_3653.method1431((byte) -89)) {
			if (!aClass23_Sub10_Sub2_3646.method576(6295, class23_sub7)) {
				int i_0_ = i;
				while ((class23_sub7.anInt2197 ^ 0xffffffff) > (i_0_ ^ 0xffffffff)) {
					method586(class23_sub7, class23_sub7.anInt2197, (byte) -61);
					i_0_ -= class23_sub7.anInt2197;
					if (aClass23_Sub10_Sub2_3646.method552(i_0_, null, 0, class23_sub7, 66)) {
						continue while_105_;
					}
				}
				method586(class23_sub7, i_0_, (byte) -61);
				class23_sub7.anInt2197 -= i_0_;
			}
		}
	}
	
	private final void method584(int i, int i_1_, int[] is, Class23_Sub7 class23_sub7, int i_2_, int i_3_) {
		if ((aClass23_Sub10_Sub2_3646.anIntArray3619[class23_sub7.anInt2204] & 0x4 ^ 0xffffffff) != -1 && class23_sub7.anInt2194 < 0) {
			int i_4_ = aClass23_Sub10_Sub2_3646.anIntArray3612[class23_sub7.anInt2204] / Class32.anInt498;
			for (;;) {
				int i_5_ = (-class23_sub7.anInt2205 + i_4_ + 1048575) / i_4_;
				if (i_5_ > i_1_) {
					break;
				}
				class23_sub7.aClass23_Sub10_Sub1_2198.method506(is, i_3_, i_5_);
				class23_sub7.anInt2205 += -1048576 + i_4_ * i_5_;
				i_1_ -= i_5_;
				Class23_Sub10_Sub1 class23_sub10_sub1 = class23_sub7.aClass23_Sub10_Sub1_2198;
				int i_6_ = Class32.anInt498 / 100;
				int i_7_ = 262144 / i_4_;
				i_3_ += i_5_;
				if ((i_7_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
					i_6_ = i_7_;
				}
				if (aClass23_Sub10_Sub2_3646.anIntArray3627[class23_sub7.anInt2204] != 0) {
					class23_sub7.aClass23_Sub10_Sub1_2198 = Class23_Sub10_Sub1.method529(class23_sub7.aClass23_Sub6_Sub1_2211, class23_sub10_sub1.method508(), 0, class23_sub10_sub1.method513());
					aClass23_Sub10_Sub2_3646.method566(class23_sub7.aClass23_Sub2_2224.aShortArray2056[class23_sub7.anInt2215] < 0, (byte) 121, class23_sub7);
					class23_sub7.aClass23_Sub10_Sub1_2198.method515(i_6_, class23_sub10_sub1.method512());
				} else {
					class23_sub7.aClass23_Sub10_Sub1_2198 = Class23_Sub10_Sub1.method529(class23_sub7.aClass23_Sub6_Sub1_2211, class23_sub10_sub1.method508(), class23_sub10_sub1.method512(), class23_sub10_sub1.method513());
				}
				if ((class23_sub7.aClass23_Sub2_2224.aShortArray2056[class23_sub7.anInt2215] ^ 0xffffffff) > -1) {
					class23_sub7.aClass23_Sub10_Sub1_2198.method536(-1);
				}
				class23_sub10_sub1.method519(i_6_);
				class23_sub10_sub1.method506(is, i_3_, i + -i_3_);
				if (class23_sub10_sub1.method526()) {
					aClass23_Sub10_Sub4_3656.method590(class23_sub10_sub1);
				}
			}
			class23_sub7.anInt2205 += i_4_ * i_1_;
		}
		class23_sub7.aClass23_Sub10_Sub1_2198.method506(is, i_3_, i_1_);
		anInt3645++;
		if (i_2_ <= 90) {
			method503();
		}
	}
	
	final void method506(int[] is, int i, int i_8_) {
		anInt3643++;
		aClass23_Sub10_Sub4_3656.method506(is, i, i_8_);
	while_107_:
		for (Class23_Sub7 class23_sub7 = (Class23_Sub7) aClass89_3653.method1437(-1); class23_sub7 != null; class23_sub7 = (Class23_Sub7) aClass89_3653.method1431((byte) -89)) {
			if (!aClass23_Sub10_Sub2_3646.method576(6295, class23_sub7)) {
				int i_9_ = i_8_;
				int i_10_ = i;
				while (class23_sub7.anInt2197 < i_9_) {
					method584(i_10_ + i_9_, class23_sub7.anInt2197, is, class23_sub7, 124, i_10_);
					i_10_ += class23_sub7.anInt2197;
					i_9_ -= class23_sub7.anInt2197;
					if (aClass23_Sub10_Sub2_3646.method552(i_9_, is, i_10_, class23_sub7, 100)) {
						continue while_107_;
					}
				}
				method584(i_10_ + i_9_, i_9_, is, class23_sub7, 93, i_10_);
				class23_sub7.anInt2197 -= i_9_;
			}
		}
	}
	
	static final void method585(int i, int i_11_, int i_12_) {
		Class23_Sub13_Sub9.aBoolean3858 = true;
		Class71_Sub3.anInt2742 = i;
		Class23_Sub4_Sub11.anInt3071 = i_11_;
		Class38_Sub2.anInt2503 = i_12_;
		Class87_Sub1.anInt2788 = -1;
		Class23_Sub10_Sub2.anInt3595 = -1;
	}
	
	private final void method586(Class23_Sub7 class23_sub7, int i, byte b) {
		if (b != -61) {
			method502();
		}
		if ((aClass23_Sub10_Sub2_3646.anIntArray3619[class23_sub7.anInt2204] & 0x4 ^ 0xffffffff) != -1 && class23_sub7.anInt2194 < 0) {
			int i_13_ = aClass23_Sub10_Sub2_3646.anIntArray3612[class23_sub7.anInt2204] / Class32.anInt498;
			int i_14_ = (-class23_sub7.anInt2205 + 1048575 - -i_13_) / i_13_;
			class23_sub7.anInt2205 = class23_sub7.anInt2205 + i * i_13_ & 0xfffff;
			if ((i_14_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
				if (aClass23_Sub10_Sub2_3646.anIntArray3627[class23_sub7.anInt2204] == 0) {
					class23_sub7.aClass23_Sub10_Sub1_2198 = Class23_Sub10_Sub1.method529(class23_sub7.aClass23_Sub6_Sub1_2211, class23_sub7.aClass23_Sub10_Sub1_2198.method508(), class23_sub7.aClass23_Sub10_Sub1_2198.method512(), class23_sub7.aClass23_Sub10_Sub1_2198.method513());
				} else {
					class23_sub7.aClass23_Sub10_Sub1_2198 = Class23_Sub10_Sub1.method529(class23_sub7.aClass23_Sub6_Sub1_2211, class23_sub7.aClass23_Sub10_Sub1_2198.method508(), 0, class23_sub7.aClass23_Sub10_Sub1_2198.method513());
					aClass23_Sub10_Sub2_3646.method566(class23_sub7.aClass23_Sub2_2224.aShortArray2056[class23_sub7.anInt2215] < 0, (byte) 114, class23_sub7);
				}
				if ((class23_sub7.aClass23_Sub2_2224.aShortArray2056[class23_sub7.anInt2215] ^ 0xffffffff) > -1) {
					class23_sub7.aClass23_Sub10_Sub1_2198.method536(-1);
				}
				i = class23_sub7.anInt2205 / i_13_;
			}
		}
		class23_sub7.aClass23_Sub10_Sub1_2198.method507(i);
		anInt3651++;
	}
	
	static final boolean method587(int i, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		anInt3650++;
		int i_25_ = 40 / ((i_19_ - -40) / 53);
		for (int i_26_ = 0; i_26_ < 104; i_26_++) {
			for (int i_27_ = 0; i_27_ < 104; i_27_++) {
				Class23_Sub4_Sub28.anIntArrayArray3346[i_26_][i_27_] = 0;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_26_][i_27_] = 99999999;
			}
		}
		Class23_Sub4_Sub28.anIntArrayArray3346[i_17_][i_16_] = 99;
		Class23_Sub4_Sub29.anIntArrayArray3368[i_17_][i_16_] = 0;
		int i_28_ = i_16_;
		int i_29_ = i_17_;
		int i_30_ = 0;
		Class23_Sub13_Sub9.anIntArray3859[i_30_] = i_17_;
		Class23_Sub4_Sub22.anIntArray3260[i_30_++] = i_16_;
		int i_31_ = 0;
		int[][] is = Class4.aClass72Array85[Class23_Sub13_Sub11.anInt3916].anIntArrayArray1290;
		boolean bool_32_ = false;
		while (i_31_ != i_30_) {
			i_29_ = Class23_Sub13_Sub9.anIntArray3859[i_31_];
			i_28_ = Class23_Sub4_Sub22.anIntArray3260[i_31_];
			i_31_ = 1 + i_31_ & 0xfff;
			if (i_29_ == i_21_ && (i_28_ ^ 0xffffffff) == (i_15_ ^ 0xffffffff)) {
				bool_32_ = true;
				break;
			}
			if ((i_24_ ^ 0xffffffff) != -1) {
				if (i_24_ >= 5 && i_24_ != 10 || !Class4.aClass72Array85[Class23_Sub13_Sub11.anInt3916].method1305((byte) 42, i_24_ - 1, i_18_, i_21_, i_28_, 2, i_29_, i_15_)) {
					if (i_24_ < 10 && Class4.aClass72Array85[Class23_Sub13_Sub11.anInt3916].method1303(i_21_, (byte) 77, i_28_, i_29_, i_15_, i_18_, i_24_ + -1, 2)) {
						bool_32_ = true;
						break;
					}
				} else {
					bool_32_ = true;
					break;
				}
			}
			if (i_22_ != 0 && i_20_ != 0 && Class4.aClass72Array85[Class23_Sub13_Sub11.anInt3916].method1290(i_15_, i_21_, i_29_, i_22_, 2, i_28_, i, i_20_, (byte) -124)) {
				bool_32_ = true;
				break;
			}
			int i_33_ = Class23_Sub4_Sub29.anIntArrayArray3368[i_29_][i_28_] + 1;
			if (i_29_ > 0 && (Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_29_][i_28_] ^ 0xffffffff) == -1 && (0x12c010e & is[-1 + i_29_][i_28_]) == 0 && (0x12c0138 & is[i_29_ + -1][1 + i_28_] ^ 0xffffffff) == -1) {
				Class23_Sub13_Sub9.anIntArray3859[i_30_] = i_29_ - 1;
				Class23_Sub4_Sub22.anIntArray3260[i_30_] = i_28_;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_29_ + -1][i_28_] = 2;
				i_30_ = i_30_ + 1 & 0xfff;
				Class23_Sub4_Sub29.anIntArrayArray3368[-1 + i_29_][i_28_] = i_33_;
			}
			if (i_29_ < 102 && (Class23_Sub4_Sub28.anIntArrayArray3346[1 + i_29_][i_28_] ^ 0xffffffff) == -1 && (0x12c0183 & is[2 + i_29_][i_28_] ^ 0xffffffff) == -1 && (0x12c01e0 & is[i_29_ - -2][i_28_ - -1] ^ 0xffffffff) == -1) {
				Class23_Sub13_Sub9.anIntArray3859[i_30_] = 1 + i_29_;
				Class23_Sub4_Sub22.anIntArray3260[i_30_] = i_28_;
				i_30_ = i_30_ + 1 & 0xfff;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_29_ + 1][i_28_] = 8;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_29_ - -1][i_28_] = i_33_;
			}
			if ((i_28_ ^ 0xffffffff) < -1 && Class23_Sub4_Sub28.anIntArrayArray3346[i_29_][-1 + i_28_] == 0 && (0x12c010e & is[i_29_][i_28_ - 1] ^ 0xffffffff) == -1 && (is[i_29_ - -1][-1 + i_28_] & 0x12c0183 ^ 0xffffffff) == -1) {
				Class23_Sub13_Sub9.anIntArray3859[i_30_] = i_29_;
				Class23_Sub4_Sub22.anIntArray3260[i_30_] = i_28_ - 1;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_29_][-1 + i_28_] = 1;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_29_][i_28_ + -1] = i_33_;
				i_30_ = 1 + i_30_ & 0xfff;
			}
			if (i_28_ < 102 && Class23_Sub4_Sub28.anIntArrayArray3346[i_29_][1 + i_28_] == 0 && (0x12c0138 & is[i_29_][2 + i_28_] ^ 0xffffffff) == -1 && (0x12c01e0 & is[i_29_ - -1][i_28_ + 2]) == 0) {
				Class23_Sub13_Sub9.anIntArray3859[i_30_] = i_29_;
				Class23_Sub4_Sub22.anIntArray3260[i_30_] = 1 + i_28_;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_29_][1 + i_28_] = 4;
				i_30_ = 0xfff & 1 + i_30_;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_29_][1 + i_28_] = i_33_;
			}
			if ((i_29_ ^ 0xffffffff) < -1 && i_28_ > 0 && Class23_Sub4_Sub28.anIntArrayArray3346[i_29_ - 1][-1 + i_28_] == 0 && (is[-1 + i_29_][i_28_] & 0x12c0138 ^ 0xffffffff) == -1 && (is[-1 + i_29_][-1 + i_28_] & 0x12c010e) == 0 && (is[i_29_][-1 + i_28_] & 0x12c0183 ^ 0xffffffff) == -1) {
				Class23_Sub13_Sub9.anIntArray3859[i_30_] = i_29_ - 1;
				Class23_Sub4_Sub22.anIntArray3260[i_30_] = i_28_ + -1;
				i_30_ = i_30_ + 1 & 0xfff;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_29_ - 1][-1 + i_28_] = 3;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_29_ + -1][i_28_ + -1] = i_33_;
			}
			if (i_29_ < 102 && i_28_ > 0 && Class23_Sub4_Sub28.anIntArrayArray3346[i_29_ + 1][i_28_ + -1] == 0 && (0x12c010e & is[i_29_ + 1][i_28_ - 1] ^ 0xffffffff) == -1 && (0x12c0183 & is[i_29_ + 2][-1 + i_28_] ^ 0xffffffff) == -1 && (0x12c01e0 & is[2 + i_29_][i_28_] ^ 0xffffffff) == -1) {
				Class23_Sub13_Sub9.anIntArray3859[i_30_] = 1 + i_29_;
				Class23_Sub4_Sub22.anIntArray3260[i_30_] = i_28_ + -1;
				i_30_ = i_30_ - -1 & 0xfff;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_29_ - -1][-1 + i_28_] = 9;
				Class23_Sub4_Sub29.anIntArrayArray3368[1 + i_29_][i_28_ + -1] = i_33_;
			}
			if (i_29_ > 0 && i_28_ < 102 && (Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_29_][i_28_ - -1] ^ 0xffffffff) == -1 && (is[-1 + i_29_][i_28_ - -1] & 0x12c010e ^ 0xffffffff) == -1 && (0x12c0138 & is[-1 + i_29_][2 + i_28_]) == 0 && (is[i_29_][i_28_ - -2] & 0x12c01e0) == 0) {
				Class23_Sub13_Sub9.anIntArray3859[i_30_] = -1 + i_29_;
				Class23_Sub4_Sub22.anIntArray3260[i_30_] = i_28_ - -1;
				i_30_ = 0xfff & 1 + i_30_;
				Class23_Sub4_Sub28.anIntArrayArray3346[-1 + i_29_][i_28_ + 1] = 6;
				Class23_Sub4_Sub29.anIntArrayArray3368[i_29_ + -1][i_28_ - -1] = i_33_;
			}
			if (i_29_ < 102 && i_28_ < 102 && (Class23_Sub4_Sub28.anIntArrayArray3346[i_29_ - -1][1 + i_28_] ^ 0xffffffff) == -1 && (0x12c0138 & is[i_29_ + 1][i_28_ + 2]) == 0 && (0x12c01e0 & is[i_29_ + 2][i_28_ + 2] ^ 0xffffffff) == -1 && (0x12c0183 & is[i_29_ + 2][1 + i_28_]) == 0) {
				Class23_Sub13_Sub9.anIntArray3859[i_30_] = i_29_ - -1;
				Class23_Sub4_Sub22.anIntArray3260[i_30_] = 1 + i_28_;
				i_30_ = i_30_ + 1 & 0xfff;
				Class23_Sub4_Sub28.anIntArrayArray3346[i_29_ - -1][i_28_ - -1] = 12;
				Class23_Sub4_Sub29.anIntArrayArray3368[1 + i_29_][i_28_ - -1] = i_33_;
			}
		}
		Class78.anInt1417 = 0;
		if (!bool_32_) {
			if (!bool) {
				return false;
			}
			int i_34_ = 1000;
			int i_35_ = 100;
			int i_36_ = 10;
			for (int i_37_ = i_21_ - i_36_; i_36_ + i_21_ >= i_37_; i_37_++) {
				for (int i_38_ = i_15_ - i_36_; i_38_ <= i_15_ + i_36_; i_38_++) {
					if ((i_37_ ^ 0xffffffff) <= -1 && i_38_ >= 0 && i_37_ < 104 && i_38_ < 104 && Class23_Sub4_Sub29.anIntArrayArray3368[i_37_][i_38_] < 100) {
						int i_39_ = 0;
						int i_40_ = 0;
						if ((i_15_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff)) {
							i_40_ = i_15_ + -i_38_;
						} else if ((i_20_ + i_15_ - 1 ^ 0xffffffff) > (i_38_ ^ 0xffffffff)) {
							i_40_ = i_38_ - i_20_ - i_15_ - -1;
						}
						if (i_21_ > i_37_) {
							i_39_ = i_21_ - i_37_;
						} else if (-1 + (i_21_ - -i_22_) < i_37_) {
							i_39_ = i_37_ - -1 - i_21_ + -i_22_;
						}
						int i_41_ = i_39_ * i_39_ - -(i_40_ * i_40_);
						if ((i_34_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff) || (i_34_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && Class23_Sub4_Sub29.anIntArrayArray3368[i_37_][i_38_] < i_35_) {
							i_35_ = Class23_Sub4_Sub29.anIntArrayArray3368[i_37_][i_38_];
							i_29_ = i_37_;
							i_28_ = i_38_;
							i_34_ = i_41_;
						}
					}
				}
			}
			if (i_34_ == 1000) {
				return false;
			}
			if ((i_17_ ^ 0xffffffff) == (i_29_ ^ 0xffffffff) && (i_16_ ^ 0xffffffff) == (i_28_ ^ 0xffffffff)) {
				return false;
			}
			Class78.anInt1417 = 1;
		}
		i_31_ = 0;
		Class23_Sub13_Sub9.anIntArray3859[i_31_] = i_29_;
		Class23_Sub4_Sub22.anIntArray3260[i_31_++] = i_28_;
		int i_43_;
		int i_42_ = i_43_ = Class23_Sub4_Sub28.anIntArrayArray3346[i_29_][i_28_];
		while ((i_29_ ^ 0xffffffff) != (i_17_ ^ 0xffffffff) || (i_16_ ^ 0xffffffff) != (i_28_ ^ 0xffffffff)) {
			if ((i_42_ ^ 0xffffffff) != (i_43_ ^ 0xffffffff)) {
				Class23_Sub13_Sub9.anIntArray3859[i_31_] = i_29_;
				Class23_Sub4_Sub22.anIntArray3260[i_31_++] = i_28_;
				i_43_ = i_42_;
			}
			if ((0x1 & i_42_ ^ 0xffffffff) != -1) {
				i_28_++;
			} else if ((0x4 & i_42_ ^ 0xffffffff) != -1) {
				i_28_--;
			}
			if ((i_42_ & 0x2) == 0) {
				if ((i_42_ & 0x8) != 0) {
					i_29_--;
				}
			} else {
				i_29_++;
			}
			i_42_ = Class23_Sub4_Sub28.anIntArrayArray3346[i_29_][i_28_];
		}
		if ((i_31_ ^ 0xffffffff) < -1) {
			Class23_Sub13_Sub7.method635(true, i_31_, Class23_Sub4_Sub22.anIntArray3260, Class23_Sub13_Sub9.anIntArray3859, i_23_);
			return true;
		}
		if (i_23_ == 1) {
			return false;
		}
		return true;
	}
	
	public static void method588(int i) {
		aClass5_3649 = null;
		aClass16_3659 = null;
		anIntArray3658 = null;
		aClass16_3655 = null;
		if (i >= -10) {
			anInt3660 = -65;
		}
		aClass16_3657 = null;
	}
	
	Class23_Sub10_Sub3(Class23_Sub10_Sub2 class23_sub10_sub2) {
		aClass23_Sub10_Sub2_3646 = class23_sub10_sub2;
	}
	
	static {
		aClass5_3649 = new Class5(128);
		aClass16_3657 = Class38_Sub6.method1076((byte) 86, "Angreifen");
		aClass16_3659 = Class38_Sub6.method1076((byte) 86, "<col=40ff00>");
		anInt3660 = 0;
		anIntArray3658 = new int[200];
	}
}
