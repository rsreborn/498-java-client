/* Class23_Sub10_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub10_Sub2 extends Class23_Sub10
{
	static int anInt3564;
	private int[] anIntArray3565;
	static int anInt3566;
	static int anInt3567;
	private int[] anIntArray3568 = new int[16];
	private int[] anIntArray3569;
	static int anInt3570;
	static int anInt3571;
	static int anInt3572;
	static int anInt3573;
	private int[] anIntArray3574;
	static int anInt3575;
	private int anInt3576 = 1000000;
	static int anInt3577;
	static int anInt3578;
	private int[] anIntArray3579;
	static int anInt3580;
	static int anInt3581;
	private int[] anIntArray3582;
	private Class23_Sub7[][] aClass23_Sub7ArrayArray3583;
	static int anInt3584;
	static int anInt3585;
	static int anInt3586;
	private int[] anIntArray3587;
	static int anInt3588;
	static int anInt3589 = 1;
	static int anInt3590;
	static int anInt3591;
	private Class96 aClass96_3592;
	private int[] anIntArray3593;
	static int anInt3594;
	static int anInt3595;
	static int anInt3596;
	static int anInt3597;
	static short aShort3598;
	static RSString aClass16_3599 = Class38_Sub6.method1076((byte) 86, "Freie Welt");
	static RSString aClass16_3600 = Class38_Sub6.method1076((byte) 86, "<col=ffff00>");
	static int anInt3601;
	static int anInt3602;
	static short aShort3603;
	static int anInt3604;
	static int anInt3605;
	static int anInt3606;
	static int anInt3607;
	private int anInt3608;
	static Class23_Sub13_Sub10[] aClass23_Sub13_Sub10Array3609;
	private int[] anIntArray3610;
	static int anInt3611;
	protected int[] anIntArray3612;
	static int anInt3613;
	private int[] anIntArray3614;
	static int anInt3615;
	static int anInt3616;
	static int anInt3617;
	private oa anOa3618;
	protected int[] anIntArray3619;
	static int anInt3620;
	static int anInt3621;
	static int anInt3622;
	static RSString aClass16_3623;
	static int anInt3624;
	static int anInt3625;
	private Class23_Sub7[][] aClass23_Sub7ArrayArray3626;
	protected int[] anIntArray3627;
	static int anInt3628;
	static int anInt3629;
	private int[] anIntArray3630;
	private int[] anIntArray3631;
	static int anInt3632;
	static int anInt3633;
	static int[] anIntArray3634;
	static int anInt3635;
	static int anInt3636;
	private Class23_Sub10_Sub3 aClass23_Sub10_Sub3_3637;
	private boolean aBoolean3638;
	private int anInt3639;
	private long aLong3640;
	private long aLong3641;
	private int anInt3642;
	
	private final void method548(int i, int i_0_) {
		int i_1_ = i & 0xf0;
		anInt3615++;
		if (i_1_ == 128) {
			int i_2_ = 0xf & i;
			int i_3_ = i >> 8 & 0x7f;
			int i_4_ = (0x7fc7dd & i) >> 16;
			method578(i_3_, i_2_, 5106, i_4_);
		} else if (i_1_ == 144) {
			int i_5_ = 0xf & i;
			int i_6_ = i >> 8 & 0x7f;
			int i_7_ = 0x7f & i >> 16;
			if ((i_7_ ^ 0xffffffff) >= -1) {
				method578(i_6_, i_5_, i_0_ + 5112, 64);
			} else {
				method559(i_5_, i_7_, i_6_, (byte) -64);
			}
		} else if (i_1_ == 160) {
			int i_8_ = (0x7f97 & i) >> 8;
			int i_9_ = i & 0xf;
			int i_10_ = 0x7f & i >> 16;
			method569(i_9_, i_10_, 83, i_8_);
		} else if (i_1_ == 176) {
			int i_11_ = i & 0xf;
			int i_12_ = i >> 8 & 0x7f;
			int i_13_ = i >> 16 & 0x7f;
			if ((i_12_ ^ 0xffffffff) == -1) {
				anIntArray3631[i_11_] = (i_13_ << 14) + Class24.method919(anIntArray3631[i_11_], -2080769);
			}
			if (i_12_ == 32) {
				anIntArray3631[i_11_] = Class24.method919(anIntArray3631[i_11_], -16257) - -(i_13_ << 7);
			}
			if (i_12_ == 1) {
				anIntArray3582[i_11_] = (i_13_ << 7) + Class24.method919(-16257, anIntArray3582[i_11_]);
			}
			if (i_12_ == 33) {
				anIntArray3582[i_11_] = i_13_ + Class24.method919(-128, anIntArray3582[i_11_]);
			}
			if (i_12_ == 5) {
				anIntArray3579[i_11_] = Class24.method919(-16257, anIntArray3579[i_11_]) + (i_13_ << 7);
			}
			if (i_12_ == 37) {
				anIntArray3579[i_11_] = i_13_ + Class24.method919(-128, anIntArray3579[i_11_]);
			}
			if (i_12_ == 7) {
				anIntArray3614[i_11_] = Class24.method919(-16257, anIntArray3614[i_11_]) + (i_13_ << 7);
			}
			if (i_12_ == 39) {
				anIntArray3614[i_11_] = i_13_ + Class24.method919(-128, anIntArray3614[i_11_]);
			}
			if (i_12_ == 10) {
				anIntArray3574[i_11_] = (i_13_ << 7) + Class24.method919(anIntArray3574[i_11_], -16257);
			}
			if (i_12_ == 42) {
				anIntArray3574[i_11_] = i_13_ + Class24.method919(anIntArray3574[i_11_], -128);
			}
			if (i_12_ == 11) {
				anIntArray3568[i_11_] = Class24.method919(-16257, anIntArray3568[i_11_]) + (i_13_ << 7);
			}
			if (i_12_ == 43) {
				anIntArray3568[i_11_] = i_13_ + Class24.method919(-128, anIntArray3568[i_11_]);
			}
			if (i_12_ == 64) {
				if (i_13_ < 64) {
					anIntArray3619[i_11_] = Class24.method919(anIntArray3619[i_11_], -2);
				} else {
					anIntArray3619[i_11_] = Class65.method1230(anIntArray3619[i_11_], 1);
				}
			}
			if (i_12_ == 65) {
				if (i_13_ >= 64) {
					anIntArray3619[i_11_] = Class65.method1230(anIntArray3619[i_11_], 2);
				} else {
					method563(27798, i_11_);
					anIntArray3619[i_11_] = Class24.method919(anIntArray3619[i_11_], -3);
				}
			}
			if (i_12_ == 99) {
				anIntArray3610[i_11_] = Class24.method919(127, anIntArray3610[i_11_]) - -(i_13_ << 7);
			}
			if (i_12_ == 98) {
				anIntArray3610[i_11_] = i_13_ + Class24.method919(anIntArray3610[i_11_], 16256);
			}
			if (i_12_ == 101) {
				anIntArray3610[i_11_] = 16384 + Class24.method919(127, anIntArray3610[i_11_]) - -(i_13_ << 7);
			}
			if (i_12_ == 100) {
				anIntArray3610[i_11_] = i_13_ + Class24.method919(anIntArray3610[i_11_], 16256) + 16384;
			}
			if (i_12_ == 120) {
				method554(i_11_, (byte) 95);
			}
			if (i_12_ == 121) {
				method565(8192, i_11_);
			}
			if (i_12_ == 123) {
				method575(-112, i_11_);
			}
			if (i_12_ == 6) {
				int i_14_ = anIntArray3610[i_11_];
				if (i_14_ == 16384) {
					anIntArray3593[i_11_] = (i_13_ << 7) + Class24.method919(anIntArray3593[i_11_], -16257);
				}
			}
			if (i_12_ == 38) {
				int i_15_ = anIntArray3610[i_11_];
				if (i_15_ == 16384) {
					anIntArray3593[i_11_] = i_13_ + Class24.method919(-128, anIntArray3593[i_11_]);
				}
			}
			if (i_12_ == 16) {
				anIntArray3627[i_11_] = (i_13_ << 7) + Class24.method919(anIntArray3627[i_11_], -16257);
			}
			if (i_12_ == 48) {
				anIntArray3627[i_11_] = Class24.method919(anIntArray3627[i_11_], -128) - -i_13_;
			}
			if (i_12_ == 81) {
				if (i_13_ >= 64) {
					anIntArray3619[i_11_] = Class65.method1230(anIntArray3619[i_11_], 4);
				} else {
					method567(i_0_ + 6, i_11_);
					anIntArray3619[i_11_] = Class24.method919(anIntArray3619[i_11_], -5);
				}
			}
			if (i_12_ == 17) {
				method553((i_13_ << 7) + (anIntArray3587[i_11_] & ~0x3f80), 15052, i_11_);
			}
			if (i_12_ == 49) {
				method553(i_13_ + (anIntArray3587[i_11_] & ~0x7f), 15052, i_11_);
			}
		} else if (i_1_ == 192) {
			int i_16_ = 0xf & i;
			int i_17_ = (0x7ffe & i) >> 8;
			method571(8460, i_16_, i_17_ + anIntArray3631[i_16_]);
		} else if (i_1_ == 208) {
			int i_18_ = i & 0xf;
			int i_19_ = (0x7f9f & i) >> 8;
			method555((byte) 58, i_18_, i_19_);
		} else {
			if (i_0_ != -6) {
				anIntArray3612 = null;
			}
			if (i_1_ == 224) {
				int i_20_ = 0xf & i;
				int i_21_ = (0x7f & i >> 8) + (0x3f80 & i >> 9);
				method550(i_20_, i_21_, (byte) 71);
			} else {
				i_1_ = 0xff & i;
				if (i_1_ == 255) {
					method574(125);
				}
			}
		}
	}
	
	final synchronized void method549(byte b, int i, int i_22_) {
		anInt3578++;
		method557(i_22_, 48, i);
		int i_23_ = -95 % ((39 - b) / 60);
	}
	
	private final void method550(int i, int i_24_, byte b) {
		anIntArray3630[i] = i_24_;
		if (b < 3) {
			method502();
		}
		anInt3573++;
	}
	
	final synchronized void method551(byte b) {
		if (b == 24) {
			anInt3590++;
			aClass96_3592.method1483();
			method574(125);
		}
	}
	
	final synchronized void method506(int[] is, int i, int i_25_) {
		anInt3596++;
		if (aClass96_3592.method1480()) {
			int i_26_ = anInt3576 * aClass96_3592.anInt1627 / Class32.anInt498;
			do {
				long l = (long) i_25_ * (long) i_26_ + aLong3641;
				if (aLong3640 + -l >= 0L) {
					aLong3641 = l;
					break;
				}
				int i_27_ = (int) (((long) i_26_ + -aLong3641 + aLong3640 - 1L) / (long) i_26_);
				i_25_ -= i_27_;
				aLong3641 += (long) i_27_ * (long) i_26_;
				aClass23_Sub10_Sub3_3637.method506(is, i, i_27_);
				i += i_27_;
				method580(1);
			} while (aClass96_3592.method1480());
		}
		aClass23_Sub10_Sub3_3637.method506(is, i, i_25_);
	}
	
	final synchronized Class23_Sub10 method502() {
		anInt3584++;
		return null;
	}
	
	final boolean method552(int i, int[] is, int i_28_, Class23_Sub7 class23_sub7, int i_29_) {
		class23_sub7.anInt2197 = Class32.anInt498 / 100;
		anInt3633++;
		if (class23_sub7.anInt2194 >= 0 && (class23_sub7.aClass23_Sub10_Sub1_2198 == null || class23_sub7.aClass23_Sub10_Sub1_2198.method527())) {
			class23_sub7.method496((byte) -53);
			class23_sub7.method228(0);
			if ((class23_sub7.anInt2217 ^ 0xffffffff) < -1 && aClass23_Sub7ArrayArray3583[class23_sub7.anInt2204][class23_sub7.anInt2217] == class23_sub7) {
				aClass23_Sub7ArrayArray3583[class23_sub7.anInt2204][class23_sub7.anInt2217] = null;
			}
			return true;
		}
		int i_30_ = class23_sub7.anInt2212;
		if (i_30_ > 0) {
			i_30_ -= (int) (0.5 + Math.pow(2.0, 4.921259842519685E-4 * (double) anIntArray3579[class23_sub7.anInt2204]) * 16.0);
			if (i_30_ < 0) {
				i_30_ = 0;
			}
			class23_sub7.anInt2212 = i_30_;
		}
		if (i_29_ <= 30) {
			method567(98, 8);
		}
		boolean bool = false;
		class23_sub7.aClass23_Sub10_Sub1_2198.method528(method573(class23_sub7, 100));
		class23_sub7.anInt2210++;
		Class47 class47 = class23_sub7.aClass47_2209;
		class23_sub7.anInt2208 += class47.anInt725;
		double d = (double) ((-60 + class23_sub7.anInt2215 << 8) + (class23_sub7.anInt2225 * class23_sub7.anInt2212 >> 12)) * 5.086263020833333E-6;
		if (class47.anInt730 > 0) {
			if (class47.anInt736 > 0) {
				class23_sub7.anInt2222 += (int) (Math.pow(2.0, d * (double) class47.anInt736) * 128.0 + 0.5);
			} else {
				class23_sub7.anInt2222 += 128;
			}
			if (class23_sub7.anInt2222 * class47.anInt730 >= 819200) {
				bool = true;
			}
		}
		if (class47.aByteArray729 != null) {
			if ((class47.anInt728 ^ 0xffffffff) >= -1) {
				class23_sub7.anInt2218 += 128;
			} else {
				class23_sub7.anInt2218 += (int) (Math.pow(2.0, d * (double) class47.anInt728) * 128.0 + 0.5);
			}
			for (/**/; (class47.aByteArray729.length + -2 ^ 0xffffffff) < (class23_sub7.anInt2207 ^ 0xffffffff) && class23_sub7.anInt2218 > (0xff & class47.aByteArray729[class23_sub7.anInt2207 - -2]) << 8; class23_sub7.anInt2207 += 2) {
				/* empty */
			}
			if ((class23_sub7.anInt2207 ^ 0xffffffff) == (-2 + class47.aByteArray729.length ^ 0xffffffff) && class47.aByteArray729[class23_sub7.anInt2207 + 1] == 0) {
				bool = true;
			}
		}
		if ((class23_sub7.anInt2194 ^ 0xffffffff) <= -1 && class47.aByteArray731 != null && (anIntArray3619[class23_sub7.anInt2204] & 0x1) == 0 && (class23_sub7.anInt2217 < 0 || aClass23_Sub7ArrayArray3583[class23_sub7.anInt2204][class23_sub7.anInt2217] != class23_sub7)) {
			if ((class47.anInt720 ^ 0xffffffff) < -1) {
				class23_sub7.anInt2194 += (int) (Math.pow(2.0, (double) class47.anInt720 * d) * 128.0 + 0.5);
			} else {
				class23_sub7.anInt2194 += 128;
			}
			for (/**/; class47.aByteArray731.length + -2 > class23_sub7.anInt2199 && (class47.aByteArray731[2 + class23_sub7.anInt2199] & 0xff) << 8 < class23_sub7.anInt2194; class23_sub7.anInt2199 += 2) {
				/* empty */
			}
			if (class23_sub7.anInt2199 == class47.aByteArray731.length + -2) {
				bool = true;
			}
		}
		if (bool) {
			class23_sub7.aClass23_Sub10_Sub1_2198.method519(class23_sub7.anInt2197);
			if (is == null) {
				class23_sub7.aClass23_Sub10_Sub1_2198.method507(i);
			} else {
				class23_sub7.aClass23_Sub10_Sub1_2198.method506(is, i_28_, i);
			}
			if (class23_sub7.aClass23_Sub10_Sub1_2198.method526()) {
				aClass23_Sub10_Sub3_3637.aClass23_Sub10_Sub4_3656.method590(class23_sub7.aClass23_Sub10_Sub1_2198);
			}
			class23_sub7.method496((byte) -53);
			if (class23_sub7.anInt2194 >= 0) {
				class23_sub7.method228(0);
				if (class23_sub7.anInt2217 > 0 && aClass23_Sub7ArrayArray3583[class23_sub7.anInt2204][class23_sub7.anInt2217] == class23_sub7) {
					aClass23_Sub7ArrayArray3583[class23_sub7.anInt2204][class23_sub7.anInt2217] = null;
				}
			}
			return true;
		}
		class23_sub7.aClass23_Sub10_Sub1_2198.method547(class23_sub7.anInt2197, method561(107, class23_sub7), method558(class23_sub7, (byte) 104));
		return false;
	}
	
	private final void method553(int i, int i_31_, int i_32_) {
		if (i_31_ != 15052) {
			anInt3595 = 117;
		}
		anInt3635++;
		anIntArray3587[i_32_] = i;
		anIntArray3612[i_32_] = (int) (0.5 + Math.pow(2.0, 5.4931640625E-4 * (double) i) * 2097152.0);
	}
	
	private final void method554(int i, byte b) {
		anInt3575++;
		for (Class23_Sub7 class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1437(-126); class23_sub7 != null; class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1431((byte) -89)) {
			if (i < 0 || (class23_sub7.anInt2204 ^ 0xffffffff) == (i ^ 0xffffffff)) {
				if (class23_sub7.aClass23_Sub10_Sub1_2198 != null) {
					class23_sub7.aClass23_Sub10_Sub1_2198.method519(Class32.anInt498 / 100);
					if (class23_sub7.aClass23_Sub10_Sub1_2198.method526()) {
						aClass23_Sub10_Sub3_3637.aClass23_Sub10_Sub4_3656.method590(class23_sub7.aClass23_Sub10_Sub1_2198);
					}
					class23_sub7.method496((byte) -53);
				}
				if ((class23_sub7.anInt2194 ^ 0xffffffff) > -1) {
					aClass23_Sub7ArrayArray3626[class23_sub7.anInt2204][class23_sub7.anInt2215] = null;
				}
				class23_sub7.method228(0);
			}
		}
		int i_33_ = -107 % ((41 - b) / 42);
	}
	
	private final void method555(byte b, int i, int i_34_) {
		if (b != 58) {
			method561(-101, null);
		}
		anInt3602++;
	}
	
	final int method556(int i) {
		anInt3580++;
		if (i != 0) {
			method570(98);
		}
		return anInt3608;
	}
	
	final synchronized void method507(int i) {
		anInt3591++;
		if (aClass96_3592.method1480()) {
			int i_35_ = anInt3576 * aClass96_3592.anInt1627 / Class32.anInt498;
			do {
				long l = (long) i_35_ * (long) i + aLong3641;
				if ((aLong3640 + -l ^ 0xffffffffffffffffL) <= -1L) {
					aLong3641 = l;
					break;
				}
				int i_36_ = (int) ((aLong3640 - aLong3641 - (-(long) i_35_ + 1L)) / (long) i_35_);
				aLong3641 += (long) i_36_ * (long) i_35_;
				i -= i_36_;
				aClass23_Sub10_Sub3_3637.method507(i_36_);
				method580(1);
			} while (aClass96_3592.method1480());
		}
		aClass23_Sub10_Sub3_3637.method507(i);
	}
	
	private final void method557(int i, int i_37_, int i_38_) {
		anIntArray3565[i_38_] = i;
		if (i_37_ <= 36) {
			anInt3576 = -100;
		}
		anIntArray3631[i_38_] = Class24.method919(-128, i);
		method571(8460, i_38_, i);
		anInt3567++;
	}
	
	private final int method558(Class23_Sub7 class23_sub7, byte b) {
		anInt3624++;
		if (b <= 81) {
			return -14;
		}
		int i = anIntArray3574[class23_sub7.anInt2204];
		if (i >= 8192) {
			return 16384 + -(32 + (-class23_sub7.anInt2214 + 128) * (-i + 16384) >> 6);
		}
		return class23_sub7.anInt2214 * i - -32 >> 6;
	}
	
	private final void method559(int i, int i_39_, int i_40_, byte b) {
		method578(i_40_, i, 5106, 64);
		anInt3594++;
		if ((anIntArray3619[i] & 0x2) != 0) {
			for (Class23_Sub7 class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1440(117); class23_sub7 != null; class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1438((byte) 117)) {
				if (class23_sub7.anInt2204 == i && class23_sub7.anInt2194 < 0) {
					aClass23_Sub7ArrayArray3626[i][class23_sub7.anInt2215] = null;
					aClass23_Sub7ArrayArray3626[i][i_40_] = class23_sub7;
					int i_41_ = class23_sub7.anInt2223 + (class23_sub7.anInt2225 * class23_sub7.anInt2212 >> 12);
					class23_sub7.anInt2223 += -class23_sub7.anInt2215 + i_40_ << 8;
					class23_sub7.anInt2225 = -class23_sub7.anInt2223 + i_41_;
					class23_sub7.anInt2215 = i_40_;
					class23_sub7.anInt2212 = 4096;
					return;
				}
			}
		}
		Class23_Sub2 class23_sub2 = (Class23_Sub2) anOa3618.a((byte) 126, (long) anIntArray3569[i]);
		if (class23_sub2 != null) {
			Class23_Sub6_Sub1 class23_sub6_sub1 = class23_sub2.aClass23_Sub6_Sub1Array2052[i_40_];
			if (class23_sub6_sub1 != null) {
				Class23_Sub7 class23_sub7 = new Class23_Sub7();
				class23_sub7.anInt2204 = i;
				class23_sub7.aClass23_Sub2_2224 = class23_sub2;
				class23_sub7.aClass23_Sub6_Sub1_2211 = class23_sub6_sub1;
				class23_sub7.aClass47_2209 = class23_sub2.aClass47Array2051[i_40_];
				class23_sub7.anInt2217 = class23_sub2.aByteArray2045[i_40_];
				class23_sub7.anInt2215 = i_40_;
				class23_sub7.anInt2220 = class23_sub2.aByteArray2067[i_40_] * (i_39_ * i_39_ * class23_sub2.anInt2046) - -1024 >> 11;
				class23_sub7.anInt2214 = class23_sub2.aByteArray2066[i_40_] & 0xff;
				class23_sub7.anInt2223 = (i_40_ << 8) - (0x7fff & class23_sub2.aShortArray2056[i_40_]);
				class23_sub7.anInt2194 = -1;
				class23_sub7.anInt2207 = 0;
				class23_sub7.anInt2222 = 0;
				class23_sub7.anInt2218 = 0;
				class23_sub7.anInt2199 = 0;
				if ((anIntArray3627[i] ^ 0xffffffff) != -1) {
					class23_sub7.aClass23_Sub10_Sub1_2198 = Class23_Sub10_Sub1.method529(class23_sub6_sub1, method573(class23_sub7, 100), 0, method558(class23_sub7, (byte) 82));
					method566((class23_sub2.aShortArray2056[i_40_] ^ 0xffffffff) > -1, (byte) 106, class23_sub7);
				} else {
					class23_sub7.aClass23_Sub10_Sub1_2198 = Class23_Sub10_Sub1.method529(class23_sub6_sub1, method573(class23_sub7, 100), method561(31, class23_sub7), method558(class23_sub7, (byte) 98));
				}
				if ((class23_sub2.aShortArray2056[i_40_] ^ 0xffffffff) > -1) {
					class23_sub7.aClass23_Sub10_Sub1_2198.method536(-1);
				}
				if ((class23_sub7.anInt2217 ^ 0xffffffff) <= -1) {
					Class23_Sub7 class23_sub7_42_ = aClass23_Sub7ArrayArray3583[i][class23_sub7.anInt2217];
					if (class23_sub7_42_ != null && class23_sub7_42_.anInt2194 < 0) {
						aClass23_Sub7ArrayArray3626[i][class23_sub7_42_.anInt2215] = null;
						class23_sub7_42_.anInt2194 = 0;
					}
					aClass23_Sub7ArrayArray3583[i][class23_sub7.anInt2217] = class23_sub7;
				}
				int i_43_ = -126 % ((21 - b) / 46);
				aClass23_Sub10_Sub3_3637.aClass89_3653.method1439(-95, class23_sub7);
				aClass23_Sub7ArrayArray3626[i][i_40_] = class23_sub7;
			}
		}
	}
	
	static final void method560(int i) {
		Class23_Sub4_Sub16.method329((byte) -93);
		Class7.method93(-1385015865);
		if (i <= 66) {
			method577((byte) -9);
		}
		anInt3586++;
		Class23_Sub13_Sub8_Sub1.method682(-1);
		Class63.method1211(92);
		Class65.method1234((byte) 54);
		Class23_Sub13_Sub11.method725((byte) -123);
		Class67.method1244(-97);
		Class23_Sub13.method602(116);
		Class23_Sub4_Sub24.method369(-121);
		Class23_Sub4_Sub23_Sub1.method365((byte) -97);
		Class23_Sub19.method884(0);
		Class97.method1488(-122);
		((Class86) Class76.anInterface1_1399).method1399(1);
		Class23_Sub10_Sub3.aClass5_3649.method68(0);
		Class23_Sub4_Sub7.aClass105_Sub1_3024.method1548(-25035);
		Class23_Sub4_Sub8.aClass105_Sub1_3031.method1548(-25035);
		Class89.aClass105_Sub1_1509.method1548(-25035);
		Class30.aClass105_Sub1_475.method1548(-25035);
		Class38_Sub6.aClass105_Sub1_2613.method1548(-25035);
		CacheFileChannel.aClass105_Sub1_457.method1548(-25035);
		Class69.aClass105_Sub1_1211.method1548(-25035);
		Class92.aClass105_Sub1_1561.method1548(-25035);
		Class23_Sub4_Sub27.aClass105_Sub1_3339.method1548(-25035);
		Class23_Sub1.aClass105_Sub1_2037.method1548(-25035);
		Class69.aClass105_Sub1_1214.method1548(-25035);
	}
	
	final synchronized int method501() {
		anInt3601++;
		return 0;
	}
	
	private final int method561(int i, Class23_Sub7 class23_sub7) {
		anInt3577++;
		Class47 class47 = class23_sub7.aClass47_2209;
		int i_44_ = anIntArray3614[class23_sub7.anInt2204] * anIntArray3568[class23_sub7.anInt2204] + 4096 >> 13;
		i_44_ = i_44_ * i_44_ + 16384 >> 15;
		i_44_ = i_44_ * class23_sub7.anInt2220 + 16384 >> 15;
		i_44_ = anInt3608 * i_44_ - -128 >> 8;
		if (class47.anInt730 > 0) {
			i_44_ = (int) (Math.pow(0.5, (double) class47.anInt730 * ((double) class23_sub7.anInt2222 * 1.953125E-5)) * (double) i_44_ + 0.5);
		}
		if (class47.aByteArray729 != null) {
			int i_45_ = class23_sub7.anInt2218;
			int i_46_ = class47.aByteArray729[class23_sub7.anInt2207 + 1];
			if ((class23_sub7.anInt2207 ^ 0xffffffff) > (-2 + class47.aByteArray729.length ^ 0xffffffff)) {
				int i_47_ = 0xff00 & class47.aByteArray729[2 + class23_sub7.anInt2207] << 8;
				int i_48_ = class47.aByteArray729[class23_sub7.anInt2207] << 8 & 0xff00;
				i_46_ += (class47.aByteArray729[3 + class23_sub7.anInt2207] - i_46_) * (-i_48_ + i_45_) / (i_47_ - i_48_);
			}
			i_44_ = i_46_ * i_44_ - -32 >> 6;
		}
		if (class23_sub7.anInt2194 > 0 && class47.aByteArray731 != null) {
			int i_49_ = class47.aByteArray731[1 + class23_sub7.anInt2199];
			int i_50_ = class23_sub7.anInt2194;
			if ((class23_sub7.anInt2199 ^ 0xffffffff) > (-2 + class47.aByteArray731.length ^ 0xffffffff)) {
				int i_51_ = (class47.aByteArray731[class23_sub7.anInt2199] & 0xff) << 8;
				int i_52_ = (0xff & class47.aByteArray731[2 + class23_sub7.anInt2199]) << 8;
				i_49_ += (i_50_ - i_51_) * (-i_49_ + class47.aByteArray731[3 + class23_sub7.anInt2199]) / (i_52_ + -i_51_);
			}
			i_44_ = 32 + i_44_ * i_49_ >> 6;
		}
		if (i < 8) {
			method576(-25, null);
		}
		return i_44_;
	}
	
	static final void method562(byte b, Class105 class105) {
		Class23_Sub13_Sub23.aClass105_4256 = class105;
		anInt3628++;
		if (b > -49) {
			aClass16_3623 = null;
		}
	}
	
	private final void method563(int i, int i_53_) {
		anInt3616++;
		if (i != 27798) {
			aLong3640 = -58L;
		}
		if ((0x2 & anIntArray3619[i_53_]) != 0) {
			for (Class23_Sub7 class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1437(-127); class23_sub7 != null; class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1431((byte) -89)) {
				if (class23_sub7.anInt2204 == i_53_ && aClass23_Sub7ArrayArray3626[i_53_][class23_sub7.anInt2215] == null && (class23_sub7.anInt2194 ^ 0xffffffff) > -1) {
					class23_sub7.anInt2194 = 0;
				}
			}
		}
	}
	
	final synchronized void method564(int i) {
		anInt3585++;
		if (i == -2) {
			for (Class23_Sub2 class23_sub2 = (Class23_Sub2) anOa3618.a((byte) -25); class23_sub2 != null; class23_sub2 = (Class23_Sub2) anOa3618.a(true))
				class23_sub2.method239(0);
		}
	}
	
	private final void method565(int i, int i_54_) {
		anInt3607++;
		if (i_54_ < 0) {
			for (i_54_ = 0; i_54_ < 16; i_54_++)
				method565(8192, i_54_);
		} else {
			anIntArray3614[i_54_] = 12800;
			anIntArray3574[i_54_] = 8192;
			anIntArray3568[i_54_] = 16383;
			anIntArray3630[i_54_] = 8192;
			anIntArray3582[i_54_] = 0;
			anIntArray3579[i_54_] = 8192;
			method563(27798, i_54_);
			method567(0, i_54_);
			anIntArray3619[i_54_] = 0;
			anIntArray3610[i_54_] = 32767;
			anIntArray3593[i_54_] = 256;
			anIntArray3627[i_54_] = 0;
			method553(i, i + 6860, i_54_);
		}
	}
	
	final void method566(boolean bool, byte b, Class23_Sub7 class23_sub7) {
		int i = class23_sub7.aClass23_Sub6_Sub1_2211.aByteArray3544.length;
		anInt3566++;
		int i_55_;
		if (bool && class23_sub7.aClass23_Sub6_Sub1_2211.aBoolean3545) {
			int i_56_ = -class23_sub7.aClass23_Sub6_Sub1_2211.anInt3548 + (i + i);
			i_55_ = (int) ((long) i_56_ * (long) anIntArray3627[class23_sub7.anInt2204] >> 6);
			i <<= 8;
			if ((i ^ 0xffffffff) >= (i_55_ ^ 0xffffffff)) {
				class23_sub7.aClass23_Sub10_Sub1_2198.method523(true);
				i_55_ = -1 + i - -i - i_55_;
			}
		} else {
			i_55_ = (int) ((long) anIntArray3627[class23_sub7.anInt2204] * (long) i >> 6);
		}
		if (b > 73) {
			class23_sub7.aClass23_Sub10_Sub1_2198.method524(i_55_);
		}
	}
	
	private final void method567(int i, int i_57_) {
		if (i == 0) {
			anInt3621++;
			if ((anIntArray3619[i_57_] & 0x4 ^ 0xffffffff) != -1) {
				for (Class23_Sub7 class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1437(-116); class23_sub7 != null; class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1431((byte) -89)) {
					if (class23_sub7.anInt2204 == i_57_) {
						class23_sub7.anInt2205 = 0;
					}
				}
			}
		}
	}
	
	static final void method568(int i) {
		anInt3570++;
		if (Class23_Sub8.aClass16_2248 != null) {
			if (Class73.anInt1319 < 10) {
				if (!Class23_Sub4_Sub8.aClass105_Sub1_3030.method1561(-79, Class23_Sub8.aClass16_2248)) {
					Class73.anInt1319 = Class23_Sub4_Sub8.aClass105_Sub1_3030.method1541(Class23_Sub8.aClass16_2248, 106) / 10;
					return;
				}
				Class73.anInt1319 = 10;
			}
			if (Class73.anInt1319 == 10) {
				Buffer class23_sub5 = new Buffer(Class23_Sub4_Sub8.aClass105_Sub1_3030.method1536(Class23_Sub8.aClass16_2248, Class23_Sub13_Sub18.aClass16_4100, i ^ 0x14));
				int i_58_ = class23_sub5.method476((byte) -124);
				int i_59_ = class23_sub5.method476((byte) -118);
				int i_60_ = class23_sub5.method476((byte) -108);
				int i_61_ = class23_sub5.method476((byte) -106);
				int i_62_ = class23_sub5.method476((byte) -123);
				int i_63_ = class23_sub5.method476((byte) -118);
				Class23_Sub4_Sub4.aDouble2969 = Class107.aDouble1838 = 8.0;
				Class102.anInt1702 = i_58_ * 64;
				Class38_Sub7.anInt2697 = 64 * (i_61_ - i_59_ - -1);
				int i_64_ = Class42.anInt662 + (Class105.aClass38_Sub7_Sub2_1812.anInt2674 >> 7) + -Class102.anInt1702;
				Class70.anInt1238 = (i_60_ + -i_58_) * 64 - -64;
				i_64_ += -5 + (int) (10.0 * Math.random());
				int i_65_ = Class70.anInt1238 >> 6;
				Class23_Sub4_Sub6.anIntArray2979 = new int[1 + Class23_Sub13_Sub25.anInt4289];
				int i_66_ = Class38_Sub7.anInt2697 >> 6;
				Class47.aByteArrayArrayArray737 = new byte[i_65_][i_66_][];
				Class32.aByteArrayArrayArray506 = new byte[i_65_][i_66_][];
				Class23_Sub4_Sub35.aByteArrayArrayArray3457 = new byte[i_65_][i_66_][];
				Class102.anIntArrayArrayArray1713 = new int[i_65_][i_66_][];
				Class23_Sub13_Sub10.anIntArrayArrayArray3881 = new int[i_65_][i_66_][];
				CacheFileChannel.anInt445 = i_59_ * 64;
				Class55.aByteArrayArrayArray879 = new byte[i_65_][i_66_][];
				Class23_Sub13_Sub7.aByteArrayArrayArray3750 = new byte[i_65_][i_66_][];
				Class83.aByteArrayArrayArray1458 = new byte[i_65_][i_66_][];
				int i_67_ = Class23_Sub4_Sub12.anInt3089 >> 2 << 10;
				int i_68_ = Class58.anInt903 + ((Class105.aClass38_Sub7_Sub2_1812.anInt2659 >> 7) + -CacheFileChannel.anInt445);
				i_68_ += -5 + (int) (Math.random() * 10.0);
				if (i_64_ >= 0 && (Class70.anInt1238 ^ 0xffffffff) < (i_64_ ^ 0xffffffff) && i_68_ >= 0 && Class38_Sub7.anInt2697 > i_68_) {
					Canvas_Sub1.anInt55 = i_64_;
					Class8.anInt179 = Class38_Sub7.anInt2697 - i_68_;
				} else {
					Canvas_Sub1.anInt55 = -Class102.anInt1702 + 64 * i_62_;
					Class8.anInt179 = -(64 * i_63_) + Class38_Sub7.anInt2697 + CacheFileChannel.anInt445;
				}
				int i_69_ = Class23_Sub20.anInt2400 >> 1;
				for (int i_70_ = 0; (Class23_Sub13_Sub25.anInt4289 ^ 0xffffffff) < (i_70_ ^ 0xffffffff); i_70_++) {
					Class23_Sub13_Sub4 class23_sub13_sub4 = Applet_Sub1.method23(i_70_, true);
					if (class23_sub13_sub4 != null) {
						int i_71_ = class23_sub13_sub4.anInt3709;
						if (i_71_ >= 0 && !Class76.anInterface1_1399.method2(i + -192, i_71_)) {
							i_71_ = -1;
						}
						int i_72_;
						if (class23_sub13_sub4.anInt3710 >= 0) {
							int i_73_ = class23_sub13_sub4.anInt3710;
							int i_74_ = i_69_ + (i_73_ & 0x7f);
							if ((i_74_ ^ 0xffffffff) > -1) {
								i_74_ = 0;
							} else if (i_74_ > 127) {
								i_74_ = 127;
							}
							int i_75_ = (0x380 & i_73_) + (i_67_ + i_73_ & 0xfc00) + i_74_;
							i_72_ = Class76.anIntArray1397[Class33.method967((byte) 55, 96, i_75_)];
						} else if ((i_71_ ^ 0xffffffff) > -1) {
							if ((class23_sub13_sub4.anInt3705 ^ 0xffffffff) != 0) {
								int i_76_ = class23_sub13_sub4.anInt3705;
								int i_77_ = (i_76_ & 0x7f) + i_69_;
								if ((i_77_ ^ 0xffffffff) > -1) {
									i_77_ = 0;
								} else if (i_77_ > 127) {
									i_77_ = 127;
								}
								int i_78_ = i_77_ + (0x380 & i_76_) + (i_67_ + i_76_ & 0xfc00);
								i_72_ = Class76.anIntArray1397[Class33.method967((byte) 67, 96, i_78_)];
							} else {
								i_72_ = -1;
							}
						} else {
							i_72_ = Class76.anIntArray1397[Class33.method967((byte) 88, 96, Class76.anInterface1_1399.method4(i_71_, (byte) 50))];
						}
						Class23_Sub4_Sub6.anIntArray2979[1 + i_70_] = i_72_;
					}
				}
				Class73.anInt1319 = 20;
			} else if (Class73.anInt1319 == 20) {
				Class19.method198(Class23_Sub4_Sub8.aClass105_Sub1_3030.method1536(Class23_Sub8.aClass16_2248, Class23_Sub4_Sub32.aClass16_3414, i ^ 0x37), -1);
				Class73.anInt1319 = 30;
				Class23_Sub13_Sub7.method640((byte) -86);
			} else if (Class73.anInt1319 == 30) {
				Class23_Sub4_Sub20.method347(23095, Class23_Sub4_Sub8.aClass105_Sub1_3030.method1536(Class23_Sub8.aClass16_2248, Class23_Sub13_Sub6.aClass16_3737, 95));
				Class73.anInt1319 = 50;
				Class23_Sub13_Sub7.method640((byte) -86);
			} else if (Class73.anInt1319 == 50) {
				Class38_Sub2.method1036((byte) 120, Class23_Sub4_Sub8.aClass105_Sub1_3030.method1536(Class23_Sub8.aClass16_2248, Class94.aClass16_1606, 85));
				Class73.anInt1319 = 70;
				Class23_Sub13_Sub7.method640((byte) -86);
			} else if (Class73.anInt1319 == 70) {
				Class38_Sub7.method1090((byte) -106, Class23_Sub4_Sub8.aClass105_Sub1_3030.method1536(Class23_Sub8.aClass16_2248, Class98.aClass16_1657, 101));
				Class73.anInt1319 = 90;
				Class23_Sub13_Sub7.method640((byte) -86);
			} else {
				Class17.method190(Class23_Sub4_Sub8.aClass105_Sub1_3030.method1536(Class23_Sub8.aClass16_2248, Class5.aClass16_116, 80), -79);
				if (Class73.anInt1319 == 90) {
					Class94.aClass84_1607 = new Class84(11, true, Class71_Sub3.aCanvas2740);
					Class61.aClass84_962 = new Class84(12, true, Class71_Sub3.aCanvas2740);
					Class23_Sub13.aClass84_2307 = new Class84(14, true, Class71_Sub3.aCanvas2740);
					Class23_Sub4_Sub30.aClass84_3384 = new Class84(17, true, Class71_Sub3.aCanvas2740);
					Class23_Sub4_Sub1.aClass84_2888 = new Class84(19, true, Class71_Sub3.aCanvas2740);
					Class23_Sub27.aClass84_2483 = new Class84(22, true, Class71_Sub3.aCanvas2740);
					Class23_Sub25.aClass84_2463 = new Class84(26, true, Class71_Sub3.aCanvas2740);
					Class23_Sub8.aClass84_2244 = new Class84(30, true, Class71_Sub3.aCanvas2740);
					Class73.anInt1319 = 100;
				}
				Class75.anInt1381 = -1;
				Class68.anInt1203 = -1;
				Class73.anInt1319 = 100;
				Class23_Sub13_Sub7.method640((byte) -86);
				if (i != 96) {
					anInt3625 = -89;
				}
				System.gc();
			}
		}
	}
	
	private final void method569(int i, int i_79_, int i_80_, int i_81_) {
		anInt3611++;
		if (i_80_ != 83) {
			method548(98, 34);
		}
	}
	
	final synchronized boolean method570(int i) {
		if (i > -50) {
			return true;
		}
		anInt3564++;
		return aClass96_3592.method1480();
	}
	
	private final void method571(int i, int i_82_, int i_83_) {
		if (i != 8460) {
			method583(80);
		}
		if ((anIntArray3569[i_82_] ^ 0xffffffff) != (i_83_ ^ 0xffffffff)) {
			anIntArray3569[i_82_] = i_83_;
			for (int i_84_ = 0; i_84_ < 128; i_84_++)
				aClass23_Sub7ArrayArray3583[i_82_][i_84_] = null;
		}
		anInt3632++;
	}
	
	final synchronized void method572(Class23_Sub18 class23_sub18, int i, boolean bool) {
		anInt3629++;
		method551((byte) 24);
		aClass96_3592.method1476(class23_sub18.aByteArray2374);
		aBoolean3638 = bool;
		aLong3641 = 0L;
		int i_85_ = aClass96_3592.method1479();
		for (int i_86_ = 0; (i_86_ ^ 0xffffffff) > (i_85_ ^ 0xffffffff); i_86_++) {
			aClass96_3592.method1471(i_86_);
			aClass96_3592.method1485(i_86_);
			aClass96_3592.method1473(i_86_);
		}
		anInt3642 = aClass96_3592.method1475();
		if (i <= -89) {
			anInt3639 = aClass96_3592.anIntArray1625[anInt3642];
			aLong3640 = aClass96_3592.method1486(anInt3639);
		}
	}
	
	private final int method573(Class23_Sub7 class23_sub7, int i) {
		if (i != 100) {
			method571(-95, 32, 14);
		}
		int i_87_ = class23_sub7.anInt2223 + (class23_sub7.anInt2225 * class23_sub7.anInt2212 >> 12);
		Class47 class47 = class23_sub7.aClass47_2209;
		anInt3581++;
		i_87_ += (anIntArray3630[class23_sub7.anInt2204] - 8192) * anIntArray3593[class23_sub7.anInt2204] >> 12;
		if ((class47.anInt725 ^ 0xffffffff) < -1 && (class47.anInt724 > 0 || (anIntArray3582[class23_sub7.anInt2204] ^ 0xffffffff) < -1)) {
			int i_88_ = class47.anInt724 << 2;
			int i_89_ = class47.anInt732 << 1;
			if ((i_89_ ^ 0xffffffff) < (class23_sub7.anInt2210 ^ 0xffffffff)) {
				i_88_ = i_88_ * class23_sub7.anInt2210 / i_89_;
			}
			i_88_ += anIntArray3582[class23_sub7.anInt2204] >> 7;
			double d = Math.sin(0.01227184630308513 * (double) (0x1ff & class23_sub7.anInt2208));
			i_87_ += (int) (d * (double) i_88_);
		}
		int i_90_ = (int) ((double) (class23_sub7.aClass23_Sub6_Sub1_2211.anInt3547 * 256) * Math.pow(2.0, (double) i_87_ * 3.255208333333333E-4) / (double) Class32.anInt498 + 0.5);
		if (i_90_ >= 1) {
			return i_90_;
		}
		return 1;
	}
	
	private final void method574(int i) {
		if (i != 125) {
			aClass16_3600 = null;
		}
		anInt3622++;
		method554(-1, (byte) -56);
		method565(8192, -1);
		for (int i_91_ = 0; i_91_ < 16; i_91_++)
			anIntArray3569[i_91_] = anIntArray3565[i_91_];
		for (int i_92_ = 0; i_92_ < 16; i_92_++)
			anIntArray3631[i_92_] = Class24.method919(-128, anIntArray3565[i_92_]);
	}
	
	private final void method575(int i, int i_93_) {
		Class23_Sub7 class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1437(-113);
		if (i > -49) {
			anIntArray3612 = null;
		}
		for (/**/; class23_sub7 != null; class23_sub7 = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1431((byte) -89)) {
			if ((i_93_ < 0 || (i_93_ ^ 0xffffffff) == (class23_sub7.anInt2204 ^ 0xffffffff)) && (class23_sub7.anInt2194 ^ 0xffffffff) > -1) {
				aClass23_Sub7ArrayArray3626[class23_sub7.anInt2204][class23_sub7.anInt2215] = null;
				class23_sub7.anInt2194 = 0;
			}
		}
		anInt3588++;
	}
	
	final boolean method576(int i, Class23_Sub7 class23_sub7) {
		if (i != 6295) {
			return true;
		}
		anInt3597++;
		if (class23_sub7.aClass23_Sub10_Sub1_2198 == null) {
			if (class23_sub7.anInt2194 >= 0) {
				class23_sub7.method228(0);
				if ((class23_sub7.anInt2217 ^ 0xffffffff) < -1 && aClass23_Sub7ArrayArray3583[class23_sub7.anInt2204][class23_sub7.anInt2217] == class23_sub7) {
					aClass23_Sub7ArrayArray3583[class23_sub7.anInt2204][class23_sub7.anInt2217] = null;
				}
			}
			return true;
		}
		return false;
	}
	
	public static void method577(byte b) {
		aClass16_3599 = null;
		aClass23_Sub13_Sub10Array3609 = null;
		if (b < -79) {
			aClass16_3600 = null;
			anIntArray3634 = null;
			aClass16_3623 = null;
		}
	}
	
	private final void method578(int i, int i_94_, int i_95_, int i_96_) {
		anInt3613++;
		Class23_Sub7 class23_sub7 = aClass23_Sub7ArrayArray3626[i_94_][i];
		if (class23_sub7 != null) {
			aClass23_Sub7ArrayArray3626[i_94_][i] = null;
			if ((0x2 & anIntArray3619[i_94_]) == 0) {
				class23_sub7.anInt2194 = 0;
			} else {
				for (Class23_Sub7 class23_sub7_97_ = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1437(-124); class23_sub7_97_ != null; class23_sub7_97_ = (Class23_Sub7) aClass23_Sub10_Sub3_3637.aClass89_3653.method1431((byte) -89)) {
					if ((class23_sub7.anInt2204 ^ 0xffffffff) == (class23_sub7_97_.anInt2204 ^ 0xffffffff) && class23_sub7_97_.anInt2194 < 0 && class23_sub7 != class23_sub7_97_) {
						class23_sub7.anInt2194 = 0;
						break;
					}
				}
			}
			if (i_95_ != 5106) {
				anInt3595 = 9;
			}
		}
	}
	
	final synchronized Class23_Sub10 method503() {
		anInt3636++;
		return aClass23_Sub10_Sub3_3637;
	}
	
	final synchronized void method579(int i, int i_98_) {
		anInt3608 = i_98_;
		if (i != 2) {
			method569(42, 15, 81, 120);
		}
		anInt3571++;
	}
	
	private final void method580(int i) {
		int i_99_ = anInt3642;
		anInt3606++;
		int i_100_ = anInt3639;
		long l = aLong3640;
		while ((i_100_ ^ 0xffffffff) == (anInt3639 ^ 0xffffffff)) {
			while ((i_100_ ^ 0xffffffff) == (aClass96_3592.anIntArray1625[i_99_] ^ 0xffffffff)) {
				aClass96_3592.method1471(i_99_);
				int i_101_ = aClass96_3592.method1481(i_99_);
				if (i_101_ == 1) {
					aClass96_3592.method1478();
					aClass96_3592.method1473(i_99_);
					if (aClass96_3592.method1477()) {
						if (aBoolean3638 && i_100_ != 0) {
							aClass96_3592.method1474(l);
						} else {
							method574(125);
							aClass96_3592.method1483();
							return;
						}
					}
					break;
				}
				if ((0x80 & i_101_ ^ 0xffffffff) != -1) {
					method548(i_101_, -6);
				}
				aClass96_3592.method1485(i_99_);
				aClass96_3592.method1473(i_99_);
			}
			i_99_ = aClass96_3592.method1475();
			i_100_ = aClass96_3592.anIntArray1625[i_99_];
			l = aClass96_3592.method1486(i_100_);
		}
		anInt3642 = i_99_;
		anInt3639 = i_100_;
		aLong3640 = l;
		if (i != 1) {
			method562((byte) -99, null);
		}
	}
	
	static final void method581(int i, int i_102_) {
		Class17_Sub1.anInt2002 = 50;
		Class92.anInt1560 = i;
		if (i_102_ >= -39) {
			method581(100, -19);
		}
		anInt3572++;
	}
	
	final synchronized boolean method582(int i, Class14 class14, byte b, Class105 class105, Class23_Sub18 class23_sub18) {
		anInt3620++;
		class23_sub18.method874();
		boolean bool = true;
		int[] is = null;
		if ((i ^ 0xffffffff) < -1) {
			is = new int[] { i };
		}
		if (b != 24) {
			return false;
		}
		for (Class23_Sub16 class23_sub16 = (Class23_Sub16) class23_sub18.anOa2375.a((byte) -25); class23_sub16 != null; class23_sub16 = (Class23_Sub16) class23_sub18.anOa2375.a(true)) {
			int i_103_ = (int) class23_sub16.aLong358;
			Class23_Sub2 class23_sub2 = (Class23_Sub2) anOa3618.a((byte) -38, (long) i_103_);
			if (class23_sub2 == null) {
				class23_sub2 = Class104.method1525(b ^ 0x17, i_103_, class105);
				if (class23_sub2 == null) {
					bool = false;
					continue;
				}
				anOa3618.a(class23_sub2, (byte) -14, (long) i_103_);
			}
			if (!class23_sub2.method241(is, class14, class23_sub16.aByteArray2359, 0)) {
				bool = false;
			}
		}
		if (bool) {
			class23_sub18.method876();
		}
		return bool;
	}
	
	final synchronized void method583(int i) {
		anInt3605++;
		for (Class23_Sub2 class23_sub2 = (Class23_Sub2) anOa3618.a((byte) -25); class23_sub2 != null; class23_sub2 = (Class23_Sub2) anOa3618.a(true))
			class23_sub2.method228(0);
		if (i > -57) {
			anInt3639 = -34;
		}
	}
	
	public Class23_Sub10_Sub2() {
		anIntArray3574 = new int[16];
		anIntArray3579 = new int[16];
		anIntArray3582 = new int[16];
		anIntArray3569 = new int[16];
		anIntArray3587 = new int[16];
		aClass23_Sub7ArrayArray3583 = new Class23_Sub7[16][128];
		anIntArray3614 = new int[16];
		anIntArray3610 = new int[16];
		anIntArray3593 = new int[16];
		anIntArray3619 = new int[16];
		anIntArray3565 = new int[16];
		anIntArray3612 = new int[16];
		anIntArray3631 = new int[16];
		aClass23_Sub7ArrayArray3626 = new Class23_Sub7[16][128];
		anIntArray3630 = new int[16];
		anInt3608 = 256;
		anIntArray3627 = new int[16];
		aClass96_3592 = new Class96();
		aClass23_Sub10_Sub3_3637 = new Class23_Sub10_Sub3(this);
		anOa3618 = new oa(128);
		method574(125);
	}
	
	static {
		aShort3598 = (short) 1;
		anInt3595 = -1;
		aClass16_3623 = Class38_Sub6.method1076((byte) 86, "Der Server wird gerade aktualisiert)3");
		anIntArray3634 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };
		anInt3617 = -1;
		aShort3603 = (short) 1;
	}
}
