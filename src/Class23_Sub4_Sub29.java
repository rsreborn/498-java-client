/* Class23_Sub4_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class23_Sub4_Sub29 extends Class23_Sub4
{
	static int anInt3355;
	private int[][] anIntArrayArray3356;
	static int anInt3357;
	private int[] anIntArray3358;
	static int anInt3359;
	static int anInt3360;
	static int anInt3361;
	static RSString aClass16_3362;
	static RSString aClass16_3363 = Class38_Sub6.method1076((byte) 86, "Benutzen Sie die (WPasswort -=ndern(W Option");
	private int[] anIntArray3364;
	static int anInt3365;
	private static RSString aClass16_3366;
	static RSString aClass16_3367 = Class38_Sub6.method1076((byte) 86, "Zugewiesener Speicher)3");
	static int[][] anIntArrayArray3368;
	static int anInt3369;
	private int anInt3370 = 0;
	static int anInt3371;
	static int anInt3372;
	private short[] aShortArray3373 = new short[257];
	static int anInt3374;
	static int anInt3375;
	
	public static void method383(int i) {
		aClass16_3367 = null;
		if (i < 49) {
			anIntArrayArray3368 = null;
		}
		aClass16_3366 = null;
		aClass16_3363 = null;
		anIntArrayArray3368 = null;
		aClass16_3362 = null;
	}
	
	final void method265(int i) {
		anInt3372++;
		if (anIntArrayArray3356 == null) {
			anIntArrayArray3356 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (anIntArrayArray3356.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (anInt3370 == 2) {
			method384((byte) -115);
		}
		Class33.method968(2);
		if (i != -21746) {
			anIntArrayArray3368 = null;
		}
		method390(true);
	}
	
	private final void method384(byte b) {
		anInt3374++;
		int[] is = anIntArrayArray3356[0];
		int[] is_0_ = anIntArrayArray3356[1];
		if (b == -115) {
			int[] is_1_ = anIntArrayArray3356[-1 + anIntArrayArray3356.length];
			int[] is_2_ = anIntArrayArray3356[-2 + anIntArrayArray3356.length];
			anIntArray3358 = new int[] { -is_1_[0] + (is_2_[0] + is_2_[0]), is_2_[1] - (is_1_[1] + -is_2_[1]) };
			anIntArray3364 = new int[] { is[0] - (is_0_[0] + -is[0]), is[1] - (-is[1] - -is_0_[1]) };
		}
	}
	
	static final boolean method385(Class105 class105, int i, int i_3_, int i_4_) {
		byte[] bs = class105.method1544(i_4_, i, i_3_);
		anInt3360++;
		if (bs == null) {
			return false;
		}
		Class14.method129(bs, 1);
		return true;
	}
	
	final int[] method260(int i, int i_5_) {
		int[] is = aClass99_2115.method1500(i_5_, (byte) -104);
		anInt3375++;
		if (aClass99_2115.aBoolean1681) {
			int[] is_6_ = this.method261(i_5_, 0, (byte) 18);
			for (int i_7_ = 0; Class23_Sub4_Sub33.anInt3428 > i_7_; i_7_++) {
				int i_8_ = is_6_[i_7_] >> 4;
				if ((i_8_ ^ 0xffffffff) > -1) {
					i_8_ = 0;
				}
				if (i_8_ > 256) {
					i_8_ = 256;
				}
				is[i_7_] = aShortArray3373[i_8_];
			}
		}
		if (i != 0) {
			return null;
		}
		return is;
	}
	
	static final void method386(RSString class16, boolean bool, boolean bool_9_) {
		anInt3365++;
		if (bool_9_ != false) {
			aClass16_3363 = null;
		}
		int i = 4;
		int i_10_ = 6 + i;
		int i_11_ = 6 + i;
		int i_12_ = Class38_Sub7.aClass23_Sub13_Sub8_2637.method667(class16, 250);
		int i_13_ = 13 * Class38_Sub7.aClass23_Sub13_Sub8_2637.method669(class16, 250);
		Class20.method222(-i + i_10_, i_11_ - i, i + (i_12_ + i), i + i_13_ + i, 0);
		Class20.method215(i_10_ - i, -i + i_11_, i + i_12_ - -i, i + i + i_13_, 16777215);
		Class38_Sub7.aClass23_Sub13_Sub8_2637.method665(class16, i_10_, i_11_, i_12_, i_13_, 16777215, -1, 1, 1, 0);
		RuntimeException_Sub1.method1589(i + i + i_13_, i + (i_12_ - -i), i_10_ + -i, -i + i_11_, true);
		if (bool) {
			java.awt.Canvas canvas = Class71_Sub3.aCanvas2740;
			try {
				Graphics graphics = canvas.getGraphics();
				Class23_Sub13_Sub25.aClass78_4290.method1342(3, graphics, 0, 0);
			} catch (Exception exception) {
				canvas.repaint();
			}
		} else {
			Class23_Sub13_Sub4.method618(i_10_, i_12_, i_13_, -717, i_11_);
		}
	}
	
	public Class23_Sub4_Sub29() {
		super(1, true);
	}
	
	private final int[] method387(byte b, int i) {
		if (b < 52) {
			method390(false);
		}
		anInt3359++;
		if ((i ^ 0xffffffff) > -1) {
			return anIntArray3364;
		}
		if ((anIntArrayArray3356.length ^ 0xffffffff) >= (i ^ 0xffffffff)) {
			return anIntArray3358;
		}
		return anIntArrayArray3356[i];
	}
	
	static final void method388(int i) {
		if (i != -18065) {
			aClass16_3366 = null;
		}
		anInt3357++;
		if (Class23_Sub23.aClass34_2427 != null) {
			Class23_Sub23.aClass34_2427.method976(false);
		}
	}
	
	final void method255(Buffer class23_sub5, int i, int i_14_) {
		anInt3371++;
		if ((i ^ 0xffffffff) == -1) {
			anInt3370 = class23_sub5.method461(-1797813752);
			anIntArrayArray3356 = new int[class23_sub5.method461(i_14_ ^ ~0x6b28761f)][2];
			for (int i_15_ = 0; i_15_ < anIntArrayArray3356.length; i_15_++) {
				anIntArrayArray3356[i_15_][0] = class23_sub5.method476((byte) -109);
				anIntArrayArray3356[i_15_][1] = class23_sub5.method476((byte) -98);
			}
		}
		if (i_14_ != 1000) {
			method384((byte) -22);
		}
	}
	
	static final RSString method389(RSString[] class16s, int i, int i_16_, int i_17_) {
		anInt3361++;
		int i_18_ = 0;
		for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
			if (class16s[i_19_ + i_16_] == null) {
				class16s[i_19_ + i_16_] = Class105_Sub1.aClass16_2869;
			}
			i_18_ += class16s[i_19_ + i_16_].anInt1896;
		}
		if (i != -32768) {
			aClass16_3367 = null;
		}
		byte[] bs = new byte[i_18_];
		int i_20_ = 0;
		for (int i_21_ = 0; (i_17_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
			RSString class16 = class16s[i_21_ + i_16_];
			Class3.method56(class16.aByteArray1906, 0, bs, i_20_, class16.anInt1896);
			i_20_ += class16.anInt1896;
		}
		RSString class16 = new RSString();
		class16.anInt1896 = i_18_;
		class16.aByteArray1906 = bs;
		return class16;
	}
	
	private final void method390(boolean bool) {
		if (bool == true) {
			int i = anInt3370;
		while_119_:
			do {
				do {
					if (i != 2) {
						if (i != 1) {
							break;
						}
					} else {
						for (i = 0; i < 257; i++) {
							int i_22_ = i << 4;
							int i_23_;
							for (i_23_ = 1; (-1 + anIntArrayArray3356.length ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
								if (anIntArrayArray3356[i_23_][0] > i_22_) {
									break;
								}
							}
							int[] is = anIntArrayArray3356[i_23_ + -1];
							int[] is_24_ = anIntArrayArray3356[i_23_];
							int i_25_ = method387((byte) 127, -2 + i_23_)[1];
							int i_26_ = is_24_[1];
							int i_27_ = i_26_ + -i_25_;
							int i_28_ = is[1];
							int i_29_ = method387((byte) 76, 1 + i_23_)[1];
							int i_30_ = i_28_ + -i_26_ + i_29_ + -i_25_;
							int i_31_ = i_28_;
							int i_32_ = (i_22_ - is[0] << 12) / (is_24_[0] + -is[0]);
							int i_33_ = i_32_ * i_32_ >> 12;
							int i_34_ = (i_32_ * i_30_ >> 12) * i_33_ >> 12;
							int i_35_ = -i_30_ + -i_28_ + i_25_;
							int i_36_ = i_32_ * i_27_ >> 12;
							int i_37_ = i_35_ * i_33_ >> 12;
							int i_38_ = i_37_ + i_34_ + (i_36_ + i_31_);
							if (i_38_ <= -32768) {
								i_38_ = -32767;
							}
							if (i_38_ >= 32768) {
								i_38_ = 32767;
							}
							aShortArray3373[i] = (short) i_38_;
						}
						break while_119_;
					}
					for (i = 0; i < 257; i++) {
						int i_39_ = i << 4;
						int i_40_;
						for (i_40_ = 1; i_40_ < anIntArrayArray3356.length + -1; i_40_++) {
							if ((i_39_ ^ 0xffffffff) > (anIntArrayArray3356[i_40_][0] ^ 0xffffffff)) {
								break;
							}
						}
						int[] is = anIntArrayArray3356[i_40_ - 1];
						int[] is_41_ = anIntArrayArray3356[i_40_];
						int i_42_ = (i_39_ - is[0] << 12) / (is_41_[0] - is[0]);
						int i_43_ = -Class55.anIntArray870[0xff & i_42_ >> 5] + 4096 >> 1;
						int i_44_ = -i_43_ + 4096;
						int i_45_ = is_41_[1] * i_43_ + i_44_ * is[1] >> 12;
						if (i_45_ <= -32768) {
							i_45_ = -32767;
						}
						if ((i_45_ ^ 0xffffffff) <= -32769) {
							i_45_ = 32767;
						}
						aShortArray3373[i] = (short) i_45_;
					}
					break while_119_;
				} while (false);
				for (i = 0; i < 257; i++) {
					int i_46_ = i << 4;
					int i_47_;
					for (i_47_ = 1; anIntArrayArray3356.length - 1 > i_47_; i_47_++) {
						if ((i_46_ ^ 0xffffffff) > (anIntArrayArray3356[i_47_][0] ^ 0xffffffff)) {
							break;
						}
					}
					int[] is = anIntArrayArray3356[i_47_];
					int[] is_48_ = anIntArrayArray3356[i_47_ + -1];
					int i_49_ = (-is_48_[0] + i_46_ << 12) / (is[0] + -is_48_[0]);
					int i_50_ = -i_49_ + 4096;
					int i_51_ = i_49_ * is[1] + i_50_ * is_48_[1] >> 12;
					if (i_51_ <= -32768) {
						i_51_ = -32767;
					}
					if (i_51_ >= 32768) {
						i_51_ = 32767;
					}
					aShortArray3373[i] = (short) i_51_;
				}
			} while (false);
			anInt3355++;
		}
	}
	
	static {
		aClass16_3366 = Class38_Sub6.method1076((byte) 86, "Allocated memory");
		aClass16_3362 = aClass16_3366;
		anInt3369 = 0;
		anIntArrayArray3368 = new int[104][104];
	}
}
