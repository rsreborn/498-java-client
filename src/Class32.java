/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class32 implements KeyListener, FocusListener
{
	static RSString aClass16_494 = Class38_Sub6.method1076((byte) 86, " )2>");
	static int anInt495;
	static int anInt496;
	static RSString aClass16_497;
	static int anInt498;
	static int anInt499;
	private static RSString aClass16_500 = Class38_Sub6.method1076((byte) 86, "Your account has been disabled)3");
	static int[] anIntArray501 = new int[256];
	static Class64 aClass64_502;
	static int anInt503;
	static int anInt504;
	static int anInt505;
	static byte[][][] aByteArrayArrayArray506;
	static int anInt507;
	static int anInt508;
	static int anInt509;
	
	static final void method962(int i, int i_0_, int i_1_, byte b, Class38_Sub7_Sub2 class38_sub7_sub2) {
		anInt509++;
		if (class38_sub7_sub2 != Class105.aClass38_Sub7_Sub2_1812 && Class23_Sub13_Sub9.anInt3863 < 400) {
			RSString class16;
			if (class38_sub7_sub2.anInt4386 != 0) {
				class16 = Class23_Sub4_Sub14.method322(new RSString[] { class38_sub7_sub2.aClass16_4389, Class92.aClass16_1564, Class38_Sub7.aClass16_2679, Class23_Sub4_Sub23.method360((byte) -9, class38_sub7_sub2.anInt4386), Class23_Sub4_Sub10.aClass16_3048 }, -58);
			} else {
				class16 = Class23_Sub4_Sub14.method322(new RSString[] { class38_sub7_sub2.aClass16_4389, Class23_Sub4_Sub1.method271(Class105.aClass38_Sub7_Sub2_1812.anInt4383, (byte) -15, class38_sub7_sub2.anInt4383), Class92.aClass16_1564, Class23_Sub19.aClass16_2378, Class23_Sub4_Sub23.method360((byte) -9, class38_sub7_sub2.anInt4383), Class23_Sub4_Sub10.aClass16_3048 }, -93);
			}
			if (Class38_Sub7_Sub1.anInt4374 == 1) {
				Class23_Sub13_Sub19.method812((long) i_1_, (short) 40, i_0_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub24.aClass16_4281, Buffer.aClass16_2169, class16 }, -46), 500, Class23_Sub13_Sub20.aClass16_4163, i);
				Class23_Sub9.anInt2271++;
			} else if (!Class23_Sub13_Sub7.aBoolean3792) {
				for (int i_2_ = 7; (i_2_ ^ 0xffffffff) <= -1; i_2_--) {
					if (Class23_Sub23.aClass16Array2432[i_2_] != null) {
						short s = 0;
						boolean bool = false;
						if ((Class23_Sub4_Sub29.anInt3369 ^ 0xffffffff) != -1 || !Class23_Sub23.aClass16Array2432[i_2_].method140(Class31.aClass16_487, 40)) {
							if (Class23_Sub13.aBooleanArray2317[i_2_]) {
								s = (short) 2000;
							}
						} else {
							if ((Class105.aClass38_Sub7_Sub2_1812.anInt4383 ^ 0xffffffff) > (class38_sub7_sub2.anInt4383 ^ 0xffffffff)) {
								s = (short) 2000;
							}
							if (Class105.aClass38_Sub7_Sub2_1812.anInt4398 != 0 && class38_sub7_sub2.anInt4398 != 0) {
								if (class38_sub7_sub2.anInt4398 == Class105.aClass38_Sub7_Sub2_1812.anInt4398) {
									s = (short) 2000;
								} else {
									s = (short) 0;
								}
							}
						}
						short s_3_ = Class23_Sub13_Sub25.aShortArray4283[i_2_];
						s_3_ += s;
						Class23_Sub13_Sub19.method812((long) i_1_, s_3_, i_0_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub1.aClass16_2896, class16 }, -124), 500, Class23_Sub23.aClass16Array2432[i_2_], i);
						Class23_Sub4_Sub20.anInt3232++;
					}
				}
			} else if ((0x8 & Class71_Sub1.anInt2725) == 8) {
				Class23_Sub13_Sub19.method812((long) i_1_, (short) 38, i_0_, Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub13_Sub4.aClass16_3714, Buffer.aClass16_2169, class16 }, -16), 500, Class49.aClass16_764, i);
				Class17.anInt300++;
			}
			int i_4_ = -41 / ((b - -8) / 62);
			for (int i_5_ = 0; (Class23_Sub13_Sub9.anInt3863 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				if (Class38_Sub5.aShortArray2603[i_5_] == 5) {
					Class98.aClass16Array1655[i_5_] = Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub4_Sub1.aClass16_2896, class16 }, -15);
					break;
				}
			}
		}
	}
	
	public final void keyTyped(KeyEvent keyevent) {
		if (Class39.aClass32_609 != null) {
			int i = Class14.method134(keyevent, 97);
			if ((i ^ 0xffffffff) <= -1) {
				int i_6_ = 0x7f & 1 + Class68.anInt1202;
				if ((Class103.anInt1724 ^ 0xffffffff) != (i_6_ ^ 0xffffffff)) {
					Class38.anIntArray596[Class68.anInt1202] = -1;
					Class23_Sub13_Sub5.anIntArray3719[Class68.anInt1202] = i;
					Class68.anInt1202 = i_6_;
				}
			}
		}
		keyevent.consume();
		anInt503++;
	}
	
	public final synchronized void keyReleased(KeyEvent keyevent) {
		anInt499++;
		if (Class39.aClass32_609 != null) {
			Class79.anInt1883 = 0;
			int i = keyevent.getKeyCode();
			if (i < 0 || i >= Class83.anIntArray1459.length) {
				i = -1;
			} else {
				i = ~0x80 & Class83.anIntArray1459[i];
			}
			if (Class23_Sub4_Sub6.anInt2986 >= 0 && i >= 0) {
				Class17_Sub1.anIntArray2001[Class23_Sub4_Sub6.anInt2986] = i ^ 0xffffffff;
				Class23_Sub4_Sub6.anInt2986 = 0x7f & Class23_Sub4_Sub6.anInt2986 - -1;
				if (Class23_Sub13.anInt2309 == Class23_Sub4_Sub6.anInt2986) {
					Class23_Sub4_Sub6.anInt2986 = -1;
				}
			}
		}
		keyevent.consume();
	}
	
	static final void method963() {
		int i = Class38.anIntArray595[Class23_Sub4_Sub17.anInt3174];
		Class59[] class59s = Class38.aClass59ArrayArray591[Class23_Sub4_Sub17.anInt3174];
		Class23_Sub4_Sub4.anInt2967 = 0;
	while_19_:
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			Class59 class59 = class59s[i_7_];
			if (Class35.anIntArray548 != null) {
				for (int i_8_ = 0; i_8_ < Class35.anIntArray548.length; i_8_++) {
					if (Class35.anIntArray548[i_8_] != -1000000 && (class59.anInt927 <= Class35.anIntArray548[i_8_] || class59.anInt922 <= Class35.anIntArray548[i_8_]) && (class59.anInt947 <= Class23_Sub4_Sub23.anIntArray3285[i_8_] || class59.anInt929 <= Class23_Sub4_Sub23.anIntArray3285[i_8_]) && (class59.anInt947 >= Class81.anIntArray1433[i_8_] || class59.anInt929 >= Class81.anIntArray1433[i_8_]) && (class59.anInt944 <= Class23_Sub4_Sub33.anIntArray3427[i_8_] || class59.anInt930 <= Class23_Sub4_Sub33.anIntArray3427[i_8_]) && (class59.anInt944 >= Class82.anIntArray1455[i_8_] || class59.anInt930 >= Class82.anIntArray1455[i_8_])) {
						continue while_19_;
					}
				}
			}
			if (class59.anInt948 == 1) {
				int i_9_ = class59.anInt941 - Canvas_Sub1.anInt51 + Class23_Sub4_Sub15.anInt3138;
				if (i_9_ >= 0 && i_9_ <= Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138) {
					int i_10_ = class59.anInt923 - Class23_Sub4_Sub33.anInt3425 + Class23_Sub4_Sub15.anInt3138;
					if (i_10_ < 0) {
						i_10_ = 0;
					}
					int i_11_ = class59.anInt936 - Class23_Sub4_Sub33.anInt3425 + Class23_Sub4_Sub15.anInt3138;
					if (i_11_ > Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138) {
						i_11_ = Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138;
					}
					boolean bool = false;
					while (i_10_ <= i_11_) {
						if (Class94.aBooleanArrayArray1608[i_9_][i_10_++]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_12_ = Class17.anInt311 - class59.anInt947;
						if (i_12_ > 32) {
							class59.anInt932 = 1;
						} else {
							if (i_12_ >= -32) {
								continue;
							}
							class59.anInt932 = 2;
							i_12_ = -i_12_;
						}
						class59.anInt939 = (class59.anInt944 - Class23_Sub4_Sub23.anInt3281 << 8) / i_12_;
						class59.anInt921 = (class59.anInt930 - Class23_Sub4_Sub23.anInt3281 << 8) / i_12_;
						class59.anInt949 = (class59.anInt927 - Class61.anInt956 << 8) / i_12_;
						class59.anInt943 = (class59.anInt922 - Class61.anInt956 << 8) / i_12_;
						Class23_Sub13_Sub1.aClass59Array3670[Class23_Sub4_Sub4.anInt2967++] = class59;
					}
				}
			} else if (class59.anInt948 == 2) {
				int i_13_ = class59.anInt923 - Class23_Sub4_Sub33.anInt3425 + Class23_Sub4_Sub15.anInt3138;
				if (i_13_ >= 0 && i_13_ <= Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138) {
					int i_14_ = class59.anInt941 - Canvas_Sub1.anInt51 + Class23_Sub4_Sub15.anInt3138;
					if (i_14_ < 0) {
						i_14_ = 0;
					}
					int i_15_ = class59.anInt914 - Canvas_Sub1.anInt51 + Class23_Sub4_Sub15.anInt3138;
					if (i_15_ > Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138) {
						i_15_ = Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138;
					}
					boolean bool = false;
					while (i_14_ <= i_15_) {
						if (Class94.aBooleanArrayArray1608[i_14_++][i_13_]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_16_ = Class23_Sub4_Sub23.anInt3281 - class59.anInt944;
						if (i_16_ > 32) {
							class59.anInt932 = 3;
						} else {
							if (i_16_ >= -32) {
								continue;
							}
							class59.anInt932 = 4;
							i_16_ = -i_16_;
						}
						class59.anInt938 = (class59.anInt947 - Class17.anInt311 << 8) / i_16_;
						class59.anInt942 = (class59.anInt929 - Class17.anInt311 << 8) / i_16_;
						class59.anInt949 = (class59.anInt927 - Class61.anInt956 << 8) / i_16_;
						class59.anInt943 = (class59.anInt922 - Class61.anInt956 << 8) / i_16_;
						Class23_Sub13_Sub1.aClass59Array3670[Class23_Sub4_Sub4.anInt2967++] = class59;
					}
				}
			} else if (class59.anInt948 == 4) {
				int i_17_ = class59.anInt927 - Class61.anInt956;
				if (i_17_ > 128) {
					int i_18_ = class59.anInt923 - Class23_Sub4_Sub33.anInt3425 + Class23_Sub4_Sub15.anInt3138;
					if (i_18_ < 0) {
						i_18_ = 0;
					}
					int i_19_ = class59.anInt936 - Class23_Sub4_Sub33.anInt3425 + Class23_Sub4_Sub15.anInt3138;
					if (i_19_ > Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138) {
						i_19_ = Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138;
					}
					if (i_18_ <= i_19_) {
						int i_20_ = class59.anInt941 - Canvas_Sub1.anInt51 + Class23_Sub4_Sub15.anInt3138;
						if (i_20_ < 0) {
							i_20_ = 0;
						}
						int i_21_ = class59.anInt914 - Canvas_Sub1.anInt51 + Class23_Sub4_Sub15.anInt3138;
						if (i_21_ > Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138) {
							i_21_ = Class23_Sub4_Sub15.anInt3138 + Class23_Sub4_Sub15.anInt3138;
						}
						boolean bool = false;
					while_17_:
						for (int i_22_ = i_20_; i_22_ <= i_21_; i_22_++) {
							for (int i_23_ = i_18_; i_23_ <= i_19_; i_23_++) {
								if (Class94.aBooleanArrayArray1608[i_22_][i_23_]) {
									bool = true;
									break while_17_;
								}
							}
						}
						if (bool) {
							class59.anInt932 = 5;
							class59.anInt938 = (class59.anInt947 - Class17.anInt311 << 8) / i_17_;
							class59.anInt942 = (class59.anInt929 - Class17.anInt311 << 8) / i_17_;
							class59.anInt939 = (class59.anInt944 - Class23_Sub4_Sub23.anInt3281 << 8) / i_17_;
							class59.anInt921 = (class59.anInt930 - Class23_Sub4_Sub23.anInt3281 << 8) / i_17_;
							Class23_Sub13_Sub1.aClass59Array3670[Class23_Sub4_Sub4.anInt2967++] = class59;
						}
					}
				}
			}
		}
	}
	
	public final synchronized void focusLost(FocusEvent focusevent) {
		anInt507++;
		if (Class39.aClass32_609 != null) {
			Class23_Sub4_Sub6.anInt2986 = -1;
		}
	}
	
	static final void method964(int i, int i_24_) {
		Class75.anInt1381 = -1;
		Canvas_Sub1.anInt55 = i_24_;
		anInt504++;
		if (i == 128) {
			Class68.anInt1203 = -1;
			Class61.method1198(15);
		}
	}
	
	public static void method965(int i) {
		aClass16_494 = null;
		anIntArray501 = null;
		aClass16_500 = null;
		aClass16_497 = null;
		aClass64_502 = null;
		aByteArrayArrayArray506 = null;
		if (i != -7897) {
			method966(18, -79);
		}
	}
	
	public final void focusGained(FocusEvent focusevent) {
		anInt508++;
	}
	
	static final boolean method966(int i, int i_25_) {
		anInt495++;
		if (i >= 97 && i <= 122) {
			return true;
		}
		if (i >= 65 && i <= 90) {
			return true;
		}
		if (i >= 48 && i <= 57) {
			return true;
		}
		if (i_25_ != 122) {
			anIntArray501 = null;
		}
		return false;
	}
	
	public final synchronized void keyPressed(KeyEvent keyevent) {
		anInt496++;
		if (Class39.aClass32_609 != null) {
			Class79.anInt1883 = 0;
			int i = keyevent.getKeyCode();
			if (i < 0 || i >= Class83.anIntArray1459.length) {
				i = -1;
			} else {
				i = Class83.anIntArray1459[i];
				if ((0x80 & i) != 0) {
					i = -1;
				}
			}
			if ((Class23_Sub4_Sub6.anInt2986 ^ 0xffffffff) <= -1 && (i ^ 0xffffffff) <= -1) {
				Class17_Sub1.anIntArray2001[Class23_Sub4_Sub6.anInt2986] = i;
				Class23_Sub4_Sub6.anInt2986 = 1 + Class23_Sub4_Sub6.anInt2986 & 0x7f;
				if (Class23_Sub13.anInt2309 == Class23_Sub4_Sub6.anInt2986) {
					Class23_Sub4_Sub6.anInt2986 = -1;
				}
			}
			if ((i ^ 0xffffffff) <= -1) {
				int i_26_ = 0x7f & 1 + Class68.anInt1202;
				if ((i_26_ ^ 0xffffffff) != (Class103.anInt1724 ^ 0xffffffff)) {
					Class38.anIntArray596[Class68.anInt1202] = i;
					Class23_Sub13_Sub5.anIntArray3719[Class68.anInt1202] = -1;
					Class68.anInt1202 = i_26_;
				}
			}
			int i_27_ = keyevent.getModifiers();
			if ((0xa & i_27_) != 0 || i == 85 || i == 10) {
				keyevent.consume();
			}
		}
	}
	
	static {
		aClass16_497 = aClass16_500;
	}
}
