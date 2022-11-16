/* Class38_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38_Sub7_Sub1 extends Class38_Sub7
{
	static int anInt4364;
	static int anInt4365;
	static int anInt4366;
	static int[][] anIntArrayArray4367;
	static int anInt4368;
	static RSString aClass16_4369 = Class38_Sub6.method1076((byte) 86, "_");
	static int anInt4370;
	static int anInt4371;
	static boolean aBoolean4372;
	protected Class23_Sub13_Sub20 aClass23_Sub13_Sub20_4373;
	static int anInt4374;
	static int anInt4375;
	static int anInt4376;
	static Buffer[] aClass23_Sub5Array4377;
	static int anInt4378;
	
	final boolean method1082(byte b) {
		if (b != -108) {
			return false;
		}
		anInt4366++;
		if (aClass23_Sub13_Sub20_4373 == null) {
			return false;
		}
		return true;
	}
	
	public static void method1091(int i) {
		aClass16_4369 = null;
		if (i != 2047) {
			method1093(-11);
		}
		anIntArrayArray4367 = null;
		aClass23_Sub5Array4377 = null;
	}
	
	static final boolean method1092(Class64 class64, int i) {
		anInt4378++;
		if (i == class64.anInt1149) {
			Class23_Sub4_Sub31.anInt3400 = 250;
			return true;
		}
		return false;
	}
	
	final int method999() {
		anInt4370++;
		return anInt2685;
	}
	
	static final void method1093(int i) {
		if (CacheIndex.aClass11_264 != null) {
			synchronized (CacheIndex.aClass11_264) {
				CacheIndex.aClass11_264 = null;
			}
		}
		anInt4375++;
		int i_0_ = 73 / ((-54 - i) / 44);
	}
	
	static final Class23_Sub13_Sub12 method1094(int i, int i_1_) {
		anInt4371++;
		Class23_Sub13_Sub12 class23_sub13_sub12 = (Class23_Sub13_Sub12) Class23_Sub4_Sub5.aClass5_2972.method62(124, (long) i);
		if (class23_sub13_sub12 != null) {
			return class23_sub13_sub12;
		}
		if (i_1_ != 1) {
			return null;
		}
		byte[] bs;
		if (i >= 32768) {
			bs = CacheIndex.aClass105_265.method1544(0x7fff & i, 0, 1);
		} else {
			bs = Class23_Sub4_Sub14.aClass105_3119.method1544(i, 0, 1);
		}
		class23_sub13_sub12 = new Class23_Sub13_Sub12();
		if (bs != null) {
			class23_sub13_sub12.method755(new Buffer(bs), -28386);
		}
		Class23_Sub4_Sub5.aClass5_2972.method67((long) i, class23_sub13_sub12, true);
		return class23_sub13_sub12;
	}
	
	final void method995(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, long l) {
		anInt4364++;
		if (aClass23_Sub13_Sub20_4373 != null) {
			Class23_Sub13_Sub22 class23_sub13_sub22 = (anInt2693 ^ 0xffffffff) != 0 && (anInt2706 ^ 0xffffffff) == -1 ? Class7.method90(anInt2693, (byte) 79) : null;
			Class23_Sub13_Sub22 class23_sub13_sub22_9_ = anInt2634 == -1 || (anInt2635 ^ 0xffffffff) == (anInt2634 ^ 0xffffffff) && class23_sub13_sub22 != null ? null : Class7.method90(anInt2634, (byte) 110);
			Class38_Sub1 class38_sub1 = aClass23_Sub13_Sub20_4373.method815(class23_sub13_sub22, 4, anInt2709, anInt2642, class23_sub13_sub22_9_);
			if (class38_sub1 != null) {
				anInt2685 = class38_sub1.method999();
				int i_10_ = 0;
				int i_11_ = 0;
				int i_12_ = 0;
				if ((aClass23_Sub13_Sub20_4373.aShort4183 ^ 0xffffffff) != -1 && aClass23_Sub13_Sub20_4373.aShort4145 != 0) {
					int i_13_ = Class76.anIntArray1386[i];
					int i_14_ = Class76.anIntArray1395[i];
					int i_15_ = aClass23_Sub13_Sub20_4373.aShort4183;
					int i_16_ = aClass23_Sub13_Sub20_4373.aShort4145;
					int i_17_ = -i_15_ / 2;
					int i_18_ = -i_16_ / 2;
					int i_19_ = -(i_13_ * i_17_) + i_18_ * i_14_ >> 16;
					int i_20_ = i_15_ / 2;
					int i_21_ = -i_16_ / 2;
					int i_22_ = i_14_ * i_20_ + i_13_ * i_21_ >> 16;
					int i_23_ = i_16_ / 2;
					int i_24_ = i_13_ * i_18_ - -(i_17_ * i_14_) >> 16;
					int i_25_ = i_21_ * i_14_ - i_20_ * i_13_ >> 16;
					int i_26_ = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_24_ + anInt2674, anInt2659 - -i_19_, (byte) 123);
					int i_27_ = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, anInt2674 + i_22_, i_25_ + anInt2659, (byte) -38);
					int i_28_ = -i_15_ / 2;
					int i_29_ = i_13_ * i_23_ + i_14_ * i_28_ >> 16;
					int i_30_ = i_14_ * i_23_ - i_13_ * i_28_ >> 16;
					int i_31_ = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_29_ + anInt2674, anInt2659 + i_30_, (byte) -101);
					int i_32_ = i_15_ / 2;
					int i_33_ = i_16_ / 2;
					int i_34_ = i_13_ * i_33_ + i_14_ * i_32_ >> 16;
					int i_35_ = i_33_ * i_14_ - i_13_ * i_32_ >> 16;
					int i_36_ = (i_26_ ^ 0xffffffff) <= (i_31_ ^ 0xffffffff) ? i_31_ : i_26_;
					int i_37_ = i_27_ > i_26_ ? i_26_ : i_27_;
					int i_38_ = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_34_ + anInt2674, i_35_ + anInt2659, (byte) 100);
					int i_39_ = i_38_ <= i_27_ ? i_38_ : i_27_;
					int i_40_ = i_31_ < i_38_ ? i_31_ : i_38_;
					i_11_ = 0x7ff & (int) (325.95 * Math.atan2((double) (-i_40_ + i_37_), (double) i_16_));
					i_12_ = i_38_ + i_26_;
					if ((i_11_ ^ 0xffffffff) != -1) {
						class38_sub1.method1019(i_11_);
					}
					i_10_ = 0x7ff & (int) (325.95 * Math.atan2((double) (-i_39_ + i_36_), (double) i_15_));
					if (i_10_ != 0) {
						class38_sub1.method1008(i_10_);
					}
					if (i_27_ - -i_31_ < i_12_) {
						i_12_ = i_27_ + i_31_;
					}
					i_12_ = (i_12_ >> 1) + -anInt2656;
					if ((i_12_ ^ 0xffffffff) != -1) {
						class38_sub1.method1013(0, i_12_, 0);
					}
				}
				Class38_Sub1 class38_sub1_41_ = null;
				if ((anInt2710 ^ 0xffffffff) != 0 && (anInt2695 ^ 0xffffffff) != 0) {
					Class23_Sub13_Sub17 class23_sub13_sub17 = Class23_Sub13_Sub21.method827(anInt2710, (byte) -120);
					class38_sub1_41_ = class23_sub13_sub17.method787(anInt2695, (byte) 95);
					if (class38_sub1_41_ != null) {
						class38_sub1_41_.method1013(0, -anInt2647, 0);
						if (class23_sub13_sub17.aBoolean4054) {
							if (i_11_ != 0) {
								class38_sub1_41_.method1019(i_11_);
							}
							if ((i_10_ ^ 0xffffffff) != -1) {
								class38_sub1_41_.method1008(i_10_);
							}
							if ((i_12_ ^ 0xffffffff) != -1) {
								class38_sub1_41_.method1013(0, i_12_, 0);
							}
						}
					}
				}
				if (class38_sub1_41_ != null) {
					class38_sub1 = ((Class38_Sub1_Sub1) class38_sub1).method1024(class38_sub1_41_);
				}
				if (aClass23_Sub13_Sub20_4373.anInt4173 == 1) {
					class38_sub1.aBoolean2489 = true;
				}
				class38_sub1.method995(i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, l);
			}
		}
	}
	
	static final void method1095(Class34 class34, int i, boolean bool) {
		anInt4365++;
		if (Class23_Sub23.aClass34_2427 != null) {
			try {
				Class23_Sub23.aClass34_2427.method976(false);
			} catch (Exception exception) {
				/* empty */
			}
			Class23_Sub23.aClass34_2427 = null;
		}
		Class23_Sub23.aClass34_2427 = class34;
		Class23_Sub2.method238(i, bool);
		Class51.anInt799 = 0;
		Class23_Sub4_Sub1.aClass23_Sub13_Sub26_2894 = null;
		Class73.aClass23_Sub5_1324.position = i;
		Class23_Sub4_Sub9.aClass23_Sub5_3035 = null;
		for (;;) {
			Class23_Sub13_Sub26 class23_sub13_sub26 = (Class23_Sub13_Sub26) Class42.anOa649.a((byte) -25);
			if (class23_sub13_sub26 == null) {
				break;
			}
			Class8.anOa172.a(class23_sub13_sub26, (byte) -14, class23_sub13_sub26.aLong358);
			Class4.anInt89--;
			Buffer.anInt2166++;
		}
		for (;;) {
			Class23_Sub13_Sub26 class23_sub13_sub26 = (Class23_Sub13_Sub26) Class87_Sub3.anOa2812.a((byte) -25);
			if (class23_sub13_sub26 == null) {
				break;
			}
			Class23_Sub4_Sub39.aClass27_3520.method934(i, class23_sub13_sub26);
			CacheFileChannel.anOa451.a(class23_sub13_sub26, (byte) -14, class23_sub13_sub26.aLong358);
			Class68.anInt1190++;
			Class23_Sub13_Sub8_Sub1.anInt4501--;
		}
		if ((Class95.aByte1613 ^ 0xffffffff) != -1) {
			try {
				Buffer class23_sub5 = new Buffer(4);
				class23_sub5.writeByte(4);
				class23_sub5.writeByte(Class95.aByte1613);
				class23_sub5.method443(0, (byte) 51);
				Class23_Sub23.aClass34_2427.method977(i + 30000, 4, 0, class23_sub5.payload);
			} catch (java.io.IOException ioexception) {
				try {
					Class23_Sub23.aClass34_2427.method976(false);
				} catch (Exception exception) {
					/* empty */
				}
				Class23_Sub17.anInt2369++;
				Class23_Sub23.aClass34_2427 = null;
			}
		}
		Class64.anInt1077 = 0;
		Class21.aLong337 = Class94.method1466(i ^ 0x5860);
	}
	
	Class38_Sub7_Sub1() {
		/* empty */
	}
	
	static {
		anIntArrayArray4367 = new int[104][104];
		anInt4368 = 0;
		anInt4374 = 0;
		anInt4376 = 1;
		aClass23_Sub5Array4377 = new Buffer[2048];
	}
}
