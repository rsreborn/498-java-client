/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class83
{
	protected int anInt1457;
	static byte[][][] aByteArrayArrayArray1458;
	static int[] anIntArray1459 = { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	static int anInt1460;
	protected int anInt1461;
	static Class45 aClass45_1462;
	protected Class38 aClass38_1463;
	static RSString aClass16_1464;
	protected int anInt1465;
	static int anInt1466;
	static int anInt1467;
	protected Class38 aClass38_1468;
	protected int anInt1469;
	static int anInt1470;
	private static RSString aClass16_1471 = Class38_Sub6.method1076((byte) 86, "Your account is already logged in)3");
	protected int anInt1472;
	protected long aLong1473 = 0L;
	
	static final RSString method1376(int i, long l) {
		anInt1470++;
		if ((l ^ 0xffffffffffffffffL) >= -1L || (l ^ 0xffffffffffffffffL) <= -6582952005840035282L) {
			return null;
		}
		if ((l % 37L ^ 0xffffffffffffffffL) == -1L) {
			return null;
		}
		int i_0_ = 0;
		for (long l_1_ = l; (l_1_ ^ 0xffffffffffffffffL) != -1L; l_1_ /= 37L)
			i_0_++;
		byte[] bs = new byte[i_0_];
		while ((l ^ 0xffffffffffffffffL) != -1L) {
			long l_2_ = l;
			l /= 37L;
			bs[--i_0_] = Class38_Sub6.aByteArray2618[(int) (-(l * 37L) + l_2_)];
		}
		RSString class16 = new RSString();
		class16.aByteArray1906 = bs;
		if (i != -1) {
			anInt1460 = -124;
		}
		class16.anInt1896 = bs.length;
		return class16;
	}
	
	static final Class83 method1377(int i, int i_3_, int i_4_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_3_][i_4_];
		if (class23_sub1 == null) {
			return null;
		}
		return class23_sub1.aClass83_2031;
	}
	
	public static void method1378(byte b) {
		aClass16_1471 = null;
		aByteArrayArrayArray1458 = null;
		aClass45_1462 = null;
		aClass16_1464 = null;
		if (b == -36) {
			anIntArray1459 = null;
		}
	}
	
	static final void method1379(boolean bool, int i) {
		if ((i ^ 0xffffffff) == 2) {
			Class28.method937(Class71_Sub1_Sub1.aClass16_4434, Class87_Sub1.aClass16_2778, Class23_Sub13_Sub10.aClass16_3876, (byte) 98);
		} else if (i != -2) {
			if ((i ^ 0xffffffff) == 0) {
				Class28.method937(Class71_Sub1_Sub1.aClass16_4456, Class87_Sub1.aClass16_2775, Class59.aClass16_919, (byte) 98);
			} else if (i != 3) {
				if (i != 4) {
					if (i == 5) {
						Class28.method937(Class71_Sub1_Sub1.aClass16_4425, Class23_Sub4_Sub6.aClass16_2981, aClass16_1464, (byte) 98);
					} else if (i == 6) {
						Class28.method937(Class71_Sub1_Sub1.aClass16_4460, CacheIndex.aClass16_259, Class58.aClass16_908, (byte) 98);
					} else if (i == 7) {
						Class28.method937(Class71_Sub1_Sub1.aClass16_4427, Class23_Sub4_Sub7.aClass16_3021, Class89.aClass16_1522, (byte) 98);
					} else if (i == 8) {
						Class28.method937(Class71_Sub1_Sub1.aClass16_4416, Class38.aClass16_593, Class23.aClass16_357, (byte) 98);
					} else if (i == 9) {
						Class28.method937(Class71_Sub1_Sub1.aClass16_4442, Class5.aClass16_111, Class23_Sub4_Sub11.aClass16_3063, (byte) 98);
					} else if (i == 10) {
						Class28.method937(Class71_Sub1_Sub1.aClass16_4446, Class2.aClass16_81, Class23.aClass16_348, (byte) 98);
					} else if (i != 11) {
						if (i == 12) {
							Class28.method937(Class71_Sub1_Sub1.aClass16_4455, Class91.aClass16_1559, Class64.aClass16_1148, (byte) 98);
						} else if (i == 13) {
							Class28.method937(Class71_Sub1_Sub1.aClass16_4443, Class87_Sub1.aClass16_2787, Buffer.aClass16_2163, (byte) 98);
						} else if (i != 14) {
							if (i != 16) {
								if (i == 17) {
									Class28.method937(Class71_Sub1_Sub1.aClass16_4448, Class50.aClass16_767, Class71_Sub3.aClass16_2743, (byte) 98);
								} else if (i != 18) {
									if (i == 19) {
										Class28.method937(Class23_Sub4_Sub7.aClass16_3009, Class23_Sub13_Sub11.aClass16_3942, Class44.aClass16_678, (byte) 98);
									} else if (i != 20) {
										if (i != 22) {
											if (i == 23) {
												Class28.method937(Class71_Sub1_Sub1.aClass16_4424, Class23_Sub12.aClass16_2299, Class71_Sub2_Sub1.aClass16_4474, (byte) 98);
											} else if (i == 24) {
												Class28.method937(Class71_Sub1_Sub1.aClass16_4445, Class38_Sub5.aClass16_2584, Class50.aClass16_773, (byte) 98);
											} else if (i == 25) {
												Class28.method937(Class71_Sub1_Sub1.aClass16_4459, Class87_Sub1.aClass16_2790, CacheIndex.aClass16_263, (byte) 98);
											} else if (i == 26) {
												Class28.method937(Class71_Sub1_Sub1.aClass16_4422, Class23_Sub4_Sub14.aClass16_3133, Class45.aClass16_700, (byte) 98);
											} else if (i == 27) {
												Class28.method937(Class71_Sub1_Sub1.aClass16_4414, Class30.aClass16_474, Class71_Sub1_Sub1.aClass16_4418, (byte) 98);
											} else {
												Class28.method937(Class71_Sub1_Sub1.aClass16_4452, Class87_Sub1.aClass16_2781, Class23_Sub13_Sub16.aClass16_4039, (byte) 98);
											}
										} else {
											Class28.method937(Class71_Sub1_Sub1.aClass16_4435, Class23_Sub13_Sub2.aClass16_3686, CacheFileChannel.aClass16_465, (byte) 98);
										}
									} else {
										Class28.method937(Class71_Sub1_Sub1.aClass16_4430, Class87_Sub1.aClass16_2772, CacheIndex.aClass16_247, (byte) 98);
									}
								} else {
									Class28.method937(Class71_Sub1_Sub1.aClass16_4429, Class23_Sub13_Sub18.aClass16_4095, Class23_Sub13_Sub13.aClass16_3989, (byte) 98);
								}
							} else {
								Class28.method937(Class71_Sub1_Sub1.aClass16_4419, Class23_Sub5_Sub1.aClass16_3536, Class23_Sub9.aClass16_2272, (byte) 98);
							}
						} else {
							Class28.method937(Class71_Sub1_Sub1.aClass16_4447, Class23_Sub12.aClass16_2292, Class87_Sub2.aClass16_2804, (byte) 98);
						}
					} else {
						Class28.method937(Class71_Sub1_Sub1.aClass16_4450, Class23_Sub13_Sub3.aClass16_3696, Class23_Sub4_Sub21.aClass16_3255, (byte) 98);
					}
				} else {
					Class28.method937(Class71_Sub1_Sub1.aClass16_4432, Class70.aClass16_1231, Class32.aClass16_497, (byte) 98);
				}
			} else {
				Class28.method937(Class71_Sub1_Sub1.aClass16_4440, Class23_Sub4_Sub5.aClass16_2974, Class71_Sub1_Sub1.aClass16_4437, (byte) 98);
			}
		} else {
			Class28.method937(Class71_Sub1_Sub1.aClass16_4453, Class23_Sub4_Sub1.aClass16_2903, Class71_Sub1_Sub1.aClass16_4439, (byte) 98);
		}
		if (bool != true) {
			aClass45_1462 = null;
		}
		Class103.method1521(10, 27172);
		anInt1467++;
	}
	
	static {
		aClass16_1464 = aClass16_1471;
		anInt1460 = -1;
	}
}
