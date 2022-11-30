/* Class23_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class23_Sub4_Sub2 extends Class23_Sub4
{
	static Class14 aClass14_2911;
	private int anInt2912;
	static RSString aClass16_2913;
	private int anInt2914;
	private int anInt2915 = 0;
	static RSString aClass16_2916 = Class38_Sub6.method1076((byte) 86, "cross");
	static RSString aClass16_2917;
	private int anInt2918 = 4096;
	private static RSString aClass16_2919;
	static int anInt2920;
	static RSString aClass16_2921;
	static int anInt2922;
	static int anInt2923;
	static int anInt2924;
	static int anInt2925 = 0;
	private int anInt2926;
	static int anInt2927;
	static int anInt2928;
	static RSString aClass16_2929;
	static int anInt2930;
	private static RSString aClass16_2931;
	static Class38_Sub7_Sub2[] aClass38_Sub7_Sub2Array2932;
	static int anInt2933;
	static int anInt2934;
	
	final void method265(int i) {
		Class33.method968(2);
		if (i != -21746) {
			method260(77, 126);
		}
		anInt2934++;
	}
	
	static final void method275(int i, int i_0_, int i_1_, int i_2_, byte b, int i_3_, int i_4_) {
		if (b != 37) {
			anInt2925 = -103;
		}
		if ((Class38_Sub7_Sub1.anInt4374 ^ 0xffffffff) == -1 && !Class23_Sub13_Sub7.aBoolean3792) {
			Class23_Sub13_Sub16.anInt4045++;
			int i_5_ = Class46.anInt715;
			int i_6_ = Class21.anInt335;
			int i_7_ = Class23_Sub4_Sub35.anInt3459;
			int i_8_ = Class23_Sub4_Sub7.anInt3023;
			int i_9_ = (i_1_ + -i_2_) * (i_6_ + -i_5_) / i_3_ - -i_5_;
			int i_10_ = i_7_ + (i_8_ - i_7_) * (-i + i_4_) / i_0_;
			Class23_Sub13_Sub19.method812(0L, (short) 5, i_9_, Class23_Sub4_Sub38.aClass16_3509, 500, Class23_Sub4_Sub7.aClass16_3022, i_10_);
		}
		anInt2922++;
		long l = -1L;
		for (int i_11_ = 0; (oa.anInt1243 ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
			long l_12_ = Class23_Sub4.aLongArray2110[i_11_];
			int i_13_ = 0x7f & (int) l_12_;
			int i_14_ = (0x3fd5 & (int) l_12_) >> 7;
			int i_15_ = 0x7fffffff & (int) (l_12_ >>> 32);
			int i_16_ = (int) l_12_ >> 29 & 0x3;
			if ((l_12_ ^ 0xffffffffffffffffL) != (l ^ 0xffffffffffffffffL)) {
				l = l_12_;
				if (i_16_ == 2 && Class23_Sub4_Sub9.method298(Class23_Sub13_Sub11.anInt3916, i_13_, i_14_, l_12_)) {
					Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_15_, -21035);
					if (class23_sub13_sub7.anIntArray3746 != null) {
						class23_sub13_sub7 = class23_sub13_sub7.method646(176743434);
					}
					if (class23_sub13_sub7 == null) {
						continue;
					}
					if (Class38_Sub7_Sub1.anInt4374 == 1) {
						Class23_Sub13_Sub19.method812(l_12_, (short) 14, i_13_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub24.aClass16_4281, Class35.aClass16_556, class23_sub13_sub7.aClass16_3797 }, -121), 500, Class23_Sub13_Sub20.aClass16_4163, i_14_);
						Buffer.anInt2151++;
					} else if (Class23_Sub13_Sub7.aBoolean3792) {
						if ((0x4 & Class71_Sub1.anInt2725) == 4) {
							Class23_Sub13_Sub19.method812(l_12_, (short) 42, i_13_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub4.aClass16_3714, Class35.aClass16_556, class23_sub13_sub7.aClass16_3797 }, -112), b + 463, Class49.aClass16_764, i_14_);
							Class63.anInt991++;
						}
					} else {
						client.anInt1958++;
						RSString[] class16s = class23_sub13_sub7.aClass16Array3800;
						if (Class23_Sub4_Sub5.aBoolean2977) {
							class16s = Class23_Sub4_Sub31.method396(b + 30076, class16s);
						}
						if (class16s != null) {
							for (int i_17_ = 4; i_17_ >= 0; i_17_--) {
								if (class16s[i_17_] != null) {
									short s = 0;
									Class23_Sub4_Sub1.anInt2899++;
									if (i_17_ == 0) {
										s = (short) 29;
									}
									if (i_17_ == 1) {
										s = (short) 39;
									}
									if (i_17_ == 2) {
										s = (short) 37;
									}
									if (i_17_ == 3) {
										s = (short) 10;
									}
									if (i_17_ == 4) {
										s = (short) 1001;
									}
									Class23_Sub13_Sub19.method812(l_12_, s, i_13_, Class23_Sub4_Sub14.method322(new RSString[] { Class87_Sub2.aClass16_2805, class23_sub13_sub7.aClass16_3797 }, -60), 500, class16s[i_17_], i_14_);
								}
							}
						}
						Class23_Sub13_Sub19.method812((long) class23_sub13_sub7.anInt3791, (short) 1005, i_13_, Class23_Sub4_Sub14.method322(new RSString[] { Class87_Sub2.aClass16_2805, class23_sub13_sub7.aClass16_3797 }, -18), b + 463, Class71_Sub1_Sub1.aClass16_4462, i_14_);
					}
				}
				if (i_16_ == 1) {
					Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[i_15_];
					if (class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4173 == 1 && (0x7f & class38_sub7_sub1.anInt2674) == 64 && (class38_sub7_sub1.anInt2659 & 0x7f) == 64) {
						for (int i_18_ = 0; (Class23_Sub4_Sub18.anInt3191 ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
							Class38_Sub7_Sub1 class38_sub7_sub1_19_ = Class31.aClass38_Sub7_Sub1Array483[Class23_Sub4_Sub17.anIntArray3170[i_18_]];
							if (class38_sub7_sub1_19_ != null && class38_sub7_sub1_19_ != class38_sub7_sub1 && class38_sub7_sub1_19_.aClass23_Sub13_Sub20_4373.anInt4173 == 1 && class38_sub7_sub1.anInt2674 == class38_sub7_sub1_19_.anInt2674 && class38_sub7_sub1_19_.anInt2659 == class38_sub7_sub1.anInt2659) {
								method276(i_13_, i_14_, class38_sub7_sub1_19_.aClass23_Sub13_Sub20_4373, true, Class23_Sub4_Sub17.anIntArray3170[i_18_]);
							}
						}
						for (int i_20_ = 0; (Class23_Sub4_Sub11.anInt3067 ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
							Class38_Sub7_Sub2 class38_sub7_sub2 = aClass38_Sub7_Sub2Array2932[Class23_Sub13_Sub3.anIntArray3700[i_20_]];
							if (class38_sub7_sub2 != null && (class38_sub7_sub2.anInt2674 ^ 0xffffffff) == (class38_sub7_sub1.anInt2674 ^ 0xffffffff) && (class38_sub7_sub1.anInt2659 ^ 0xffffffff) == (class38_sub7_sub2.anInt2659 ^ 0xffffffff)) {
								Class32.method962(i_14_, i_13_, Class23_Sub13_Sub3.anIntArray3700[i_20_], (byte) 123, class38_sub7_sub2);
							}
						}
					}
					method276(i_13_, i_14_, class38_sub7_sub1.aClass23_Sub13_Sub20_4373, true, i_15_);
				}
				if (i_16_ == 0) {
					Class38_Sub7_Sub2 class38_sub7_sub2 = aClass38_Sub7_Sub2Array2932[i_15_];
					if ((0x7f & class38_sub7_sub2.anInt2674) == 64 && (class38_sub7_sub2.anInt2659 & 0x7f) == 64) {
						for (int i_21_ = 0; Class23_Sub4_Sub18.anInt3191 > i_21_; i_21_++) {
							Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[Class23_Sub4_Sub17.anIntArray3170[i_21_]];
							if (class38_sub7_sub1 != null && class38_sub7_sub1.aClass23_Sub13_Sub20_4373.anInt4173 == 1 && class38_sub7_sub2.anInt2674 == class38_sub7_sub1.anInt2674 && (class38_sub7_sub2.anInt2659 ^ 0xffffffff) == (class38_sub7_sub1.anInt2659 ^ 0xffffffff)) {
								method276(i_13_, i_14_, class38_sub7_sub1.aClass23_Sub13_Sub20_4373, true, Class23_Sub4_Sub17.anIntArray3170[i_21_]);
							}
						}
						for (int i_22_ = 0; (Class23_Sub4_Sub11.anInt3067 ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
							Class38_Sub7_Sub2 class38_sub7_sub2_23_ = aClass38_Sub7_Sub2Array2932[Class23_Sub13_Sub3.anIntArray3700[i_22_]];
							if (class38_sub7_sub2_23_ != null && class38_sub7_sub2 != class38_sub7_sub2_23_ && (class38_sub7_sub2_23_.anInt2674 ^ 0xffffffff) == (class38_sub7_sub2.anInt2674 ^ 0xffffffff) && (class38_sub7_sub2_23_.anInt2659 ^ 0xffffffff) == (class38_sub7_sub2.anInt2659 ^ 0xffffffff)) {
								Class32.method962(i_14_, i_13_, Class23_Sub13_Sub3.anIntArray3700[i_22_], (byte) -119, class38_sub7_sub2_23_);
							}
						}
					}
					Class32.method962(i_14_, i_13_, i_15_, (byte) 119, class38_sub7_sub2);
				}
				if (i_16_ == 3) {
					Class89 class89 = Class82.aClass89ArrayArrayArray1453[Class23_Sub13_Sub11.anInt3916][i_13_][i_14_];
					if (class89 != null) {
						for (Class23_Sub13_Sub1 class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1440(b ^ 0x55); class23_sub13_sub1 != null; class23_sub13_sub1 = (Class23_Sub13_Sub1) class89.method1438((byte) 121)) {
							int i_24_ = class23_sub13_sub1.aClass38_Sub2_3668.anInt2495;
							Class23_Sub13_Sub11 class23_sub13_sub11 = Class23_Sub13_Sub24.method853(124, i_24_);
							if (Class38_Sub7_Sub1.anInt4374 != 1) {
								if (!Class23_Sub13_Sub7.aBoolean3792) {
									Class23_Sub8.anInt2231++;
									RSString[] class16s = class23_sub13_sub11.aClass16Array3945;
									if (Class23_Sub4_Sub5.aBoolean2977) {
										class16s = Class23_Sub4_Sub31.method396(30113, class16s);
									}
									for (int i_25_ = 4; (i_25_ ^ 0xffffffff) <= -1; i_25_--) {
										if (class16s != null && class16s[i_25_] != null) {
											Class38_Sub7.anInt2636++;
											short s = 0;
											if (i_25_ == 0) {
												s = (short) 17;
											}
											if (i_25_ == 1) {
												s = (short) 12;
											}
											if (i_25_ == 2) {
												s = (short) 46;
											}
											if (i_25_ == 3) {
												s = (short) 34;
											}
											if (i_25_ == 4) {
												s = (short) 33;
											}
											Class23_Sub13_Sub19.method812((long) i_24_, s, i_13_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.aClass16_3902 }, -107), 500, class16s[i_25_], i_14_);
										} else if (i_25_ == 2) {
											Class23_Sub13_Sub19.method812((long) i_24_, (short) 46, i_13_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.aClass16_3902 }, -91), b + 463, Class17.aClass16_307, i_14_);
											Class23_Sub4_Sub23.anInt3283++;
										}
									}
									Class23_Sub13_Sub19.method812((long) i_24_, (short) 1003, i_13_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub32.aClass16_3418, class23_sub13_sub11.aClass16_3902 }, -84), 500, Class71_Sub1_Sub1.aClass16_4462, i_14_);
								} else if ((0x1 & Class71_Sub1.anInt2725) == 1) {
									Class49.anInt757++;
									Class23_Sub13_Sub19.method812((long) i_24_, (short) 35, i_13_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub4.aClass16_3714, Class14.aClass16_274, class23_sub13_sub11.aClass16_3902 }, b + -100), b ^ 0x1d1, Class49.aClass16_764, i_14_);
								}
							} else {
								Class23_Sub13_Sub19.method812((long) i_24_, (short) 43, i_13_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub24.aClass16_4281, Class14.aClass16_274, class23_sub13_sub11.aClass16_3902 }, b ^ ~0x3b), 500, Class23_Sub13_Sub20.aClass16_4163, i_14_);
								Class55.anInt873++;
							}
						}
					}
				}
			}
		}
	}
	
	private static final void method276(int i, int i_26_, Class23_Sub13_Sub20 class23_sub13_sub20, boolean bool, int i_27_) {
		anInt2930++;
		if (bool != true) {
			method276(116, 51, null, false, -125);
		}
		if (Class23_Sub13_Sub9.anInt3863 < 400) {
			if (class23_sub13_sub20.anIntArray4153 != null) {
				class23_sub13_sub20 = class23_sub13_sub20.method813(674);
			}
			if (class23_sub13_sub20 != null && class23_sub13_sub20.aBoolean4169) {
				RSString class16 = class23_sub13_sub20.aClass16_4185;
				if (class23_sub13_sub20.anInt4166 != 0) {
					class16 = Class23_Sub4_Sub14.method322(new RSString[] { class16, Class23_Sub4_Sub1.method271(Class105.aClass38_Sub7_Sub2_1812.anInt4383, (byte) -15, class23_sub13_sub20.anInt4166), Class92.aClass16_1564, Class23_Sub19.aClass16_2378, Class23_Sub4_Sub23.method360((byte) -9, class23_sub13_sub20.anInt4166), Class23_Sub4_Sub10.aClass16_3048 }, -95);
				}
				if (Class38_Sub7_Sub1.anInt4374 != 1) {
					if (!Class23_Sub13_Sub7.aBoolean3792) {
						Class23_Sub13_Sub14.anInt4008++;
						RSString[] class16s = class23_sub13_sub20.aClass16Array4182;
						if (Class23_Sub4_Sub5.aBoolean2977) {
							class16s = Class23_Sub4_Sub31.method396(30113, class16s);
						}
						if (class16s != null) {
							for (int i_28_ = 4; i_28_ >= 0; i_28_--) {
								if (class16s[i_28_] != null && (Class23_Sub4_Sub29.anInt3369 != 0 || !class16s[i_28_].method140(Class31.aClass16_487, 40))) {
									short s = 0;
									Class59.anInt920++;
									if ((i_28_ ^ 0xffffffff) == -1) {
										s = (short) 58;
									}
									if (i_28_ == 1) {
										s = (short) 45;
									}
									if (i_28_ == 2) {
										s = (short) 31;
									}
									if (i_28_ == 3) {
										s = (short) 1;
									}
									if (i_28_ == 4) {
										s = (short) 48;
									}
									Class23_Sub13_Sub19.method812((long) i_27_, s, i, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub7.aClass16_2200, class16 }, -120), 500, class16s[i_28_], i_26_);
								}
							}
						}
						if (Class23_Sub4_Sub29.anInt3369 == 0 && class16s != null) {
							for (int i_29_ = 4; (i_29_ ^ 0xffffffff) <= -1; i_29_--) {
								if (class16s[i_29_] != null && class16s[i_29_].method140(Class31.aClass16_487, 40)) {
									Class23_Sub7.anInt2195++;
									short s = 0;
									short s_30_ = 0;
									if ((i_29_ ^ 0xffffffff) == -1) {
										s_30_ = (short) 58;
									}
									if ((Class105.aClass38_Sub7_Sub2_1812.anInt4383 ^ 0xffffffff) > (class23_sub13_sub20.anInt4166 ^ 0xffffffff)) {
										s = (short) 2000;
									}
									if (i_29_ == 1) {
										s_30_ = (short) 45;
									}
									if (i_29_ == 2) {
										s_30_ = (short) 31;
									}
									if (i_29_ == 3) {
										s_30_ = (short) 1;
									}
									if (i_29_ == 4) {
										s_30_ = (short) 48;
									}
									if (s_30_ != 0) {
										s_30_ += s;
									}
									Class23_Sub13_Sub19.method812((long) i_27_, s_30_, i, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub7.aClass16_2200, class16 }, -95), 500, class16s[i_29_], i_26_);
								}
							}
						}
						Class23_Sub13_Sub19.method812((long) i_27_, (short) 1004, i, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub7.aClass16_2200, class16 }, -75), 500, Class71_Sub1_Sub1.aClass16_4462, i_26_);
					} else if ((Class71_Sub1.anInt2725 & 0x2) == 2) {
						Class49.anInt766++;
						Class23_Sub13_Sub19.method812((long) i_27_, (short) 21, i, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub4.aClass16_3714, Class23_Sub4_Sub21.aClass16_3248, class16 }, -119), 500, Class49.aClass16_764, i_26_);
					}
				} else {
					Class23_Sub4_Sub7.anInt3006++;
					Class23_Sub13_Sub19.method812((long) i_27_, (short) 32, i, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub24.aClass16_4281, Class23_Sub4_Sub21.aClass16_3248, class16 }, -107), 500, Class23_Sub13_Sub20.aClass16_4163, i_26_);
				}
			}
		}
	}
	
	static final boolean method277(int i, byte[] bs, int i_31_, byte b) {
		int i_32_ = 75 / ((64 - b) / 40);
		boolean bool = true;
		Buffer class23_sub5 = new Buffer(bs);
		anInt2933++;
		int i_33_ = -1;
		for (;;) {
			int i_34_ = class23_sub5.method447((byte) -120);
			if ((i_34_ ^ 0xffffffff) == -1) {
				break;
			}
			i_33_ += i_34_;
			int i_35_ = 0;
			boolean bool_36_ = false;
			for (;;) {
				if (bool_36_) {
					int i_37_ = class23_sub5.method432((byte) 108);
					if ((i_37_ ^ 0xffffffff) == -1) {
						break;
					}
					class23_sub5.readByte();
				} else {
					int i_38_ = class23_sub5.method432((byte) 112);
					if ((i_38_ ^ 0xffffffff) == -1) {
						break;
					}
					i_35_ += i_38_ - 1;
					int i_39_ = class23_sub5.readByte() >> 2;
					int i_40_ = (0xff7 & i_35_) >> 6;
					int i_41_ = i_31_ + i_40_;
					int i_42_ = i_35_ & 0x3f;
					int i_43_ = i + i_42_;
					if (i_41_ > 0 && (i_43_ ^ 0xffffffff) < -1 && i_41_ < 103 && i_43_ < 103) {
						Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(i_33_, -21035);
						if (i_39_ != 22 || !Class7.aBoolean170 || (class23_sub13_sub7.anInt3793 ^ 0xffffffff) != -1 || class23_sub13_sub7.anInt3806 == 1 || class23_sub13_sub7.aBoolean3785) {
							if (!class23_sub13_sub7.method642(10286)) {
								bool = false;
								Class23_Sub4_Sub9.anInt3036++;
							}
							bool_36_ = true;
						}
					}
				}
			}
		}
		return bool;
	}
	
	final int[] method260(int i, int i_44_) {
		anInt2928++;
		int[] is = aClass99_2115.method1500(i_44_, (byte) -113);
		if (i != 0) {
			return null;
		}
		if (aClass99_2115.aBoolean1681) {
			int i_45_ = anInt2918 >> 1;
			int[][] is_46_ = aClass99_2115.method1499((byte) -98);
			Random random = new Random((long) anInt2914);
			for (int i_47_ = 0; anInt2926 > i_47_; i_47_++) {
				int i_48_ = anInt2918 > 0 ? anInt2915 - (i_45_ + -Class23_Sub13_Sub9.method686(i ^ 0x3072, random, anInt2918)) : anInt2915;
				int i_49_ = Class23_Sub13_Sub9.method686(12402, random, Class23_Sub4_Sub33.anInt3428);
				i_48_ = (0xff8 & i_48_) >> 4;
				int i_50_ = Class23_Sub13_Sub9.method686(12402, random, Class102.anInt1706);
				int i_51_ = i_49_ - -(Class55.anIntArray870[i_48_] * anInt2912 >> 12);
				int i_52_ = (anInt2912 * Class47.anIntArray739[i_48_] >> 12) + i_50_;
				int i_53_ = -i_49_ + i_51_;
				int i_54_ = i_52_ + -i_50_;
				if (i_53_ != 0 || (i_54_ ^ 0xffffffff) != -1) {
					if ((i_53_ ^ 0xffffffff) > -1) {
						i_53_ = -i_53_;
					}
					if ((i_54_ ^ 0xffffffff) > -1) {
						i_54_ = -i_54_;
					}
					boolean bool = i_53_ < i_54_;
					if (bool) {
						int i_55_ = i_49_;
						int i_56_ = i_51_;
						i_49_ = i_50_;
						i_51_ = i_52_;
						i_52_ = i_56_;
						i_50_ = i_55_;
					}
					if (i_49_ > i_51_) {
						int i_57_ = i_49_;
						i_49_ = i_51_;
						int i_58_ = i_50_;
						i_50_ = i_52_;
						i_51_ = i_57_;
						i_52_ = i_58_;
					}
					int i_59_ = -i_50_ + i_52_;
					int i_60_ = i_51_ - i_49_;
					if (i_59_ < 0) {
						i_59_ = -i_59_;
					}
					int i_61_ = i_50_;
					int i_62_ = 1024 - (Class23_Sub13_Sub9.method686(i ^ 0x3072, random, 4096) >> 2);
					int i_63_ = -i_60_ / 2;
					int i_64_ = 2048 / i_60_;
					int i_65_ = i_52_ <= i_50_ ? -1 : 1;
					for (int i_66_ = i_49_; (i_66_ ^ 0xffffffff) > (i_51_ ^ 0xffffffff); i_66_++) {
						int i_67_ = 1024 + (i_62_ + i_64_ * (-i_49_ + i_66_));
						int i_68_ = i_61_ & Class23_Sub4_Sub1.anInt2892;
						i_63_ += i_59_;
						int i_69_ = i_66_ & Class95.anInt1611;
						if (i_63_ > 0) {
							i_63_ = -i_60_ + i_63_;
							i_61_ = i_65_ + i_61_;
						}
						if (!bool) {
							is_46_[i_69_][i_68_] = i_67_;
						} else {
							is_46_[i_68_][i_69_] = i_67_;
						}
					}
				}
			}
		}
		return is;
	}
	
	static final void method278(long l, byte b) {
		anInt2927++;
		if (l != 0L) {
			for (int i = 0; i < Class45.anInt696; i++) {
				if ((l ^ 0xffffffffffffffffL) == (Class68.aLongArray1187[i] ^ 0xffffffffffffffffL)) {
					Class87.anInt1490++;
					Class45.anInt696--;
					for (int i_70_ = i; (i_70_ ^ 0xffffffff) > (Class45.anInt696 ^ 0xffffffff); i_70_++) {
						Class23_Sub4_Sub14.aClass16Array3130[i_70_] = Class23_Sub4_Sub14.aClass16Array3130[i_70_ + 1];
						Class23_Sub10_Sub3.anIntArray3658[i_70_] = Class23_Sub10_Sub3.anIntArray3658[i_70_ + 1];
						Class87_Sub3.aClass16Array2816[i_70_] = Class87_Sub3.aClass16Array2816[i_70_ + 1];
						Class68.aLongArray1187[i_70_] = Class68.aLongArray1187[1 + i_70_];
						Class11.anIntArray229[i_70_] = Class11.anIntArray229[1 + i_70_];
						Class104.aBooleanArray1741[i_70_] = Class104.aBooleanArray1741[1 + i_70_];
					}
					Class75.anInt1372 = Class23_Sub10_Sub2.anInt3589;
					Class23_Sub7.outBuffer.method486(47, 2976);
					Class23_Sub7.outBuffer.method436(l, (byte) -108);
					break;
				}
			}
			if (b >= -37) {
				aClass16_2929 = null;
			}
		}
	}
	
	public static void method279(byte b) {
		aClass14_2911 = null;
		if (b != 2) {
			method276(-15, 51, null, true, 42);
		}
		aClass16_2913 = null;
		aClass38_Sub7_Sub2Array2932 = null;
		aClass16_2931 = null;
		aClass16_2921 = null;
		aClass16_2917 = null;
		aClass16_2929 = null;
		aClass16_2916 = null;
		aClass16_2919 = null;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_71_) {
		if (i_71_ != 1000) {
			aClass16_2916 = null;
		}
		int i_72_ = i;
	while_7_:
		do {
		while_6_:
			do {
			while_5_:
				do {
					do {
						if (i_72_ != 0) {
							if (i_72_ != 1) {
								if (i_72_ != 2) {
									if (i_72_ != 3) {
										if (i_72_ == 4) {
											break while_6_;
										}
										break while_7_;
									}
								} else {
									break;
								}
								break while_5_;
							}
						} else {
							anInt2914 = class23_sub5.readByte();
							break while_7_;
						}
						anInt2926 = class23_sub5.readShortBE();
						break while_7_;
					} while (false);
					anInt2912 = class23_sub5.readByte();
					break while_7_;
				} while (false);
				anInt2915 = class23_sub5.readShortBE();
				break while_7_;
			} while (false);
			anInt2918 = class23_sub5.readShortBE();
		} while (false);
		anInt2924++;
	}
	
	public Class23_Sub4_Sub2() {
		super(0, true);
		anInt2912 = 16;
		anInt2926 = 2000;
		anInt2914 = 0;
	}
	
	static {
		aClass16_2919 = Class38_Sub6.method1076((byte) 86, "To create a new account you need to");
		anInt2923 = 0;
		aClass16_2913 = aClass16_2919;
		aClass16_2931 = Class38_Sub6.method1076((byte) 86, "Loaded config");
		anInt2920 = 127;
		aClass16_2929 = aClass16_2931;
		aClass16_2921 = Class38_Sub6.method1076((byte) 86, "sl_flags");
		aClass16_2917 = Class38_Sub6.method1076((byte) 86, "mapfunction");
		aClass38_Sub7_Sub2Array2932 = new Class38_Sub7_Sub2[2048];
	}
}
