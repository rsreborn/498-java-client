/* Class38_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class38_Sub7_Sub2 extends Class38_Sub7
{
	protected int anInt4379;
	protected int anInt4380;
	static int anInt4381;
	static int anInt4382;
	protected int anInt4383;
	protected boolean aBoolean4384 = false;
	private short aShort4385 = 0;
	protected int anInt4386;
	protected int anInt4387;
	static int anInt4388;
	protected RSString aClass16_4389;
	protected int anInt4390;
	protected int anInt4391;
	private short aShort4392 = 0;
	protected Class51 aClass51_4393;
	protected int anInt4394;
	protected int anInt4395;
	protected int anInt4396;
	static CRC32 aCRC32_4397 = new CRC32();
	protected int anInt4398;
	static int anInt4399;
	static int anInt4400;
	protected int anInt4401;
	protected Class38_Sub1 aClass38_Sub1_4402;
	protected int anInt4403;
	static RSString aClass16_4404 = Class38_Sub6.method1076((byte) 86, "Diese Welt ist voll)3");
	static int anInt4405;
	static RSString aClass16_4406;
	static int anInt4407;
	static int anInt4408;
	static Class105_Sub1 aClass105_Sub1_4409;
	static int anInt4410 = 0;
	protected int anInt4411;
	static int[] anIntArray4412;
	static int anInt4413;
	
	final boolean method1082(byte b) {
		anInt4400++;
		if (b != -108) {
			method1096(94);
		}
		if (aClass51_4393 == null) {
			return false;
		}
		return true;
	}
	
	static final Class23_Sub13_Sub19 method1096(int i) {
		anInt4399++;
		if (Class45.aClass23_Sub13_Sub19_689 == null) {
			Class45.aClass23_Sub13_Sub19_689 = new Class23_Sub13_Sub19();
		}
		if (i != -1) {
			aClass16_4406 = null;
		}
		return Class45.aClass23_Sub13_Sub19_689;
	}
	
	static final Class66 method1097(int i) {
		anInt4407++;
		if (i != 0) {
			return null;
		}
		try {
			return (Class66) Class.forName("Class66_Sub1").newInstance();
		} catch (Throwable throwable) {
			return null;
		}
	}
	
	final void method1098(int i, Buffer class23_sub5) {
		anInt4405++;
		class23_sub5.position = 0;
		int i_0_ = class23_sub5.readByte();
		int i_1_ = i_0_ & 0x1;
		if ((i_0_ & 0x2) == 2) {
			aShort4392 = (short) (class23_sub5.readByte() << 2);
			aShort4385 = (short) (class23_sub5.readByte() << 2);
		} else {
			aShort4392 = (short) 0;
			aShort4385 = (short) 0;
		}
		boolean bool = (0x4 & i_0_) != 0;
		anInt2668 = 1 + (i_0_ >> 3);
		anInt4401 = class23_sub5.method452(-16933672);
		anInt4394 = class23_sub5.method452(-16933672);
		int[] is = new int[i];
		int i_2_ = -1;
		anInt4398 = 0;
		for (int i_3_ = 0; i_3_ < 12; i_3_++) {
			int i_4_ = class23_sub5.readByte();
			if (i_4_ == 0) {
				is[i_3_] = 0;
			} else {
				int i_5_ = class23_sub5.readByte();
				int i_6_ = i_5_ + (i_4_ << 8);
				if (i_3_ == 0 && i_6_ == 65535) {
					i_2_ = class23_sub5.readShortBE();
					break;
				}
				if (i_6_ >= 32768) {
					i_6_ = Class102.anIntArray1710[i_6_ - 32768];
					is[i_3_] = Class65.method1230(i_6_, 1073741824);
					int i_7_ = Class23_Sub13_Sub24.method853(-73, i_6_).anInt3943;
					if ((i_7_ ^ 0xffffffff) != -1) {
						anInt4398 = i_7_;
					}
				} else {
					is[i_3_] = Class65.method1230(-2147483648, i_6_ + -256);
				}
			}
		}
		int[] is_8_ = new int[5];
		for (int i_9_ = 0; i_9_ < 5; i_9_++) {
			int i_10_ = class23_sub5.readByte();
			if ((i_10_ ^ 0xffffffff) > -1 || (Class44.aShortArrayArray679[i_9_].length ^ 0xffffffff) >= (i_10_ ^ 0xffffffff)) {
				i_10_ = 0;
			}
			is_8_[i_9_] = i_10_;
		}
		anInt2635 = class23_sub5.readShortBE();
		if (anInt2635 == 65535) {
			anInt2635 = -1;
		}
		anInt2653 = class23_sub5.readShortBE();
		if (anInt2653 == 65535) {
			anInt2653 = -1;
		}
		anInt2691 = anInt2653;
		anInt2641 = class23_sub5.readShortBE();
		if ((anInt2641 ^ 0xffffffff) == -65536) {
			anInt2641 = -1;
		}
		anInt2655 = class23_sub5.readShortBE();
		if (anInt2655 == 65535) {
			anInt2655 = -1;
		}
		anInt2700 = class23_sub5.readShortBE();
		if (anInt2700 == 65535) {
			anInt2700 = -1;
		}
		anInt2678 = class23_sub5.readShortBE();
		if (anInt2678 == 65535) {
			anInt2678 = -1;
		}
		anInt2673 = class23_sub5.readShortBE();
		if (anInt2673 == 65535) {
			anInt2673 = -1;
		}
		aClass16_4389 = Class83.method1376(i + -13, class23_sub5.method468(-98)).method154((byte) 59);
		anInt4383 = class23_sub5.readByte();
		if (bool) {
			anInt4386 = class23_sub5.readShortBE();
		} else {
			anInt4386 = 0;
		}
		if (aClass51_4393 == null) {
			aClass51_4393 = new Class51();
		}
		aClass51_4393.method1164(i_1_ == 1, -13, is_8_, i_2_, is);
	}
	
	final void method995(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, long l) {
		anInt4381++;
		if (aClass51_4393 != null) {
			Class23_Sub13_Sub22 class23_sub13_sub22 = (anInt2693 ^ 0xffffffff) != 0 && anInt2706 == 0 ? Class7.method90(anInt2693, (byte) 72) : null;
			Class23_Sub13_Sub22 class23_sub13_sub22_18_ = anInt2634 == -1 || aBoolean4384 || (anInt2635 ^ 0xffffffff) == (anInt2634 ^ 0xffffffff) && class23_sub13_sub22 != null ? null : Class7.method90(anInt2634, (byte) 87);
			Class38_Sub1 class38_sub1 = aClass51_4393.method1166(anInt2709, anInt2642, (byte) -52, class23_sub13_sub22_18_, class23_sub13_sub22);
			if (class38_sub1 != null) {
				anInt2685 = class38_sub1.method999();
				if (Class105.aClass38_Sub7_Sub2_1812 == this) {
					for (int i_19_ = Class23_Sub27.aClass10Array2488.length - 1; i_19_ >= 0; i_19_--) {
						Class10 class10 = Class23_Sub27.aClass10Array2488[i_19_];
						if (class10 != null && class10.anInt213 != -1) {
							if (class10.anInt203 == 1 && class10.anInt209 >= 0 && (Class31.aClass38_Sub7_Sub1Array483.length ^ 0xffffffff) < (class10.anInt209 ^ 0xffffffff)) {
								Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[class10.anInt209];
								if (class38_sub7_sub1 != null) {
									int i_20_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32) + class38_sub7_sub1.anInt2674 / 32;
									int i_21_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + class38_sub7_sub1.anInt2659 / 32;
									method1101(-1, i_15_, i_20_, i_13_, i_16_, class10.anInt213, class38_sub1, i_11_, i, i_21_, i_14_, i_12_, i_17_);
								}
							}
							if (class10.anInt203 == 2) {
								int i_22_ = (class10.anInt211 + -Class42.anInt662) * 4 - (-2 + Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32);
								int i_23_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32) + (class10.anInt212 - Class58.anInt903) * 4 - -2;
								method1101(-1, i_15_, i_22_, i_13_, i_16_, class10.anInt213, class38_sub1, i_11_, i, i_23_, i_14_, i_12_, i_17_);
							}
							if (class10.anInt203 == 10 && class10.anInt209 >= 0 && class10.anInt209 < Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932.length) {
								Class38_Sub7_Sub2 class38_sub7_sub2_24_ = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[class10.anInt209];
								if (class38_sub7_sub2_24_ != null) {
									int i_25_ = class38_sub7_sub2_24_.anInt2659 / 32 - Class105.aClass38_Sub7_Sub2_1812.anInt2659 / 32;
									int i_26_ = -(Class105.aClass38_Sub7_Sub2_1812.anInt2674 / 32) + class38_sub7_sub2_24_.anInt2674 / 32;
									method1101(-1, i_15_, i_26_, i_13_, i_16_, class10.anInt213, class38_sub1, i_11_, i, i_25_, i_14_, i_12_, i_17_);
								}
							}
						}
					}
				}
				int i_27_ = 0;
				int i_28_ = 0;
				int i_29_ = 0;
				if (aShort4392 != 0 && aShort4385 != 0) {
					int i_30_ = Class76.anIntArray1386[i];
					int i_31_ = Class76.anIntArray1395[i];
					int i_32_ = aShort4385;
					int i_33_ = -i_32_ / 2;
					int i_34_ = aShort4392;
					int i_35_ = -i_34_ / 2;
					int i_36_ = -i_32_ / 2;
					int i_37_ = i_33_ * i_31_ + -(i_35_ * i_30_) >> 16;
					int i_38_ = i_33_ * i_30_ + i_31_ * i_35_ >> 16;
					int i_39_ = i_34_ / 2;
					int i_40_ = i_39_ * i_31_ + i_36_ * i_30_ >> 16;
					int i_41_ = -i_34_ / 2;
					int i_42_ = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, i_38_ + anInt2674, anInt2659 + i_37_, (byte) 103);
					int i_43_ = -(i_30_ * i_39_) + i_31_ * i_36_ >> 16;
					int i_44_ = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, anInt2674 - -i_40_, i_43_ + anInt2659, (byte) -94);
					int i_45_ = i_32_ / 2;
					int i_46_ = i_45_ * i_30_ + i_31_ * i_41_ >> 16;
					int i_47_ = -(i_30_ * i_41_) + i_31_ * i_45_ >> 16;
					int i_48_ = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, anInt2674 + i_46_, anInt2659 + i_47_, (byte) 126);
					int i_49_ = i_32_ / 2;
					int i_50_ = i_34_ / 2;
					int i_51_ = i_31_ * i_50_ + i_30_ * i_49_ >> 16;
					int i_52_ = -(i_30_ * i_50_) + i_49_ * i_31_ >> 16;
					int i_53_ = (i_42_ ^ 0xffffffff) <= (i_44_ ^ 0xffffffff) ? i_44_ : i_42_;
					int i_54_ = Class23_Sub4_Sub22.method359(Class23_Sub13_Sub11.anInt3916, anInt2674 - -i_51_, anInt2659 + i_52_, (byte) 123);
					i_29_ = i_54_ + i_42_;
					int i_55_ = (i_44_ ^ 0xffffffff) <= (i_54_ ^ 0xffffffff) ? i_54_ : i_44_;
					int i_56_ = i_48_ <= i_42_ ? i_48_ : i_42_;
					if (i_29_ > i_44_ - -i_48_) {
						i_29_ = i_48_ + i_44_;
					}
					int i_57_ = i_54_ <= i_48_ ? i_54_ : i_48_;
					i_27_ = (int) (Math.atan2((double) (-i_57_ + i_53_), (double) i_32_) * 325.95) & 0x7ff;
					if ((i_27_ ^ 0xffffffff) != -1) {
						class38_sub1.method1019(i_27_);
					}
					i_28_ = (int) (325.95 * Math.atan2((double) (-i_55_ + i_56_), (double) i_34_)) & 0x7ff;
					if ((i_28_ ^ 0xffffffff) != -1) {
						class38_sub1.method1008(i_28_);
					}
					i_29_ = (i_29_ >> 1) + -anInt2656;
					if ((i_29_ ^ 0xffffffff) != -1) {
						class38_sub1.method1013(0, i_29_, 0);
					}
				}
				Class38_Sub1 class38_sub1_58_ = null;
				if (!aBoolean4384 && anInt2710 != -1 && anInt2695 != -1) {
					Class23_Sub13_Sub17 class23_sub13_sub17 = Class23_Sub13_Sub21.method827(anInt2710, (byte) -124);
					class38_sub1_58_ = class23_sub13_sub17.method787(anInt2695, (byte) 95);
					if (class38_sub1_58_ != null) {
						class38_sub1_58_.method1013(0, -anInt2647, 0);
						if (class23_sub13_sub17.aBoolean4054) {
							if (i_27_ != 0) {
								class38_sub1_58_.method1019(i_27_);
							}
							if (i_28_ != 0) {
								class38_sub1_58_.method1008(i_28_);
							}
							if (i_29_ != 0) {
								class38_sub1_58_.method1013(0, i_29_, 0);
							}
						}
					}
				}
				Class38_Sub1 class38_sub1_59_ = null;
				if (!aBoolean4384 && aClass38_Sub1_4402 != null) {
					if (Class89.anInt1511 >= anInt4411) {
						aClass38_Sub1_4402 = null;
					}
					if ((Class89.anInt1511 ^ 0xffffffff) <= (anInt4380 ^ 0xffffffff) && (anInt4411 ^ 0xffffffff) < (Class89.anInt1511 ^ 0xffffffff)) {
						class38_sub1_59_ = aClass38_Sub1_4402;
						class38_sub1_59_.method1013(-anInt2674 + anInt4395, anInt4403 + -anInt2656, anInt4379 - anInt2659);
						if (anInt2682 != 512) {
							if (anInt2682 != 1024) {
								if (anInt2682 == 1536) {
									class38_sub1_59_.method1009();
								}
							} else {
								class38_sub1_59_.method1006();
							}
						} else {
							class38_sub1_59_.method1007();
						}
					}
				}
				if (class38_sub1_58_ != null) {
					class38_sub1 = ((Class38_Sub1_Sub1) class38_sub1).method1024(class38_sub1_58_);
				}
				if (class38_sub1_59_ != null) {
					class38_sub1 = ((Class38_Sub1_Sub1) class38_sub1).method1024(class38_sub1_59_);
				}
				class38_sub1.aBoolean2489 = true;
				class38_sub1.method995(i, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_, l);
				if (class38_sub1_59_ != null) {
					if (anInt2682 == 512) {
						class38_sub1_59_.method1009();
					} else if (anInt2682 != 1024) {
						if (anInt2682 == 1536) {
							class38_sub1_59_.method1007();
						}
					} else {
						class38_sub1_59_.method1006();
					}
					class38_sub1_59_.method1013(-anInt4395 + anInt2674, -anInt4403 + anInt2656, -anInt4379 + anInt2659);
				}
			}
		}
	}
	
	public static void method1099(int i) {
		aCRC32_4397 = null;
		aClass16_4404 = null;
		aClass16_4406 = null;
		if (i != -1803925744) {
			aClass16_4406 = null;
		}
		anIntArray4412 = null;
		aClass105_Sub1_4409 = null;
	}
	
	final int method999() {
		anInt4388++;
		return anInt2685;
	}
	
	static final void method1100(int i, int i_60_, Class13 class13, Class105_Sub1 class105_sub1) {
		anInt4408++;
		if (i < 58) {
			aCRC32_4397 = null;
		}
		Class23_Sub14 class23_sub14 = new Class23_Sub14();
		class23_sub14.aLong358 = (long) i_60_;
		class23_sub14.anInt2330 = 1;
		class23_sub14.aClass105_Sub1_2321 = class105_sub1;
		class23_sub14.aClass13_2322 = class13;
		synchronized (Class23_Sub13_Sub15.aClass89_4018) {
			Class23_Sub13_Sub15.aClass89_4018.method1439(90, class23_sub14);
		}
		Class23_Sub13_Sub26.method858((byte) -61);
	}
	
	private final void method1101(int i, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, Class38_Sub1 class38_sub1, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_) {
		anInt4382++;
		int i_72_ = i_68_ * i_68_ + i_62_ * i_62_;
		if (i_72_ >= 16 && i_72_ <= 360000) {
			int i_73_ = 0x7ff & (int) (Math.atan2((double) i_62_, (double) i_68_) * 325.949);
			Class38_Sub1 class38_sub1_74_ = Class38.method1000(class38_sub1, anInt2674, anInt2659, i_73_, -630, i_65_, anInt2656);
			if (class38_sub1_74_ != null) {
				class38_sub1_74_.method995(0, i_66_, i_70_, i_63_, i_69_, i_61_, i_64_, i_71_, -1L);
			}
			if (i != -1) {
				aShort4392 = (short) 42;
			}
		}
	}
	
	Class38_Sub7_Sub2() {
		anInt4380 = 0;
		anInt4401 = -1;
		anInt4398 = 0;
		anInt4386 = 0;
		anInt4394 = -1;
		anInt4383 = 0;
		anInt4411 = 0;
	}
	
	static {
		aClass16_4406 = Class38_Sub6.method1076((byte) 86, "<)4col>");
		anInt4413 = 0;
	}
}
