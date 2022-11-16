/* Class38_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38_Sub4 extends Class38
{
	private byte[] aByteArray2519;
	private static int[] anIntArray2520 = Class76.anIntArray1386;
	protected int anInt2521;
	protected int[] anIntArray2522;
	protected int anInt2523;
	protected short aShort2524;
	private byte[] aByteArray2525;
	private short[] aShortArray2526;
	protected int[] anIntArray2527;
	protected byte[] aByteArray2528;
	protected short[] aShortArray2529;
	private byte[] aByteArray2530;
	private byte[] aByteArray2531;
	protected short[] aShortArray2532;
	protected byte aByte2533 = 0;
	private short aShort2534;
	private short[] aShortArray2535;
	protected byte[] aByteArray2536;
	private short aShort2537;
	private short aShort2538;
	protected byte[] aByteArray2539;
	protected short[] aShortArray2540;
	protected Class92[] aClass92Array2541;
	private static int[] anIntArray2542 = new int[10000];
	private short[] aShortArray2543;
	private short aShort2544;
	protected int[] anIntArray2545;
	protected int[][] anIntArrayArray2546;
	private byte[] aByteArray2547;
	private static int anInt2548 = 0;
	protected Class92[] aClass92Array2549;
	protected Class40[] aClass40Array2550;
	protected short[] aShortArray2551;
	protected int[] anIntArray2552;
	protected int[] anIntArray2553;
	private short aShort2554;
	protected short aShort2555;
	private short aShort2556;
	protected byte[] aByteArray2557;
	protected int[][] anIntArrayArray2558;
	protected byte[] aByteArray2559;
	private int[] anIntArray2560;
	protected int[] anIntArray2561;
	protected short[] aShortArray2562;
	private int[] anIntArray2563;
	private static int[] anIntArray2564;
	private static int[] anIntArray2565 = Class76.anIntArray1395;
	protected int anInt2566;
	private boolean aBoolean2567;
	
	final Class38_Sub4 method1040(int i, int i_0_, int[][] is, int[][] is_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		method1053();
		int i_6_ = i_2_ + aShort2556;
		int i_7_ = i_2_ + aShort2534;
		int i_8_ = i_4_ + aShort2538;
		int i_9_ = i_4_ + aShort2554;
		if ((i == 1 || i == 2 || i == 3 || i == 5) && (i_6_ < 0 || i_7_ + 128 >> 7 >= is.length || i_8_ < 0 || i_9_ + 128 >> 7 >= is[0].length)) {
			return this;
		}
		if (i == 4 || i == 5) {
			if (is_1_ == null) {
				return this;
			}
			if (i_6_ < 0 || i_7_ + 128 >> 7 >= is_1_.length || i_8_ < 0 || i_9_ + 128 >> 7 >= is_1_[0].length) {
				return this;
			}
		} else {
			i_6_ >>= 7;
			i_7_ = i_7_ + 127 >> 7;
			i_8_ >>= 7;
			i_9_ = i_9_ + 127 >> 7;
			if (is[i_6_][i_8_] == i_3_ && is[i_7_][i_8_] == i_3_ && is[i_6_][i_9_] == i_3_ && is[i_7_][i_9_] == i_3_) {
				return this;
			}
		}
		Class38_Sub4 class38_sub4_10_;
		if (bool) {
			class38_sub4_10_ = new Class38_Sub4();
			class38_sub4_10_.anInt2566 = anInt2566;
			class38_sub4_10_.anInt2523 = anInt2523;
			class38_sub4_10_.anInt2521 = anInt2521;
			class38_sub4_10_.anIntArray2527 = anIntArray2527;
			class38_sub4_10_.anIntArray2552 = anIntArray2552;
			class38_sub4_10_.anIntArray2522 = anIntArray2522;
			class38_sub4_10_.aByteArray2539 = aByteArray2539;
			class38_sub4_10_.aByteArray2559 = aByteArray2559;
			class38_sub4_10_.aByteArray2528 = aByteArray2528;
			class38_sub4_10_.aByteArray2536 = aByteArray2536;
			class38_sub4_10_.aShortArray2532 = aShortArray2532;
			class38_sub4_10_.aShortArray2562 = aShortArray2562;
			class38_sub4_10_.aByte2533 = aByte2533;
			class38_sub4_10_.aByteArray2557 = aByteArray2557;
			class38_sub4_10_.aShortArray2529 = aShortArray2529;
			class38_sub4_10_.aShortArray2540 = aShortArray2540;
			class38_sub4_10_.aShortArray2551 = aShortArray2551;
			class38_sub4_10_.aShortArray2535 = aShortArray2535;
			class38_sub4_10_.aShortArray2526 = aShortArray2526;
			class38_sub4_10_.aShortArray2543 = aShortArray2543;
			class38_sub4_10_.aByteArray2531 = aByteArray2531;
			class38_sub4_10_.aByteArray2519 = aByteArray2519;
			class38_sub4_10_.aByteArray2530 = aByteArray2530;
			class38_sub4_10_.aByteArray2525 = aByteArray2525;
			class38_sub4_10_.aByteArray2547 = aByteArray2547;
			class38_sub4_10_.anIntArray2563 = anIntArray2563;
			class38_sub4_10_.anIntArray2560 = anIntArray2560;
			class38_sub4_10_.anIntArrayArray2558 = anIntArrayArray2558;
			class38_sub4_10_.anIntArrayArray2546 = anIntArrayArray2546;
			class38_sub4_10_.aShort2555 = aShort2555;
			class38_sub4_10_.aShort2524 = aShort2524;
			class38_sub4_10_.aClass92Array2541 = aClass92Array2541;
			class38_sub4_10_.aClass40Array2550 = aClass40Array2550;
			class38_sub4_10_.aClass92Array2549 = aClass92Array2549;
			if (i == 3) {
				class38_sub4_10_.anIntArray2553 = Class72.method1291(0, anIntArray2553);
				class38_sub4_10_.anIntArray2545 = Class72.method1291(0, anIntArray2545);
				class38_sub4_10_.anIntArray2561 = Class72.method1291(0, anIntArray2561);
			} else {
				class38_sub4_10_.anIntArray2553 = anIntArray2553;
				class38_sub4_10_.anIntArray2545 = new int[class38_sub4_10_.anInt2566];
				class38_sub4_10_.anIntArray2561 = anIntArray2561;
			}
		} else {
			class38_sub4_10_ = this;
		}
		if (i == 1) {
			for (int i_11_ = 0; i_11_ < class38_sub4_10_.anInt2566; i_11_++) {
				int i_12_ = anIntArray2553[i_11_] + i_2_;
				int i_13_ = anIntArray2561[i_11_] + i_4_;
				int i_14_ = i_12_ & 0x7f;
				int i_15_ = i_13_ & 0x7f;
				int i_16_ = i_12_ >> 7;
				int i_17_ = i_13_ >> 7;
				int i_18_ = is[i_16_][i_17_] * (128 - i_14_) + is[i_16_ + 1][i_17_] * i_14_ >> 7;
				int i_19_ = is[i_16_][i_17_ + 1] * (128 - i_14_) + is[i_16_ + 1][i_17_ + 1] * i_14_ >> 7;
				int i_20_ = i_18_ * (128 - i_15_) + i_19_ * i_15_ >> 7;
				class38_sub4_10_.anIntArray2545[i_11_] = anIntArray2545[i_11_] + i_20_ - i_3_;
			}
		} else if (i == 2) {
			for (int i_21_ = 0; i_21_ < class38_sub4_10_.anInt2566; i_21_++) {
				int i_22_ = (anIntArray2545[i_21_] << 16) / aShort2537;
				if (i_22_ < i_0_) {
					int i_23_ = anIntArray2553[i_21_] + i_2_;
					int i_24_ = anIntArray2561[i_21_] + i_4_;
					int i_25_ = i_23_ & 0x7f;
					int i_26_ = i_24_ & 0x7f;
					int i_27_ = i_23_ >> 7;
					int i_28_ = i_24_ >> 7;
					int i_29_ = is[i_27_][i_28_] * (128 - i_25_) + is[i_27_ + 1][i_28_] * i_25_ >> 7;
					int i_30_ = is[i_27_][i_28_ + 1] * (128 - i_25_) + is[i_27_ + 1][i_28_ + 1] * i_25_ >> 7;
					int i_31_ = i_29_ * (128 - i_26_) + i_30_ * i_26_ >> 7;
					class38_sub4_10_.anIntArray2545[i_21_] = anIntArray2545[i_21_] + (i_31_ - i_3_) * (i_0_ - i_22_) / i_0_;
				} else {
					class38_sub4_10_.anIntArray2545[i_21_] = anIntArray2545[i_21_];
				}
			}
		} else if (i == 3) {
			int i_32_ = (i_0_ & 0xff) * 4;
			int i_33_ = (i_0_ >> 8 & 0xff) * 4;
			method1054(is, i_2_, i_3_, i_4_, i_32_, i_33_);
		} else if (i == 4) {
			int i_34_ = aShort2544 - aShort2537;
			for (int i_35_ = 0; i_35_ < anInt2566; i_35_++) {
				int i_36_ = anIntArray2553[i_35_] + i_2_;
				int i_37_ = anIntArray2561[i_35_] + i_4_;
				int i_38_ = i_36_ & 0x7f;
				int i_39_ = i_37_ & 0x7f;
				int i_40_ = i_36_ >> 7;
				int i_41_ = i_37_ >> 7;
				int i_42_ = is_1_[i_40_][i_41_] * (128 - i_38_) + is_1_[i_40_ + 1][i_41_] * i_38_ >> 7;
				int i_43_ = is_1_[i_40_][i_41_ + 1] * (128 - i_38_) + is_1_[i_40_ + 1][i_41_ + 1] * i_38_ >> 7;
				int i_44_ = i_42_ * (128 - i_39_) + i_43_ * i_39_ >> 7;
				class38_sub4_10_.anIntArray2545[i_35_] = anIntArray2545[i_35_] + (i_44_ - i_3_) + i_34_;
			}
		} else if (i == 5) {
			int i_45_ = aShort2544 - aShort2537;
			for (int i_46_ = 0; i_46_ < anInt2566; i_46_++) {
				int i_47_ = anIntArray2553[i_46_] + i_2_;
				int i_48_ = anIntArray2561[i_46_] + i_4_;
				int i_49_ = i_47_ & 0x7f;
				int i_50_ = i_48_ & 0x7f;
				int i_51_ = i_47_ >> 7;
				int i_52_ = i_48_ >> 7;
				int i_53_ = is[i_51_][i_52_] * (128 - i_49_) + is[i_51_ + 1][i_52_] * i_49_ >> 7;
				int i_54_ = is[i_51_][i_52_ + 1] * (128 - i_49_) + is[i_51_ + 1][i_52_ + 1] * i_49_ >> 7;
				int i_55_ = i_53_ * (128 - i_50_) + i_54_ * i_50_ >> 7;
				i_53_ = is_1_[i_51_][i_52_] * (128 - i_49_) + is_1_[i_51_ + 1][i_52_] * i_49_ >> 7;
				i_54_ = is_1_[i_51_][i_52_ + 1] * (128 - i_49_) + is_1_[i_51_ + 1][i_52_ + 1] * i_49_ >> 7;
				int i_56_ = i_53_ * (128 - i_50_) + i_54_ * i_50_ >> 7;
				int i_57_ = i_55_ - i_56_;
				class38_sub4_10_.anIntArray2545[i_46_] = ((anIntArray2545[i_46_] << 8) / i_45_ * i_57_ >> 8) - (i_3_ - i_55_);
			}
		}
		if (bool_5_) {
			class38_sub4_10_.method1047();
		} else {
			aBoolean2567 = false;
		}
		return class38_sub4_10_;
	}
	
	final int method999() {
		if (!aBoolean2567) {
			method1053();
		}
		return aShort2537;
	}
	
	private final void method1041(byte[] bs) {
		Buffer class23_sub5 = new Buffer(bs);
		Buffer class23_sub5_58_ = new Buffer(bs);
		Buffer class23_sub5_59_ = new Buffer(bs);
		Buffer class23_sub5_60_ = new Buffer(bs);
		Buffer class23_sub5_61_ = new Buffer(bs);
		Buffer class23_sub5_62_ = new Buffer(bs);
		Buffer class23_sub5_63_ = new Buffer(bs);
		class23_sub5.position = bs.length - 23;
		int i = class23_sub5.method476((byte) -110);
		int i_64_ = class23_sub5.method476((byte) -124);
		int i_65_ = class23_sub5.method461(-1797813752);
		int i_66_ = class23_sub5.method461(-1797813752);
		int i_67_ = class23_sub5.method461(-1797813752);
		int i_68_ = class23_sub5.method461(-1797813752);
		int i_69_ = class23_sub5.method461(-1797813752);
		int i_70_ = class23_sub5.method461(-1797813752);
		int i_71_ = class23_sub5.method461(-1797813752);
		int i_72_ = class23_sub5.method476((byte) -107);
		int i_73_ = class23_sub5.method476((byte) -108);
		int i_74_ = class23_sub5.method476((byte) -116);
		int i_75_ = class23_sub5.method476((byte) -101);
		int i_76_ = class23_sub5.method476((byte) -98);
		int i_77_ = 0;
		int i_78_ = 0;
		int i_79_ = 0;
		if (i_65_ > 0) {
			aByteArray2557 = new byte[i_65_];
			class23_sub5.position = 0;
			for (int i_80_ = 0; i_80_ < i_65_; i_80_++) {
				byte b = aByteArray2557[i_80_] = class23_sub5.method452(-16933672);
				if (b == 0) {
					i_77_++;
				}
				if (b >= 1 && b <= 3) {
					i_78_++;
				}
				if (b == 2) {
					i_79_++;
				}
			}
		}
		int i_81_ = i_65_;
		int i_82_ = i_81_;
		i_81_ += i;
		int i_83_ = i_81_;
		if (i_66_ == 1) {
			i_81_ += i_64_;
		}
		int i_84_ = i_81_;
		i_81_ += i_64_;
		int i_85_ = i_81_;
		if (i_67_ == 255) {
			i_81_ += i_64_;
		}
		int i_86_ = i_81_;
		if (i_69_ == 1) {
			i_81_ += i_64_;
		}
		int i_87_ = i_81_;
		if (i_71_ == 1) {
			i_81_ += i;
		}
		int i_88_ = i_81_;
		if (i_68_ == 1) {
			i_81_ += i_64_;
		}
		int i_89_ = i_81_;
		i_81_ += i_75_;
		int i_90_ = i_81_;
		if (i_70_ == 1) {
			i_81_ += i_64_ * 2;
		}
		int i_91_ = i_81_;
		i_81_ += i_76_;
		int i_92_ = i_81_;
		i_81_ += i_64_ * 2;
		int i_93_ = i_81_;
		i_81_ += i_72_;
		int i_94_ = i_81_;
		i_81_ += i_73_;
		int i_95_ = i_81_;
		i_81_ += i_74_;
		int i_96_ = i_81_;
		i_81_ += i_77_ * 6;
		int i_97_ = i_81_;
		i_81_ += i_78_ * 6;
		int i_98_ = i_81_;
		i_81_ += i_78_ * 6;
		int i_99_ = i_81_;
		i_81_ += i_78_;
		int i_100_ = i_81_;
		i_81_ += i_78_;
		int i_101_ = i_81_;
		i_81_ += i_78_ + i_79_ * 2;
		anInt2566 = i;
		anInt2523 = i_64_;
		anInt2521 = i_65_;
		anIntArray2553 = new int[i];
		anIntArray2545 = new int[i];
		anIntArray2561 = new int[i];
		anIntArray2527 = new int[i_64_];
		anIntArray2552 = new int[i_64_];
		anIntArray2522 = new int[i_64_];
		if (i_71_ == 1) {
			anIntArray2563 = new int[i];
		}
		if (i_66_ == 1) {
			aByteArray2539 = new byte[i_64_];
		}
		if (i_67_ == 255) {
			aByteArray2559 = new byte[i_64_];
		} else {
			aByte2533 = (byte) i_67_;
		}
		if (i_68_ == 1) {
			aByteArray2528 = new byte[i_64_];
		}
		if (i_69_ == 1) {
			anIntArray2560 = new int[i_64_];
		}
		if (i_70_ == 1) {
			aShortArray2562 = new short[i_64_];
		}
		if (i_70_ == 1 && i_65_ > 0) {
			aByteArray2536 = new byte[i_64_];
		}
		aShortArray2532 = new short[i_64_];
		if (i_65_ > 0) {
			aShortArray2529 = new short[i_65_];
			aShortArray2540 = new short[i_65_];
			aShortArray2551 = new short[i_65_];
			if (i_78_ > 0) {
				aShortArray2535 = new short[i_78_];
				aShortArray2526 = new short[i_78_];
				aShortArray2543 = new short[i_78_];
				aByteArray2531 = new byte[i_78_];
				aByteArray2519 = new byte[i_78_];
				aByteArray2530 = new byte[i_78_];
			}
			if (i_79_ > 0) {
				aByteArray2525 = new byte[i_79_];
				aByteArray2547 = new byte[i_79_];
			}
		}
		class23_sub5.position = i_82_;
		class23_sub5_58_.position = i_93_;
		class23_sub5_59_.position = i_94_;
		class23_sub5_60_.position = i_95_;
		class23_sub5_61_.position = i_87_;
		int i_102_ = 0;
		int i_103_ = 0;
		int i_104_ = 0;
		for (int i_105_ = 0; i_105_ < i; i_105_++) {
			int i_106_ = class23_sub5.method461(-1797813752);
			int i_107_ = 0;
			if ((i_106_ & 0x1) != 0) {
				i_107_ = class23_sub5_58_.method459(true);
			}
			int i_108_ = 0;
			if ((i_106_ & 0x2) != 0) {
				i_108_ = class23_sub5_59_.method459(true);
			}
			int i_109_ = 0;
			if ((i_106_ & 0x4) != 0) {
				i_109_ = class23_sub5_60_.method459(true);
			}
			anIntArray2553[i_105_] = i_102_ + i_107_;
			anIntArray2545[i_105_] = i_103_ + i_108_;
			anIntArray2561[i_105_] = i_104_ + i_109_;
			i_102_ = anIntArray2553[i_105_];
			i_103_ = anIntArray2545[i_105_];
			i_104_ = anIntArray2561[i_105_];
			if (i_71_ == 1) {
				anIntArray2563[i_105_] = class23_sub5_61_.method461(-1797813752);
			}
		}
		class23_sub5.position = i_92_;
		class23_sub5_58_.position = i_83_;
		class23_sub5_59_.position = i_85_;
		class23_sub5_60_.position = i_88_;
		class23_sub5_61_.position = i_86_;
		class23_sub5_62_.position = i_90_;
		class23_sub5_63_.position = i_91_;
		for (int i_110_ = 0; i_110_ < i_64_; i_110_++) {
			aShortArray2532[i_110_] = (short) class23_sub5.method476((byte) -107);
			if (i_66_ == 1) {
				aByteArray2539[i_110_] = class23_sub5_58_.method452(-16933672);
			}
			if (i_67_ == 255) {
				aByteArray2559[i_110_] = class23_sub5_59_.method452(-16933672);
			}
			if (i_68_ == 1) {
				aByteArray2528[i_110_] = class23_sub5_60_.method452(-16933672);
			}
			if (i_69_ == 1) {
				anIntArray2560[i_110_] = class23_sub5_61_.method461(-1797813752);
			}
			if (i_70_ == 1) {
				aShortArray2562[i_110_] = (short) (class23_sub5_62_.method476((byte) -115) - 1);
			}
			if (aByteArray2536 != null) {
				if (aShortArray2562[i_110_] != -1) {
					aByteArray2536[i_110_] = (byte) (class23_sub5_63_.method461(-1797813752) - 1);
				} else {
					aByteArray2536[i_110_] = (byte) -1;
				}
			}
		}
		class23_sub5.position = i_89_;
		class23_sub5_58_.position = i_84_;
		int i_111_ = 0;
		int i_112_ = 0;
		int i_113_ = 0;
		int i_114_ = 0;
		for (int i_115_ = 0; i_115_ < i_64_; i_115_++) {
			int i_116_ = class23_sub5_58_.method461(-1797813752);
			if (i_116_ == 1) {
				i_111_ = class23_sub5.method459(true) + i_114_;
				i_114_ = i_111_;
				i_112_ = class23_sub5.method459(true) + i_114_;
				i_114_ = i_112_;
				i_113_ = class23_sub5.method459(true) + i_114_;
				i_114_ = i_113_;
				anIntArray2527[i_115_] = i_111_;
				anIntArray2552[i_115_] = i_112_;
				anIntArray2522[i_115_] = i_113_;
			}
			if (i_116_ == 2) {
				i_112_ = i_113_;
				i_113_ = class23_sub5.method459(true) + i_114_;
				i_114_ = i_113_;
				anIntArray2527[i_115_] = i_111_;
				anIntArray2552[i_115_] = i_112_;
				anIntArray2522[i_115_] = i_113_;
			}
			if (i_116_ == 3) {
				i_111_ = i_113_;
				i_113_ = class23_sub5.method459(true) + i_114_;
				i_114_ = i_113_;
				anIntArray2527[i_115_] = i_111_;
				anIntArray2552[i_115_] = i_112_;
				anIntArray2522[i_115_] = i_113_;
			}
			if (i_116_ == 4) {
				int i_117_ = i_111_;
				i_111_ = i_112_;
				i_112_ = i_117_;
				i_113_ = class23_sub5.method459(true) + i_114_;
				i_114_ = i_113_;
				anIntArray2527[i_115_] = i_111_;
				anIntArray2552[i_115_] = i_112_;
				anIntArray2522[i_115_] = i_113_;
			}
		}
		class23_sub5.position = i_96_;
		class23_sub5_58_.position = i_97_;
		class23_sub5_59_.position = i_98_;
		class23_sub5_60_.position = i_99_;
		class23_sub5_61_.position = i_100_;
		class23_sub5_62_.position = i_101_;
		for (int i_118_ = 0; i_118_ < i_65_; i_118_++) {
			int i_119_ = aByteArray2557[i_118_] & 0xff;
			if (i_119_ == 0) {
				aShortArray2529[i_118_] = (short) class23_sub5.method476((byte) -119);
				aShortArray2540[i_118_] = (short) class23_sub5.method476((byte) -112);
				aShortArray2551[i_118_] = (short) class23_sub5.method476((byte) -118);
			}
			if (i_119_ == 1) {
				aShortArray2529[i_118_] = (short) class23_sub5_58_.method476((byte) -115);
				aShortArray2540[i_118_] = (short) class23_sub5_58_.method476((byte) -122);
				aShortArray2551[i_118_] = (short) class23_sub5_58_.method476((byte) -128);
				aShortArray2535[i_118_] = (short) class23_sub5_59_.method476((byte) -119);
				aShortArray2526[i_118_] = (short) class23_sub5_59_.method476((byte) -113);
				aShortArray2543[i_118_] = (short) class23_sub5_59_.method476((byte) -126);
				aByteArray2531[i_118_] = class23_sub5_60_.method452(-16933672);
				aByteArray2519[i_118_] = class23_sub5_61_.method452(-16933672);
				aByteArray2530[i_118_] = class23_sub5_62_.method452(-16933672);
			}
			if (i_119_ == 2) {
				aShortArray2529[i_118_] = (short) class23_sub5_58_.method476((byte) -128);
				aShortArray2540[i_118_] = (short) class23_sub5_58_.method476((byte) -115);
				aShortArray2551[i_118_] = (short) class23_sub5_58_.method476((byte) -100);
				aShortArray2535[i_118_] = (short) class23_sub5_59_.method476((byte) -128);
				aShortArray2526[i_118_] = (short) class23_sub5_59_.method476((byte) -120);
				aShortArray2543[i_118_] = (short) class23_sub5_59_.method476((byte) -110);
				aByteArray2531[i_118_] = class23_sub5_60_.method452(-16933672);
				aByteArray2519[i_118_] = class23_sub5_61_.method452(-16933672);
				aByteArray2530[i_118_] = class23_sub5_62_.method452(-16933672);
				aByteArray2525[i_118_] = class23_sub5_62_.method452(-16933672);
				aByteArray2547[i_118_] = class23_sub5_62_.method452(-16933672);
			}
			if (i_119_ == 3) {
				aShortArray2529[i_118_] = (short) class23_sub5_58_.method476((byte) -120);
				aShortArray2540[i_118_] = (short) class23_sub5_58_.method476((byte) -125);
				aShortArray2551[i_118_] = (short) class23_sub5_58_.method476((byte) -128);
				aShortArray2535[i_118_] = (short) class23_sub5_59_.method476((byte) -105);
				aShortArray2526[i_118_] = (short) class23_sub5_59_.method476((byte) -114);
				aShortArray2543[i_118_] = (short) class23_sub5_59_.method476((byte) -120);
				aByteArray2531[i_118_] = class23_sub5_60_.method452(-16933672);
				aByteArray2519[i_118_] = class23_sub5_61_.method452(-16933672);
				aByteArray2530[i_118_] = class23_sub5_62_.method452(-16933672);
			}
		}
	}
	
	final void method1042(int i, int i_120_, int i_121_) {
		for (int i_122_ = 0; i_122_ < anInt2566; i_122_++) {
			anIntArray2553[i_122_] += i;
			anIntArray2545[i_122_] += i_120_;
			anIntArray2561[i_122_] += i_121_;
		}
		method1047();
	}
	
	final void method995(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, long l) {
		/* empty */
	}
	
	final void method1043(short s, short s_130_) {
		if (aShortArray2562 != null) {
			for (int i = 0; i < anInt2523; i++) {
				if (aShortArray2562[i] == s) {
					aShortArray2562[i] = s_130_;
				}
			}
		}
	}
	
	public static void method1044() {
		anIntArray2542 = null;
		anIntArray2564 = null;
		anIntArray2520 = null;
		anIntArray2565 = null;
	}
	
	final Class38 method994(int i, int i_131_, int i_132_) {
		return method1064(aShort2555, aShort2524, i, i_131_, i_132_);
	}
	
	final void method1045() {
		for (int i = 0; i < anInt2566; i++) {
			int i_133_ = anIntArray2561[i];
			anIntArray2561[i] = anIntArray2553[i];
			anIntArray2553[i] = -i_133_;
		}
		method1047();
	}
	
	final Class38_Sub1_Sub1 method1046(int i, int i_134_, int i_135_, int i_136_, int i_137_) {
		return new Class38_Sub1_Sub1(this, i, i_134_, i_135_, i_136_, i_137_);
	}
	
	private final void method1047() {
		aClass92Array2541 = null;
		aClass92Array2549 = null;
		aClass40Array2550 = null;
		aBoolean2567 = false;
	}
	
	final void method1048() {
		if (anIntArray2563 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_138_ = 0; i_138_ < anInt2566; i_138_++) {
				int i_139_ = anIntArray2563[i_138_];
				is[i_139_]++;
				if (i_139_ > i) {
					i = i_139_;
				}
			}
			anIntArrayArray2558 = new int[i + 1][];
			for (int i_140_ = 0; i_140_ <= i; i_140_++) {
				anIntArrayArray2558[i_140_] = new int[is[i_140_]];
				is[i_140_] = 0;
			}
			for (int i_141_ = 0; i_141_ < anInt2566; i_141_++) {
				int i_142_ = anIntArray2563[i_141_];
				anIntArrayArray2558[i_142_][is[i_142_]++] = i_141_;
			}
			anIntArray2563 = null;
		}
		if (anIntArray2560 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_143_ = 0; i_143_ < anInt2523; i_143_++) {
				int i_144_ = anIntArray2560[i_143_];
				is[i_144_]++;
				if (i_144_ > i) {
					i = i_144_;
				}
			}
			anIntArrayArray2546 = new int[i + 1][];
			for (int i_145_ = 0; i_145_ <= i; i_145_++) {
				anIntArrayArray2546[i_145_] = new int[is[i_145_]];
				is[i_145_] = 0;
			}
			for (int i_146_ = 0; i_146_ < anInt2523; i_146_++) {
				int i_147_ = anIntArray2560[i_146_];
				anIntArrayArray2546[i_147_][is[i_147_]++] = i_146_;
			}
			anIntArray2560 = null;
		}
	}
	
	final void method1049(int i) {
		int i_148_ = anIntArray2520[i];
		int i_149_ = anIntArray2565[i];
		for (int i_150_ = 0; i_150_ < anInt2566; i_150_++) {
			int i_151_ = anIntArray2561[i_150_] * i_148_ + anIntArray2553[i_150_] * i_149_ >> 16;
			anIntArray2561[i_150_] = anIntArray2561[i_150_] * i_149_ - anIntArray2553[i_150_] * i_148_ >> 16;
			anIntArray2553[i_150_] = i_151_;
		}
		method1047();
	}
	
	private final void method1050(int i) {
		int i_152_ = anIntArray2520[i];
		int i_153_ = anIntArray2565[i];
		for (int i_154_ = 0; i_154_ < anInt2566; i_154_++) {
			int i_155_ = anIntArray2545[i_154_] * i_152_ + anIntArray2553[i_154_] * i_153_ >> 16;
			anIntArray2545[i_154_] = anIntArray2545[i_154_] * i_153_ - anIntArray2553[i_154_] * i_152_ >> 16;
			anIntArray2553[i_154_] = i_155_;
		}
		method1047();
	}
	
	final Class38_Sub4 method1051() {
		Class38_Sub4 class38_sub4_156_ = new Class38_Sub4();
		if (aByteArray2539 != null) {
			class38_sub4_156_.aByteArray2539 = new byte[anInt2523];
			for (int i = 0; i < anInt2523; i++)
				class38_sub4_156_.aByteArray2539[i] = aByteArray2539[i];
		}
		class38_sub4_156_.anInt2566 = anInt2566;
		class38_sub4_156_.anInt2523 = anInt2523;
		class38_sub4_156_.anInt2521 = anInt2521;
		class38_sub4_156_.anIntArray2553 = anIntArray2553;
		class38_sub4_156_.anIntArray2545 = anIntArray2545;
		class38_sub4_156_.anIntArray2561 = anIntArray2561;
		class38_sub4_156_.anIntArray2527 = anIntArray2527;
		class38_sub4_156_.anIntArray2552 = anIntArray2552;
		class38_sub4_156_.anIntArray2522 = anIntArray2522;
		class38_sub4_156_.aByteArray2559 = aByteArray2559;
		class38_sub4_156_.aByteArray2528 = aByteArray2528;
		class38_sub4_156_.aByteArray2536 = aByteArray2536;
		class38_sub4_156_.aShortArray2532 = aShortArray2532;
		class38_sub4_156_.aShortArray2562 = aShortArray2562;
		class38_sub4_156_.aByte2533 = aByte2533;
		class38_sub4_156_.aByteArray2557 = aByteArray2557;
		class38_sub4_156_.aShortArray2529 = aShortArray2529;
		class38_sub4_156_.aShortArray2540 = aShortArray2540;
		class38_sub4_156_.aShortArray2551 = aShortArray2551;
		class38_sub4_156_.aShortArray2535 = aShortArray2535;
		class38_sub4_156_.aShortArray2526 = aShortArray2526;
		class38_sub4_156_.aShortArray2543 = aShortArray2543;
		class38_sub4_156_.aByteArray2531 = aByteArray2531;
		class38_sub4_156_.aByteArray2519 = aByteArray2519;
		class38_sub4_156_.aByteArray2530 = aByteArray2530;
		class38_sub4_156_.aByteArray2525 = aByteArray2525;
		class38_sub4_156_.aByteArray2547 = aByteArray2547;
		class38_sub4_156_.anIntArray2563 = anIntArray2563;
		class38_sub4_156_.anIntArray2560 = anIntArray2560;
		class38_sub4_156_.anIntArrayArray2558 = anIntArrayArray2558;
		class38_sub4_156_.anIntArrayArray2546 = anIntArrayArray2546;
		class38_sub4_156_.aClass92Array2541 = aClass92Array2541;
		class38_sub4_156_.aClass40Array2550 = aClass40Array2550;
		class38_sub4_156_.aShort2555 = aShort2555;
		class38_sub4_156_.aShort2524 = aShort2524;
		return class38_sub4_156_;
	}
	
	private static final int method1052(int[][] is, int i, int i_157_) {
		int i_158_ = i >> 7;
		int i_159_ = i_157_ >> 7;
		if (i_158_ < 0 || i_159_ < 0 || i_158_ >= is.length || i_159_ >= is[0].length) {
			return 0;
		}
		int i_160_ = i & 0x7f;
		int i_161_ = i_157_ & 0x7f;
		int i_162_ = is[i_158_][i_159_] * (128 - i_160_) + is[i_158_ + 1][i_159_] * i_160_ >> 7;
		int i_163_ = is[i_158_][i_159_ + 1] * (128 - i_160_) + is[i_158_ + 1][i_159_ + 1] * i_160_ >> 7;
		return i_162_ * (128 - i_161_) + i_163_ * i_161_ >> 7;
	}
	
	private final void method1053() {
		if (!aBoolean2567) {
			aBoolean2567 = true;
			int i = 32767;
			int i_164_ = 32767;
			int i_165_ = 32767;
			int i_166_ = -32768;
			int i_167_ = -32768;
			int i_168_ = -32768;
			for (int i_169_ = 0; i_169_ < anInt2566; i_169_++) {
				int i_170_ = anIntArray2553[i_169_];
				int i_171_ = anIntArray2545[i_169_];
				int i_172_ = anIntArray2561[i_169_];
				if (i_170_ < i) {
					i = i_170_;
				}
				if (i_170_ > i_166_) {
					i_166_ = i_170_;
				}
				if (i_171_ < i_164_) {
					i_164_ = i_171_;
				}
				if (i_171_ > i_167_) {
					i_167_ = i_171_;
				}
				if (i_172_ < i_165_) {
					i_165_ = i_172_;
				}
				if (i_172_ > i_168_) {
					i_168_ = i_172_;
				}
			}
			aShort2556 = (short) i;
			aShort2534 = (short) i_166_;
			aShort2537 = (short) i_164_;
			aShort2544 = (short) i_167_;
			aShort2538 = (short) i_165_;
			aShort2554 = (short) i_168_;
		}
	}
	
	private final void method1054(int[][] is, int i, int i_173_, int i_174_, int i_175_, int i_176_) {
		boolean bool = false;
		boolean bool_177_ = false;
		boolean bool_178_ = false;
		int i_179_ = -i_175_ / 2;
		int i_180_ = -i_176_ / 2;
		int i_181_ = method1052(is, i + i_179_, i_174_ + i_180_);
		int i_182_ = i_175_ / 2;
		int i_183_ = -i_176_ / 2;
		int i_184_ = method1052(is, i + i_182_, i_174_ + i_183_);
		int i_185_ = -i_175_ / 2;
		int i_186_ = i_176_ / 2;
		int i_187_ = method1052(is, i + i_185_, i_174_ + i_186_);
		int i_188_ = i_175_ / 2;
		int i_189_ = i_176_ / 2;
		int i_190_ = method1052(is, i + i_188_, i_174_ + i_189_);
		int i_191_ = i_181_ < i_184_ ? i_181_ : i_184_;
		int i_192_ = i_187_ < i_190_ ? i_187_ : i_190_;
		int i_193_ = i_184_ < i_190_ ? i_184_ : i_190_;
		int i_194_ = i_181_ < i_187_ ? i_181_ : i_187_;
		int i_195_ = (int) (Math.atan2((double) (i_191_ - i_192_), (double) i_176_) * 325.95) & 0x7ff;
		if (i_195_ != 0) {
			method1059(i_195_);
		}
		int i_196_ = (int) (Math.atan2((double) (i_194_ - i_193_), (double) i_175_) * 325.95) & 0x7ff;
		if (i_196_ != 0) {
			method1050(i_196_);
		}
		int i_197_ = i_181_ + i_190_;
		if (i_184_ + i_187_ < i_197_) {
			i_197_ = i_184_ + i_187_;
		}
		i_197_ = (i_197_ >> 1) - i_173_;
		if (i_197_ != 0) {
			method1042(0, i_197_, 0);
		}
	}
	
	final void method1055(int i, int i_198_, int i_199_) {
		if (i_199_ != 0) {
			int i_200_ = anIntArray2520[i_199_];
			int i_201_ = anIntArray2565[i_199_];
			for (int i_202_ = 0; i_202_ < anInt2566; i_202_++) {
				int i_203_ = anIntArray2545[i_202_] * i_200_ + anIntArray2553[i_202_] * i_201_ >> 16;
				anIntArray2545[i_202_] = anIntArray2545[i_202_] * i_201_ - anIntArray2553[i_202_] * i_200_ >> 16;
				anIntArray2553[i_202_] = i_203_;
			}
		}
		if (i != 0) {
			int i_204_ = anIntArray2520[i];
			int i_205_ = anIntArray2565[i];
			for (int i_206_ = 0; i_206_ < anInt2566; i_206_++) {
				int i_207_ = anIntArray2545[i_206_] * i_205_ - anIntArray2561[i_206_] * i_204_ >> 16;
				anIntArray2561[i_206_] = anIntArray2545[i_206_] * i_204_ + anIntArray2561[i_206_] * i_205_ >> 16;
				anIntArray2545[i_206_] = i_207_;
			}
		}
		if (i_198_ != 0) {
			int i_208_ = anIntArray2520[i_198_];
			int i_209_ = anIntArray2565[i_198_];
			for (int i_210_ = 0; i_210_ < anInt2566; i_210_++) {
				int i_211_ = anIntArray2561[i_210_] * i_208_ + anIntArray2553[i_210_] * i_209_ >> 16;
				anIntArray2561[i_210_] = anIntArray2561[i_210_] * i_209_ - anIntArray2553[i_210_] * i_208_ >> 16;
				anIntArray2553[i_210_] = i_211_;
			}
		}
	}
	
	final void method1056(int i, int i_212_, int i_213_) {
		for (int i_214_ = 0; i_214_ < anInt2566; i_214_++) {
			anIntArray2553[i_214_] = anIntArray2553[i_214_] * i / 128;
			anIntArray2545[i_214_] = anIntArray2545[i_214_] * i_212_ / 128;
			anIntArray2561[i_214_] = anIntArray2561[i_214_] * i_213_ / 128;
		}
		method1047();
	}
	
	final void method1057() {
		for (int i = 0; i < anInt2566; i++)
			anIntArray2561[i] = -anIntArray2561[i];
		for (int i = 0; i < anInt2523; i++) {
			int i_215_ = anIntArray2527[i];
			anIntArray2527[i] = anIntArray2522[i];
			anIntArray2522[i] = i_215_;
		}
		method1047();
	}
	
	final void method1058() {
		for (int i = 0; i < anInt2566; i++) {
			int i_216_ = anIntArray2553[i];
			anIntArray2553[i] = anIntArray2561[i];
			anIntArray2561[i] = -i_216_;
		}
		method1047();
	}
	
	private final void method1059(int i) {
		int i_217_ = anIntArray2520[i];
		int i_218_ = anIntArray2565[i];
		for (int i_219_ = 0; i_219_ < anInt2566; i_219_++) {
			int i_220_ = anIntArray2545[i_219_] * i_218_ - anIntArray2561[i_219_] * i_217_ >> 16;
			anIntArray2561[i_219_] = anIntArray2545[i_219_] * i_217_ + anIntArray2561[i_219_] * i_218_ >> 16;
			anIntArray2545[i_219_] = i_220_;
		}
		method1047();
	}
	
	static final Class38_Sub4 method1060(Class105 class105, int i, int i_221_) {
		byte[] bs = class105.method1544(i_221_, 0, i);
		if (bs == null) {
			return null;
		}
		return new Class38_Sub4(bs);
	}
	
	final boolean method998() {
		return true;
	}
	
	final void method1061() {
		for (int i = 0; i < anInt2566; i++) {
			anIntArray2553[i] = -anIntArray2553[i];
			anIntArray2561[i] = -anIntArray2561[i];
		}
		method1047();
	}
	
	private final int method1062(Class38_Sub4 class38_sub4_222_, int i) {
		int i_223_ = -1;
		int i_224_ = class38_sub4_222_.anIntArray2553[i];
		int i_225_ = class38_sub4_222_.anIntArray2545[i];
		int i_226_ = class38_sub4_222_.anIntArray2561[i];
		for (int i_227_ = 0; i_227_ < anInt2566; i_227_++) {
			if (i_224_ == anIntArray2553[i_227_] && i_225_ == anIntArray2545[i_227_] && i_226_ == anIntArray2561[i_227_]) {
				i_223_ = i_227_;
				break;
			}
		}
		if (i_223_ == -1) {
			anIntArray2553[anInt2566] = i_224_;
			anIntArray2545[anInt2566] = i_225_;
			anIntArray2561[anInt2566] = i_226_;
			if (class38_sub4_222_.anIntArray2563 != null) {
				anIntArray2563[anInt2566] = class38_sub4_222_.anIntArray2563[i];
			}
			i_223_ = anInt2566++;
		}
		return i_223_;
	}
	
	final void method992(Class38 class38, int i, int i_228_, int i_229_, boolean bool) {
		Class38_Sub4 class38_sub4_230_ = (Class38_Sub4) class38;
		class38_sub4_230_.method1053();
		class38_sub4_230_.method1066();
		anInt2548++;
		int i_231_ = 0;
		int[] is = class38_sub4_230_.anIntArray2553;
		int i_232_ = class38_sub4_230_.anInt2566;
		for (int i_233_ = 0; i_233_ < anInt2566; i_233_++) {
			Class92 class92 = aClass92Array2541[i_233_];
			if (class92.anInt1568 != 0) {
				int i_234_ = anIntArray2545[i_233_] - i_228_;
				if (i_234_ >= class38_sub4_230_.aShort2537 && i_234_ <= class38_sub4_230_.aShort2544) {
					int i_235_ = anIntArray2553[i_233_] - i;
					if (i_235_ >= class38_sub4_230_.aShort2556 && i_235_ <= class38_sub4_230_.aShort2534) {
						int i_236_ = anIntArray2561[i_233_] - i_229_;
						if (i_236_ >= class38_sub4_230_.aShort2538 && i_236_ <= class38_sub4_230_.aShort2554) {
							for (int i_237_ = 0; i_237_ < i_232_; i_237_++) {
								Class92 class92_238_ = class38_sub4_230_.aClass92Array2541[i_237_];
								if (i_235_ == is[i_237_] && i_236_ == class38_sub4_230_.anIntArray2561[i_237_] && i_234_ == class38_sub4_230_.anIntArray2545[i_237_] && class92_238_.anInt1568 != 0) {
									if (aClass92Array2549 == null) {
										aClass92Array2549 = new Class92[anInt2566];
									}
									if (class38_sub4_230_.aClass92Array2549 == null) {
										class38_sub4_230_.aClass92Array2549 = new Class92[i_232_];
									}
									Class92 class92_239_ = aClass92Array2549[i_233_];
									if (class92_239_ == null) {
										class92_239_ = aClass92Array2549[i_233_] = new Class92(class92);
									}
									Class92 class92_240_ = class38_sub4_230_.aClass92Array2549[i_237_];
									if (class92_240_ == null) {
										class92_240_ = class38_sub4_230_.aClass92Array2549[i_237_] = new Class92(class92_238_);
									}
									class92_239_.anInt1562 += class92_238_.anInt1562;
									class92_239_.anInt1565 += class92_238_.anInt1565;
									class92_239_.anInt1572 += class92_238_.anInt1572;
									class92_239_.anInt1568 += class92_238_.anInt1568;
									class92_240_.anInt1562 += class92.anInt1562;
									class92_240_.anInt1565 += class92.anInt1565;
									class92_240_.anInt1572 += class92.anInt1572;
									class92_240_.anInt1568 += class92.anInt1568;
									i_231_++;
									anIntArray2542[i_233_] = anInt2548;
									anIntArray2564[i_237_] = anInt2548;
								}
							}
						}
					}
				}
			}
		}
		if (i_231_ >= 3 && bool) {
			for (int i_241_ = 0; i_241_ < anInt2523; i_241_++) {
				if (anIntArray2542[anIntArray2527[i_241_]] == anInt2548 && anIntArray2542[anIntArray2552[i_241_]] == anInt2548 && anIntArray2542[anIntArray2522[i_241_]] == anInt2548) {
					if (aByteArray2539 == null) {
						aByteArray2539 = new byte[anInt2523];
					}
					aByteArray2539[i_241_] = (byte) 2;
				}
			}
			for (int i_242_ = 0; i_242_ < class38_sub4_230_.anInt2523; i_242_++) {
				if (anIntArray2564[class38_sub4_230_.anIntArray2527[i_242_]] == anInt2548 && anIntArray2564[class38_sub4_230_.anIntArray2552[i_242_]] == anInt2548 && anIntArray2564[class38_sub4_230_.anIntArray2522[i_242_]] == anInt2548) {
					if (class38_sub4_230_.aByteArray2539 == null) {
						class38_sub4_230_.aByteArray2539 = new byte[class38_sub4_230_.anInt2523];
					}
					class38_sub4_230_.aByteArray2539[i_242_] = (byte) 2;
				}
			}
		}
	}
	
	final void method1063() {
		anIntArray2563 = null;
		anIntArray2560 = null;
		anIntArrayArray2558 = null;
		anIntArrayArray2546 = null;
	}
	
	final Class38_Sub1 method1064(int i, int i_243_, int i_244_, int i_245_, int i_246_) {
		return new Class38_Sub1_Sub1(this, i, i_243_, i_244_, i_245_, i_246_);
	}
	
	final void method1065(short s, short s_247_) {
		for (int i = 0; i < anInt2523; i++) {
			if (aShortArray2532[i] == s) {
				aShortArray2532[i] = s_247_;
			}
		}
	}
	
	final void method1066() {
		if (aClass92Array2541 == null) {
			aClass92Array2541 = new Class92[anInt2566];
			for (int i = 0; i < anInt2566; i++)
				aClass92Array2541[i] = new Class92();
			for (int i = 0; i < anInt2523; i++) {
				int i_248_ = anIntArray2527[i];
				int i_249_ = anIntArray2552[i];
				int i_250_ = anIntArray2522[i];
				int i_251_ = anIntArray2553[i_249_] - anIntArray2553[i_248_];
				int i_252_ = anIntArray2545[i_249_] - anIntArray2545[i_248_];
				int i_253_ = anIntArray2561[i_249_] - anIntArray2561[i_248_];
				int i_254_ = anIntArray2553[i_250_] - anIntArray2553[i_248_];
				int i_255_ = anIntArray2545[i_250_] - anIntArray2545[i_248_];
				int i_256_ = anIntArray2561[i_250_] - anIntArray2561[i_248_];
				int i_257_ = i_252_ * i_256_ - i_255_ * i_253_;
				int i_258_ = i_253_ * i_254_ - i_256_ * i_251_;
				int i_259_;
				for (i_259_ = i_251_ * i_255_ - i_254_ * i_252_; i_257_ > 8192 || i_258_ > 8192 || i_259_ > 8192 || i_257_ < -8192 || i_258_ < -8192 || i_259_ < -8192; i_259_ >>= 1) {
					i_257_ >>= 1;
					i_258_ >>= 1;
				}
				int i_260_ = (int) Math.sqrt((double) (i_257_ * i_257_ + i_258_ * i_258_ + i_259_ * i_259_));
				if (i_260_ <= 0) {
					i_260_ = 1;
				}
				i_257_ = i_257_ * 256 / i_260_;
				i_258_ = i_258_ * 256 / i_260_;
				i_259_ = i_259_ * 256 / i_260_;
				byte b;
				if (aByteArray2539 == null) {
					b = (byte) 0;
				} else {
					b = aByteArray2539[i];
				}
				if (b == 0) {
					Class92 class92 = aClass92Array2541[i_248_];
					class92.anInt1562 += i_257_;
					class92.anInt1565 += i_258_;
					class92.anInt1572 += i_259_;
					class92.anInt1568++;
					class92 = aClass92Array2541[i_249_];
					class92.anInt1562 += i_257_;
					class92.anInt1565 += i_258_;
					class92.anInt1572 += i_259_;
					class92.anInt1568++;
					class92 = aClass92Array2541[i_250_];
					class92.anInt1562 += i_257_;
					class92.anInt1565 += i_258_;
					class92.anInt1572 += i_259_;
					class92.anInt1568++;
				} else if (b == 1) {
					if (aClass40Array2550 == null) {
						aClass40Array2550 = new Class40[anInt2523];
					}
					Class40 class40 = aClass40Array2550[i] = new Class40();
					class40.anInt627 = i_257_;
					class40.anInt621 = i_258_;
					class40.anInt622 = i_259_;
				}
			}
		}
	}
	
	private Class38_Sub4() {
		anInt2523 = 0;
		anInt2566 = 0;
		aBoolean2567 = false;
	}
	
	private Class38_Sub4(byte[] bs) {
		anInt2523 = 0;
		anInt2566 = 0;
		aBoolean2567 = false;
		if (bs[bs.length - 1] == -1 && bs[bs.length - 2] == -1) {
			method1041(bs);
		} else {
			method1067(bs);
		}
	}
	
	Class38_Sub4(Class38_Sub4[] class38_sub4s, int i) {
		anInt2523 = 0;
		anInt2566 = 0;
		aBoolean2567 = false;
		boolean bool = false;
		boolean bool_261_ = false;
		boolean bool_262_ = false;
		boolean bool_263_ = false;
		boolean bool_264_ = false;
		boolean bool_265_ = false;
		anInt2566 = 0;
		anInt2523 = 0;
		anInt2521 = 0;
		aByte2533 = (byte) -1;
		for (int i_266_ = 0; i_266_ < i; i_266_++) {
			Class38_Sub4 class38_sub4_267_ = class38_sub4s[i_266_];
			if (class38_sub4_267_ != null) {
				anInt2566 += class38_sub4_267_.anInt2566;
				anInt2523 += class38_sub4_267_.anInt2523;
				anInt2521 += class38_sub4_267_.anInt2521;
				if (class38_sub4_267_.aByteArray2559 != null) {
					bool_261_ = true;
				} else {
					if (aByte2533 == -1) {
						aByte2533 = class38_sub4_267_.aByte2533;
					}
					if (aByte2533 != class38_sub4_267_.aByte2533) {
						bool_261_ = true;
					}
				}
				bool = bool | class38_sub4_267_.aByteArray2539 != null;
				bool_262_ = bool_262_ | class38_sub4_267_.aByteArray2528 != null;
				bool_263_ = bool_263_ | class38_sub4_267_.anIntArray2560 != null;
				bool_264_ = bool_264_ | class38_sub4_267_.aShortArray2562 != null;
				bool_265_ = bool_265_ | class38_sub4_267_.aByteArray2536 != null;
			}
		}
		anIntArray2553 = new int[anInt2566];
		anIntArray2545 = new int[anInt2566];
		anIntArray2561 = new int[anInt2566];
		anIntArray2563 = new int[anInt2566];
		anIntArray2527 = new int[anInt2523];
		anIntArray2552 = new int[anInt2523];
		anIntArray2522 = new int[anInt2523];
		if (bool) {
			aByteArray2539 = new byte[anInt2523];
		}
		if (bool_261_) {
			aByteArray2559 = new byte[anInt2523];
		}
		if (bool_262_) {
			aByteArray2528 = new byte[anInt2523];
		}
		if (bool_263_) {
			anIntArray2560 = new int[anInt2523];
		}
		if (bool_264_) {
			aShortArray2562 = new short[anInt2523];
		}
		if (bool_265_) {
			aByteArray2536 = new byte[anInt2523];
		}
		aShortArray2532 = new short[anInt2523];
		if (anInt2521 > 0) {
			aByteArray2557 = new byte[anInt2521];
			aShortArray2529 = new short[anInt2521];
			aShortArray2540 = new short[anInt2521];
			aShortArray2551 = new short[anInt2521];
			aShortArray2535 = new short[anInt2521];
			aShortArray2526 = new short[anInt2521];
			aShortArray2543 = new short[anInt2521];
			aByteArray2531 = new byte[anInt2521];
			aByteArray2519 = new byte[anInt2521];
			aByteArray2530 = new byte[anInt2521];
			aByteArray2525 = new byte[anInt2521];
			aByteArray2547 = new byte[anInt2521];
		}
		anInt2566 = 0;
		anInt2523 = 0;
		anInt2521 = 0;
		for (int i_268_ = 0; i_268_ < i; i_268_++) {
			Class38_Sub4 class38_sub4_269_ = class38_sub4s[i_268_];
			if (class38_sub4_269_ != null) {
				for (int i_270_ = 0; i_270_ < class38_sub4_269_.anInt2523; i_270_++) {
					if (bool && class38_sub4_269_.aByteArray2539 != null) {
						aByteArray2539[anInt2523] = class38_sub4_269_.aByteArray2539[i_270_];
					}
					if (bool_261_) {
						if (class38_sub4_269_.aByteArray2559 != null) {
							aByteArray2559[anInt2523] = class38_sub4_269_.aByteArray2559[i_270_];
						} else {
							aByteArray2559[anInt2523] = class38_sub4_269_.aByte2533;
						}
					}
					if (bool_262_ && class38_sub4_269_.aByteArray2528 != null) {
						aByteArray2528[anInt2523] = class38_sub4_269_.aByteArray2528[i_270_];
					}
					if (bool_263_ && class38_sub4_269_.anIntArray2560 != null) {
						anIntArray2560[anInt2523] = class38_sub4_269_.anIntArray2560[i_270_];
					}
					if (bool_264_) {
						if (class38_sub4_269_.aShortArray2562 != null) {
							aShortArray2562[anInt2523] = class38_sub4_269_.aShortArray2562[i_270_];
						} else {
							aShortArray2562[anInt2523] = (short) -1;
						}
					}
					if (bool_265_) {
						if (class38_sub4_269_.aByteArray2536 != null && class38_sub4_269_.aByteArray2536[i_270_] != -1) {
							aByteArray2536[anInt2523] = (byte) (class38_sub4_269_.aByteArray2536[i_270_] + anInt2521);
						} else {
							aByteArray2536[anInt2523] = (byte) -1;
						}
					}
					aShortArray2532[anInt2523] = class38_sub4_269_.aShortArray2532[i_270_];
					anIntArray2527[anInt2523] = method1062(class38_sub4_269_, class38_sub4_269_.anIntArray2527[i_270_]);
					anIntArray2552[anInt2523] = method1062(class38_sub4_269_, class38_sub4_269_.anIntArray2552[i_270_]);
					anIntArray2522[anInt2523] = method1062(class38_sub4_269_, class38_sub4_269_.anIntArray2522[i_270_]);
					anInt2523++;
				}
				for (int i_271_ = 0; i_271_ < class38_sub4_269_.anInt2521; i_271_++) {
					byte b = aByteArray2557[anInt2521] = class38_sub4_269_.aByteArray2557[i_271_];
					if (b == 0) {
						aShortArray2529[anInt2521] = (short) method1062(class38_sub4_269_, class38_sub4_269_.aShortArray2529[i_271_]);
						aShortArray2540[anInt2521] = (short) method1062(class38_sub4_269_, class38_sub4_269_.aShortArray2540[i_271_]);
						aShortArray2551[anInt2521] = (short) method1062(class38_sub4_269_, class38_sub4_269_.aShortArray2551[i_271_]);
					}
					if (b >= 1 && b <= 3) {
						aShortArray2529[anInt2521] = class38_sub4_269_.aShortArray2529[i_271_];
						aShortArray2540[anInt2521] = class38_sub4_269_.aShortArray2540[i_271_];
						aShortArray2551[anInt2521] = class38_sub4_269_.aShortArray2551[i_271_];
						aShortArray2535[anInt2521] = class38_sub4_269_.aShortArray2535[i_271_];
						aShortArray2526[anInt2521] = class38_sub4_269_.aShortArray2526[i_271_];
						aShortArray2543[anInt2521] = class38_sub4_269_.aShortArray2543[i_271_];
						aByteArray2531[anInt2521] = class38_sub4_269_.aByteArray2531[i_271_];
						aByteArray2519[anInt2521] = class38_sub4_269_.aByteArray2519[i_271_];
						aByteArray2530[anInt2521] = class38_sub4_269_.aByteArray2530[i_271_];
					}
					if (b == 2) {
						aByteArray2525[anInt2521] = class38_sub4_269_.aByteArray2525[i_271_];
						aByteArray2547[anInt2521] = class38_sub4_269_.aByteArray2547[i_271_];
					}
					anInt2521++;
				}
			}
		}
	}
	
	Class38_Sub4(Class38_Sub4 class38_sub4_272_, boolean bool, boolean bool_273_, boolean bool_274_, boolean bool_275_) {
		anInt2523 = 0;
		anInt2566 = 0;
		aBoolean2567 = false;
		anInt2566 = class38_sub4_272_.anInt2566;
		anInt2523 = class38_sub4_272_.anInt2523;
		anInt2521 = class38_sub4_272_.anInt2521;
		if (bool) {
			anIntArray2553 = class38_sub4_272_.anIntArray2553;
			anIntArray2545 = class38_sub4_272_.anIntArray2545;
			anIntArray2561 = class38_sub4_272_.anIntArray2561;
		} else {
			anIntArray2553 = new int[anInt2566];
			anIntArray2545 = new int[anInt2566];
			anIntArray2561 = new int[anInt2566];
			for (int i = 0; i < anInt2566; i++) {
				anIntArray2553[i] = class38_sub4_272_.anIntArray2553[i];
				anIntArray2545[i] = class38_sub4_272_.anIntArray2545[i];
				anIntArray2561[i] = class38_sub4_272_.anIntArray2561[i];
			}
		}
		if (bool_273_) {
			aShortArray2532 = class38_sub4_272_.aShortArray2532;
		} else {
			aShortArray2532 = new short[anInt2523];
			for (int i = 0; i < anInt2523; i++)
				aShortArray2532[i] = class38_sub4_272_.aShortArray2532[i];
		}
		if (bool_274_ || class38_sub4_272_.aShortArray2562 == null) {
			aShortArray2562 = class38_sub4_272_.aShortArray2562;
		} else {
			aShortArray2562 = new short[anInt2523];
			for (int i = 0; i < anInt2523; i++)
				aShortArray2562[i] = class38_sub4_272_.aShortArray2562[i];
		}
		if (bool_275_) {
			aByteArray2528 = class38_sub4_272_.aByteArray2528;
		} else {
			aByteArray2528 = new byte[anInt2523];
			if (class38_sub4_272_.aByteArray2528 == null) {
				for (int i = 0; i < anInt2523; i++)
					aByteArray2528[i] = (byte) 0;
			} else {
				for (int i = 0; i < anInt2523; i++)
					aByteArray2528[i] = class38_sub4_272_.aByteArray2528[i];
			}
		}
		anIntArray2527 = class38_sub4_272_.anIntArray2527;
		anIntArray2552 = class38_sub4_272_.anIntArray2552;
		anIntArray2522 = class38_sub4_272_.anIntArray2522;
		aByteArray2539 = class38_sub4_272_.aByteArray2539;
		aByteArray2559 = class38_sub4_272_.aByteArray2559;
		aByteArray2536 = class38_sub4_272_.aByteArray2536;
		aByte2533 = class38_sub4_272_.aByte2533;
		aByteArray2557 = class38_sub4_272_.aByteArray2557;
		aShortArray2529 = class38_sub4_272_.aShortArray2529;
		aShortArray2540 = class38_sub4_272_.aShortArray2540;
		aShortArray2551 = class38_sub4_272_.aShortArray2551;
		aShortArray2535 = class38_sub4_272_.aShortArray2535;
		aShortArray2526 = class38_sub4_272_.aShortArray2526;
		aShortArray2543 = class38_sub4_272_.aShortArray2543;
		aByteArray2531 = class38_sub4_272_.aByteArray2531;
		aByteArray2519 = class38_sub4_272_.aByteArray2519;
		aByteArray2530 = class38_sub4_272_.aByteArray2530;
		aByteArray2525 = class38_sub4_272_.aByteArray2525;
		aByteArray2547 = class38_sub4_272_.aByteArray2547;
		anIntArray2563 = class38_sub4_272_.anIntArray2563;
		anIntArray2560 = class38_sub4_272_.anIntArray2560;
		anIntArrayArray2558 = class38_sub4_272_.anIntArrayArray2558;
		anIntArrayArray2546 = class38_sub4_272_.anIntArrayArray2546;
		aClass92Array2541 = class38_sub4_272_.aClass92Array2541;
		aClass40Array2550 = class38_sub4_272_.aClass40Array2550;
		aClass92Array2549 = class38_sub4_272_.aClass92Array2549;
		aShort2555 = class38_sub4_272_.aShort2555;
		aShort2524 = class38_sub4_272_.aShort2524;
	}
	
	private final void method1067(byte[] bs) {
		boolean bool = false;
		boolean bool_276_ = false;
		Buffer class23_sub5 = new Buffer(bs);
		Buffer class23_sub5_277_ = new Buffer(bs);
		Buffer class23_sub5_278_ = new Buffer(bs);
		Buffer class23_sub5_279_ = new Buffer(bs);
		Buffer class23_sub5_280_ = new Buffer(bs);
		class23_sub5.position = bs.length - 18;
		int i = class23_sub5.method476((byte) -121);
		int i_281_ = class23_sub5.method476((byte) -120);
		int i_282_ = class23_sub5.method461(-1797813752);
		int i_283_ = class23_sub5.method461(-1797813752);
		int i_284_ = class23_sub5.method461(-1797813752);
		int i_285_ = class23_sub5.method461(-1797813752);
		int i_286_ = class23_sub5.method461(-1797813752);
		int i_287_ = class23_sub5.method461(-1797813752);
		int i_288_ = class23_sub5.method476((byte) -110);
		int i_289_ = class23_sub5.method476((byte) -119);
		int i_290_ = class23_sub5.method476((byte) -117);
		int i_291_ = class23_sub5.method476((byte) -99);
		int i_292_ = 0;
		int i_293_ = i_292_;
		i_292_ += i;
		int i_294_ = i_292_;
		i_292_ += i_281_;
		int i_295_ = i_292_;
		if (i_284_ == 255) {
			i_292_ += i_281_;
		}
		int i_296_ = i_292_;
		if (i_286_ == 1) {
			i_292_ += i_281_;
		}
		int i_297_ = i_292_;
		if (i_283_ == 1) {
			i_292_ += i_281_;
		}
		int i_298_ = i_292_;
		if (i_287_ == 1) {
			i_292_ += i;
		}
		int i_299_ = i_292_;
		if (i_285_ == 1) {
			i_292_ += i_281_;
		}
		int i_300_ = i_292_;
		i_292_ += i_291_;
		int i_301_ = i_292_;
		i_292_ += i_281_ * 2;
		int i_302_ = i_292_;
		i_292_ += i_282_ * 6;
		int i_303_ = i_292_;
		i_292_ += i_288_;
		int i_304_ = i_292_;
		i_292_ += i_289_;
		int i_305_ = i_292_;
		i_292_ += i_290_;
		anInt2566 = i;
		anInt2523 = i_281_;
		anInt2521 = i_282_;
		anIntArray2553 = new int[i];
		anIntArray2545 = new int[i];
		anIntArray2561 = new int[i];
		anIntArray2527 = new int[i_281_];
		anIntArray2552 = new int[i_281_];
		anIntArray2522 = new int[i_281_];
		if (i_282_ > 0) {
			aByteArray2557 = new byte[i_282_];
			aShortArray2529 = new short[i_282_];
			aShortArray2540 = new short[i_282_];
			aShortArray2551 = new short[i_282_];
		}
		if (i_287_ == 1) {
			anIntArray2563 = new int[i];
		}
		if (i_283_ == 1) {
			aByteArray2539 = new byte[i_281_];
			aByteArray2536 = new byte[i_281_];
			aShortArray2562 = new short[i_281_];
		}
		if (i_284_ == 255) {
			aByteArray2559 = new byte[i_281_];
		} else {
			aByte2533 = (byte) i_284_;
		}
		if (i_285_ == 1) {
			aByteArray2528 = new byte[i_281_];
		}
		if (i_286_ == 1) {
			anIntArray2560 = new int[i_281_];
		}
		aShortArray2532 = new short[i_281_];
		class23_sub5.position = i_293_;
		class23_sub5_277_.position = i_303_;
		class23_sub5_278_.position = i_304_;
		class23_sub5_279_.position = i_305_;
		class23_sub5_280_.position = i_298_;
		int i_306_ = 0;
		int i_307_ = 0;
		int i_308_ = 0;
		for (int i_309_ = 0; i_309_ < i; i_309_++) {
			int i_310_ = class23_sub5.method461(-1797813752);
			int i_311_ = 0;
			if ((i_310_ & 0x1) != 0) {
				i_311_ = class23_sub5_277_.method459(true);
			}
			int i_312_ = 0;
			if ((i_310_ & 0x2) != 0) {
				i_312_ = class23_sub5_278_.method459(true);
			}
			int i_313_ = 0;
			if ((i_310_ & 0x4) != 0) {
				i_313_ = class23_sub5_279_.method459(true);
			}
			anIntArray2553[i_309_] = i_306_ + i_311_;
			anIntArray2545[i_309_] = i_307_ + i_312_;
			anIntArray2561[i_309_] = i_308_ + i_313_;
			i_306_ = anIntArray2553[i_309_];
			i_307_ = anIntArray2545[i_309_];
			i_308_ = anIntArray2561[i_309_];
			if (i_287_ == 1) {
				anIntArray2563[i_309_] = class23_sub5_280_.method461(-1797813752);
			}
		}
		class23_sub5.position = i_301_;
		class23_sub5_277_.position = i_297_;
		class23_sub5_278_.position = i_295_;
		class23_sub5_279_.position = i_299_;
		class23_sub5_280_.position = i_296_;
		for (int i_314_ = 0; i_314_ < i_281_; i_314_++) {
			aShortArray2532[i_314_] = (short) class23_sub5.method476((byte) -100);
			if (i_283_ == 1) {
				int i_315_ = class23_sub5_277_.method461(-1797813752);
				if ((i_315_ & 0x1) == 1) {
					aByteArray2539[i_314_] = (byte) 1;
					bool = true;
				} else {
					aByteArray2539[i_314_] = (byte) 0;
				}
				if ((i_315_ & 0x2) == 2) {
					aByteArray2536[i_314_] = (byte) (i_315_ >> 2);
					aShortArray2562[i_314_] = aShortArray2532[i_314_];
					aShortArray2532[i_314_] = (short) 127;
					if (aShortArray2562[i_314_] != -1) {
						bool_276_ = true;
					}
				} else {
					aByteArray2536[i_314_] = (byte) -1;
					aShortArray2562[i_314_] = (short) -1;
				}
			}
			if (i_284_ == 255) {
				aByteArray2559[i_314_] = class23_sub5_278_.method452(-16933672);
			}
			if (i_285_ == 1) {
				aByteArray2528[i_314_] = class23_sub5_279_.method452(-16933672);
			}
			if (i_286_ == 1) {
				anIntArray2560[i_314_] = class23_sub5_280_.method461(-1797813752);
			}
		}
		class23_sub5.position = i_300_;
		class23_sub5_277_.position = i_294_;
		int i_316_ = 0;
		int i_317_ = 0;
		int i_318_ = 0;
		int i_319_ = 0;
		for (int i_320_ = 0; i_320_ < i_281_; i_320_++) {
			int i_321_ = class23_sub5_277_.method461(-1797813752);
			if (i_321_ == 1) {
				i_316_ = class23_sub5.method459(true) + i_319_;
				i_319_ = i_316_;
				i_317_ = class23_sub5.method459(true) + i_319_;
				i_319_ = i_317_;
				i_318_ = class23_sub5.method459(true) + i_319_;
				i_319_ = i_318_;
				anIntArray2527[i_320_] = i_316_;
				anIntArray2552[i_320_] = i_317_;
				anIntArray2522[i_320_] = i_318_;
			}
			if (i_321_ == 2) {
				i_317_ = i_318_;
				i_318_ = class23_sub5.method459(true) + i_319_;
				i_319_ = i_318_;
				anIntArray2527[i_320_] = i_316_;
				anIntArray2552[i_320_] = i_317_;
				anIntArray2522[i_320_] = i_318_;
			}
			if (i_321_ == 3) {
				i_316_ = i_318_;
				i_318_ = class23_sub5.method459(true) + i_319_;
				i_319_ = i_318_;
				anIntArray2527[i_320_] = i_316_;
				anIntArray2552[i_320_] = i_317_;
				anIntArray2522[i_320_] = i_318_;
			}
			if (i_321_ == 4) {
				int i_322_ = i_316_;
				i_316_ = i_317_;
				i_317_ = i_322_;
				i_318_ = class23_sub5.method459(true) + i_319_;
				i_319_ = i_318_;
				anIntArray2527[i_320_] = i_316_;
				anIntArray2552[i_320_] = i_317_;
				anIntArray2522[i_320_] = i_318_;
			}
		}
		class23_sub5.position = i_302_;
		for (int i_323_ = 0; i_323_ < i_282_; i_323_++) {
			aByteArray2557[i_323_] = (byte) 0;
			aShortArray2529[i_323_] = (short) class23_sub5.method476((byte) -111);
			aShortArray2540[i_323_] = (short) class23_sub5.method476((byte) -124);
			aShortArray2551[i_323_] = (short) class23_sub5.method476((byte) -108);
		}
		if (aByteArray2536 != null) {
			boolean bool_324_ = false;
			for (int i_325_ = 0; i_325_ < i_281_; i_325_++) {
				int i_326_ = aByteArray2536[i_325_] & 0xff;
				if (i_326_ != 255) {
					if ((aShortArray2529[i_326_] & 0xffff) == anIntArray2527[i_325_] && (aShortArray2540[i_326_] & 0xffff) == anIntArray2552[i_325_] && (aShortArray2551[i_326_] & 0xffff) == anIntArray2522[i_325_]) {
						aByteArray2536[i_325_] = (byte) -1;
					} else {
						bool_324_ = true;
					}
				}
			}
			if (!bool_324_) {
				aByteArray2536 = null;
			}
		}
		if (!bool_276_) {
			aShortArray2562 = null;
		}
		if (!bool) {
			aByteArray2539 = null;
		}
	}
	
	static {
		anIntArray2564 = new int[10000];
	}
}
