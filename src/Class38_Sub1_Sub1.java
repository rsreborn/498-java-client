/* Class38_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38_Sub1_Sub1 extends Class38_Sub1
{
	protected int[] anIntArray4308;
	protected int[] anIntArray4309;
	private byte[] aByteArray4310;
	private byte[] aByteArray4311;
	protected int anInt4312 = 0;
	private short aShort4313;
	private int[] anIntArray4314;
	private int anInt4315;
	private int[] anIntArray4316;
	private short aShort4317;
	private int[] anIntArray4318;
	private int[] anIntArray4319;
	private int[][] anIntArrayArray4320;
	protected boolean aBoolean4321 = false;
	private short aShort4322;
	private byte[] aByteArray4323;
	private int[][] anIntArrayArray4324;
	private short aShort4325;
	private short aShort4326;
	private static Class38_Sub1_Sub1 aClass38_Sub1_Sub1_4327 = new Class38_Sub1_Sub1();
	private int[] anIntArray4328;
	private int anInt4329;
	protected int[] anIntArray4330;
	private static Class38_Sub1_Sub1 aClass38_Sub1_Sub1_4331;
	private int[] anIntArray4332;
	private int[] anIntArray4333;
	private byte aByte4334 = 0;
	private short[] aShortArray4335;
	private static byte[] aByteArray4336 = new byte[1];
	private int[] anIntArray4337;
	private short aShort4338;
	private int[] anIntArray4339;
	private short aShort4340;
	private short aShort4341;
	private static int anInt4342;
	private static int anInt4343;
	private static int[][] anIntArrayArray4344;
	private static int[] anIntArray4345;
	private static int[] anIntArray4346;
	private static int[] anIntArray4347;
	private static boolean[] aBooleanArray4348;
	private static int[] anIntArray4349;
	private static int[] anIntArray4350;
	private static int anInt4351;
	private static int[] anIntArray4352;
	private static boolean[] aBooleanArray4353;
	private static int[] anIntArray4354;
	private static int[] anIntArray4355;
	private static int[][] anIntArrayArray4356;
	private static int[] anIntArray4357;
	private static int[] anIntArray4358;
	private static int[] anIntArray4359;
	private static int[] anIntArray4360;
	private static int[] anIntArray4361;
	private static int[] anIntArray4362;
	private static byte[] aByteArray4363;
	
	final int method1012() {
		if (!aBoolean4321) {
			method1029();
		}
		return aShort4341;
	}
	
	private final Class38_Sub1 method1021(boolean bool, Class38_Sub1_Sub1 class38_sub1_sub1_0_, byte[] bs) {
		class38_sub1_sub1_0_.anInt4312 = anInt4312;
		class38_sub1_sub1_0_.anInt4329 = anInt4329;
		class38_sub1_sub1_0_.anInt4315 = anInt4315;
		if (class38_sub1_sub1_0_.anIntArray4330 == null || class38_sub1_sub1_0_.anIntArray4330.length < anInt4312) {
			class38_sub1_sub1_0_.anIntArray4330 = new int[anInt4312 + 100];
			class38_sub1_sub1_0_.anIntArray4308 = new int[anInt4312 + 100];
			class38_sub1_sub1_0_.anIntArray4309 = new int[anInt4312 + 100];
		}
		for (int i = 0; i < anInt4312; i++) {
			class38_sub1_sub1_0_.anIntArray4330[i] = anIntArray4330[i];
			class38_sub1_sub1_0_.anIntArray4308[i] = anIntArray4308[i];
			class38_sub1_sub1_0_.anIntArray4309[i] = anIntArray4309[i];
		}
		if (bool) {
			class38_sub1_sub1_0_.aByteArray4323 = aByteArray4323;
		} else {
			class38_sub1_sub1_0_.aByteArray4323 = bs;
			if (aByteArray4323 == null) {
				for (int i = 0; i < anInt4329; i++)
					class38_sub1_sub1_0_.aByteArray4323[i] = (byte) 0;
			} else {
				for (int i = 0; i < anInt4329; i++)
					class38_sub1_sub1_0_.aByteArray4323[i] = aByteArray4323[i];
			}
		}
		class38_sub1_sub1_0_.anIntArray4319 = anIntArray4319;
		class38_sub1_sub1_0_.anIntArray4332 = anIntArray4332;
		class38_sub1_sub1_0_.anIntArray4337 = anIntArray4337;
		class38_sub1_sub1_0_.anIntArray4316 = anIntArray4316;
		class38_sub1_sub1_0_.anIntArray4318 = anIntArray4318;
		class38_sub1_sub1_0_.anIntArray4328 = anIntArray4328;
		class38_sub1_sub1_0_.aByteArray4310 = aByteArray4310;
		class38_sub1_sub1_0_.aByteArray4311 = aByteArray4311;
		class38_sub1_sub1_0_.aShortArray4335 = aShortArray4335;
		class38_sub1_sub1_0_.aByte4334 = aByte4334;
		class38_sub1_sub1_0_.anIntArray4333 = anIntArray4333;
		class38_sub1_sub1_0_.anIntArray4314 = anIntArray4314;
		class38_sub1_sub1_0_.anIntArray4339 = anIntArray4339;
		class38_sub1_sub1_0_.anIntArrayArray4320 = anIntArrayArray4320;
		class38_sub1_sub1_0_.anIntArrayArray4324 = anIntArrayArray4324;
		class38_sub1_sub1_0_.aBoolean2489 = aBoolean2489;
		class38_sub1_sub1_0_.aBoolean4321 = false;
		return class38_sub1_sub1_0_;
	}
	
	private final void method1022(int i, int[] is, int i_1_, int i_2_, int i_3_) {
		int i_4_ = is.length;
		if (i == 0) {
			int i_5_ = 0;
			anInt4351 = 0;
			anInt4342 = 0;
			anInt4343 = 0;
			for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
				int i_7_ = is[i_6_];
				if (i_7_ < anIntArrayArray4320.length) {
					int[] is_8_ = anIntArrayArray4320[i_7_];
					for (int i_9_ = 0; i_9_ < is_8_.length; i_9_++) {
						int i_10_ = is_8_[i_9_];
						anInt4351 += anIntArray4330[i_10_];
						anInt4342 += anIntArray4308[i_10_];
						anInt4343 += anIntArray4309[i_10_];
						i_5_++;
					}
				}
			}
			if (i_5_ > 0) {
				anInt4351 = anInt4351 / i_5_ + i_1_;
				anInt4342 = anInt4342 / i_5_ + i_2_;
				anInt4343 = anInt4343 / i_5_ + i_3_;
			} else {
				anInt4351 = i_1_;
				anInt4342 = i_2_;
				anInt4343 = i_3_;
			}
		} else if (i == 1) {
			for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
				int i_12_ = is[i_11_];
				if (i_12_ < anIntArrayArray4320.length) {
					int[] is_13_ = anIntArrayArray4320[i_12_];
					for (int i_14_ = 0; i_14_ < is_13_.length; i_14_++) {
						int i_15_ = is_13_[i_14_];
						anIntArray4330[i_15_] += i_1_;
						anIntArray4308[i_15_] += i_2_;
						anIntArray4309[i_15_] += i_3_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_16_ = 0; i_16_ < i_4_; i_16_++) {
				int i_17_ = is[i_16_];
				if (i_17_ < anIntArrayArray4320.length) {
					int[] is_18_ = anIntArrayArray4320[i_17_];
					for (int i_19_ = 0; i_19_ < is_18_.length; i_19_++) {
						int i_20_ = is_18_[i_19_];
						anIntArray4330[i_20_] -= anInt4351;
						anIntArray4308[i_20_] -= anInt4342;
						anIntArray4309[i_20_] -= anInt4343;
						if (i_3_ != 0) {
							int i_21_ = Class76.anIntArray1386[i_3_];
							int i_22_ = Class76.anIntArray1395[i_3_];
							int i_23_ = anIntArray4308[i_20_] * i_21_ + anIntArray4330[i_20_] * i_22_ + 32767 >> 16;
							anIntArray4308[i_20_] = anIntArray4308[i_20_] * i_22_ - anIntArray4330[i_20_] * i_21_ + 32767 >> 16;
							anIntArray4330[i_20_] = i_23_;
						}
						if (i_1_ != 0) {
							int i_24_ = Class76.anIntArray1386[i_1_];
							int i_25_ = Class76.anIntArray1395[i_1_];
							int i_26_ = anIntArray4308[i_20_] * i_25_ - anIntArray4309[i_20_] * i_24_ + 32767 >> 16;
							anIntArray4309[i_20_] = anIntArray4308[i_20_] * i_24_ + anIntArray4309[i_20_] * i_25_ + 32767 >> 16;
							anIntArray4308[i_20_] = i_26_;
						}
						if (i_2_ != 0) {
							int i_27_ = Class76.anIntArray1386[i_2_];
							int i_28_ = Class76.anIntArray1395[i_2_];
							int i_29_ = anIntArray4309[i_20_] * i_27_ + anIntArray4330[i_20_] * i_28_ + 32767 >> 16;
							anIntArray4309[i_20_] = anIntArray4309[i_20_] * i_28_ - anIntArray4330[i_20_] * i_27_ + 32767 >> 16;
							anIntArray4330[i_20_] = i_29_;
						}
						anIntArray4330[i_20_] += anInt4351;
						anIntArray4308[i_20_] += anInt4342;
						anIntArray4309[i_20_] += anInt4343;
					}
				}
			}
		} else if (i == 3) {
			for (int i_30_ = 0; i_30_ < i_4_; i_30_++) {
				int i_31_ = is[i_30_];
				if (i_31_ < anIntArrayArray4320.length) {
					int[] is_32_ = anIntArrayArray4320[i_31_];
					for (int i_33_ = 0; i_33_ < is_32_.length; i_33_++) {
						int i_34_ = is_32_[i_33_];
						anIntArray4330[i_34_] -= anInt4351;
						anIntArray4308[i_34_] -= anInt4342;
						anIntArray4309[i_34_] -= anInt4343;
						anIntArray4330[i_34_] = anIntArray4330[i_34_] * i_1_ / 128;
						anIntArray4308[i_34_] = anIntArray4308[i_34_] * i_2_ / 128;
						anIntArray4309[i_34_] = anIntArray4309[i_34_] * i_3_ / 128;
						anIntArray4330[i_34_] += anInt4351;
						anIntArray4308[i_34_] += anInt4342;
						anIntArray4309[i_34_] += anInt4343;
					}
				}
			}
		} else if (i == 5 && anIntArrayArray4324 != null && aByteArray4323 != null) {
			for (int i_35_ = 0; i_35_ < i_4_; i_35_++) {
				int i_36_ = is[i_35_];
				if (i_36_ < anIntArrayArray4324.length) {
					int[] is_37_ = anIntArrayArray4324[i_36_];
					for (int i_38_ = 0; i_38_ < is_37_.length; i_38_++) {
						int i_39_ = is_37_[i_38_];
						int i_40_ = (aByteArray4323[i_39_] & 0xff) + i_1_ * 8;
						if (i_40_ < 0) {
							i_40_ = 0;
						} else if (i_40_ > 255) {
							i_40_ = 255;
						}
						aByteArray4323[i_39_] = (byte) i_40_;
					}
				}
			}
		}
	}
	
	final void method1003(Class23_Sub13_Sub16 class23_sub13_sub16, int i, Class23_Sub13_Sub16 class23_sub13_sub16_41_, int i_42_, int[] is, boolean bool) {
		if (i != -1) {
			if (is == null || i_42_ == -1) {
				method1020(class23_sub13_sub16, i, bool);
			} else {
				Class15 class15 = class23_sub13_sub16.aClass15Array4042[i];
				Class15 class15_43_ = class23_sub13_sub16_41_.aClass15Array4042[i_42_];
				Class23_Sub12 class23_sub12 = class15.aClass23_Sub12_293;
				anInt4351 = 0;
				anInt4342 = 0;
				anInt4343 = 0;
				int i_44_ = 0;
				int i_45_ = is[i_44_++];
				for (int i_46_ = 0; i_46_ < class15.anInt295; i_46_++) {
					int i_47_;
					for (i_47_ = class15.aShortArray296[i_46_]; i_47_ > i_45_; i_45_ = is[i_44_++]) {
						/* empty */
					}
					if (i_47_ != i_45_ || class23_sub12.anIntArray2295[i_47_] == 0) {
						if (class15.aShortArray290[i_46_] != -1) {
							method1022(0, class23_sub12.anIntArrayArray2305[class15.aShortArray290[i_46_]], 0, 0, 0);
						}
						method1022(class23_sub12.anIntArray2295[i_47_], class23_sub12.anIntArrayArray2305[i_47_], class15.aShortArray297[i_46_], class15.aShortArray289[i_46_], class15.aShortArray298[i_46_]);
					}
				}
				anInt4351 = 0;
				anInt4342 = 0;
				anInt4343 = 0;
				i_44_ = 0;
				i_45_ = is[i_44_++];
				for (int i_48_ = 0; i_48_ < class15_43_.anInt295; i_48_++) {
					int i_49_;
					for (i_49_ = class15_43_.aShortArray296[i_48_]; i_49_ > i_45_; i_45_ = is[i_44_++]) {
						/* empty */
					}
					if (i_49_ == i_45_ || class23_sub12.anIntArray2295[i_49_] == 0) {
						if (class15_43_.aShortArray290[i_48_] != -1) {
							method1022(0, class23_sub12.anIntArrayArray2305[class15_43_.aShortArray290[i_48_]], 0, 0, 0);
						}
						method1022(class23_sub12.anIntArray2295[i_49_], class23_sub12.anIntArrayArray2305[i_49_], class15_43_.aShortArray297[i_48_], class15_43_.aShortArray289[i_48_], class15_43_.aShortArray298[i_48_]);
					}
				}
				aBoolean4321 = false;
			}
		}
	}
	
	final void method1009() {
		for (int i = 0; i < anInt4312; i++) {
			int i_50_ = anIntArray4330[i];
			anIntArray4330[i] = anIntArray4309[i];
			anIntArray4309[i] = -i_50_;
		}
		aBoolean4321 = false;
	}
	
	final int method1016() {
		if (!aBoolean4321) {
			method1029();
		}
		return aShort4326;
	}
	
	final Class38_Sub1 method1005(boolean bool, boolean bool_51_) {
		if (!bool && aByteArray4363.length < anInt4329) {
			aByteArray4363 = new byte[anInt4329 + 100];
		}
		return method1021(bool, aClass38_Sub1_Sub1_4331, aByteArray4363);
	}
	
	final int method1014() {
		if (!aBoolean4321) {
			method1029();
		}
		return aShort4340;
	}
	
	private final boolean method1023(int i, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_) {
		if (i_52_ < i_53_ && i_52_ < i_54_ && i_52_ < i_55_) {
			return false;
		}
		if (i_52_ > i_53_ && i_52_ > i_54_ && i_52_ > i_55_) {
			return false;
		}
		if (i < i_56_ && i < i_57_ && i < i_58_) {
			return false;
		}
		if (i > i_56_ && i > i_57_ && i > i_58_) {
			return false;
		}
		return true;
	}
	
	final int method999() {
		if (!aBoolean4321) {
			method1029();
		}
		return aShort4338;
	}
	
	final void method1018(int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		try {
			if (!aBoolean4321) {
				method1029();
			}
			int i_65_ = Class76.anInt1383;
			int i_66_ = Class76.anInt1392;
			int i_67_ = Class76.anIntArray1386[i];
			int i_68_ = Class76.anIntArray1395[i];
			int i_69_ = Class76.anIntArray1386[i_59_];
			int i_70_ = Class76.anIntArray1395[i_59_];
			int i_71_ = Class76.anIntArray1386[i_60_];
			int i_72_ = Class76.anIntArray1395[i_60_];
			int i_73_ = Class76.anIntArray1386[i_61_];
			int i_74_ = Class76.anIntArray1395[i_61_];
			int i_75_ = i_63_ * i_73_ + i_64_ * i_74_ >> 16;
			for (int i_76_ = 0; i_76_ < anInt4312; i_76_++) {
				int i_77_ = anIntArray4330[i_76_];
				int i_78_ = anIntArray4308[i_76_];
				int i_79_ = anIntArray4309[i_76_];
				if (i_60_ != 0) {
					int i_80_ = i_78_ * i_71_ + i_77_ * i_72_ >> 16;
					i_78_ = i_78_ * i_72_ - i_77_ * i_71_ >> 16;
					i_77_ = i_80_;
				}
				if (i != 0) {
					int i_81_ = i_78_ * i_68_ - i_79_ * i_67_ >> 16;
					i_79_ = i_78_ * i_67_ + i_79_ * i_68_ >> 16;
					i_78_ = i_81_;
				}
				if (i_59_ != 0) {
					int i_82_ = i_79_ * i_69_ + i_77_ * i_70_ >> 16;
					i_79_ = i_79_ * i_70_ - i_77_ * i_69_ >> 16;
					i_77_ = i_82_;
				}
				i_77_ += i_62_;
				i_78_ += i_63_;
				i_79_ += i_64_;
				int i_83_ = i_78_ * i_74_ - i_79_ * i_73_ >> 16;
				i_79_ = i_78_ * i_73_ + i_79_ * i_74_ >> 16;
				i_78_ = i_83_;
				anIntArray4349[i_76_] = i_79_ - i_75_;
				anIntArray4358[i_76_] = i_65_ + (i_77_ << 9) / i_79_;
				anIntArray4352[i_76_] = i_66_ + (i_78_ << 9) / i_79_;
				if (anInt4315 > 0) {
					anIntArray4354[i_76_] = i_77_;
					anIntArray4355[i_76_] = i_78_;
					anIntArray4359[i_76_] = i_79_;
				}
			}
			method1033(false, false, 0L, aShort4317, aShort4317 << 1);
		} catch (RuntimeException runtimeexception) {
			/* empty */
		}
	}
	
	final Class38_Sub1 method1024(Class38_Sub1 class38_sub1) {
		return new Class38_Sub1_Sub1(new Class38_Sub1_Sub1[] { this, (Class38_Sub1_Sub1) class38_sub1 }, 2);
	}
	
	final int method1010() {
		if (!aBoolean4321) {
			method1029();
		}
		return aShort4325;
	}
	
	final void method1025(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_) {
		try {
			if (!aBoolean4321) {
				method1029();
			}
			int i_91_ = Class76.anInt1383;
			int i_92_ = Class76.anInt1392;
			int i_93_ = Class76.anIntArray1386[i];
			int i_94_ = Class76.anIntArray1395[i];
			int i_95_ = Class76.anIntArray1386[i_84_];
			int i_96_ = Class76.anIntArray1395[i_84_];
			int i_97_ = Class76.anIntArray1386[i_85_];
			int i_98_ = Class76.anIntArray1395[i_85_];
			int i_99_ = Class76.anIntArray1386[i_86_];
			int i_100_ = Class76.anIntArray1395[i_86_];
			int i_101_ = i_88_ * i_99_ + i_89_ * i_100_ >> 16;
			for (int i_102_ = 0; i_102_ < anInt4312; i_102_++) {
				int i_103_ = anIntArray4330[i_102_];
				int i_104_ = anIntArray4308[i_102_];
				int i_105_ = anIntArray4309[i_102_];
				if (i_85_ != 0) {
					int i_106_ = i_104_ * i_97_ + i_103_ * i_98_ >> 16;
					i_104_ = i_104_ * i_98_ - i_103_ * i_97_ >> 16;
					i_103_ = i_106_;
				}
				if (i != 0) {
					int i_107_ = i_104_ * i_94_ - i_105_ * i_93_ >> 16;
					i_105_ = i_104_ * i_93_ + i_105_ * i_94_ >> 16;
					i_104_ = i_107_;
				}
				if (i_84_ != 0) {
					int i_108_ = i_105_ * i_95_ + i_103_ * i_96_ >> 16;
					i_105_ = i_105_ * i_96_ - i_103_ * i_95_ >> 16;
					i_103_ = i_108_;
				}
				i_103_ += i_87_;
				i_104_ += i_88_;
				i_105_ += i_89_;
				int i_109_ = i_104_ * i_100_ - i_105_ * i_99_ >> 16;
				i_105_ = i_104_ * i_99_ + i_105_ * i_100_ >> 16;
				i_104_ = i_109_;
				anIntArray4349[i_102_] = i_105_ - i_101_;
				anIntArray4358[i_102_] = i_91_ + (i_103_ << 9) / i_90_;
				anIntArray4352[i_102_] = i_92_ + (i_104_ << 9) / i_90_;
				if (anInt4315 > 0) {
					anIntArray4354[i_102_] = i_103_;
					anIntArray4355[i_102_] = i_104_;
					anIntArray4359[i_102_] = i_105_;
				}
			}
			method1033(false, false, 0L, aShort4317, aShort4317 << 1);
		} catch (RuntimeException runtimeexception) {
			/* empty */
		}
	}
	
	final int method1001() {
		if (!aBoolean4321) {
			method1029();
		}
		return aShort4322;
	}
	
	private static final int method1026(int i, int i_110_) {
		i_110_ = i_110_ * (i & 0x7f) >> 7;
		if (i_110_ < 2) {
			i_110_ = 2;
		} else if (i_110_ > 126) {
			i_110_ = 126;
		}
		return (i & 0xff80) + i_110_;
	}
	
	private static final int method1027(int i) {
		if (i < 2) {
			i = 2;
		} else if (i > 126) {
			i = 126;
		}
		return i;
	}
	
	public static void method1028() {
		aClass38_Sub1_Sub1_4327 = null;
		aByteArray4336 = null;
		aClass38_Sub1_Sub1_4331 = null;
		aByteArray4363 = null;
		aBooleanArray4348 = null;
		aBooleanArray4353 = null;
		anIntArray4358 = null;
		anIntArray4352 = null;
		anIntArray4349 = null;
		anIntArray4354 = null;
		anIntArray4355 = null;
		anIntArray4359 = null;
		anIntArray4347 = null;
		anIntArrayArray4356 = null;
		anIntArray4362 = null;
		anIntArrayArray4344 = null;
		anIntArray4350 = null;
		anIntArray4361 = null;
		anIntArray4345 = null;
		anIntArray4360 = null;
		anIntArray4357 = null;
		anIntArray4346 = null;
	}
	
	final void method995(int i, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, long l) {
		if (!aBoolean4321) {
			method1029();
		}
		int i_118_ = i_117_ * i_114_ - i_115_ * i_113_ >> 16;
		int i_119_ = i_116_ * i_111_ + i_118_ * i_112_ >> 16;
		int i_120_ = i_119_ + (aShort4341 * i_112_ + aShort4313 * i_111_ >> 16);
		if (i_120_ > 50) {
			int i_121_ = i_119_ + (-aShort4341 * i_112_ + aShort4338 * i_111_ >> 16);
			if (i_121_ < 3500) {
				int i_122_ = i_117_ * i_113_ + i_115_ * i_114_ >> 16;
				int i_123_ = i_122_ + aShort4341 << 9;
				if (i_123_ / i_120_ > Class46.anInt715) {
					int i_124_ = i_122_ - aShort4341 << 9;
					if (i_124_ / i_120_ < Class21.anInt335) {
						int i_125_ = i_116_ * i_112_ - i_118_ * i_111_ >> 16;
						int i_126_ = i_125_ + (aShort4341 * i_111_ + aShort4313 * i_112_ >> 16) << 9;
						if (i_126_ / i_120_ > Class23_Sub4_Sub35.anInt3459) {
							int i_127_ = i_125_ + (-aShort4341 * i_111_ + aShort4338 * i_112_ >> 16) << 9;
							if (i_127_ / i_120_ < Class23_Sub4_Sub7.anInt3023) {
								boolean bool = false;
								boolean bool_128_ = i_121_ <= 50;
								boolean bool_129_ = bool_128_ || anInt4315 > 0;
								int i_130_ = Class76.anInt1383;
								int i_131_ = Class76.anInt1392;
								int i_132_ = 0;
								int i_133_ = 0;
								if (i != 0) {
									i_132_ = Class76.anIntArray1386[i];
									i_133_ = Class76.anIntArray1395[i];
								}
								boolean bool_134_ = false;
								if (l > 0L && Class99.aBoolean1673 && i_121_ > 0) {
									int i_135_;
									int i_136_;
									if (i_122_ > 0) {
										i_135_ = i_124_ / i_120_;
										i_136_ = i_123_ / i_121_;
									} else {
										i_135_ = i_124_ / i_121_;
										i_136_ = i_123_ / i_120_;
									}
									int i_137_;
									int i_138_;
									if (i_125_ > 0) {
										i_137_ = i_127_ / i_120_;
										i_138_ = i_126_ / i_121_;
									} else {
										i_137_ = i_127_ / i_121_;
										i_138_ = i_126_ / i_120_;
									}
									if (Class23_Sub13_Sub10.anInt3878 >= i_135_ && Class23_Sub13_Sub10.anInt3878 <= i_136_ && client.anInt1973 >= i_137_ && client.anInt1973 <= i_138_) {
										i_135_ = 999999;
										i_136_ = -999999;
										i_137_ = 999999;
										i_138_ = -999999;
										int[] is = new int[] { aShort4322, aShort4325, aShort4322, aShort4325, aShort4322, aShort4325, aShort4322, aShort4325 };
										int[] is_139_ = new int[] { aShort4340, aShort4340, aShort4326, aShort4326, aShort4340, aShort4340, aShort4326, aShort4326 };
										int[] is_140_ = new int[] { aShort4338, aShort4338, aShort4338, aShort4338, aShort4313, aShort4313, aShort4313, aShort4313 };
										for (int i_141_ = 0; i_141_ < 8; i_141_++) {
											int i_142_ = is[i_141_];
											int i_143_ = is_140_[i_141_];
											int i_144_ = is_139_[i_141_];
											if (i != 0) {
												int i_145_ = i_144_ * i_132_ + i_142_ * i_133_ >> 16;
												i_144_ = i_144_ * i_133_ - i_142_ * i_132_ >> 16;
												i_142_ = i_145_;
											}
											i_142_ += i_115_;
											i_143_ += i_116_;
											i_144_ += i_117_;
											int i_146_ = i_144_ * i_113_ + i_142_ * i_114_ >> 16;
											i_144_ = i_144_ * i_114_ - i_142_ * i_113_ >> 16;
											i_142_ = i_146_;
											i_146_ = i_143_ * i_112_ - i_144_ * i_111_ >> 16;
											i_144_ = i_143_ * i_111_ + i_144_ * i_112_ >> 16;
											i_143_ = i_146_;
											if (i_144_ > 0) {
												int i_147_ = (i_142_ << 9) / i_144_;
												int i_148_ = (i_143_ << 9) / i_144_;
												if (i_147_ < i_135_) {
													i_135_ = i_147_;
												}
												if (i_147_ > i_136_) {
													i_136_ = i_147_;
												}
												if (i_148_ < i_137_) {
													i_137_ = i_148_;
												}
												if (i_148_ > i_138_) {
													i_138_ = i_148_;
												}
											}
										}
										if (Class23_Sub13_Sub10.anInt3878 >= i_135_ && Class23_Sub13_Sub10.anInt3878 <= i_136_ && client.anInt1973 >= i_137_ && client.anInt1973 <= i_138_) {
											if (aBoolean2489) {
												Class23_Sub4.aLongArray2110[oa.anInt1243++] = l;
											} else {
												bool_134_ = true;
											}
										}
									}
								}
								for (int i_149_ = 0; i_149_ < anInt4312; i_149_++) {
									int i_150_ = anIntArray4330[i_149_];
									int i_151_ = anIntArray4308[i_149_];
									int i_152_ = anIntArray4309[i_149_];
									if (i != 0) {
										int i_153_ = i_152_ * i_132_ + i_150_ * i_133_ >> 16;
										i_152_ = i_152_ * i_133_ - i_150_ * i_132_ >> 16;
										i_150_ = i_153_;
									}
									i_150_ += i_115_;
									i_151_ += i_116_;
									i_152_ += i_117_;
									int i_154_ = i_152_ * i_113_ + i_150_ * i_114_ >> 16;
									i_152_ = i_152_ * i_114_ - i_150_ * i_113_ >> 16;
									i_150_ = i_154_;
									i_154_ = i_151_ * i_112_ - i_152_ * i_111_ >> 16;
									i_152_ = i_151_ * i_111_ + i_152_ * i_112_ >> 16;
									i_151_ = i_154_;
									anIntArray4349[i_149_] = i_152_ - i_119_;
									if (i_152_ >= 50) {
										anIntArray4358[i_149_] = i_130_ + (i_150_ << 9) / i_152_;
										anIntArray4352[i_149_] = i_131_ + (i_151_ << 9) / i_152_;
									} else {
										anIntArray4358[i_149_] = -5000;
										bool = true;
									}
									if (bool_129_) {
										anIntArray4354[i_149_] = i_150_;
										anIntArray4355[i_149_] = i_151_;
										anIntArray4359[i_149_] = i_152_;
									}
								}
								try {
									method1033(bool, bool_134_, l, i_119_ - i_121_, i_120_ - i_121_ + 2);
								} catch (Exception exception) {
									/* empty */
								}
							}
						}
					}
				}
			}
		}
	}
	
	final void method1008(int i) {
		int i_155_ = Class76.anIntArray1386[i];
		int i_156_ = Class76.anIntArray1395[i];
		for (int i_157_ = 0; i_157_ < anInt4312; i_157_++) {
			int i_158_ = anIntArray4308[i_157_] * i_155_ + anIntArray4330[i_157_] * i_156_ >> 16;
			anIntArray4308[i_157_] = anIntArray4308[i_157_] * i_156_ - anIntArray4330[i_157_] * i_155_ >> 16;
			anIntArray4330[i_157_] = i_158_;
		}
		aBoolean4321 = false;
	}
	
	private final void method1029() {
		int i = 32767;
		int i_159_ = 32767;
		int i_160_ = 32767;
		int i_161_ = -32768;
		int i_162_ = -32768;
		int i_163_ = -32768;
		int i_164_ = 0;
		int i_165_ = 0;
		for (int i_166_ = 0; i_166_ < anInt4312; i_166_++) {
			int i_167_ = anIntArray4330[i_166_];
			int i_168_ = anIntArray4308[i_166_];
			int i_169_ = anIntArray4309[i_166_];
			if (i_167_ < i) {
				i = i_167_;
			}
			if (i_167_ > i_161_) {
				i_161_ = i_167_;
			}
			if (i_168_ < i_159_) {
				i_159_ = i_168_;
			}
			if (i_168_ > i_162_) {
				i_162_ = i_168_;
			}
			if (i_169_ < i_160_) {
				i_160_ = i_169_;
			}
			if (i_169_ > i_163_) {
				i_163_ = i_169_;
			}
			int i_170_ = i_167_ * i_167_ + i_169_ * i_169_;
			if (i_170_ > i_164_) {
				i_164_ = i_170_;
			}
			i_170_ = i_167_ * i_167_ + i_169_ * i_169_ + i_168_ * i_168_;
			if (i_170_ > i_165_) {
				i_165_ = i_170_;
			}
		}
		aShort4322 = (short) i;
		aShort4325 = (short) i_161_;
		aShort4338 = (short) i_159_;
		aShort4313 = (short) i_162_;
		aShort4340 = (short) i_160_;
		aShort4326 = (short) i_163_;
		aShort4341 = (short) (int) (Math.sqrt((double) i_164_) + 0.99);
		aShort4317 = (short) (int) (Math.sqrt((double) i_165_) + 0.99);
		aBoolean4321 = true;
	}
	
	private final void method1030(int i) {
		int i_171_ = Class76.anInt1383;
		int i_172_ = Class76.anInt1392;
		int i_173_ = 0;
		int i_174_ = anIntArray4319[i];
		int i_175_ = anIntArray4332[i];
		int i_176_ = anIntArray4337[i];
		int i_177_ = anIntArray4359[i_174_];
		int i_178_ = anIntArray4359[i_175_];
		int i_179_ = anIntArray4359[i_176_];
		if (aByteArray4323 == null) {
			Class76.anInt1390 = 0;
		} else {
			Class76.anInt1390 = aByteArray4323[i] & 0xff;
		}
		if (i_177_ >= 50) {
			anIntArray4360[i_173_] = anIntArray4358[i_174_];
			anIntArray4357[i_173_] = anIntArray4352[i_174_];
			anIntArray4346[i_173_++] = anIntArray4316[i];
		} else {
			int i_180_ = anIntArray4354[i_174_];
			int i_181_ = anIntArray4355[i_174_];
			int i_182_ = anIntArray4316[i];
			if (i_179_ >= 50) {
				int i_183_ = (50 - i_177_) * Class76.anIntArray1394[i_179_ - i_177_];
				anIntArray4360[i_173_] = i_171_ + (i_180_ + ((anIntArray4354[i_176_] - i_180_) * i_183_ >> 16) << 9) / 50;
				anIntArray4357[i_173_] = i_172_ + (i_181_ + ((anIntArray4355[i_176_] - i_181_) * i_183_ >> 16) << 9) / 50;
				anIntArray4346[i_173_++] = i_182_ + ((anIntArray4328[i] - i_182_) * i_183_ >> 16);
			}
			if (i_178_ >= 50) {
				int i_184_ = (50 - i_177_) * Class76.anIntArray1394[i_178_ - i_177_];
				anIntArray4360[i_173_] = i_171_ + (i_180_ + ((anIntArray4354[i_175_] - i_180_) * i_184_ >> 16) << 9) / 50;
				anIntArray4357[i_173_] = i_172_ + (i_181_ + ((anIntArray4355[i_175_] - i_181_) * i_184_ >> 16) << 9) / 50;
				anIntArray4346[i_173_++] = i_182_ + ((anIntArray4318[i] - i_182_) * i_184_ >> 16);
			}
		}
		if (i_178_ >= 50) {
			anIntArray4360[i_173_] = anIntArray4358[i_175_];
			anIntArray4357[i_173_] = anIntArray4352[i_175_];
			anIntArray4346[i_173_++] = anIntArray4318[i];
		} else {
			int i_185_ = anIntArray4354[i_175_];
			int i_186_ = anIntArray4355[i_175_];
			int i_187_ = anIntArray4318[i];
			if (i_177_ >= 50) {
				int i_188_ = (50 - i_178_) * Class76.anIntArray1394[i_177_ - i_178_];
				anIntArray4360[i_173_] = i_171_ + (i_185_ + ((anIntArray4354[i_174_] - i_185_) * i_188_ >> 16) << 9) / 50;
				anIntArray4357[i_173_] = i_172_ + (i_186_ + ((anIntArray4355[i_174_] - i_186_) * i_188_ >> 16) << 9) / 50;
				anIntArray4346[i_173_++] = i_187_ + ((anIntArray4316[i] - i_187_) * i_188_ >> 16);
			}
			if (i_179_ >= 50) {
				int i_189_ = (50 - i_178_) * Class76.anIntArray1394[i_179_ - i_178_];
				anIntArray4360[i_173_] = i_171_ + (i_185_ + ((anIntArray4354[i_176_] - i_185_) * i_189_ >> 16) << 9) / 50;
				anIntArray4357[i_173_] = i_172_ + (i_186_ + ((anIntArray4355[i_176_] - i_186_) * i_189_ >> 16) << 9) / 50;
				anIntArray4346[i_173_++] = i_187_ + ((anIntArray4328[i] - i_187_) * i_189_ >> 16);
			}
		}
		if (i_179_ >= 50) {
			anIntArray4360[i_173_] = anIntArray4358[i_176_];
			anIntArray4357[i_173_] = anIntArray4352[i_176_];
			anIntArray4346[i_173_++] = anIntArray4328[i];
		} else {
			int i_190_ = anIntArray4354[i_176_];
			int i_191_ = anIntArray4355[i_176_];
			int i_192_ = anIntArray4328[i];
			if (i_178_ >= 50) {
				int i_193_ = (50 - i_179_) * Class76.anIntArray1394[i_178_ - i_179_];
				anIntArray4360[i_173_] = i_171_ + (i_190_ + ((anIntArray4354[i_175_] - i_190_) * i_193_ >> 16) << 9) / 50;
				anIntArray4357[i_173_] = i_172_ + (i_191_ + ((anIntArray4355[i_175_] - i_191_) * i_193_ >> 16) << 9) / 50;
				anIntArray4346[i_173_++] = i_192_ + ((anIntArray4318[i] - i_192_) * i_193_ >> 16);
			}
			if (i_177_ >= 50) {
				int i_194_ = (50 - i_179_) * Class76.anIntArray1394[i_177_ - i_179_];
				anIntArray4360[i_173_] = i_171_ + (i_190_ + ((anIntArray4354[i_174_] - i_190_) * i_194_ >> 16) << 9) / 50;
				anIntArray4357[i_173_] = i_172_ + (i_191_ + ((anIntArray4355[i_174_] - i_191_) * i_194_ >> 16) << 9) / 50;
				anIntArray4346[i_173_++] = i_192_ + ((anIntArray4316[i] - i_192_) * i_194_ >> 16);
			}
		}
		int i_195_ = anIntArray4360[0];
		int i_196_ = anIntArray4360[1];
		int i_197_ = anIntArray4360[2];
		int i_198_ = anIntArray4357[0];
		int i_199_ = anIntArray4357[1];
		int i_200_ = anIntArray4357[2];
		Class76.aBoolean1398 = false;
		if (i_173_ == 3) {
			if (i_195_ < 0 || i_196_ < 0 || i_197_ < 0 || i_195_ > Class76.anInt1384 || i_196_ > Class76.anInt1384 || i_197_ > Class76.anInt1384) {
				Class76.aBoolean1398 = true;
			}
			if (aShortArray4335 == null || aShortArray4335[i] == -1) {
				if (anIntArray4328[i] == -1) {
					Class76.method1321(i_198_, i_199_, i_200_, i_195_, i_196_, i_197_, Class76.anIntArray1397[anIntArray4316[i]]);
				} else {
					Class76.method1333(i_198_, i_199_, i_200_, i_195_, i_196_, i_197_, anIntArray4346[0], anIntArray4346[1], anIntArray4346[2]);
				}
			} else {
				int i_201_;
				int i_202_;
				int i_203_;
				if (aByteArray4311 != null && aByteArray4311[i] != -1) {
					int i_204_ = aByteArray4311[i] & 0xff;
					i_201_ = anIntArray4333[i_204_];
					i_202_ = anIntArray4314[i_204_];
					i_203_ = anIntArray4339[i_204_];
				} else {
					i_201_ = i_174_;
					i_202_ = i_175_;
					i_203_ = i_176_;
				}
				if (anIntArray4328[i] == -1) {
					Class76.method1324(i_198_, i_199_, i_200_, i_195_, i_196_, i_197_, anIntArray4316[i], anIntArray4316[i], anIntArray4316[i], anIntArray4354[i_201_], anIntArray4354[i_202_], anIntArray4354[i_203_], anIntArray4355[i_201_], anIntArray4355[i_202_], anIntArray4355[i_203_], anIntArray4359[i_201_], anIntArray4359[i_202_], anIntArray4359[i_203_], aShortArray4335[i]);
				} else {
					Class76.method1324(i_198_, i_199_, i_200_, i_195_, i_196_, i_197_, anIntArray4346[0], anIntArray4346[1], anIntArray4346[2], anIntArray4354[i_201_], anIntArray4354[i_202_], anIntArray4354[i_203_], anIntArray4355[i_201_], anIntArray4355[i_202_], anIntArray4355[i_203_], anIntArray4359[i_201_], anIntArray4359[i_202_], anIntArray4359[i_203_], aShortArray4335[i]);
				}
			}
		}
		if (i_173_ == 4) {
			if (i_195_ < 0 || i_196_ < 0 || i_197_ < 0 || i_195_ > Class76.anInt1384 || i_196_ > Class76.anInt1384 || i_197_ > Class76.anInt1384 || anIntArray4360[3] < 0 || anIntArray4360[3] > Class76.anInt1384) {
				Class76.aBoolean1398 = true;
			}
			if (aShortArray4335 == null || aShortArray4335[i] == -1) {
				if (anIntArray4328[i] == -1) {
					int i_205_ = Class76.anIntArray1397[anIntArray4316[i]];
					Class76.method1321(i_198_, i_199_, i_200_, i_195_, i_196_, i_197_, i_205_);
					Class76.method1321(i_198_, i_200_, anIntArray4357[3], i_195_, i_197_, anIntArray4360[3], i_205_);
				} else {
					Class76.method1333(i_198_, i_199_, i_200_, i_195_, i_196_, i_197_, anIntArray4346[0], anIntArray4346[1], anIntArray4346[2]);
					Class76.method1333(i_198_, i_200_, anIntArray4357[3], i_195_, i_197_, anIntArray4360[3], anIntArray4346[0], anIntArray4346[2], anIntArray4346[3]);
				}
			} else {
				int i_206_;
				int i_207_;
				int i_208_;
				if (aByteArray4311 != null && aByteArray4311[i] != -1) {
					int i_209_ = aByteArray4311[i] & 0xff;
					i_206_ = anIntArray4333[i_209_];
					i_207_ = anIntArray4314[i_209_];
					i_208_ = anIntArray4339[i_209_];
				} else {
					i_206_ = i_174_;
					i_207_ = i_175_;
					i_208_ = i_176_;
				}
				short s = aShortArray4335[i];
				if (anIntArray4328[i] == -1) {
					Class76.method1324(i_198_, i_199_, i_200_, i_195_, i_196_, i_197_, anIntArray4316[i], anIntArray4316[i], anIntArray4316[i], anIntArray4354[i_206_], anIntArray4354[i_207_], anIntArray4354[i_208_], anIntArray4355[i_206_], anIntArray4355[i_207_], anIntArray4355[i_208_], anIntArray4359[i_206_], anIntArray4359[i_207_], anIntArray4359[i_208_], s);
					Class76.method1324(i_198_, i_200_, anIntArray4357[3], i_195_, i_197_, anIntArray4360[3], anIntArray4316[i], anIntArray4316[i], anIntArray4316[i], anIntArray4354[i_206_], anIntArray4354[i_207_], anIntArray4354[i_208_], anIntArray4355[i_206_], anIntArray4355[i_207_], anIntArray4355[i_208_], anIntArray4359[i_206_], anIntArray4359[i_207_], anIntArray4359[i_208_], s);
				} else {
					Class76.method1324(i_198_, i_199_, i_200_, i_195_, i_196_, i_197_, anIntArray4346[0], anIntArray4346[1], anIntArray4346[2], anIntArray4354[i_206_], anIntArray4354[i_207_], anIntArray4354[i_208_], anIntArray4355[i_206_], anIntArray4355[i_207_], anIntArray4355[i_208_], anIntArray4359[i_206_], anIntArray4359[i_207_], anIntArray4359[i_208_], s);
					Class76.method1324(i_198_, i_200_, anIntArray4357[3], i_195_, i_197_, anIntArray4360[3], anIntArray4346[0], anIntArray4346[2], anIntArray4346[3], anIntArray4354[i_206_], anIntArray4354[i_207_], anIntArray4354[i_208_], anIntArray4355[i_206_], anIntArray4355[i_207_], anIntArray4355[i_208_], anIntArray4359[i_206_], anIntArray4359[i_207_], anIntArray4359[i_208_], s);
				}
			}
		}
	}
	
	final void method1019(int i) {
		int i_210_ = Class76.anIntArray1386[i];
		int i_211_ = Class76.anIntArray1395[i];
		for (int i_212_ = 0; i_212_ < anInt4312; i_212_++) {
			int i_213_ = anIntArray4308[i_212_] * i_211_ - anIntArray4309[i_212_] * i_210_ >> 16;
			anIntArray4309[i_212_] = anIntArray4308[i_212_] * i_210_ + anIntArray4309[i_212_] * i_211_ >> 16;
			anIntArray4308[i_212_] = i_213_;
		}
		aBoolean4321 = false;
	}
	
	final Class38_Sub1 method1015(boolean bool, boolean bool_214_) {
		if (!bool && aByteArray4336.length < anInt4329) {
			aByteArray4336 = new byte[anInt4329 + 100];
		}
		return method1021(bool, aClass38_Sub1_Sub1_4327, aByteArray4336);
	}
	
	final void method1007() {
		for (int i = 0; i < anInt4312; i++) {
			int i_215_ = anIntArray4309[i];
			anIntArray4309[i] = anIntArray4330[i];
			anIntArray4330[i] = -i_215_;
		}
		aBoolean4321 = false;
	}
	
	final void method1002(int i, int i_216_, int i_217_) {
		for (int i_218_ = 0; i_218_ < anInt4312; i_218_++) {
			anIntArray4330[i_218_] = anIntArray4330[i_218_] * i / 128;
			anIntArray4308[i_218_] = anIntArray4308[i_218_] * i_216_ / 128;
			anIntArray4309[i_218_] = anIntArray4309[i_218_] * i_217_ / 128;
		}
		aBoolean4321 = false;
	}
	
	final void method1004(int i) {
		int i_219_ = Class76.anIntArray1386[i];
		int i_220_ = Class76.anIntArray1395[i];
		for (int i_221_ = 0; i_221_ < anInt4312; i_221_++) {
			int i_222_ = anIntArray4309[i_221_] * i_219_ + anIntArray4330[i_221_] * i_220_ >> 16;
			anIntArray4309[i_221_] = anIntArray4309[i_221_] * i_220_ - anIntArray4330[i_221_] * i_219_ >> 16;
			anIntArray4330[i_221_] = i_222_;
		}
		aBoolean4321 = false;
	}
	
	final void method1013(int i, int i_223_, int i_224_) {
		for (int i_225_ = 0; i_225_ < anInt4312; i_225_++) {
			anIntArray4330[i_225_] += i;
			anIntArray4308[i_225_] += i_223_;
			anIntArray4309[i_225_] += i_224_;
		}
		aBoolean4321 = false;
	}
	
	private final void method1031(int i) {
		if (aBooleanArray4353[i]) {
			method1030(i);
		} else {
			int i_226_ = anIntArray4319[i];
			int i_227_ = anIntArray4332[i];
			int i_228_ = anIntArray4337[i];
			Class76.aBoolean1398 = aBooleanArray4348[i];
			if (aByteArray4323 == null) {
				Class76.anInt1390 = 0;
			} else {
				Class76.anInt1390 = aByteArray4323[i] & 0xff;
			}
			if (aShortArray4335 == null || aShortArray4335[i] == -1) {
				if (anIntArray4328[i] == -1) {
					Class76.method1321(anIntArray4352[i_226_], anIntArray4352[i_227_], anIntArray4352[i_228_], anIntArray4358[i_226_], anIntArray4358[i_227_], anIntArray4358[i_228_], Class76.anIntArray1397[anIntArray4316[i]]);
				} else {
					Class76.method1333(anIntArray4352[i_226_], anIntArray4352[i_227_], anIntArray4352[i_228_], anIntArray4358[i_226_], anIntArray4358[i_227_], anIntArray4358[i_228_], anIntArray4316[i], anIntArray4318[i], anIntArray4328[i]);
				}
			} else {
				int i_229_;
				int i_230_;
				int i_231_;
				if (aByteArray4311 != null && aByteArray4311[i] != -1) {
					int i_232_ = aByteArray4311[i] & 0xff;
					i_229_ = anIntArray4333[i_232_];
					i_230_ = anIntArray4314[i_232_];
					i_231_ = anIntArray4339[i_232_];
				} else {
					i_229_ = i_226_;
					i_230_ = i_227_;
					i_231_ = i_228_;
				}
				if (anIntArray4328[i] == -1) {
					Class76.method1324(anIntArray4352[i_226_], anIntArray4352[i_227_], anIntArray4352[i_228_], anIntArray4358[i_226_], anIntArray4358[i_227_], anIntArray4358[i_228_], anIntArray4316[i], anIntArray4316[i], anIntArray4316[i], anIntArray4354[i_229_], anIntArray4354[i_230_], anIntArray4354[i_231_], anIntArray4355[i_229_], anIntArray4355[i_230_], anIntArray4355[i_231_], anIntArray4359[i_229_], anIntArray4359[i_230_], anIntArray4359[i_231_], aShortArray4335[i]);
				} else {
					Class76.method1324(anIntArray4352[i_226_], anIntArray4352[i_227_], anIntArray4352[i_228_], anIntArray4358[i_226_], anIntArray4358[i_227_], anIntArray4358[i_228_], anIntArray4316[i], anIntArray4318[i], anIntArray4328[i], anIntArray4354[i_229_], anIntArray4354[i_230_], anIntArray4354[i_231_], anIntArray4355[i_229_], anIntArray4355[i_230_], anIntArray4355[i_231_], anIntArray4359[i_229_], anIntArray4359[i_230_], anIntArray4359[i_231_], aShortArray4335[i]);
				}
			}
		}
	}
	
	final void method1006() {
		for (int i = 0; i < anInt4312; i++) {
			anIntArray4330[i] = -anIntArray4330[i];
			anIntArray4309[i] = -anIntArray4309[i];
		}
		aBoolean4321 = false;
	}
	
	public Class38_Sub1_Sub1() {
		anInt4315 = 0;
		anInt4329 = 0;
	}
	
	Class38_Sub1_Sub1(Class38_Sub4 class38_sub4, int i, int i_233_, int i_234_, int i_235_, int i_236_) {
		anInt4315 = 0;
		anInt4329 = 0;
		class38_sub4.method1066();
		class38_sub4.method1048();
		anInt4312 = class38_sub4.anInt2566;
		anIntArray4330 = class38_sub4.anIntArray2553;
		anIntArray4308 = class38_sub4.anIntArray2545;
		anIntArray4309 = class38_sub4.anIntArray2561;
		anInt4329 = class38_sub4.anInt2523;
		anIntArray4319 = class38_sub4.anIntArray2527;
		anIntArray4332 = class38_sub4.anIntArray2552;
		anIntArray4337 = class38_sub4.anIntArray2522;
		aByteArray4310 = class38_sub4.aByteArray2559;
		aByteArray4323 = class38_sub4.aByteArray2528;
		aByte4334 = class38_sub4.aByte2533;
		anIntArrayArray4320 = class38_sub4.anIntArrayArray2558;
		anIntArrayArray4324 = class38_sub4.anIntArrayArray2546;
		int i_237_ = (int) Math.sqrt((double) (i_234_ * i_234_ + i_235_ * i_235_ + i_236_ * i_236_));
		int i_238_ = i_233_ * i_237_ >> 8;
		anIntArray4316 = new int[anInt4329];
		anIntArray4318 = new int[anInt4329];
		anIntArray4328 = new int[anInt4329];
		if (class38_sub4.aShortArray2562 != null) {
			aShortArray4335 = new short[anInt4329];
			for (int i_239_ = 0; i_239_ < anInt4329; i_239_++) {
				short s = class38_sub4.aShortArray2562[i_239_];
				if (s != -1 && Class76.anInterface1_1399.method2(-66, s)) {
					aShortArray4335[i_239_] = s;
				} else {
					aShortArray4335[i_239_] = (short) -1;
				}
			}
		} else {
			aShortArray4335 = null;
		}
		if (class38_sub4.anInt2521 > 0 && class38_sub4.aByteArray2536 != null) {
			int[] is = new int[class38_sub4.anInt2521];
			for (int i_240_ = 0; i_240_ < anInt4329; i_240_++) {
				if (class38_sub4.aByteArray2536[i_240_] != -1) {
					is[class38_sub4.aByteArray2536[i_240_] & 0xff]++;
				}
			}
			anInt4315 = 0;
			for (int i_241_ = 0; i_241_ < class38_sub4.anInt2521; i_241_++) {
				if (is[i_241_] > 0 && class38_sub4.aByteArray2557[i_241_] == 0) {
					anInt4315++;
				}
			}
			anIntArray4333 = new int[anInt4315];
			anIntArray4314 = new int[anInt4315];
			anIntArray4339 = new int[anInt4315];
			int i_242_ = 0;
			for (int i_243_ = 0; i_243_ < class38_sub4.anInt2521; i_243_++) {
				if (is[i_243_] > 0 && class38_sub4.aByteArray2557[i_243_] == 0) {
					anIntArray4333[i_242_] = class38_sub4.aShortArray2529[i_243_] & 0xffff;
					anIntArray4314[i_242_] = class38_sub4.aShortArray2540[i_243_] & 0xffff;
					anIntArray4339[i_242_] = class38_sub4.aShortArray2551[i_243_] & 0xffff;
					is[i_243_] = i_242_++;
				} else {
					is[i_243_] = -1;
				}
			}
			aByteArray4311 = new byte[anInt4329];
			for (int i_244_ = 0; i_244_ < anInt4329; i_244_++) {
				if (class38_sub4.aByteArray2536[i_244_] != -1) {
					aByteArray4311[i_244_] = (byte) is[class38_sub4.aByteArray2536[i_244_] & 0xff];
					if (aByteArray4311[i_244_] == -1 && aShortArray4335 != null) {
						aShortArray4335[i_244_] = (short) -1;
					}
				} else {
					aByteArray4311[i_244_] = (byte) -1;
				}
			}
		}
		for (int i_245_ = 0; i_245_ < anInt4329; i_245_++) {
			byte b;
			if (class38_sub4.aByteArray2539 == null) {
				b = (byte) 0;
			} else {
				b = class38_sub4.aByteArray2539[i_245_];
			}
			byte b_246_;
			if (class38_sub4.aByteArray2528 == null) {
				b_246_ = (byte) 0;
			} else {
				b_246_ = class38_sub4.aByteArray2528[i_245_];
			}
			short s;
			if (aShortArray4335 == null) {
				s = (short) -1;
			} else {
				s = aShortArray4335[i_245_];
			}
			if (b_246_ == -2) {
				b = (byte) 3;
			}
			if (b_246_ == -1) {
				b = (byte) 2;
			}
			if (s == -1) {
				if (b == 0) {
					int i_247_ = class38_sub4.aShortArray2532[i_245_] & 0xffff;
					Class92 class92;
					if (class38_sub4.aClass92Array2549 != null && class38_sub4.aClass92Array2549[anIntArray4319[i_245_]] != null) {
						class92 = class38_sub4.aClass92Array2549[anIntArray4319[i_245_]];
					} else {
						class92 = class38_sub4.aClass92Array2541[anIntArray4319[i_245_]];
					}
					int i_248_ = i + (i_234_ * class92.anInt1562 + i_235_ * class92.anInt1565 + i_236_ * class92.anInt1572) / (i_238_ * class92.anInt1568);
					anIntArray4316[i_245_] = method1026(i_247_, i_248_);
					if (class38_sub4.aClass92Array2549 != null && class38_sub4.aClass92Array2549[anIntArray4332[i_245_]] != null) {
						class92 = class38_sub4.aClass92Array2549[anIntArray4332[i_245_]];
					} else {
						class92 = class38_sub4.aClass92Array2541[anIntArray4332[i_245_]];
					}
					i_248_ = i + (i_234_ * class92.anInt1562 + i_235_ * class92.anInt1565 + i_236_ * class92.anInt1572) / (i_238_ * class92.anInt1568);
					anIntArray4318[i_245_] = method1026(i_247_, i_248_);
					if (class38_sub4.aClass92Array2549 != null && class38_sub4.aClass92Array2549[anIntArray4337[i_245_]] != null) {
						class92 = class38_sub4.aClass92Array2549[anIntArray4337[i_245_]];
					} else {
						class92 = class38_sub4.aClass92Array2541[anIntArray4337[i_245_]];
					}
					i_248_ = i + (i_234_ * class92.anInt1562 + i_235_ * class92.anInt1565 + i_236_ * class92.anInt1572) / (i_238_ * class92.anInt1568);
					anIntArray4328[i_245_] = method1026(i_247_, i_248_);
				} else if (b == 1) {
					Class40 class40 = class38_sub4.aClass40Array2550[i_245_];
					int i_249_ = i + (i_234_ * class40.anInt627 + i_235_ * class40.anInt621 + i_236_ * class40.anInt622) / (i_238_ + i_238_ / 2);
					anIntArray4316[i_245_] = method1026(class38_sub4.aShortArray2532[i_245_] & 0xffff, i_249_);
					anIntArray4328[i_245_] = -1;
				} else if (b == 3) {
					anIntArray4316[i_245_] = 128;
					anIntArray4328[i_245_] = -1;
				} else {
					anIntArray4328[i_245_] = -2;
				}
			} else if (b == 0) {
				Class92 class92;
				if (class38_sub4.aClass92Array2549 != null && class38_sub4.aClass92Array2549[anIntArray4319[i_245_]] != null) {
					class92 = class38_sub4.aClass92Array2549[anIntArray4319[i_245_]];
				} else {
					class92 = class38_sub4.aClass92Array2541[anIntArray4319[i_245_]];
				}
				int i_250_ = i + (i_234_ * class92.anInt1562 + i_235_ * class92.anInt1565 + i_236_ * class92.anInt1572) / (i_238_ * class92.anInt1568);
				anIntArray4316[i_245_] = method1027(i_250_);
				if (class38_sub4.aClass92Array2549 != null && class38_sub4.aClass92Array2549[anIntArray4332[i_245_]] != null) {
					class92 = class38_sub4.aClass92Array2549[anIntArray4332[i_245_]];
				} else {
					class92 = class38_sub4.aClass92Array2541[anIntArray4332[i_245_]];
				}
				i_250_ = i + (i_234_ * class92.anInt1562 + i_235_ * class92.anInt1565 + i_236_ * class92.anInt1572) / (i_238_ * class92.anInt1568);
				anIntArray4318[i_245_] = method1027(i_250_);
				if (class38_sub4.aClass92Array2549 != null && class38_sub4.aClass92Array2549[anIntArray4337[i_245_]] != null) {
					class92 = class38_sub4.aClass92Array2549[anIntArray4337[i_245_]];
				} else {
					class92 = class38_sub4.aClass92Array2541[anIntArray4337[i_245_]];
				}
				i_250_ = i + (i_234_ * class92.anInt1562 + i_235_ * class92.anInt1565 + i_236_ * class92.anInt1572) / (i_238_ * class92.anInt1568);
				anIntArray4328[i_245_] = method1027(i_250_);
			} else if (b == 1) {
				Class40 class40 = class38_sub4.aClass40Array2550[i_245_];
				int i_251_ = i + (i_234_ * class40.anInt627 + i_235_ * class40.anInt621 + i_236_ * class40.anInt622) / (i_238_ + i_238_ / 2);
				anIntArray4316[i_245_] = method1027(i_251_);
				anIntArray4328[i_245_] = -1;
			} else {
				anIntArray4328[i_245_] = -2;
			}
		}
	}
	
	final Class38_Sub1_Sub1 method1032(int i, int i_252_, int[][] is, int[][] is_253_, int i_254_, int i_255_, int i_256_, boolean bool) {
		if (!aBoolean4321) {
			method1029();
		}
		int i_257_ = i_254_ + aShort4322;
		int i_258_ = i_254_ + aShort4325;
		int i_259_ = i_256_ + aShort4340;
		int i_260_ = i_256_ + aShort4326;
		if ((i == 1 || i == 2 || i == 3 || i == 5) && (i_257_ < 0 || i_258_ + 128 >> 7 >= is.length || i_259_ < 0 || i_260_ + 128 >> 7 >= is[0].length)) {
			return this;
		}
		if (i == 4 || i == 5) {
			if (is_253_ == null) {
				return this;
			}
			if (i_257_ < 0 || i_258_ + 128 >> 7 >= is_253_.length || i_259_ < 0 || i_260_ + 128 >> 7 >= is_253_[0].length) {
				return this;
			}
		} else {
			i_257_ >>= 7;
			i_258_ = i_258_ + 127 >> 7;
			i_259_ >>= 7;
			i_260_ = i_260_ + 127 >> 7;
			if (is[i_257_][i_259_] == i_255_ && is[i_258_][i_259_] == i_255_ && is[i_257_][i_260_] == i_255_ && is[i_258_][i_260_] == i_255_) {
				return this;
			}
		}
		Class38_Sub1_Sub1 class38_sub1_sub1_261_;
		if (bool) {
			class38_sub1_sub1_261_ = new Class38_Sub1_Sub1();
			class38_sub1_sub1_261_.anInt4312 = anInt4312;
			class38_sub1_sub1_261_.anInt4329 = anInt4329;
			class38_sub1_sub1_261_.anInt4315 = anInt4315;
			class38_sub1_sub1_261_.anIntArray4319 = anIntArray4319;
			class38_sub1_sub1_261_.anIntArray4332 = anIntArray4332;
			class38_sub1_sub1_261_.anIntArray4337 = anIntArray4337;
			class38_sub1_sub1_261_.anIntArray4316 = anIntArray4316;
			class38_sub1_sub1_261_.anIntArray4318 = anIntArray4318;
			class38_sub1_sub1_261_.anIntArray4328 = anIntArray4328;
			class38_sub1_sub1_261_.aByteArray4310 = aByteArray4310;
			class38_sub1_sub1_261_.aByteArray4323 = aByteArray4323;
			class38_sub1_sub1_261_.aByteArray4311 = aByteArray4311;
			class38_sub1_sub1_261_.aShortArray4335 = aShortArray4335;
			class38_sub1_sub1_261_.aByte4334 = aByte4334;
			class38_sub1_sub1_261_.anIntArray4333 = anIntArray4333;
			class38_sub1_sub1_261_.anIntArray4314 = anIntArray4314;
			class38_sub1_sub1_261_.anIntArray4339 = anIntArray4339;
			class38_sub1_sub1_261_.anIntArrayArray4320 = anIntArrayArray4320;
			class38_sub1_sub1_261_.anIntArrayArray4324 = anIntArrayArray4324;
			class38_sub1_sub1_261_.aBoolean2489 = aBoolean2489;
			if (i == 3) {
				class38_sub1_sub1_261_.anIntArray4330 = Class72.method1291(0, anIntArray4330);
				class38_sub1_sub1_261_.anIntArray4308 = Class72.method1291(0, anIntArray4308);
				class38_sub1_sub1_261_.anIntArray4309 = Class72.method1291(0, anIntArray4309);
			} else {
				class38_sub1_sub1_261_.anIntArray4330 = anIntArray4330;
				class38_sub1_sub1_261_.anIntArray4308 = new int[class38_sub1_sub1_261_.anInt4312];
				class38_sub1_sub1_261_.anIntArray4309 = anIntArray4309;
			}
		} else {
			class38_sub1_sub1_261_ = this;
		}
		if (i == 1) {
			for (int i_262_ = 0; i_262_ < class38_sub1_sub1_261_.anInt4312; i_262_++) {
				int i_263_ = anIntArray4330[i_262_] + i_254_;
				int i_264_ = anIntArray4309[i_262_] + i_256_;
				int i_265_ = i_263_ & 0x7f;
				int i_266_ = i_264_ & 0x7f;
				int i_267_ = i_263_ >> 7;
				int i_268_ = i_264_ >> 7;
				int i_269_ = is[i_267_][i_268_] * (128 - i_265_) + is[i_267_ + 1][i_268_] * i_265_ >> 7;
				int i_270_ = is[i_267_][i_268_ + 1] * (128 - i_265_) + is[i_267_ + 1][i_268_ + 1] * i_265_ >> 7;
				int i_271_ = i_269_ * (128 - i_266_) + i_270_ * i_266_ >> 7;
				class38_sub1_sub1_261_.anIntArray4308[i_262_] = anIntArray4308[i_262_] + i_271_ - i_255_;
			}
		} else if (i == 2) {
			for (int i_272_ = 0; i_272_ < class38_sub1_sub1_261_.anInt4312; i_272_++) {
				int i_273_ = (anIntArray4308[i_272_] << 16) / aShort4338;
				if (i_273_ < i_252_) {
					int i_274_ = anIntArray4330[i_272_] + i_254_;
					int i_275_ = anIntArray4309[i_272_] + i_256_;
					int i_276_ = i_274_ & 0x7f;
					int i_277_ = i_275_ & 0x7f;
					int i_278_ = i_274_ >> 7;
					int i_279_ = i_275_ >> 7;
					int i_280_ = is[i_278_][i_279_] * (128 - i_276_) + is[i_278_ + 1][i_279_] * i_276_ >> 7;
					int i_281_ = is[i_278_][i_279_ + 1] * (128 - i_276_) + is[i_278_ + 1][i_279_ + 1] * i_276_ >> 7;
					int i_282_ = i_280_ * (128 - i_277_) + i_281_ * i_277_ >> 7;
					class38_sub1_sub1_261_.anIntArray4308[i_272_] = anIntArray4308[i_272_] + (i_282_ - i_255_) * (i_252_ - i_273_) / i_252_;
				} else {
					class38_sub1_sub1_261_.anIntArray4308[i_272_] = anIntArray4308[i_272_];
				}
			}
		} else if (i == 3) {
			int i_283_ = (i_252_ & 0xff) * 4;
			int i_284_ = (i_252_ >> 8 & 0xff) * 4;
			class38_sub1_sub1_261_.method1011(is, i_254_, i_255_, i_256_, i_283_, i_284_);
		} else if (i == 4) {
			int i_285_ = aShort4313 - aShort4338;
			for (int i_286_ = 0; i_286_ < anInt4312; i_286_++) {
				int i_287_ = anIntArray4330[i_286_] + i_254_;
				int i_288_ = anIntArray4309[i_286_] + i_256_;
				int i_289_ = i_287_ & 0x7f;
				int i_290_ = i_288_ & 0x7f;
				int i_291_ = i_287_ >> 7;
				int i_292_ = i_288_ >> 7;
				int i_293_ = is_253_[i_291_][i_292_] * (128 - i_289_) + is_253_[i_291_ + 1][i_292_] * i_289_ >> 7;
				int i_294_ = is_253_[i_291_][i_292_ + 1] * (128 - i_289_) + is_253_[i_291_ + 1][i_292_ + 1] * i_289_ >> 7;
				int i_295_ = i_293_ * (128 - i_290_) + i_294_ * i_290_ >> 7;
				class38_sub1_sub1_261_.anIntArray4308[i_286_] = anIntArray4308[i_286_] + (i_295_ - i_255_) + i_285_;
			}
		} else if (i == 5) {
			int i_296_ = aShort4313 - aShort4338;
			for (int i_297_ = 0; i_297_ < anInt4312; i_297_++) {
				int i_298_ = anIntArray4330[i_297_] + i_254_;
				int i_299_ = anIntArray4309[i_297_] + i_256_;
				int i_300_ = i_298_ & 0x7f;
				int i_301_ = i_299_ & 0x7f;
				int i_302_ = i_298_ >> 7;
				int i_303_ = i_299_ >> 7;
				int i_304_ = is[i_302_][i_303_] * (128 - i_300_) + is[i_302_ + 1][i_303_] * i_300_ >> 7;
				int i_305_ = is[i_302_][i_303_ + 1] * (128 - i_300_) + is[i_302_ + 1][i_303_ + 1] * i_300_ >> 7;
				int i_306_ = i_304_ * (128 - i_301_) + i_305_ * i_301_ >> 7;
				i_304_ = is_253_[i_302_][i_303_] * (128 - i_300_) + is_253_[i_302_ + 1][i_303_] * i_300_ >> 7;
				i_305_ = is_253_[i_302_][i_303_ + 1] * (128 - i_300_) + is_253_[i_302_ + 1][i_303_ + 1] * i_300_ >> 7;
				int i_307_ = i_304_ * (128 - i_301_) + i_305_ * i_301_ >> 7;
				int i_308_ = i_306_ - i_307_;
				class38_sub1_sub1_261_.anIntArray4308[i_297_] = ((anIntArray4308[i_297_] << 8) / i_296_ * i_308_ >> 8) - (i_255_ - i_306_);
			}
		}
		class38_sub1_sub1_261_.aBoolean4321 = false;
		return class38_sub1_sub1_261_;
	}
	
	private final void method1033(boolean bool, boolean bool_309_, long l, int i, int i_310_) {
		if (i_310_ < 1600) {
			for (int i_311_ = 0; i_311_ < i_310_; i_311_++)
				anIntArray4347[i_311_] = 0;
			for (int i_312_ = 0; i_312_ < anInt4329; i_312_++) {
				if (anIntArray4328[i_312_] != -2) {
					int i_313_ = anIntArray4319[i_312_];
					int i_314_ = anIntArray4332[i_312_];
					int i_315_ = anIntArray4337[i_312_];
					int i_316_ = anIntArray4358[i_313_];
					int i_317_ = anIntArray4358[i_314_];
					int i_318_ = anIntArray4358[i_315_];
					if (bool && (i_316_ == -5000 || i_317_ == -5000 || i_318_ == -5000)) {
						int i_319_ = anIntArray4354[i_313_];
						int i_320_ = anIntArray4354[i_314_];
						int i_321_ = anIntArray4354[i_315_];
						int i_322_ = anIntArray4355[i_313_];
						int i_323_ = anIntArray4355[i_314_];
						int i_324_ = anIntArray4355[i_315_];
						int i_325_ = anIntArray4359[i_313_];
						int i_326_ = anIntArray4359[i_314_];
						int i_327_ = anIntArray4359[i_315_];
						i_319_ -= i_320_;
						i_321_ -= i_320_;
						i_322_ -= i_323_;
						i_324_ -= i_323_;
						i_325_ -= i_326_;
						i_327_ -= i_326_;
						int i_328_ = i_322_ * i_327_ - i_325_ * i_324_;
						int i_329_ = i_325_ * i_321_ - i_319_ * i_327_;
						int i_330_ = i_319_ * i_324_ - i_322_ * i_321_;
						if (i_320_ * i_328_ + i_323_ * i_329_ + i_326_ * i_330_ > 0) {
							aBooleanArray4353[i_312_] = true;
							int i_331_ = (anIntArray4349[i_313_] + anIntArray4349[i_314_] + anIntArray4349[i_315_]) / 3 + i;
							anIntArrayArray4356[i_331_][anIntArray4347[i_331_]++] = i_312_;
						}
					} else {
						if (bool_309_ && method1023(Class23_Sub13_Sub10.anInt3878 + Class76.anInt1383, client.anInt1973 + Class76.anInt1392, anIntArray4352[i_313_], anIntArray4352[i_314_], anIntArray4352[i_315_], i_316_, i_317_, i_318_)) {
							Class23_Sub4.aLongArray2110[oa.anInt1243++] = l;
							bool_309_ = false;
						}
						if ((i_316_ - i_317_) * (anIntArray4352[i_315_] - anIntArray4352[i_314_]) - (anIntArray4352[i_313_] - anIntArray4352[i_314_]) * (i_318_ - i_317_) > 0) {
							aBooleanArray4353[i_312_] = false;
							if (i_316_ < 0 || i_317_ < 0 || i_318_ < 0 || i_316_ > Class76.anInt1384 || i_317_ > Class76.anInt1384 || i_318_ > Class76.anInt1384) {
								aBooleanArray4348[i_312_] = true;
							} else {
								aBooleanArray4348[i_312_] = false;
							}
							int i_332_ = (anIntArray4349[i_313_] + anIntArray4349[i_314_] + anIntArray4349[i_315_]) / 3 + i;
							anIntArrayArray4356[i_332_][anIntArray4347[i_332_]++] = i_312_;
						}
					}
				}
			}
			if (aByteArray4310 == null) {
				for (int i_333_ = i_310_ - 1; i_333_ >= 0; i_333_--) {
					int i_334_ = anIntArray4347[i_333_];
					if (i_334_ > 0) {
						int[] is = anIntArrayArray4356[i_333_];
						for (int i_335_ = 0; i_335_ < i_334_; i_335_++)
							method1031(is[i_335_]);
					}
				}
			} else {
				for (int i_336_ = 0; i_336_ < 12; i_336_++) {
					anIntArray4362[i_336_] = 0;
					anIntArray4345[i_336_] = 0;
				}
				for (int i_337_ = i_310_ - 1; i_337_ >= 0; i_337_--) {
					int i_338_ = anIntArray4347[i_337_];
					if (i_338_ > 0) {
						int[] is = anIntArrayArray4356[i_337_];
						for (int i_339_ = 0; i_339_ < i_338_; i_339_++) {
							int i_340_ = is[i_339_];
							byte b = aByteArray4310[i_340_];
							int i_341_ = anIntArray4362[b]++;
							anIntArrayArray4344[b][i_341_] = i_340_;
							if (b < 10) {
								anIntArray4345[b] += i_337_;
							} else if (b == 10) {
								anIntArray4350[i_341_] = i_337_;
							} else {
								anIntArray4361[i_341_] = i_337_;
							}
						}
					}
				}
				int i_342_ = 0;
				if (anIntArray4362[1] > 0 || anIntArray4362[2] > 0) {
					i_342_ = (anIntArray4345[1] + anIntArray4345[2]) / (anIntArray4362[1] + anIntArray4362[2]);
				}
				int i_343_ = 0;
				if (anIntArray4362[3] > 0 || anIntArray4362[4] > 0) {
					i_343_ = (anIntArray4345[3] + anIntArray4345[4]) / (anIntArray4362[3] + anIntArray4362[4]);
				}
				int i_344_ = 0;
				if (anIntArray4362[6] > 0 || anIntArray4362[8] > 0) {
					i_344_ = (anIntArray4345[6] + anIntArray4345[8]) / (anIntArray4362[6] + anIntArray4362[8]);
				}
				int i_345_ = 0;
				int i_346_ = anIntArray4362[10];
				int[] is = anIntArrayArray4344[10];
				int[] is_347_ = anIntArray4350;
				if (i_345_ == i_346_) {
					i_345_ = 0;
					i_346_ = anIntArray4362[11];
					is = anIntArrayArray4344[11];
					is_347_ = anIntArray4361;
				}
				int i_348_;
				if (i_345_ < i_346_) {
					i_348_ = is_347_[i_345_];
				} else {
					i_348_ = -1000;
				}
				for (int i_349_ = 0; i_349_ < 10; i_349_++) {
					while (i_349_ == 0) {
						if (i_348_ <= i_342_) {
							break;
						}
						method1031(is[i_345_++]);
						if (i_345_ == i_346_ && is != anIntArrayArray4344[11]) {
							i_345_ = 0;
							i_346_ = anIntArray4362[11];
							is = anIntArrayArray4344[11];
							is_347_ = anIntArray4361;
						}
						if (i_345_ < i_346_) {
							i_348_ = is_347_[i_345_];
						} else {
							i_348_ = -1000;
						}
					}
					while (i_349_ == 3) {
						if (i_348_ <= i_343_) {
							break;
						}
						method1031(is[i_345_++]);
						if (i_345_ == i_346_ && is != anIntArrayArray4344[11]) {
							i_345_ = 0;
							i_346_ = anIntArray4362[11];
							is = anIntArrayArray4344[11];
							is_347_ = anIntArray4361;
						}
						if (i_345_ < i_346_) {
							i_348_ = is_347_[i_345_];
						} else {
							i_348_ = -1000;
						}
					}
					while (i_349_ == 5 && i_348_ > i_344_) {
						method1031(is[i_345_++]);
						if (i_345_ == i_346_ && is != anIntArrayArray4344[11]) {
							i_345_ = 0;
							i_346_ = anIntArray4362[11];
							is = anIntArrayArray4344[11];
							is_347_ = anIntArray4361;
						}
						if (i_345_ < i_346_) {
							i_348_ = is_347_[i_345_];
						} else {
							i_348_ = -1000;
						}
					}
					int i_350_ = anIntArray4362[i_349_];
					int[] is_351_ = anIntArrayArray4344[i_349_];
					for (int i_352_ = 0; i_352_ < i_350_; i_352_++)
						method1031(is_351_[i_352_]);
				}
				while (i_348_ != -1000) {
					method1031(is[i_345_++]);
					if (i_345_ == i_346_ && is != anIntArrayArray4344[11]) {
						i_345_ = 0;
						is = anIntArrayArray4344[11];
						i_346_ = anIntArray4362[11];
						is_347_ = anIntArray4361;
					}
					if (i_345_ < i_346_) {
						i_348_ = is_347_[i_345_];
					} else {
						i_348_ = -1000;
					}
				}
			}
		}
	}
	
	final void method1020(Class23_Sub13_Sub16 class23_sub13_sub16, int i, boolean bool) {
		if (anIntArrayArray4320 != null && i != -1) {
			Class15 class15 = class23_sub13_sub16.aClass15Array4042[i];
			Class23_Sub12 class23_sub12 = class15.aClass23_Sub12_293;
			anInt4351 = 0;
			anInt4342 = 0;
			anInt4343 = 0;
			for (int i_353_ = 0; i_353_ < class15.anInt295; i_353_++) {
				short s = class15.aShortArray296[i_353_];
				if (class15.aShortArray290[i_353_] != -1) {
					method1022(0, class23_sub12.anIntArrayArray2305[class15.aShortArray290[i_353_]], 0, 0, 0);
				}
				method1022(class23_sub12.anIntArray2295[s], class23_sub12.anIntArrayArray2305[s], class15.aShortArray297[i_353_], class15.aShortArray289[i_353_], class15.aShortArray298[i_353_]);
			}
			aBoolean4321 = false;
		}
	}
	
	private Class38_Sub1_Sub1(Class38_Sub1_Sub1[] class38_sub1_sub1s, int i) {
		anInt4315 = 0;
		anInt4329 = 0;
		boolean bool = false;
		boolean bool_354_ = false;
		boolean bool_355_ = false;
		boolean bool_356_ = false;
		anInt4312 = 0;
		anInt4329 = 0;
		anInt4315 = 0;
		aByte4334 = (byte) -1;
		for (int i_357_ = 0; i_357_ < i; i_357_++) {
			Class38_Sub1_Sub1 class38_sub1_sub1_358_ = class38_sub1_sub1s[i_357_];
			if (class38_sub1_sub1_358_ != null) {
				anInt4312 += class38_sub1_sub1_358_.anInt4312;
				anInt4329 += class38_sub1_sub1_358_.anInt4329;
				anInt4315 += class38_sub1_sub1_358_.anInt4315;
				if (class38_sub1_sub1_358_.aByteArray4310 != null) {
					bool = true;
				} else {
					if (aByte4334 == -1) {
						aByte4334 = class38_sub1_sub1_358_.aByte4334;
					}
					if (aByte4334 != class38_sub1_sub1_358_.aByte4334) {
						bool = true;
					}
				}
				bool_354_ = bool_354_ | class38_sub1_sub1_358_.aByteArray4323 != null;
				bool_355_ = bool_355_ | class38_sub1_sub1_358_.aShortArray4335 != null;
				bool_356_ = bool_356_ | class38_sub1_sub1_358_.aByteArray4311 != null;
			}
		}
		anIntArray4330 = new int[anInt4312];
		anIntArray4308 = new int[anInt4312];
		anIntArray4309 = new int[anInt4312];
		anIntArray4319 = new int[anInt4329];
		anIntArray4332 = new int[anInt4329];
		anIntArray4337 = new int[anInt4329];
		anIntArray4316 = new int[anInt4329];
		anIntArray4318 = new int[anInt4329];
		anIntArray4328 = new int[anInt4329];
		if (bool) {
			aByteArray4310 = new byte[anInt4329];
		}
		if (bool_354_) {
			aByteArray4323 = new byte[anInt4329];
		}
		if (bool_355_) {
			aShortArray4335 = new short[anInt4329];
		}
		if (bool_356_) {
			aByteArray4311 = new byte[anInt4329];
		}
		if (anInt4315 > 0) {
			anIntArray4333 = new int[anInt4315];
			anIntArray4314 = new int[anInt4315];
			anIntArray4339 = new int[anInt4315];
		}
		anInt4312 = 0;
		anInt4329 = 0;
		anInt4315 = 0;
		for (int i_359_ = 0; i_359_ < i; i_359_++) {
			Class38_Sub1_Sub1 class38_sub1_sub1_360_ = class38_sub1_sub1s[i_359_];
			if (class38_sub1_sub1_360_ != null) {
				for (int i_361_ = 0; i_361_ < class38_sub1_sub1_360_.anInt4329; i_361_++) {
					anIntArray4319[anInt4329] = class38_sub1_sub1_360_.anIntArray4319[i_361_] + anInt4312;
					anIntArray4332[anInt4329] = class38_sub1_sub1_360_.anIntArray4332[i_361_] + anInt4312;
					anIntArray4337[anInt4329] = class38_sub1_sub1_360_.anIntArray4337[i_361_] + anInt4312;
					anIntArray4316[anInt4329] = class38_sub1_sub1_360_.anIntArray4316[i_361_];
					anIntArray4318[anInt4329] = class38_sub1_sub1_360_.anIntArray4318[i_361_];
					anIntArray4328[anInt4329] = class38_sub1_sub1_360_.anIntArray4328[i_361_];
					if (bool) {
						if (class38_sub1_sub1_360_.aByteArray4310 != null) {
							aByteArray4310[anInt4329] = class38_sub1_sub1_360_.aByteArray4310[i_361_];
						} else {
							aByteArray4310[anInt4329] = class38_sub1_sub1_360_.aByte4334;
						}
					}
					if (bool_354_ && class38_sub1_sub1_360_.aByteArray4323 != null) {
						aByteArray4323[anInt4329] = class38_sub1_sub1_360_.aByteArray4323[i_361_];
					}
					if (bool_355_) {
						if (class38_sub1_sub1_360_.aShortArray4335 != null) {
							aShortArray4335[anInt4329] = class38_sub1_sub1_360_.aShortArray4335[i_361_];
						} else {
							aShortArray4335[anInt4329] = (short) -1;
						}
					}
					if (bool_356_) {
						if (class38_sub1_sub1_360_.aByteArray4311 != null && class38_sub1_sub1_360_.aByteArray4311[i_361_] != -1) {
							aByteArray4311[anInt4329] = (byte) (class38_sub1_sub1_360_.aByteArray4311[i_361_] + anInt4315);
						} else {
							aByteArray4311[anInt4329] = (byte) -1;
						}
					}
					anInt4329++;
				}
				for (int i_362_ = 0; i_362_ < class38_sub1_sub1_360_.anInt4315; i_362_++) {
					anIntArray4333[anInt4315] = class38_sub1_sub1_360_.anIntArray4333[i_362_] + anInt4312;
					anIntArray4314[anInt4315] = class38_sub1_sub1_360_.anIntArray4314[i_362_] + anInt4312;
					anIntArray4339[anInt4315] = class38_sub1_sub1_360_.anIntArray4339[i_362_] + anInt4312;
					anInt4315++;
				}
				for (int i_363_ = 0; i_363_ < class38_sub1_sub1_360_.anInt4312; i_363_++) {
					anIntArray4330[anInt4312] = class38_sub1_sub1_360_.anIntArray4330[i_363_];
					anIntArray4308[anInt4312] = class38_sub1_sub1_360_.anIntArray4308[i_363_];
					anIntArray4309[anInt4312] = class38_sub1_sub1_360_.anIntArray4309[i_363_];
					anInt4312++;
				}
			}
		}
	}
	
	static {
		aClass38_Sub1_Sub1_4331 = new Class38_Sub1_Sub1();
		anIntArray4345 = new int[12];
		anIntArray4347 = new int[1600];
		anIntArrayArray4356 = new int[1600][512];
		anIntArray4349 = new int[4096];
		aBooleanArray4353 = new boolean[4096];
		anIntArray4359 = new int[4096];
		anIntArray4358 = new int[4096];
		anIntArray4357 = new int[10];
		anIntArray4346 = new int[10];
		anIntArray4354 = new int[4096];
		anIntArray4352 = new int[4096];
		anIntArray4350 = new int[4096];
		anIntArray4360 = new int[10];
		anIntArray4355 = new int[4096];
		anIntArray4361 = new int[4096];
		aBooleanArray4348 = new boolean[4096];
		anIntArrayArray4344 = new int[12][4096];
		anIntArray4362 = new int[12];
		aByteArray4363 = new byte[1];
	}
}
