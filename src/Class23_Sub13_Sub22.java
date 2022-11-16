/* Class23_Sub13_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub22 extends Class23_Sub13
{
	static int anInt4202;
	protected int[] anIntArray4203;
	protected int[] anIntArray4204;
	protected int[] anIntArray4205;
	protected int anInt4206;
	private boolean aBoolean4207;
	static int anInt4208;
	protected int anInt4209 = -1;
	private int[] anIntArray4210;
	static int anInt4211;
	static RSString aClass16_4212;
	static int anInt4213;
	static int anInt4214;
	static int anInt4215;
	static int anInt4216;
	protected int anInt4217;
	protected int anInt4218;
	protected int anInt4219;
	static int anInt4220;
	static RSString aClass16_4221 = Class38_Sub6.method1076((byte) 86, "auf der Hautpseite)3");
	static int anInt4222;
	protected int anInt4223;
	static int anInt4224;
	static int anInt4225;
	static int anInt4226;
	protected int anInt4227;
	protected int anInt4228;
	private int[] anIntArray4229;
	protected boolean aBoolean4230;
	
	final Class38_Sub1 method832(Class38_Sub1 class38_sub1, int i, boolean bool) {
		anInt4216++;
		i = anIntArray4203[i];
		Class23_Sub13_Sub16 class23_sub13_sub16 = Class87_Sub2.method1414(i >> 16, (byte) -39);
		i &= 0xffff;
		if (class23_sub13_sub16 == null) {
			return class38_sub1.method1005(true, true);
		}
		Class38_Sub1 class38_sub1_0_ = class38_sub1.method1005(!class23_sub13_sub16.method783(i, 1), !aBoolean4207);
		if (bool != true) {
			return null;
		}
		class38_sub1_0_.method1020(class23_sub13_sub16, i, aBoolean4207);
		return class38_sub1_0_;
	}
	
	static final Class23_Sub13_Sub10 method833(int i) {
		anInt4215++;
		int i_1_ = Class105.anIntArray1766[0] * Class79.anIntArray1875[0];
		byte[] bs = Class23_Sub13_Sub23.aByteArrayArray4243[0];
		int[] is = new int[i_1_];
		for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_2_++)
			is[i_2_] = Class23_Sub4_Sub1.anIntArray2890[Class24.method919(bs[i_2_], 255)];
		Class23_Sub13_Sub10_Sub1 class23_sub13_sub10_sub1 = new Class23_Sub13_Sub10_Sub1(Class23_Sub12.anInt2301, Class23_Sub13_Sub15.anInt4033, Class23_Sub23.anIntArray2417[i], Class23_Sub13_Sub2.anIntArray3679[0], Class79.anIntArray1875[0], Class105.anIntArray1766[0], is);
		Class23_Sub13_Sub9.method684(true);
		return class23_sub13_sub10_sub1;
	}
	
	static final void method834(RSString class16, byte b) {
		try {
			Class45.anApplet_Sub1_684.getAppletContext().showDocument(class16.method181(Class45.anApplet_Sub1_684.getCodeBase(), -70), "_blank");
		} catch (Exception exception) {
			/* empty */
		}
		int i = 69 % ((b - 65) / 61);
		anInt4222++;
	}
	
	final Class38_Sub1 method835(int i, byte b, Class38_Sub1 class38_sub1) {
		anInt4225++;
		i = anIntArray4203[i];
		if (b != -12) {
			method837((byte) 0, null);
		}
		Class23_Sub13_Sub16 class23_sub13_sub16 = Class87_Sub2.method1414(i >> 16, (byte) -114);
		i &= 0xffff;
		if (class23_sub13_sub16 == null) {
			return class38_sub1.method1015(true, true);
		}
		Class38_Sub1 class38_sub1_3_ = class38_sub1.method1015(!class23_sub13_sub16.method783(i, 1), !aBoolean4207);
		class38_sub1_3_.method1020(class23_sub13_sub16, i, aBoolean4207);
		return class38_sub1_3_;
	}
	
	final void method836(byte b) {
		if (b <= 13) {
			aBoolean4207 = true;
		}
		if (anInt4219 == -1) {
			if (anIntArray4229 != null) {
				anInt4219 = 2;
			} else {
				anInt4219 = 0;
			}
		}
		anInt4202++;
		if (anInt4227 == -1) {
			if (anIntArray4229 == null) {
				anInt4227 = 0;
			} else {
				anInt4227 = 2;
			}
		}
	}
	
	final void method837(byte b, Buffer class23_sub5) {
		if (b >= -41) {
			anIntArray4204 = null;
		}
		anInt4208++;
		for (;;) {
			int i = class23_sub5.method461(-1797813752);
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			method843((byte) 11, i, class23_sub5);
		}
	}
	
	static final void method838(int i, byte b) {
		int i_4_ = -15 % ((-41 - b) / 54);
		Class23_Sub13_Sub10_Sub1 class23_sub13_sub10_sub1;
		if (Class53.aClass23_Sub13_Sub10_841 == null) {
			class23_sub13_sub10_sub1 = new Class23_Sub13_Sub10_Sub1(512, 512);
		} else {
			class23_sub13_sub10_sub1 = (Class23_Sub13_Sub10_Sub1) Class53.aClass23_Sub13_Sub10_841;
		}
		anInt4211++;
		int[] is = class23_sub13_sub10_sub1.anIntArray4502;
		int i_5_ = is.length;
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
			is[i_6_] = 1;
		for (int i_7_ = 1; i_7_ < 103; i_7_++) {
			int i_8_ = 4 * (-(i_7_ * 512) + 52736) + 24628;
			for (int i_9_ = 1; i_9_ < 103; i_9_++) {
				if ((Class23_Sub4_Sub30.aByteArrayArrayArray3379[i][i_9_][i_7_] & 0x18) == 0) {
					Class23_Sub13_Sub2.method605(is, i_8_, 512, i, i_9_, i_7_);
				}
				if (i < 3 && (0x8 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[1 + i][i_9_][i_7_] ^ 0xffffffff) != -1) {
					Class23_Sub13_Sub2.method605(is, i_8_, 512, i + 1, i_9_, i_7_);
				}
				i_8_ += 4;
			}
		}
		class23_sub13_sub10_sub1.method723();
		int i_10_ = (238 - -(int) (Math.random() * 20.0) - 10 << 16) - -(238 - (-(int) (Math.random() * 20.0) + 10) << 8) - (10 + (-238 - (int) (20.0 * Math.random())));
		int i_11_ = -10 + (238 - -(int) (Math.random() * 20.0)) << 16;
		for (int i_12_ = 1; i_12_ < 103; i_12_++) {
			for (int i_13_ = 1; i_13_ < 103; i_13_++) {
				if ((0x18 & Class23_Sub4_Sub30.aByteArrayArrayArray3379[i][i_13_][i_12_]) == 0) {
					Class71_Sub2.method1279(i_13_, i_11_, i_10_, i_12_, i, 3);
				}
				if (i < 3 && (Class23_Sub4_Sub30.aByteArrayArrayArray3379[1 + i][i_13_][i_12_] & 0x8 ^ 0xffffffff) != -1) {
					Class71_Sub2.method1279(i_13_, i_11_, i_10_, i_12_, 1 + i, 3);
				}
			}
		}
		Class23_Sub5_Sub1.anInt3541 = 0;
		for (int i_14_ = 0; i_14_ < 104; i_14_++) {
			for (int i_15_ = 0; i_15_ < 104; i_15_++) {
				long l = Class107.method1584(Class23_Sub13_Sub11.anInt3916, i_14_, i_15_);
				if ((l ^ 0xffffffffffffffffL) != -1L) {
					Class23_Sub13_Sub7 class23_sub13_sub7 = Class38_Sub2.method1037(0x7fffffff & (int) (l >>> 32), -21035);
					int i_16_ = class23_sub13_sub7.anInt3751;
					if ((i_16_ ^ 0xffffffff) <= -1) {
						int i_17_ = i_15_;
						int i_18_ = i_14_;
						if (i_16_ != 22 && i_16_ != 29 && i_16_ != 34 && i_16_ != 36 && i_16_ != 46 && i_16_ != 47 && i_16_ != 48) {
							int[][] is_19_ = Class4.aClass72Array85[Class23_Sub13_Sub11.anInt3916].anIntArrayArray1290;
							for (int i_20_ = 0; i_20_ < 10; i_20_++) {
								int i_21_ = (int) (4.0 * Math.random());
								if (i_21_ == 0 && (i_18_ ^ 0xffffffff) < -1 && (-3 + i_14_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff) && (is_19_[-1 + i_18_][i_17_] & 0x12c0108 ^ 0xffffffff) == -1) {
									i_18_--;
								}
								if (i_21_ == 1 && i_18_ < 103 && i_14_ + 3 > i_18_ && (is_19_[i_18_ + 1][i_17_] & 0x12c0180) == 0) {
									i_18_++;
								}
								if (i_21_ == 2 && (i_17_ ^ 0xffffffff) < -1 && (-3 + i_15_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff) && (0x12c0102 & is_19_[i_18_][-1 + i_17_]) == 0) {
									i_17_--;
								}
								if (i_21_ == 3 && i_17_ < 103 && i_15_ + 3 > i_17_ && (0x12c0120 & is_19_[i_18_][1 + i_17_] ^ 0xffffffff) == -1) {
									i_17_++;
								}
							}
						}
						Class23_Sub4_Sub17.anIntArray3172[Class23_Sub5_Sub1.anInt3541] = class23_sub13_sub7.anInt3791;
						Class102.anIntArray1704[Class23_Sub5_Sub1.anInt3541] = i_18_;
						oa.anIntArray1251[Class23_Sub5_Sub1.anInt3541] = i_17_;
						Class23_Sub5_Sub1.anInt3541++;
					}
				}
			}
		}
		Class53.aClass23_Sub13_Sub10_841 = class23_sub13_sub10_sub1;
		Class23_Sub13_Sub25.aClass78_4290.method1347((byte) -67);
	}
	
	final Class38_Sub1 method839(Class38_Sub1 class38_sub1, int i, byte b) {
		if (b != 99) {
			method842(null, 81, null, -3, -104);
		}
		int i_22_ = anIntArray4203[i];
		anInt4213++;
		Class23_Sub13_Sub16 class23_sub13_sub16 = Class87_Sub2.method1414(i_22_ >> 16, (byte) -34);
		i_22_ &= 0xffff;
		if (class23_sub13_sub16 == null) {
			return class38_sub1.method1015(true, true);
		}
		int i_23_ = 0;
		Class23_Sub13_Sub16 class23_sub13_sub16_24_ = null;
		if (anIntArray4210 != null && (i ^ 0xffffffff) > (anIntArray4210.length ^ 0xffffffff)) {
			i_23_ = anIntArray4210[i];
			class23_sub13_sub16_24_ = Class87_Sub2.method1414(i_23_ >> 16, (byte) -96);
			i_23_ &= 0xffff;
		}
		if (class23_sub13_sub16_24_ == null || (i_23_ ^ 0xffffffff) == -65536) {
			Class38_Sub1 class38_sub1_25_ = class38_sub1.method1015(!class23_sub13_sub16.method783(i_22_, 1), !aBoolean4207);
			class38_sub1_25_.method1020(class23_sub13_sub16, i_22_, aBoolean4207);
			return class38_sub1_25_;
		}
		Class38_Sub1 class38_sub1_26_ = class38_sub1.method1015(!class23_sub13_sub16.method783(i_22_, 1) & !class23_sub13_sub16_24_.method783(i_23_, 1), !aBoolean4207);
		class38_sub1_26_.method1020(class23_sub13_sub16, i_22_, aBoolean4207);
		class38_sub1_26_.method1020(class23_sub13_sub16_24_, i_23_, aBoolean4207);
		return class38_sub1_26_;
	}
	
	final Class38_Sub1 method840(int i, int i_27_, byte b, Class38_Sub1 class38_sub1) {
		anInt4226++;
		i_27_ = anIntArray4203[i_27_];
		if (b != -15) {
			return null;
		}
		Class23_Sub13_Sub16 class23_sub13_sub16 = Class87_Sub2.method1414(i_27_ >> 16, (byte) -77);
		i_27_ &= 0xffff;
		if (class23_sub13_sub16 == null) {
			return class38_sub1.method1015(true, true);
		}
		Class38_Sub1 class38_sub1_28_ = class38_sub1.method1015(!class23_sub13_sub16.method783(i_27_, 1), !aBoolean4207);
		i &= 0x3;
		if (i == 1) {
			class38_sub1_28_.method1007();
		} else if (i == 2) {
			class38_sub1_28_.method1006();
		} else if (i == 3) {
			class38_sub1_28_.method1009();
		}
		class38_sub1_28_.method1020(class23_sub13_sub16, i_27_, aBoolean4207);
		if (i != 1) {
			if (i == 2) {
				class38_sub1_28_.method1006();
			} else if (i == 3) {
				class38_sub1_28_.method1007();
			}
		} else {
			class38_sub1_28_.method1009();
		}
		return class38_sub1_28_;
	}
	
	public static void method841(int i) {
		if (i != -20670) {
			method838(20, (byte) -71);
		}
		aClass16_4221 = null;
		aClass16_4212 = null;
	}
	
	final Class38_Sub1 method842(Class23_Sub13_Sub22 class23_sub13_sub22_29_, int i, Class38_Sub1 class38_sub1, int i_30_, int i_31_) {
		i_31_ = anIntArray4203[i_31_];
		anInt4214++;
		Class23_Sub13_Sub16 class23_sub13_sub16 = Class87_Sub2.method1414(i_31_ >> 16, (byte) -63);
		i_31_ &= 0xffff;
		if (class23_sub13_sub16 == null) {
			return class23_sub13_sub22_29_.method835(i, (byte) -12, class38_sub1);
		}
		i = class23_sub13_sub22_29_.anIntArray4203[i];
		Class23_Sub13_Sub16 class23_sub13_sub16_32_ = Class87_Sub2.method1414(i >> 16, (byte) -128);
		i &= 0xffff;
		if (class23_sub13_sub16_32_ == null) {
			Class38_Sub1 class38_sub1_33_ = class38_sub1.method1015(!class23_sub13_sub16.method783(i_31_, 1), !aBoolean4207);
			class38_sub1_33_.method1020(class23_sub13_sub16, i_31_, aBoolean4207);
			return class38_sub1_33_;
		}
		Class38_Sub1 class38_sub1_34_ = class38_sub1.method1015(!class23_sub13_sub16.method783(i_31_, 1) & !class23_sub13_sub16_32_.method783(i, 1), !class23_sub13_sub22_29_.aBoolean4207 & !aBoolean4207);
		class38_sub1_34_.method1003(class23_sub13_sub16, i_31_, class23_sub13_sub16_32_, i, anIntArray4229, class23_sub13_sub22_29_.aBoolean4207 | aBoolean4207);
		int i_35_ = 45 % ((-35 - i_30_) / 46);
		return class38_sub1_34_;
	}
	
	private final void method843(byte b, int i, Buffer class23_sub5) {
		if (b == 11) {
			anInt4224++;
			if (i != 1) {
				if (i == 2) {
					anInt4223 = class23_sub5.method476((byte) -118);
				} else if (i == 3) {
					int i_36_ = class23_sub5.method461(-1797813752);
					anIntArray4229 = new int[1 + i_36_];
					for (int i_37_ = 0; i_36_ > i_37_; i_37_++)
						anIntArray4229[i_37_] = class23_sub5.method461(Class104.method1531(b, -1797813757));
					anIntArray4229[i_36_] = 9999999;
				} else if (i == 4) {
					aBoolean4230 = true;
				} else if (i == 5) {
					anInt4217 = class23_sub5.method461(b + -1797813763);
				} else if (i != 6) {
					if (i == 7) {
						anInt4209 = class23_sub5.method476((byte) -119);
					} else if (i == 8) {
						anInt4218 = class23_sub5.method461(-1797813752);
					} else if (i == 9) {
						anInt4227 = class23_sub5.method461(b ^ ~0x6b2875fc);
					} else if (i != 10) {
						if (i != 11) {
							if (i != 12) {
								if (i == 13) {
									int i_38_ = class23_sub5.method461(-1797813752);
									anIntArray4205 = new int[i_38_];
									for (int i_39_ = 0; i_38_ > i_39_; i_39_++)
										anIntArray4205[i_39_] = class23_sub5.method471(54);
								} else if (i == 14) {
									aBoolean4207 = true;
								}
							} else {
								int i_40_ = class23_sub5.method461(-1797813752);
								anIntArray4210 = new int[i_40_];
								for (int i_41_ = 0; i_40_ > i_41_; i_41_++)
									anIntArray4210[i_41_] = class23_sub5.method476((byte) -127);
								for (int i_42_ = 0; i_40_ > i_42_; i_42_++)
									anIntArray4210[i_42_] = (class23_sub5.method476((byte) -106) << 16) + anIntArray4210[i_42_];
							}
						} else {
							anInt4228 = class23_sub5.method461(-1797813752);
						}
					} else {
						anInt4219 = class23_sub5.method461(b ^ ~0x6b2875fc);
					}
				} else {
					anInt4206 = class23_sub5.method476((byte) -119);
				}
			} else {
				int i_43_ = class23_sub5.method476((byte) -109);
				anIntArray4204 = new int[i_43_];
				for (int i_44_ = 0; (i_43_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++)
					anIntArray4204[i_44_] = class23_sub5.method476((byte) -112);
				anIntArray4203 = new int[i_43_];
				for (int i_45_ = 0; i_45_ < i_43_; i_45_++)
					anIntArray4203[i_45_] = class23_sub5.method476((byte) -121);
				for (int i_46_ = 0; (i_43_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++)
					anIntArray4203[i_46_] = (class23_sub5.method476((byte) -111) << 16) - -anIntArray4203[i_46_];
			}
		}
	}
	
	public Class23_Sub13_Sub22() {
		aBoolean4207 = false;
		anInt4206 = -1;
		anInt4219 = -1;
		anInt4217 = 5;
		anInt4223 = -1;
		anInt4218 = 99;
		anInt4227 = -1;
		anInt4228 = 2;
		aBoolean4230 = false;
	}
	
	static {
		aClass16_4212 = Class38_Sub6.method1076((byte) 86, "Unerwartete Antwort vom Anmelde)2Server");
	}
}
