/* Class23_Sub4_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub14 extends Class23_Sub4
{
	static int anInt3118;
	static Class105 aClass105_3119;
	static int anInt3120;
	private static RSString aClass16_3121 = Class38_Sub6.method1076((byte) 86, "as it was used to break our rules)3");
	private int anInt3122 = 3216;
	static int anInt3123;
	static int anInt3124;
	private int anInt3125 = 4096;
	static int anInt3126;
	static int anInt3127;
	static int[] anIntArray3128;
	static int anInt3129;
	static RSString[] aClass16Array3130;
	static int anInt3131;
	static RSString aClass16_3132;
	static RSString aClass16_3133;
	static int anInt3134;
	private int[] anIntArray3135 = new int[3];
	private int anInt3136 = 3216;
	
	final int[] method260(int i, int i_0_) {
		int[] is = aClass99_2115.method1500(i_0_, (byte) -107);
		anInt3134++;
		if (aClass99_2115.aBoolean1681) {
			int i_1_ = anInt3125 * Class54.anInt862 >> 12;
			int[] is_2_ = this.method261(Class23_Sub4_Sub1.anInt2892 & i_0_ - 1, 0, (byte) 18);
			int[] is_3_ = this.method261(i_0_, 0, (byte) 18);
			int[] is_4_ = this.method261(Class23_Sub4_Sub1.anInt2892 & i_0_ - -1, 0, (byte) 18);
			for (int i_5_ = 0; i_5_ < Class23_Sub4_Sub33.anInt3428; i_5_++) {
				int i_6_ = (is_3_[i_5_ + -1 & Class95.anInt1611] - is_3_[i_5_ + 1 & Class95.anInt1611]) * i_1_ >> 12;
				int i_7_ = (is_4_[i_5_] - is_2_[i_5_]) * i_1_ >> 12;
				int i_8_ = i_6_ >> 4;
				int i_9_ = i_7_ >> 4;
				if ((i_8_ ^ 0xffffffff) > -1) {
					i_8_ = -i_8_;
				}
				if ((i_9_ ^ 0xffffffff) > -1) {
					i_9_ = -i_9_;
				}
				if (i_8_ > 255) {
					i_8_ = 255;
				}
				if (i_9_ > 255) {
					i_9_ = 255;
				}
				int i_10_ = Class23_Sub4_Sub16.aByteArray3161[(i_9_ * (i_9_ + 1) >> 1) + i_8_] & 0xff;
				int i_11_ = i_10_ * 4096 >> 8;
				i_11_ = i_11_ * anIntArray3135[2] >> 12;
				int i_12_ = i_6_ * i_10_ >> 8;
				i_12_ = i_12_ * anIntArray3135[0] >> 12;
				int i_13_ = i_7_ * i_10_ >> 8;
				i_13_ = i_13_ * anIntArray3135[1] >> 12;
				is[i_5_] = i_11_ + i_13_ + i_12_;
			}
		}
		if (i != 0) {
			method322(null, 74);
		}
		return is;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_14_) {
		anInt3124++;
		if (i_14_ == 1000) {
			int i_15_ = i;
		while_41_:
			do {
				do {
					if ((i_15_ ^ 0xffffffff) != -1) {
						if (i_15_ != 1) {
							if (i_15_ == 2) {
								break;
							}
							break while_41_;
						}
					} else {
						anInt3125 = class23_sub5.method476((byte) -127);
						return;
					}
					anInt3136 = class23_sub5.method476((byte) -114);
					return;
				} while (false);
				anInt3122 = class23_sub5.method476((byte) -123);
			} while (false);
		}
	}
	
	private final void method320(boolean bool) {
		if (bool == true) {
			double d = Math.cos((double) ((float) anInt3122 / 4096.0F));
			anInt3129++;
			anIntArray3135[0] = (int) (4096.0 * (d * Math.sin((double) ((float) anInt3136 / 4096.0F))));
			anIntArray3135[1] = (int) (d * Math.cos((double) ((float) anInt3136 / 4096.0F)) * 4096.0);
			anIntArray3135[2] = (int) (4096.0 * Math.sin((double) ((float) anInt3122 / 4096.0F)));
			int i = anIntArray3135[0] * anIntArray3135[0] >> 12;
			int i_16_ = anIntArray3135[1] * anIntArray3135[1] >> 12;
			int i_17_ = anIntArray3135[2] * anIntArray3135[2] >> 12;
			int i_18_ = (int) (Math.sqrt((double) (i + i_16_ + i_17_ >> 12)) * 4096.0);
			if ((i_18_ ^ 0xffffffff) != -1) {
				anIntArray3135[0] = (anIntArray3135[0] << 12) / i_18_;
				anIntArray3135[1] = (anIntArray3135[1] << 12) / i_18_;
				anIntArray3135[2] = (anIntArray3135[2] << 12) / i_18_;
			}
		}
	}
	
	final void method265(int i) {
		if (i != -21746) {
			anInt3126 = 44;
		}
		method320(true);
		anInt3127++;
	}
	
	static final int method321(Buffer class23_sub5, RSString class16, int i) {
		anInt3123++;
		int i_19_ = class23_sub5.position;
		class23_sub5.method467(class16.anInt1896, 15549);
		class23_sub5.position += Class69.aClass106_1206.method1579(i ^ ~0x4ee1c480, i, class16.aByteArray1906, class16.anInt1896, class23_sub5.position, class23_sub5.payload);
		return class23_sub5.position + -i_19_;
	}
	
	static final RSString method322(RSString[] class16s, int i) {
		anInt3131++;
		if (i > -5) {
			return null;
		}
		if (class16s.length < 2) {
			throw new IllegalArgumentException();
		}
		return Class23_Sub4_Sub29.method389(class16s, -32768, 0, class16s.length);
	}
	
	static final void method323(byte b) {
		anInt3118++;
		if (b > 90) {
			if (Class9.aString198.toLowerCase().indexOf("microsoft") == -1) {
				Class83.anIntArray1459[47] = 73;
				Class83.anIntArray1459[46] = 72;
				Class83.anIntArray1459[44] = 71;
				Class83.anIntArray1459[45] = 26;
				Class83.anIntArray1459[61] = 27;
				Class83.anIntArray1459[59] = 57;
				Class83.anIntArray1459[92] = 74;
				Class83.anIntArray1459[93] = 43;
				Class83.anIntArray1459[91] = 42;
				if (Class9.aMethod196 != null) {
					Class83.anIntArray1459[520] = 59;
					Class83.anIntArray1459[222] = 58;
					Class83.anIntArray1459[192] = 28;
				} else {
					Class83.anIntArray1459[192] = 58;
					Class83.anIntArray1459[222] = 59;
				}
			} else {
				Class83.anIntArray1459[190] = 72;
				Class83.anIntArray1459[192] = 58;
				Class83.anIntArray1459[219] = 42;
				Class83.anIntArray1459[186] = 57;
				Class83.anIntArray1459[222] = 59;
				Class83.anIntArray1459[191] = 73;
				Class83.anIntArray1459[223] = 28;
				Class83.anIntArray1459[220] = 74;
				Class83.anIntArray1459[189] = 26;
				Class83.anIntArray1459[188] = 71;
				Class83.anIntArray1459[221] = 43;
				Class83.anIntArray1459[187] = 27;
			}
		}
	}
	
	public Class23_Sub4_Sub14() {
		super(1, true);
	}
	
	public static void method324(boolean bool) {
		aClass105_3119 = null;
		aClass16_3121 = null;
		anIntArray3128 = null;
		aClass16Array3130 = null;
		aClass16_3133 = null;
		aClass16_3132 = null;
		if (bool != true) {
			anIntArray3128 = null;
		}
	}
	
	static {
		anInt3120 = -2;
		anIntArray3128 = new int[5];
		anInt3126 = 0;
		aClass16_3132 = Class38_Sub6.method1076((byte) 86, "Clientscript error in: ");
		aClass16Array3130 = new RSString[200];
		aClass16_3133 = aClass16_3121;
	}
}
