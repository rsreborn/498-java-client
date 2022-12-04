/* Class78_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Class78_Sub2 extends Class78 implements ImageProducer, ImageObserver
{
	static int anInt2750;
	static int anInt2751;
	static int anInt2752;
	static int anInt2753;
	static int anInt2754;
	static int anInt2755;
	static int anInt2756;
	static int anInt2757;
	static int anInt2758;
	static int anInt2759;
	private ImageConsumer anImageConsumer2760;
	static int anInt2761;
	private ColorModel aColorModel2762;
	static int anInt2763;
	static int anInt2764;
	static Class23_Sub13_Sub10[] aClass23_Sub13_Sub10Array2765;
	static int anInt2766;
	static int anInt2767;
	static int[] anIntArray2768 = new int[5];
	static int anInt2769;
	
	public final synchronized void addConsumer(ImageConsumer imageconsumer) {
		anImageConsumer2760 = imageconsumer;
		imageconsumer.setDimensions(anInt1415, anInt1413);
		imageconsumer.setProperties(null);
		anInt2754++;
		imageconsumer.setColorModel(aColorModel2762);
		imageconsumer.setHints(14);
	}
	
	public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		anInt2763++;
		if (anImageConsumer2760 != imageconsumer) {
			return false;
		}
		return true;
	}
	
	public final synchronized void removeConsumer(ImageConsumer imageconsumer) {
		if (imageconsumer == anImageConsumer2760) {
			anImageConsumer2760 = null;
		}
		anInt2767++;
	}
	
	static final void method1351(int i, int i_0_, int i_1_, int i_2_, byte b, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (i_0_ != i_6_ || i_2_ != i_1_ || (i_7_ ^ 0xffffffff) != (i_5_ ^ 0xffffffff) || (i ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
			int i_8_ = i_6_;
			int i_9_ = i_2_;
			int i_10_ = i_6_ * 3;
			int i_11_ = 3 * i_1_;
			int i_12_ = i_0_ * 3;
			int i_13_ = i_2_ * 3;
			int i_14_ = 3 * i_7_;
			int i_15_ = -i_6_ + (i_12_ + -i_14_) + i_5_;
			int i_16_ = 3 * i;
			int i_17_ = i_11_ + i_4_ + (-i_16_ - i_2_);
			int i_18_ = i_10_ + (-i_12_ + i_14_ - i_12_);
			int i_19_ = i_13_ + i_16_ - (i_11_ + i_11_);
			int i_20_ = i_12_ - i_10_;
			int i_21_ = -i_13_ + i_11_;
			for (int i_22_ = 128; i_22_ <= 4096; i_22_ += 128) {
				int i_23_ = i_22_ * i_22_ >> 12;
				int i_24_ = i_23_ * i_22_ >> 12;
				int i_25_ = i_15_ * i_24_;
				int i_26_ = i_17_ * i_24_;
				int i_27_ = i_19_ * i_23_;
				int i_28_ = i_23_ * i_18_;
				int i_29_ = i_21_ * i_22_;
				int i_30_ = i_20_ * i_22_;
				int i_31_ = (i_26_ + (i_27_ - -i_29_) >> 12) + i_2_;
				int i_32_ = i_6_ + (i_30_ + i_25_ - -i_28_ >> 12);
				Class55.method1180(i_31_, i_32_, i_9_, i_8_, i_3_, (byte) 126);
				i_8_ = i_32_;
				i_9_ = i_31_;
			}
		} else {
			Class55.method1180(i_4_, i_5_, i_2_, i_6_, i_3_, (byte) 121);
		}
		anInt2769++;
		if (b < 37) {
			aClass23_Sub13_Sub10Array2765 = null;
		}
	}
	
	public final void startProduction(ImageConsumer imageconsumer) {
		anInt2751++;
		addConsumer(imageconsumer);
	}
	
	static final void method1352(Class72[] class72s, int i, boolean bool) {
		if (i == -7396) {
			int i_33_;
			if (bool) {
				i_33_ = 1;
			} else {
				i_33_ = 4;
			}
			anInt2750++;
			if (!bool) {
				for (int i_34_ = 0; i_34_ < 4; i_34_++) {
					for (int i_35_ = 0; i_35_ < 104; i_35_++) {
						for (int i_36_ = 0; i_36_ < 104; i_36_++) {
							if ((Class23_Sub4_Sub30.aByteArrayArrayArray3379[i_34_][i_35_][i_36_] & 0x1) == 1) {
								int i_37_ = i_34_;
								if ((0x2 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[1][i_35_][i_36_]) == 2) {
									i_37_--;
								}
								if ((i_37_ ^ 0xffffffff) <= -1) {
									class72s[i_37_].method1292((byte) 111, i_36_, i_35_);
								}
							}
						}
					}
				}
				Class23_Sub20.anInt2400 += (int) (Math.random() * 5.0) + -2;
				Class23_Sub4_Sub12.anInt3089 += -2 + (int) (5.0 * Math.random());
				if (Class23_Sub4_Sub12.anInt3089 < -8) {
					Class23_Sub4_Sub12.anInt3089 = -8;
				}
				if (Class23_Sub20.anInt2400 < -16) {
					Class23_Sub20.anInt2400 = -16;
				}
				if (Class23_Sub20.anInt2400 > 16) {
					Class23_Sub20.anInt2400 = 16;
				}
				if (Class23_Sub4_Sub12.anInt3089 > 8) {
					Class23_Sub4_Sub12.anInt3089 = 8;
				}
			}
			int i_38_ = Class23_Sub4_Sub12.anInt3089 >> 2 << 10;
			int i_39_ = Class23_Sub20.anInt2400 >> 1;
			int[][] is = new int[104][104];
			int[][] is_40_ = new int[104][104];
			for (int i_41_ = 0; (i_33_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++) {
				byte[][] bs = Class38_Sub7.aByteArrayArrayArray2690[i_41_];
				int i_42_ = 74;
				int i_43_ = 768;
				int i_44_ = (int) Math.sqrt(5100.0);
				int i_45_ = i_44_ * i_43_ >> 8;
				for (int i_46_ = 1; i_46_ < 103; i_46_++) {
					for (int i_47_ = 1; i_47_ < 103; i_47_++) {
						int i_48_ = i_42_;
						int i_49_ = Class17.anIntArrayArrayArray301[i_41_][1 + i_47_][i_46_] - Class17.anIntArrayArrayArray301[i_41_][-1 + i_47_][i_46_];
						int i_50_ = -Class17.anIntArrayArrayArray301[i_41_][i_47_][i_46_ + -1] + Class17.anIntArrayArrayArray301[i_41_][i_47_][1 + i_46_];
						int i_51_ = (int) Math.sqrt((double) (i_50_ * i_50_ + 65536 + i_49_ * i_49_));
						int i_52_ = -65536 / i_51_;
						int i_53_ = (i_49_ << 8) / i_51_;
						int i_54_ = (i_50_ << 8) / i_51_;
						i_48_ += (-50 * i_53_ - (-(-10 * i_52_) + -(-50 * i_54_))) / i_45_;
						int i_55_ = (bs[i_47_][i_46_] >> 1) + (bs[i_47_][1 + i_46_] >> 3) + (bs[1 + i_47_][i_46_] >> 3) + ((bs[i_47_ - 1][i_46_] >> 2) + (bs[i_47_][i_46_ - 1] >> 2));
						is_40_[i_47_][i_46_] = -i_55_ + i_48_;
					}
				}
				for (int i_56_ = 0; i_56_ < 104; i_56_++) {
					Class23_Sub13_Sub14.anIntArray4016[i_56_] = 0;
					Class38_Sub3.anIntArray2515[i_56_] = 0;
					Class58.anIntArray910[i_56_] = 0;
					Class23_Sub12.anIntArray2302[i_56_] = 0;
					Class23_Sub4_Sub3.anIntArray2947[i_56_] = 0;
				}
				for (int i_57_ = -5; i_57_ < 104; i_57_++) {
					for (int i_58_ = 0; i_58_ < 104; i_58_++) {
						int i_59_ = i_57_ - -5;
						if (i_59_ < 104) {
							int i_60_ = 0xff & Class23_Sub13_Sub10.aByteArrayArrayArray3872[i_41_][i_59_][i_58_];
							if (i_60_ > 0) {
								Class23_Sub13_Sub24 class23_sub13_sub24 = Class23_Sub4_Sub9.method300(1, i_60_ + -1);
								Class23_Sub13_Sub14.anIntArray4016[i_58_] += class23_sub13_sub24.anInt4263;
								Class38_Sub3.anIntArray2515[i_58_] += class23_sub13_sub24.anInt4270;
								Class58.anIntArray910[i_58_] += class23_sub13_sub24.anInt4264;
								Class23_Sub12.anIntArray2302[i_58_] += class23_sub13_sub24.anInt4268;
								Class23_Sub4_Sub3.anIntArray2947[i_58_]++;
							}
						}
						int i_61_ = i_57_ - 5;
						if ((i_61_ ^ 0xffffffff) <= -1) {
							int i_62_ = Class23_Sub13_Sub10.aByteArrayArrayArray3872[i_41_][i_61_][i_58_] & 0xff;
							if (i_62_ > 0) {
								Class23_Sub13_Sub24 class23_sub13_sub24 = Class23_Sub4_Sub9.method300(1, -1 + i_62_);
								Class23_Sub13_Sub14.anIntArray4016[i_58_] -= class23_sub13_sub24.anInt4263;
								Class38_Sub3.anIntArray2515[i_58_] -= class23_sub13_sub24.anInt4270;
								Class58.anIntArray910[i_58_] -= class23_sub13_sub24.anInt4264;
								Class23_Sub12.anIntArray2302[i_58_] -= class23_sub13_sub24.anInt4268;
								Class23_Sub4_Sub3.anIntArray2947[i_58_]--;
							}
						}
					}
					if ((i_57_ ^ 0xffffffff) <= -1) {
						int i_63_ = 0;
						int i_64_ = 0;
						int i_65_ = 0;
						int i_66_ = 0;
						int i_67_ = 0;
						for (int i_68_ = -5; i_68_ < 104; i_68_++) {
							int i_69_ = i_68_ + 5;
							if (i_69_ < 104) {
								i_64_ += Class38_Sub3.anIntArray2515[i_69_];
								i_63_ += Class58.anIntArray910[i_69_];
								i_65_ += Class23_Sub12.anIntArray2302[i_69_];
								i_66_ += Class23_Sub13_Sub14.anIntArray4016[i_69_];
								i_67_ += Class23_Sub4_Sub3.anIntArray2947[i_69_];
							}
							int i_70_ = i_68_ + -5;
							if ((i_70_ ^ 0xffffffff) <= -1) {
								i_65_ -= Class23_Sub12.anIntArray2302[i_70_];
								i_66_ -= Class23_Sub13_Sub14.anIntArray4016[i_70_];
								i_67_ -= Class23_Sub4_Sub3.anIntArray2947[i_70_];
								i_64_ -= Class38_Sub3.anIntArray2515[i_70_];
								i_63_ -= Class58.anIntArray910[i_70_];
							}
							if (i_68_ >= 0 && (i_67_ ^ 0xffffffff) < -1) {
								is[i_57_][i_68_] = Class23_Sub13_Sub13.method762((byte) 69, i_63_ / i_67_, i_66_ * 256 / i_65_, i_64_ / i_67_);
							}
						}
					}
				}
				for (int i_71_ = 1; i_71_ < 103; i_71_++) {
					for (int i_72_ = 1; i_72_ < 103; i_72_++) {
						if (!bool) {
							if (Class7.aBoolean170 && (Class23_Sub4_Sub30.aByteArrayArrayArray3379[0][i_71_][i_72_] & 0x2) == 0 && ((0x10 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[i_41_][i_71_][i_72_]) != 0 || RSString.method144(i_72_, 20, i_71_, i_41_) != Class23_Sub4_Sub7.anInt3025)) {
								continue;
							}
							if (i_41_ < Class28.anInt424) {
								Class28.anInt424 = i_41_;
							}
						}
						int i_73_ = 0xff & Class23_Sub13_Sub10.aByteArrayArrayArray3872[i_41_][i_71_][i_72_];
						int i_74_ = Class23_Sub4_Sub18.aByteArrayArrayArray3198[i_41_][i_71_][i_72_] & 0xff;
						if ((i_73_ ^ 0xffffffff) < -1 || i_74_ > 0) {
							int i_75_ = Class17.anIntArrayArrayArray301[i_41_][i_71_][i_72_];
							int i_76_ = Class17.anIntArrayArrayArray301[i_41_][i_71_ + 1][i_72_];
							int i_77_ = Class17.anIntArrayArrayArray301[i_41_][i_71_][1 + i_72_];
							int i_78_ = Class17.anIntArrayArrayArray301[i_41_][1 + i_71_][i_72_ - -1];
							if ((i_41_ ^ 0xffffffff) < -1) {
								boolean bool_79_ = true;
								if (i_73_ == 0 && (Class23_Sub4_Sub30.aByteArrayArrayArray3385[i_41_][i_71_][i_72_] ^ 0xffffffff) != -1) {
									bool_79_ = false;
								}
								if ((i_74_ ^ 0xffffffff) < -1 && !Applet_Sub1.method23(-1 + i_74_, true).aBoolean3706) {
									bool_79_ = false;
								}
								if (bool_79_ && i_76_ == i_75_ && (i_75_ ^ 0xffffffff) == (i_78_ ^ 0xffffffff) && i_75_ == i_77_) {
									Class54.anIntArrayArrayArray861[i_41_][i_71_][i_72_] = Class65.method1230(Class54.anIntArrayArrayArray861[i_41_][i_71_][i_72_], 2340);
								}
							}
							int i_80_;
							int i_81_;
							if (i_73_ <= 0) {
								i_81_ = 0;
								i_80_ = -1;
							} else {
								i_80_ = is[i_71_][i_72_];
								int i_82_ = i_39_ + (0x7f & i_80_);
								if (i_82_ >= 0) {
									if (i_82_ > 127) {
										i_82_ = 127;
									}
								} else {
									i_82_ = 0;
								}
								int i_83_ = (0xfc00 & i_80_ - -i_38_) + (i_80_ & 0x380) - -i_82_;
								i_81_ = Class76.anIntArray1397[Class14.method135(i ^ 0x1cc0, 96, i_83_)];
							}
							int i_84_ = is_40_[1 + i_71_][i_72_];
							int i_85_ = is_40_[i_71_][i_72_];
							int i_86_ = is_40_[1 + i_71_][1 + i_72_];
							int i_87_ = is_40_[i_71_][i_72_ - -1];
							if ((i_74_ ^ 0xffffffff) != -1) {
								int i_88_ = 1 + Class23_Sub4_Sub30.aByteArrayArrayArray3385[i_41_][i_71_][i_72_];
								byte b = Class23_Sub4_Sub22.aByteArrayArrayArray3257[i_41_][i_71_][i_72_];
								Class23_Sub13_Sub4 class23_sub13_sub4 = Applet_Sub1.method23(i_74_ + -1, true);
								int i_89_ = class23_sub13_sub4.anInt3709;
								if (i_89_ >= 0 && !Class76.anInterface1_1399.method2(-69, i_89_)) {
									i_89_ = -1;
								}
								int i_90_;
								int i_91_;
								if ((i_89_ ^ 0xffffffff) <= -1) {
									i_91_ = Class76.anIntArray1397[Class33.method967((byte) 48, 96, Class76.anInterface1_1399.method4(i_89_, (byte) 50))];
									i_90_ = -1;
								} else if (class23_sub13_sub4.anInt3705 == -1) {
									i_90_ = -2;
									i_91_ = 0;
								} else {
									i_90_ = class23_sub13_sub4.anInt3705;
									int i_92_ = i_39_ + (i_90_ & 0x7f);
									if (i_92_ >= 0) {
										if (i_92_ > 127) {
											i_92_ = 127;
										}
									} else {
										i_92_ = 0;
									}
									int i_93_ = i_92_ + ((0xfc00 & i_38_ + i_90_) - -(i_90_ & 0x380));
									i_91_ = Class76.anIntArray1397[Class33.method967((byte) 50, 96, i_93_)];
								}
								if (class23_sub13_sub4.anInt3710 >= 0) {
									int i_94_ = class23_sub13_sub4.anInt3710;
									int i_95_ = i_39_ + (i_94_ & 0x7f);
									if ((i_95_ ^ 0xffffffff) <= -1) {
										if (i_95_ > 127) {
											i_95_ = 127;
										}
									} else {
										i_95_ = 0;
									}
									int i_96_ = (0x380 & i_94_) + (0xfc00 & i_94_ - -i_38_) - -i_95_;
									i_91_ = Class76.anIntArray1397[Class33.method967((byte) 55, 96, i_96_)];
								}
								Class14.method132(i_41_, i_71_, i_72_, i_88_, b, i_89_, i_75_, i_76_, i_78_, i_77_, Class14.method135(-96, i_85_, i_80_), Class14.method135(-19, i_84_, i_80_), Class14.method135(-121, i_86_, i_80_), Class14.method135(i ^ 0x1c99, i_87_, i_80_), Class33.method967((byte) 56, i_85_, i_90_), Class33.method967((byte) 114, i_84_, i_90_), Class33.method967((byte) 46, i_86_, i_90_), Class33.method967((byte) 58, i_87_, i_90_), i_81_, i_91_);
							} else {
								Class14.method132(i_41_, i_71_, i_72_, 0, 0, -1, i_75_, i_76_, i_78_, i_77_, Class14.method135(i ^ 0x1cd1, i_85_, i_80_), Class14.method135(-98, i_84_, i_80_), Class14.method135(-50, i_86_, i_80_), Class14.method135(i ^ 0x1ca8, i_87_, i_80_), 0, 0, 0, 0, i_81_, 0);
							}
						}
					}
				}
				if (!bool) {
					for (int i_97_ = 1; i_97_ < 103; i_97_++) {
						for (int i_98_ = 1; i_98_ < 103; i_98_++)
							Class81.method1367(i_41_, i_98_, i_97_, RSString.method144(i_97_, 97, i_98_, i_41_));
					}
				}
				Class23_Sub13_Sub10.aByteArrayArrayArray3872[i_41_] = null;
				Class23_Sub4_Sub18.aByteArrayArrayArray3198[i_41_] = null;
				Class23_Sub4_Sub30.aByteArrayArrayArray3385[i_41_] = null;
				Class23_Sub4_Sub22.aByteArrayArrayArray3257[i_41_] = null;
				Class38_Sub7.aByteArrayArrayArray2690[i_41_] = null;
			}
			Class23_Sub4_Sub25.method375(-50, -10, -50);
			if (!bool) {
				for (int i_99_ = 0; i_99_ < 104; i_99_++) {
					for (int i_100_ = 0; i_100_ < 104; i_100_++) {
						if ((Class23_Sub4_Sub30.aByteArrayArrayArray3379[1][i_99_][i_100_] & 0x2) == 2) {
							NPCDefinition.method818(i_99_, i_100_);
						}
					}
				}
				int i_101_ = 1;
				int i_102_ = 2;
				int i_103_ = 4;
				for (int i_104_ = 0; i_104_ < 4; i_104_++) {
					if ((i_104_ ^ 0xffffffff) < -1) {
						i_102_ <<= 3;
						i_101_ <<= 3;
						i_103_ <<= 3;
					}
					for (int i_105_ = 0; (i_104_ ^ 0xffffffff) <= (i_105_ ^ 0xffffffff); i_105_++) {
						for (int i_106_ = 0; i_106_ <= 104; i_106_++) {
							for (int i_107_ = 0; i_107_ <= 104; i_107_++) {
								if ((i_101_ & Class54.anIntArrayArrayArray861[i_105_][i_107_][i_106_] ^ 0xffffffff) != -1) {
									int i_108_;
									for (i_108_ = i_106_; i_108_ < 104 && (i_101_ & Class54.anIntArrayArrayArray861[i_105_][i_107_][i_108_ + 1] ^ 0xffffffff) != -1; i_108_++) {
										/* empty */
									}
									int i_109_;
									for (i_109_ = i_106_; (i_109_ ^ 0xffffffff) < -1 && (Class54.anIntArrayArrayArray861[i_105_][i_107_][-1 + i_109_] & i_101_) != 0; i_109_--) {
										/* empty */
									}
									int i_110_;
								while_108_:
									for (i_110_ = i_105_; (i_110_ ^ 0xffffffff) < -1; i_110_--) {
										for (int i_111_ = i_109_; (i_108_ ^ 0xffffffff) <= (i_111_ ^ 0xffffffff); i_111_++) {
											if ((i_101_ & Class54.anIntArrayArrayArray861[-1 + i_110_][i_107_][i_111_] ^ 0xffffffff) == -1) {
												break while_108_;
											}
										}
									}
									int i_112_;
								while_109_:
									for (i_112_ = i_105_; (i_104_ ^ 0xffffffff) < (i_112_ ^ 0xffffffff); i_112_++) {
										for (int i_113_ = i_109_; (i_108_ ^ 0xffffffff) <= (i_113_ ^ 0xffffffff); i_113_++) {
											if ((Class54.anIntArrayArrayArray861[i_112_ - -1][i_107_][i_113_] & i_101_ ^ 0xffffffff) == -1) {
												break while_109_;
											}
										}
									}
									int i_114_ = (-i_110_ + i_112_ - -1) * (-i_109_ + i_108_ - -1);
									if (i_114_ >= 8) {
										int i_115_ = 240;
										int i_116_ = Class17.anIntArrayArrayArray301[i_110_][i_107_][i_109_];
										int i_117_ = Class17.anIntArrayArrayArray301[i_112_][i_107_][i_109_] + -i_115_;
										Class100.method1502(i_104_, 1, 128 * i_107_, i_107_ * 128, i_109_ * 128, 128 * i_108_ - -128, i_117_, i_116_);
										for (int i_118_ = i_110_; i_112_ >= i_118_; i_118_++) {
											for (int i_119_ = i_109_; (i_108_ ^ 0xffffffff) <= (i_119_ ^ 0xffffffff); i_119_++)
												Class54.anIntArrayArrayArray861[i_118_][i_107_][i_119_] = Class24.method919(Class54.anIntArrayArrayArray861[i_118_][i_107_][i_119_], i_101_ ^ 0xffffffff);
										}
									}
								}
								if ((i_102_ & Class54.anIntArrayArrayArray861[i_105_][i_107_][i_106_] ^ 0xffffffff) != -1) {
									int i_120_;
									for (i_120_ = i_107_; (i_120_ ^ 0xffffffff) < -1 && (i_102_ & Class54.anIntArrayArrayArray861[i_105_][i_120_ + -1][i_106_] ^ 0xffffffff) != -1; i_120_--) {
										/* empty */
									}
									int i_121_ = i_105_;
									int i_122_;
									for (i_122_ = i_107_; i_122_ < 104 && (Class54.anIntArrayArrayArray861[i_105_][1 + i_122_][i_106_] & i_102_ ^ 0xffffffff) != -1; i_122_++) {
										/* empty */
									}
									int i_123_ = i_105_;
								while_110_:
									for (/**/; i_121_ > 0; i_121_--) {
										for (int i_124_ = i_120_; i_124_ <= i_122_; i_124_++) {
											if ((Class54.anIntArrayArrayArray861[-1 + i_121_][i_124_][i_106_] & i_102_ ^ 0xffffffff) == -1) {
												break while_110_;
											}
										}
									}
								while_111_:
									for (/**/; i_104_ > i_123_; i_123_++) {
										for (int i_125_ = i_120_; i_122_ >= i_125_; i_125_++) {
											if ((i_102_ & Class54.anIntArrayArrayArray861[1 + i_123_][i_125_][i_106_] ^ 0xffffffff) == -1) {
												break while_111_;
											}
										}
									}
									int i_126_ = (-i_121_ + 1 + i_123_) * (1 + i_122_ - i_120_);
									if (i_126_ >= 8) {
										int i_127_ = 240;
										int i_128_ = -i_127_ + Class17.anIntArrayArrayArray301[i_123_][i_120_][i_106_];
										int i_129_ = Class17.anIntArrayArrayArray301[i_121_][i_120_][i_106_];
										Class100.method1502(i_104_, 2, i_120_ * 128, 128 + i_122_ * 128, 128 * i_106_, 128 * i_106_, i_128_, i_129_);
										for (int i_130_ = i_121_; i_123_ >= i_130_; i_130_++) {
											for (int i_131_ = i_120_; i_131_ <= i_122_; i_131_++)
												Class54.anIntArrayArrayArray861[i_130_][i_131_][i_106_] = Class24.method919(Class54.anIntArrayArrayArray861[i_130_][i_131_][i_106_], i_102_ ^ 0xffffffff);
										}
									}
								}
								if ((i_103_ & Class54.anIntArrayArrayArray861[i_105_][i_107_][i_106_]) != 0) {
									int i_132_ = i_107_;
									int i_133_ = i_107_;
									int i_134_ = i_106_;
									int i_135_;
									for (i_135_ = i_106_; i_135_ < 104; i_135_++) {
										if ((i_103_ & Class54.anIntArrayArrayArray861[i_105_][i_107_][1 + i_135_] ^ 0xffffffff) == -1) {
											break;
										}
									}
									for (/**/; i_134_ > 0; i_134_--) {
										if ((Class54.anIntArrayArrayArray861[i_105_][i_107_][i_134_ - 1] & i_103_ ^ 0xffffffff) == -1) {
											break;
										}
									}
								while_112_:
									for (/**/; (i_132_ ^ 0xffffffff) < -1; i_132_--) {
										for (int i_136_ = i_134_; (i_135_ ^ 0xffffffff) <= (i_136_ ^ 0xffffffff); i_136_++) {
											if ((Class54.anIntArrayArrayArray861[i_105_][i_132_ - 1][i_136_] & i_103_) == 0) {
												break while_112_;
											}
										}
									}
								while_113_:
									for (/**/; i_133_ < 104; i_133_++) {
										for (int i_137_ = i_134_; i_137_ <= i_135_; i_137_++) {
											if ((Class54.anIntArrayArrayArray861[i_105_][1 + i_133_][i_137_] & i_103_) == 0) {
												break while_113_;
											}
										}
									}
									if ((i_135_ + (-i_134_ + 1)) * (1 + (-i_132_ + i_133_)) >= 4) {
										int i_138_ = Class17.anIntArrayArrayArray301[i_105_][i_132_][i_134_];
										Class100.method1502(i_104_, 4, i_132_ * 128, i_133_ * 128 - -128, i_134_ * 128, 128 * i_135_ + 128, i_138_, i_138_);
										for (int i_139_ = i_132_; (i_133_ ^ 0xffffffff) <= (i_139_ ^ 0xffffffff); i_139_++) {
											for (int i_140_ = i_134_; i_140_ <= i_135_; i_140_++)
												Class54.anIntArrayArrayArray861[i_105_][i_139_][i_140_] = Class24.method919(Class54.anIntArrayArrayArray861[i_105_][i_139_][i_140_], i_103_ ^ 0xffffffff);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	final void method1342(int i, Graphics graphics, int i_141_, int i_142_) {
		method1353(27297);
		if (i != 3) {
			method1345(-51, 2, (byte) -55, -93, null, 30);
		}
		graphics.drawImage(anImage1414, i_142_, i_141_, this);
		anInt2753++;
	}
	
	private final synchronized void method1353(int i) {
		anInt2759++;
		if (i != 27297) {
			isConsumer(null);
		}
		if (anImageConsumer2760 != null) {
			anImageConsumer2760.setPixels(0, 0, anInt1415, anInt1413, aColorModel2762, anIntArray1416, 0, anInt1415);
			anImageConsumer2760.imageComplete(2);
		}
	}
	
	static final RSString method1354(int i, int i_143_) {
		anInt2761++;
		if (i != 255) {
			method1352(null, 107, true);
		}
		return Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub23.method360((byte) -9, 0xff & i_143_ >> 24), RuntimeException_Sub1.aClass16_1849, Class23_Sub4_Sub23.method360((byte) -9, i_143_ >> 16 & 0xff), RuntimeException_Sub1.aClass16_1849, Class23_Sub4_Sub23.method360((byte) -9, (0xff8d & i_143_) >> 8), RuntimeException_Sub1.aClass16_1849, Class23_Sub4_Sub23.method360((byte) -9, i_143_ & 0xff) }, i ^ ~0xd7);
	}
	
	public final boolean imageUpdate(Image image, int i, int i_144_, int i_145_, int i_146_, int i_147_) {
		anInt2755++;
		return true;
	}
	
	final void method1345(int i, int i_148_, byte b, int i_149_, Graphics graphics, int i_150_) {
		anInt2752++;
		method1356(i_150_, i_149_, i, 0, i_148_);
		Shape shape = graphics.getClip();
		graphics.clipRect(i_148_, i_149_, i, i_150_);
		graphics.drawImage(anImage1414, 0, 0, this);
		if (b <= 89) {
			aClass23_Sub13_Sub10Array2765 = null;
		}
		graphics.setClip(shape);
	}
	
	static final void method1355(int i) {
		anInt2756++;
		do {
			try {
				if (i != 2874) {
					method1357(102);
				}
				//If we don't have a World List with stuff in it, try and get the stuff
				if (Class23.aClass53_347 == null) {
					//So what all of this crap is is it trying to grab a web page that doesn't exist anymore and failing.
					Class23.aClass53_347 = new Class53(Class23_Sub4_Sub3.aClass9_2939, Class23_Sub4_Sub14.method322(new RSString[] { Class34.aClass16_539, Class23_Sub4_Sub23.method360((byte) -9, Class23_Sub13_Sub15.anInt4036), Class79.aClass16_1887 }, -85).method153((byte) -117));
				} else {
					byte[] bs = Class23.aClass53_347.method1171(i ^ 0xb0e);
					if (bs == null) {
						break;
					}
					Buffer class23_sub5 = new Buffer(bs);
					Class51.anInt793 = class23_sub5.getUShortBE();
					Class23_Sub13_Sub1.worldList = new Class82[Class51.anInt793];
					for (int i_151_ = 0; Class51.anInt793 > i_151_; i_151_++) {
						Class82 class82 = Class23_Sub13_Sub1.worldList[i_151_] = new Class82();
						int i_152_ = class23_sub5.getUShortBE();
						class82.aBoolean1450 = (0x8000 & i_152_) != 0;
						class82.anInt1451 = i_152_ & 0x7fff;
						class82.aClass16_1449 = class23_sub5.readString(i + -2872);
						class82.anInt1447 = class23_sub5.method474(true);
						class82.anInt1448 = i_151_;
						class82.anInt1443 = NPCDefinition.method814(class23_sub5.getUShortBE(), true);
					}
					Class38_Sub6.method1080(0, i ^ 0xb3a, Class23_Sub13_Sub1.worldList, Class23_Sub13_Sub1.worldList.length - 1);
					Class23.aClass53_347 = null;
					Class71_Sub2.isWorldListReady = true;
				}
			} catch (Exception exception) {
				exception.printStackTrace();
				Class23.aClass53_347 = null;
				break;
			}
			break;
		} while (false);
	}
	
	private final synchronized void method1356(int i, int i_153_, int i_154_, int i_155_, int i_156_) {
		anInt2764++;
		if (i_155_ != 0) {
			method1345(-27, 76, (byte) 35, -23, null, 113);
		}
		if (anImageConsumer2760 != null) {
			anImageConsumer2760.setPixels(i_156_, i_153_, i_154_, i, aColorModel2762, anIntArray1416, i_153_ * anInt1415 - -i_156_, anInt1415);
			anImageConsumer2760.imageComplete(2);
		}
	}
	
	public static void method1357(int i) {
		aClass23_Sub13_Sub10Array2765 = null;
		if (i != 74) {
			method1358(47, 66, -51, (byte) -69, -88, -13);
		}
		anIntArray2768 = null;
	}
	
	final void method1346(Component component, int i, int i_157_, int i_158_) {
		anIntArray1416 = new int[1 + i_157_ * i];
		anInt2757++;
		anInt1413 = i;
		anInt1415 = i_157_;
		aColorModel2762 = new DirectColorModel(32, 16711680, 65280, 255);
		if (i_158_ != 0) {
			removeConsumer(null);
		}
		anImage1414 = component.createImage(this);
		method1353(27297);
		component.prepareImage(anImage1414, this);
		method1353(27297);
		component.prepareImage(anImage1414, this);
		method1353(27297);
		component.prepareImage(anImage1414, this);
		this.method1347((byte) -70);
	}
	
	static final void method1358(int i, int i_159_, int i_160_, byte b, int i_161_, int i_162_) {
		anInt2766++;
		if (b <= 94) {
			method1355(99);
		}
		if (i_160_ < Class23_Sub13_Sub6.anInt3728 || Class35.anInt554 < i_161_ || (Class88.anInt1503 ^ 0xffffffff) < (i ^ 0xffffffff) || i_159_ > Class23_Sub4_Sub33.anInt3435) {
			Class100.method1503(i, i_160_, i_162_, i_159_, true, i_161_);
		} else {
			Class23_Sub4_Sub37.method418(i_160_, i_162_, i_161_, 0, i_159_, i);
		}
	}
	
	public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		anInt2758++;
	}
}
