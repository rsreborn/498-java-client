/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class56
{
	static RSString aClass16_886 = Class38_Sub6.method1076((byte) 86, "Verbindung abgebrochen)3");
	static int anInt887;
	static int anInt888 = 0;
	static int anInt889;
	static int anInt890;
	static int anInt891;
	static RSString aClass16_892 = Class38_Sub6.method1076((byte) 86, "Eingabeprozedur geladen)3");
	static Class23_Sub13_Sub10 aClass23_Sub13_Sub10_893;
	static int anInt894;
	static int anInt895;
	static int anInt896;
	
	static final int method1182(int i, boolean bool) {
		anInt889++;
		int i_0_ = i * (i * i >> 12) >> 12;
		if (bool != true) {
			aClass16_886 = null;
		}
		int i_1_ = -61440 + 6 * i;
		int i_2_ = 40960 - -(i_1_ * i >> 12);
		return i_2_ * i_0_ >> 12;
	}
	
	public static void method1183(byte b) {
		aClass16_886 = null;
		aClass16_892 = null;
		int i = -47 / ((b - 63) / 52);
		aClass23_Sub13_Sub10_893 = null;
	}
	
	static final void method1184(byte b, Class38_Sub7 class38_sub7) {
		anInt887++;
		if (class38_sub7.anInt2630 != 0) {
			if (class38_sub7.anInt2686 != -1 && class38_sub7.anInt2686 < 32768) {
				Class38_Sub7_Sub1 class38_sub7_sub1 = Class31.aClass38_Sub7_Sub1Array483[class38_sub7.anInt2686];
				if (class38_sub7_sub1 != null) {
					int i = class38_sub7.anInt2674 - class38_sub7_sub1.anInt2674;
					int i_3_ = class38_sub7.anInt2659 - class38_sub7_sub1.anInt2659;
					if (i != 0 || (i_3_ ^ 0xffffffff) != -1) {
						class38_sub7.anInt2682 = (int) (Math.atan2((double) i, (double) i_3_) * 325.949) & 0x7ff;
					}
				}
			}
			if (class38_sub7.anInt2686 >= 32768) {
				int i = -32768 + class38_sub7.anInt2686;
				if (Class23_Sub4_Sub10.anInt3049 == i) {
					i = 2047;
				}
				Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[i];
				if (class38_sub7_sub2 != null) {
					int i_4_ = class38_sub7.anInt2674 - class38_sub7_sub2.anInt2674;
					int i_5_ = -class38_sub7_sub2.anInt2659 + class38_sub7.anInt2659;
					if (i_4_ != 0 || (i_5_ ^ 0xffffffff) != -1) {
						class38_sub7.anInt2682 = 0x7ff & (int) (325.949 * Math.atan2((double) i_4_, (double) i_5_));
					}
				}
			}
			if (((class38_sub7.anInt2648 ^ 0xffffffff) != -1 || class38_sub7.anInt2692 != 0) && (class38_sub7.anInt2660 == 0 || class38_sub7.anInt2632 > 0)) {
				int i = 64 * class38_sub7.anInt2668 - (64 - class38_sub7.anInt2674 - -(64 * (-Class42.anInt662 + (class38_sub7.anInt2648 + -Class42.anInt662))));
				int i_6_ = -((-Class58.anInt903 + (-Class58.anInt903 + class38_sub7.anInt2692)) * 64) + (-64 - -(class38_sub7.anInt2668 * 64)) + class38_sub7.anInt2659;
				if ((i ^ 0xffffffff) != -1 || (i_6_ ^ 0xffffffff) != -1) {
					class38_sub7.anInt2682 = (int) (Math.atan2((double) i, (double) i_6_) * 325.949) & 0x7ff;
				}
				class38_sub7.anInt2692 = 0;
				class38_sub7.anInt2648 = 0;
			}
			if (b >= -36) {
				aClass23_Sub13_Sub10_893 = null;
			}
			int i = 0x7ff & class38_sub7.anInt2682 + -class38_sub7.anInt2680;
			if (i != 0) {
				class38_sub7.anInt2644++;
				if (i <= 1024) {
					class38_sub7.anInt2680 += class38_sub7.anInt2630;
					boolean bool = true;
					if ((class38_sub7.anInt2630 ^ 0xffffffff) < (i ^ 0xffffffff) || i > -class38_sub7.anInt2630 + 2048) {
						bool = false;
						class38_sub7.anInt2680 = class38_sub7.anInt2682;
					}
					if (class38_sub7.anInt2635 == class38_sub7.anInt2634 && (class38_sub7.anInt2644 > 25 || bool)) {
						if (class38_sub7.anInt2691 != -1) {
							class38_sub7.anInt2634 = class38_sub7.anInt2691;
						} else {
							class38_sub7.anInt2634 = class38_sub7.anInt2641;
						}
					}
				} else {
					boolean bool = true;
					class38_sub7.anInt2680 -= class38_sub7.anInt2630;
					if ((i ^ 0xffffffff) > (class38_sub7.anInt2630 ^ 0xffffffff) || (2048 + -class38_sub7.anInt2630 ^ 0xffffffff) > (i ^ 0xffffffff)) {
						bool = false;
						class38_sub7.anInt2680 = class38_sub7.anInt2682;
					}
					if (class38_sub7.anInt2634 == class38_sub7.anInt2635 && (class38_sub7.anInt2644 > 25 || bool)) {
						if (class38_sub7.anInt2653 == -1) {
							class38_sub7.anInt2634 = class38_sub7.anInt2641;
						} else {
							class38_sub7.anInt2634 = class38_sub7.anInt2653;
						}
					}
				}
				class38_sub7.anInt2680 &= 0x7ff;
			} else {
				class38_sub7.anInt2644 = 0;
			}
		}
	}
	
	static final void method1185(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		anInt896++;
		int i_12_ = i_7_;
		int i_13_ = 0;
		int i_14_ = i_7_ * i_7_;
		int i_15_ = i_11_ * i_11_;
		int i_16_ = i_15_ << 1;
		int i_17_ = i_14_ << 1;
		int i_18_ = i_7_ << 1;
		int i_19_ = i_17_ + (-i_18_ + 1) * i_15_;
		int i_20_ = i_16_ * (-3 + (i_12_ << 1));
		if ((i ^ 0xffffffff) <= (Class88.anInt1503 ^ 0xffffffff) && Class23_Sub4_Sub33.anInt3435 >= i) {
			int i_21_ = Class23_Sub4_Sub32.method405(i_10_ + 81, Class23_Sub13_Sub6.anInt3728, i_9_ - -i_11_, Class35.anInt554);
			int i_22_ = Class23_Sub4_Sub32.method405(88, Class23_Sub13_Sub6.anInt3728, -i_11_ + i_9_, Class35.anInt554);
			Class23_Sub13_Sub6.method632(i_21_, (byte) -30, i_8_, Class4.anIntArrayArray98[i], i_22_);
		}
		int i_23_ = i_17_ * ((i_13_ << 1) + i_10_);
		int i_24_ = i_15_ << 2;
		int i_25_ = i_14_ << 2;
		int i_26_ = (-1 + i_12_) * i_24_;
		int i_27_ = i_25_ * (1 + i_13_);
		int i_28_ = i_14_ + -(i_16_ * (i_18_ + -1));
		while ((i_12_ ^ 0xffffffff) < -1) {
			i_12_--;
			if (i_19_ < 0) {
				while ((i_19_ ^ 0xffffffff) > -1) {
					i_19_ += i_23_;
					i_28_ += i_27_;
					i_13_++;
					i_23_ += i_25_;
					i_27_ += i_25_;
				}
			}
			int i_29_ = i - i_12_;
			if ((i_28_ ^ 0xffffffff) > -1) {
				i_19_ += i_23_;
				i_13_++;
				i_28_ += i_27_;
				i_27_ += i_25_;
				i_23_ += i_25_;
			}
			i_19_ += -i_26_;
			i_28_ += -i_20_;
			int i_30_ = i - -i_12_;
			i_20_ -= i_24_;
			if ((i_30_ ^ 0xffffffff) <= (Class88.anInt1503 ^ 0xffffffff) && i_29_ <= Class23_Sub4_Sub33.anInt3435) {
				int i_31_ = Class23_Sub4_Sub32.method405(i_10_ ^ 0x39, Class23_Sub13_Sub6.anInt3728, i_9_ + i_13_, Class35.anInt554);
				int i_32_ = Class23_Sub4_Sub32.method405(65, Class23_Sub13_Sub6.anInt3728, i_9_ - i_13_, Class35.anInt554);
				if ((i_29_ ^ 0xffffffff) <= (Class88.anInt1503 ^ 0xffffffff)) {
					Class23_Sub13_Sub6.method632(i_31_, (byte) -30, i_8_, Class4.anIntArrayArray98[i_29_], i_32_);
				}
				if (i_30_ <= Class23_Sub4_Sub33.anInt3435) {
					Class23_Sub13_Sub6.method632(i_31_, (byte) -30, i_8_, Class4.anIntArrayArray98[i_30_], i_32_);
				}
			}
			i_26_ -= i_24_;
		}
	}
	
	static final void method1186(int i, boolean bool, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_) {
		anInt894++;
		int i_39_ = 0;
		int i_40_ = i_38_;
		int i_41_ = 0;
		int i_42_ = -i_34_ + i_35_;
		int i_43_ = i_38_ + -i_34_;
		int i_44_ = i_38_ * i_38_;
		int i_45_ = i_43_ * i_43_;
		int i_46_ = i_42_ * i_42_;
		int i_47_ = i_35_ * i_35_;
		int i_48_ = i_44_ << 1;
		if (bool != true) {
			aClass16_892 = null;
		}
		int i_49_ = i_47_ << 1;
		int i_50_ = i_45_ << 1;
		int i_51_ = i_38_ << 1;
		int i_52_ = i_48_ + (1 + -i_51_) * i_47_;
		int i_53_ = i_46_ << 1;
		int i_54_ = i_43_ << 1;
		int i_55_ = i_50_ + (-i_54_ + 1) * i_46_;
		int i_56_ = -((i_54_ + -1) * i_53_) + i_45_;
		int i_57_ = -((i_51_ - 1) * i_49_) + i_44_;
		int i_58_ = i_47_ << 2;
		int i_59_ = i_44_ << 2;
		int i_60_ = i_46_ << 2;
		int i_61_ = i_45_ << 2;
		int i_62_ = 3 * i_48_;
		int i_63_ = i_49_ * (-3 + i_51_);
		int i_64_ = i_50_ * 3;
		int i_65_ = (i_54_ - 3) * i_53_;
		int i_66_ = i_61_;
		int i_67_ = (i_38_ + -1) * i_58_;
		int i_68_ = i_59_;
		int i_69_ = i_60_ * (i_43_ - 1);
		int[] is = Class4.anIntArrayArray98[i_36_];
		Class23_Sub13_Sub6.method632(i_33_ + -i_42_, (byte) -30, i, is, -i_35_ + i_33_);
		Class23_Sub13_Sub6.method632(i_33_ + i_42_, (byte) -30, i_37_, is, -i_42_ + i_33_);
		Class23_Sub13_Sub6.method632(i_33_ + i_35_, (byte) -30, i, is, i_42_ + i_33_);
		while (i_40_ > 0) {
			if ((i_52_ ^ 0xffffffff) > -1) {
				while ((i_52_ ^ 0xffffffff) > -1) {
					i_39_++;
					i_52_ += i_62_;
					i_62_ += i_59_;
					i_57_ += i_68_;
					i_68_ += i_59_;
				}
			}
			boolean bool_70_ = i_40_ <= i_43_;
			if (bool_70_) {
				if (i_55_ < 0) {
					while (i_55_ < 0) {
						i_41_++;
						i_55_ += i_64_;
						i_56_ += i_66_;
						i_64_ += i_61_;
						i_66_ += i_61_;
					}
				}
				if (i_56_ < 0) {
					i_41_++;
					i_56_ += i_66_;
					i_55_ += i_64_;
					i_66_ += i_61_;
					i_64_ += i_61_;
				}
				i_56_ += -i_65_;
				i_65_ -= i_60_;
				i_55_ += -i_69_;
				i_69_ -= i_60_;
			}
			if ((i_57_ ^ 0xffffffff) > -1) {
				i_39_++;
				i_57_ += i_68_;
				i_52_ += i_62_;
				i_62_ += i_59_;
				i_68_ += i_59_;
			}
			int i_71_ = i_33_ - -i_39_;
			i_40_--;
			int i_72_ = i_33_ - i_39_;
			int i_73_ = -i_40_ + i_36_;
			int i_74_ = i_36_ + i_40_;
			if (bool_70_) {
				int i_75_ = -i_41_ + i_33_;
				int i_76_ = i_41_ + i_33_;
				Class23_Sub13_Sub6.method632(i_75_, (byte) -30, i, Class4.anIntArrayArray98[i_73_], i_72_);
				Class23_Sub13_Sub6.method632(i_76_, (byte) -30, i_37_, Class4.anIntArrayArray98[i_73_], i_75_);
				Class23_Sub13_Sub6.method632(i_71_, (byte) -30, i, Class4.anIntArrayArray98[i_73_], i_76_);
				Class23_Sub13_Sub6.method632(i_75_, (byte) -30, i, Class4.anIntArrayArray98[i_74_], i_72_);
				Class23_Sub13_Sub6.method632(i_76_, (byte) -30, i_37_, Class4.anIntArrayArray98[i_74_], i_75_);
				Class23_Sub13_Sub6.method632(i_71_, (byte) -30, i, Class4.anIntArrayArray98[i_74_], i_76_);
			} else {
				Class23_Sub13_Sub6.method632(i_71_, (byte) -30, i, Class4.anIntArrayArray98[i_73_], i_72_);
				Class23_Sub13_Sub6.method632(i_71_, (byte) -30, i, Class4.anIntArrayArray98[i_74_], i_72_);
			}
			i_57_ += -i_63_;
			i_63_ -= i_58_;
			i_52_ += -i_67_;
			i_67_ -= i_58_;
		}
	}
	
	static final void method1187(boolean bool, int i, int i_77_, int i_78_, int i_79_) {
		anInt895++;
		if (bool == false) {
			if (i_77_ < i_78_) {
				Class23_Sub13_Sub6.method632(i_78_, (byte) -30, i, Class4.anIntArrayArray98[i_79_], i_77_);
			} else {
				Class23_Sub13_Sub6.method632(i_77_, (byte) -30, i, Class4.anIntArrayArray98[i_79_], i_78_);
			}
		}
	}
	
	static final void method1188(int i) {
		anInt890++;
		if (Class23_Sub13.anInt2316 > 1) {
			Class23_Sub13.anInt2316--;
			Class88.anInt1499 = Class23_Sub10_Sub2.anInt3589;
		}
		if ((Class23_Sub4_Sub31.anInt3400 ^ 0xffffffff) < -1) {
			Class23_Sub4_Sub31.anInt3400--;
		}
		if (Class23_Sub4_Sub7.aBoolean3012) {
			Class23_Sub4_Sub7.aBoolean3012 = false;
			Class44.method1128(-35);
		} else {
			for (int i_80_ = 0; i_80_ < 100; i_80_++) {
				if (!Class79.method1362(-51)) {
					break;
				}
			}
			if (Class49.anInt756 == 30) {
				Class23_Sub13_Sub2.method608(Class23_Sub7.outBuffer, 120, (byte) 35);
				synchronized (Class23_Sub4_Sub39.aClass98_3513.anObject1653) {
					if (Class23_Sub4_Sub30.aBoolean3380) {
						if (Class23_Sub13_Sub9.anInt3860 != 0 || Class23_Sub4_Sub39.aClass98_3513.anInt1659 >= 40) {
							Class23_Sub7.outBuffer.method486(43, 2976);
							Class23_Sub15.anInt2344++;
							Class23_Sub7.outBuffer.writeByte(0);
							int i_81_ = Class23_Sub7.outBuffer.position;
							int i_82_ = 0;
							for (int i_83_ = 0; (i_83_ ^ 0xffffffff) > (Class23_Sub4_Sub39.aClass98_3513.anInt1659 ^ 0xffffffff); i_83_++) {
								if (-i_81_ + Class23_Sub7.outBuffer.position >= 240) {
									break;
								}
								i_82_++;
								int i_84_ = Class23_Sub4_Sub39.aClass98_3513.anIntArray1661[i_83_];
								if (i_84_ < 0) {
									i_84_ = 0;
								} else if (i_84_ > 502) {
									i_84_ = 502;
								}
								int i_85_ = Class23_Sub4_Sub39.aClass98_3513.anIntArray1658[i_83_];
								if ((i_85_ ^ 0xffffffff) > -1) {
									i_85_ = 0;
								} else if (i_85_ > 764) {
									i_85_ = 764;
								}
								int i_86_ = 765 * i_84_ + i_85_;
								if ((Class23_Sub4_Sub39.aClass98_3513.anIntArray1661[i_83_] ^ 0xffffffff) == 0 && Class23_Sub4_Sub39.aClass98_3513.anIntArray1658[i_83_] == -1) {
									i_86_ = 524287;
									i_85_ = -1;
									i_84_ = -1;
								}
								if ((oa.anInt1267 ^ 0xffffffff) == (i_85_ ^ 0xffffffff) && i_84_ == Class87_Sub4.anInt2843) {
									if (Class23_Sub13_Sub14.anInt4002 < 2047) {
										Class23_Sub13_Sub14.anInt4002++;
									}
								} else {
									int i_87_ = i_85_ + -oa.anInt1267;
									int i_88_ = i_84_ - Class87_Sub4.anInt2843;
									oa.anInt1267 = i_85_;
									Class87_Sub4.anInt2843 = i_84_;
									if (Class23_Sub13_Sub14.anInt4002 < 8 && i_87_ >= -32 && i_87_ <= 31 && i_88_ >= -32 && i_88_ <= 31) {
										i_88_ += 32;
										i_87_ += 32;
										Class23_Sub7.outBuffer.method443(i_88_ + (i_87_ << 6) + (Class23_Sub13_Sub14.anInt4002 << 12), (byte) 51);
										Class23_Sub13_Sub14.anInt4002 = 0;
									} else if (Class23_Sub13_Sub14.anInt4002 < 8) {
										Class23_Sub7.outBuffer.method457(-483923896, i_86_ + ((Class23_Sub13_Sub14.anInt4002 << 19) + 8388608));
										Class23_Sub13_Sub14.anInt4002 = 0;
									} else {
										Class23_Sub7.outBuffer.writeIntBE(-1073741824 - -(Class23_Sub13_Sub14.anInt4002 << 19) + i_86_);
										Class23_Sub13_Sub14.anInt4002 = 0;
									}
								}
							}
							Class23_Sub7.outBuffer.method477((byte) 21, Class23_Sub7.outBuffer.position - i_81_);
							if ((i_82_ ^ 0xffffffff) <= (Class23_Sub4_Sub39.aClass98_3513.anInt1659 ^ 0xffffffff)) {
								Class23_Sub4_Sub39.aClass98_3513.anInt1659 = 0;
							} else {
								Class23_Sub4_Sub39.aClass98_3513.anInt1659 -= i_82_;
								for (int i_89_ = 0; (i_89_ ^ 0xffffffff) > (Class23_Sub4_Sub39.aClass98_3513.anInt1659 ^ 0xffffffff); i_89_++) {
									Class23_Sub4_Sub39.aClass98_3513.anIntArray1658[i_89_] = Class23_Sub4_Sub39.aClass98_3513.anIntArray1658[i_82_ + i_89_];
									Class23_Sub4_Sub39.aClass98_3513.anIntArray1661[i_89_] = Class23_Sub4_Sub39.aClass98_3513.anIntArray1661[i_89_ - -i_82_];
								}
							}
						}
					} else {
						Class23_Sub4_Sub39.aClass98_3513.anInt1659 = 0;
					}
				}
				if ((Class23_Sub13_Sub9.anInt3860 ^ 0xffffffff) != -1) {
					Class87_Sub3.anInt2809++;
					long l = (Class23_Sub13_Sub12.aLong3975 - Class23_Sub2.aLong2058) / 50L;
					Class23_Sub2.aLong2058 = Class23_Sub13_Sub12.aLong3975;
					if ((l ^ 0xffffffffffffffffL) < -4096L) {
						l = 4095L;
					}
					int i_90_ = Class90.anInt1538;
					if (i_90_ < 0) {
						i_90_ = 0;
					} else if (i_90_ > 764) {
						i_90_ = 764;
					}
					int i_91_ = Class23_Sub13_Sub19.anInt4136;
					int i_92_ = 0;
					if (Class23_Sub13_Sub9.anInt3860 == 2) {
						i_92_ = 1;
					}
					if (i_91_ < 0) {
						i_91_ = 0;
					} else if (i_91_ > 502) {
						i_91_ = 502;
					}
					int i_93_ = (int) l;
					Class23_Sub7.outBuffer.method486(192, i + 1990508026);
					int i_94_ = i_91_ * 765 - -i_90_;
					Class23_Sub7.outBuffer.method439((byte) -75, (i_92_ << 19) + ((i_93_ << 20) - -i_94_));
				}
				if (Class23_Sub13_Sub8_Sub1.aBooleanArray4492[96] || Class23_Sub13_Sub8_Sub1.aBooleanArray4492[97] || Class23_Sub13_Sub8_Sub1.aBooleanArray4492[98] || Class23_Sub13_Sub8_Sub1.aBooleanArray4492[99]) {
					Class107.aBoolean1841 = true;
				}
				if (Class23_Sub13_Sub3.anInt3703 > 0) {
					Class23_Sub13_Sub3.anInt3703--;
				}
				if (Class107.aBoolean1841 && (Class23_Sub13_Sub3.anInt3703 ^ 0xffffffff) >= -1) {
					Class17_Sub1.anInt1989++;
					Class107.aBoolean1841 = false;
					Class23_Sub13_Sub3.anInt3703 = 20;
					Class23_Sub7.outBuffer.method486(183, 2976);
					Class23_Sub7.outBuffer.method443(Class23_Sub4_Sub37.anInt3492, (byte) 51);
					Class23_Sub7.outBuffer.method427(Class35.anInt550, -1371695448);
				}
				if (Class23_Sub13_Sub25.aBoolean4294 == true && Class23_Sub13_Sub3.aBoolean3698 == false) {
					Class23_Sub13_Sub3.aBoolean3698 = true;
					Class65.anInt1162++;
					Class23_Sub7.outBuffer.method486(32, 2976);
					Class23_Sub7.outBuffer.writeByte(1);
				}
				if (!Class23_Sub13_Sub25.aBoolean4294 == true && Class23_Sub13_Sub3.aBoolean3698 != false) {
					Class23_Sub13_Sub3.aBoolean3698 = false;
					Class23_Sub7.outBuffer.method486(32, 2976);
					Class23_Sub7.outBuffer.writeByte(0);
					Class65.anInt1162++;
				}
				Class23_Sub4_Sub1.method269(i ^ 0x76a4b231);
				if (Class49.anInt756 == 30) {
					Class82.method1375(30797);
					Class8.method98(125);
					Class63.anInt992++;
					if (Class63.anInt992 > 750) {
						Class44.method1128(122);
					} else {
						Class51.method1163((byte) -102);
						Class79.method1363(i + 1990505144);
						Class4.method61(0);
						if (Class23_Sub13_Sub12.aClass64_3967 != null) {
							Class23_Sub4_Sub7.method293((byte) -124);
						}
						Class23_Sub25.anInt2459++;
						if (Class23_Sub7.anInt2213 != 0) {
							Class51.anInt798 += 20;
							if (Class51.anInt798 >= 400) {
								Class23_Sub7.anInt2213 = 0;
							}
						}
						if (Class32.aClass64_502 != null) {
							Class23_Sub4_Sub38.anInt3500++;
							if (Class23_Sub4_Sub38.anInt3500 >= 15) {
								Class91.method1450((byte) 29, Class32.aClass64_502);
								Class32.aClass64_502 = null;
							}
						}
						if (Class51.aClass64_790 != null) {
							Class91.method1450((byte) 29, Class51.aClass64_790);
							Class103.anInt1728++;
							if (5 + Class23_Sub23.anInt2435 < Class23_Sub4_Sub14.anInt3126 || Class23_Sub4_Sub14.anInt3126 < Class23_Sub23.anInt2435 + -5 || Class102.anInt1701 > Class23_Sub4_Sub38.anInt3510 - -5 || (Class23_Sub4_Sub38.anInt3510 - 5 ^ 0xffffffff) < (Class102.anInt1701 ^ 0xffffffff)) {
								Class23_Sub13_Sub23.aBoolean4262 = true;
							}
							if ((Class8.anInt175 ^ 0xffffffff) == -1) {
								if (!Class23_Sub13_Sub23.aBoolean4262 || Class103.anInt1728 < 5) {
									if (Class95.anInt1612 != 1 && !Class87_Sub4.method1425((byte) 113, -1 + Class23_Sub13_Sub9.anInt3863) || Class23_Sub13_Sub9.anInt3863 <= 2) {
										if (Class23_Sub13_Sub9.anInt3863 > 0) {
											Class71_Sub1_Sub1.method1272((byte) -82, Class23_Sub13_Sub9.anInt3863 + -1);
										}
									} else {
										Class36.method986(false);
									}
								} else if (Class51.aClass64_790 == Class23_Sub13_Sub23.aClass64_4257 && Class87_Sub3.anInt2822 != Class49.anInt761) {
									Class71.anInt1277++;
									int i_95_ = 0;
									Class64 class64 = Class51.aClass64_790;
									if (Class75.anInt1376 == 1 && class64.anInt1149 == 206) {
										i_95_ = 1;
									}
									if (class64.anIntArray1028[Class49.anInt761] <= 0) {
										i_95_ = 0;
									}
									if (Class23_Sub1.method231(Class47.method1142(class64, 51), -128)) {
										int i_96_ = Class87_Sub3.anInt2822;
										int i_97_ = Class49.anInt761;
										class64.anIntArray1028[i_97_] = class64.anIntArray1028[i_96_];
										class64.anIntArray1147[i_97_] = class64.anIntArray1147[i_96_];
										class64.anIntArray1028[i_96_] = -1;
										class64.anIntArray1147[i_96_] = 0;
									} else if (i_95_ == 1) {
										int i_98_ = Class49.anInt761;
										int i_99_ = Class87_Sub3.anInt2822;
										while ((i_99_ ^ 0xffffffff) != (i_98_ ^ 0xffffffff)) {
											if (i_98_ >= i_99_) {
												if ((i_99_ ^ 0xffffffff) > (i_98_ ^ 0xffffffff)) {
													class64.method1217(108, i_99_ - -1, i_99_);
													i_99_++;
												}
											} else {
												class64.method1217(i + 1990505087, -1 + i_99_, i_99_);
												i_99_--;
											}
										}
									} else {
										class64.method1217(12, Class49.anInt761, Class87_Sub3.anInt2822);
									}
									Class23_Sub7.outBuffer.method486(178, 2976);
									Class23_Sub7.outBuffer.method443(Class87_Sub3.anInt2822, (byte) 51);
									Class23_Sub7.outBuffer.method445(Class51.aClass64_790.anInt1098, (byte) 66);
									Class23_Sub7.outBuffer.writeByte(i_95_);
									Class23_Sub7.outBuffer.method427(Class49.anInt761, -1371695448);
								}
								Class23_Sub13_Sub9.anInt3860 = 0;
								Class51.aClass64_790 = null;
								Class23_Sub4_Sub38.anInt3500 = 10;
							}
						}
						Class38_Sub7.anInt2649 = 0;
						Class23_Sub4_Sub39.aBoolean3516 = false;
						if (i != -1990505050) {
							method1185(-112, 7, -103, -128, -62, 62);
						}
						Class23_Sub13_Sub19.aClass64_4132 = null;
						Class72.aBoolean1310 = false;
						Class64 class64 = Class42.aClass64_663;
						Class42.aClass64_663 = null;
						Class64 class64_100_ = Class92.aClass64_1567;
						Class92.aClass64_1567 = null;
						for (/**/; CacheArchive.method1572(i ^ ~0x76a4d3ef) && Class38_Sub7.anInt2649 < 128; Class38_Sub7.anInt2649++) {
							Class23_Sub9.anIntArray2265[Class38_Sub7.anInt2649] = Class88.anInt1506;
							Class17.anIntArray308[Class38_Sub7.anInt2649] = Class53.anInt833;
						}
						Class23_Sub13_Sub12.aClass64_3967 = null;
						if ((Class69.anInt1218 ^ 0xffffffff) != 0) {
							Class23_Sub4_Sub9.method299(Class51.anInt801, Class69.anInt1218, 0, i ^ ~0x76a4b23d, 0, 0, 0, Class23_Sub4_Sub19.anInt3205);
						}
						Class23_Sub10_Sub2.anInt3589++;
						for (;;) {
							Class23_Sub9 class23_sub9 = (Class23_Sub9) Class10.aClass89_206.method1436(116);
							if (class23_sub9 == null) {
								break;
							}
							Class64 class64_101_ = class23_sub9.aClass64_2263;
							if ((class64_101_.anInt1005 ^ 0xffffffff) <= -1) {
								Class64 class64_102_ = Class23_Sub24.method905(class64_101_.anInt1056, (byte) 111);
								if (class64_102_ == null || class64_102_.aClass64Array1131 == null || class64_101_.anInt1005 >= class64_102_.aClass64Array1131.length || class64_101_ != class64_102_.aClass64Array1131[class64_101_.anInt1005]) {
									continue;
								}
							}
							Class91.method1452(class23_sub9, (byte) -118);
						}
						for (;;) {
							Class23_Sub9 class23_sub9 = (Class23_Sub9) Class17_Sub1.aClass89_1999.method1436(i ^ 0x76a4b20b);
							if (class23_sub9 == null) {
								break;
							}
							Class64 class64_103_ = class23_sub9.aClass64_2263;
							if ((class64_103_.anInt1005 ^ 0xffffffff) <= -1) {
								Class64 class64_104_ = Class23_Sub24.method905(class64_103_.anInt1056, (byte) 111);
								if (class64_104_ == null || class64_104_.aClass64Array1131 == null || (class64_103_.anInt1005 ^ 0xffffffff) <= (class64_104_.aClass64Array1131.length ^ 0xffffffff) || class64_104_.aClass64Array1131[class64_103_.anInt1005] != class64_103_) {
									continue;
								}
							}
							Class91.method1452(class23_sub9, (byte) -126);
						}
						for (;;) {
							Class23_Sub9 class23_sub9 = (Class23_Sub9) Class71_Sub2_Sub1.aClass89_4470.method1436(-75);
							if (class23_sub9 == null) {
								break;
							}
							Class64 class64_105_ = class23_sub9.aClass64_2263;
							if ((class64_105_.anInt1005 ^ 0xffffffff) <= -1) {
								Class64 class64_106_ = Class23_Sub24.method905(class64_105_.anInt1056, (byte) 111);
								if (class64_106_ == null || class64_106_.aClass64Array1131 == null || class64_106_.aClass64Array1131.length <= class64_105_.anInt1005 || class64_106_.aClass64Array1131[class64_105_.anInt1005] != class64_105_) {
									continue;
								}
							}
							Class91.method1452(class23_sub9, (byte) -101);
						}
						if (Class23_Sub13_Sub6.aBoolean3736 && Class23_Sub13_Sub12.aClass64_3967 == null) {
							Class23_Sub13_Sub6.aBoolean3736 = false;
						}
						if (Class23_Sub4_Sub8.aClass64_3028 != null) {
							RSString.method139((byte) 29);
						}
						if ((Class87_Sub1.anInt2788 ^ 0xffffffff) != 0) {
							int i_107_ = Class87_Sub1.anInt2788;
							int i_108_ = Class23_Sub10_Sub2.anInt3595;
							boolean bool = Class5.method66(0, i_108_, 0, i_107_, true, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 0);
							if (bool) {
								Class23_Sub7.anInt2213 = 1;
								Applet_Sub1.anInt34 = Class23_Sub13_Sub19.anInt4136;
								Class51.anInt798 = 0;
								Class23_Sub4_Sub27.anInt3327 = Class90.anInt1538;
							}
							Class87_Sub1.anInt2788 = -1;
						}
						CacheFileChannel.method944(false);
						if (class64 != Class42.aClass64_663) {
							if (class64 != null) {
								Class91.method1450((byte) 29, class64);
							}
							if (Class42.aClass64_663 != null) {
								Class91.method1450((byte) 29, Class42.aClass64_663);
							}
						}
						if (Class92.aClass64_1567 != class64_100_ && (Class23_Sub4_Sub21.anInt3240 ^ 0xffffffff) == (Class105.anInt1811 ^ 0xffffffff)) {
							if (class64_100_ != null) {
								Class91.method1450((byte) 29, class64_100_);
							}
							if (Class92.aClass64_1567 != null) {
								Class91.method1450((byte) 29, Class92.aClass64_1567);
							}
						}
						if (Class92.aClass64_1567 != null) {
							if (Class105.anInt1811 < Class23_Sub4_Sub21.anInt3240) {
								Class105.anInt1811++;
								if (Class23_Sub4_Sub21.anInt3240 == Class105.anInt1811) {
									Class91.method1450((byte) 29, Class92.aClass64_1567);
								}
							}
						} else if (Class105.anInt1811 > 0) {
							Class105.anInt1811--;
						}
						Class23_Sub4_Sub12.method311(true);
						if (Buffer.aBoolean2159) {
							Class23_Sub13_Sub11.method742((byte) 111);
						}
						for (int i_109_ = 0; i_109_ < 5; i_109_++)
							Class23_Sub4_Sub14.anIntArray3128[i_109_]++;
						int i_110_ = RSString.method182(-157);
						int i_111_ = Class27.method936(true);
						if (i_110_ > 4500 && i_111_ > 4500) {
							Class23_Sub4_Sub31.anInt3400 = 250;
							Class38_Sub3.anInt2506++;
							Class23_Sub13_Sub5.method625(i + 923841154, 4000);
							Class23_Sub7.outBuffer.method486(35, 2976);
						}
						Class100.anInt1686++;
						Class8.anInt180++;
						Class17_Sub1.anInt1988++;
						if (Class8.anInt180 > 500) {
							Class8.anInt180 = 0;
							int i_112_ = (int) (8.0 * Math.random());
							if ((0x1 & i_112_) == 1) {
								Class87_Sub4.anInt2841 += Class23_Sub4_Sub24.anInt3291;
							}
							if ((i_112_ & 0x2) == 2) {
								Class106.anInt1815 += Class4.anInt96;
							}
							if ((i_112_ & 0x4) == 4) {
								Class23_Sub4_Sub2.anInt2923 += Class73.anInt1325;
							}
						}
						if (Class17_Sub1.anInt1988 > 500) {
							Class17_Sub1.anInt1988 = 0;
							int i_113_ = (int) (Math.random() * 8.0);
							if ((0x2 & i_113_) == 2) {
								Class38_Sub7_Sub2.anInt4410 += Class75.anInt1382;
							}
							if ((0x1 & i_113_) == 1) {
								Class23_Sub4_Sub16.anInt3162 += Class92.anInt1563;
							}
						}
						if (Class106.anInt1815 < -55) {
							Class4.anInt96 = 2;
						}
						if (Class106.anInt1815 > 55) {
							Class4.anInt96 = -2;
						}
						if (Class87_Sub4.anInt2841 < -50) {
							Class23_Sub4_Sub24.anInt3291 = 2;
						}
						if (Class87_Sub4.anInt2841 > 50) {
							Class23_Sub4_Sub24.anInt3291 = -2;
						}
						if (Class23_Sub4_Sub16.anInt3162 < -60) {
							Class92.anInt1563 = 2;
						}
						if (Class23_Sub4_Sub2.anInt2923 < -40) {
							Class73.anInt1325 = 1;
						}
						if (Class38_Sub7_Sub2.anInt4410 < -20) {
							Class75.anInt1382 = 1;
						}
						if (Class23_Sub4_Sub16.anInt3162 > 60) {
							Class92.anInt1563 = -2;
						}
						if (Class38_Sub7_Sub2.anInt4410 > 10) {
							Class75.anInt1382 = -1;
						}
						if (Class23_Sub4_Sub2.anInt2923 > 40) {
							Class73.anInt1325 = -1;
						}
						if (Class100.anInt1686 > 50) {
							Class63.anInt987++;
							Class23_Sub7.outBuffer.method486(56, 2976);
						}
						do {
							try {
								if (Class23_Sub24.aClass34_2440 == null || (Class23_Sub7.outBuffer.position ^ 0xffffffff) >= -1) {
									break;
								}
								Class23_Sub24.aClass34_2440.method977(30000, Class23_Sub7.outBuffer.position, 0, Class23_Sub7.outBuffer.payload);
								Class100.anInt1686 = 0;
								Class23_Sub7.outBuffer.position = 0;
							} catch (java.io.IOException ioexception) {
								Class44.method1128(-11);
								break;
							}
							break;
						} while (false);
					}
				}
			}
		}
	}
}
