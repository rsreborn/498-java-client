/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class92
{
	static int anInt1560;
	static Class105_Sub1 aClass105_Sub1_1561;
	protected int anInt1562;
	static int anInt1563;
	static RSString aClass16_1564 = Class38_Sub6.method1076((byte) 86, " (X");
	protected int anInt1565;
	static int anInt1566;
	static Class64 aClass64_1567;
	protected int anInt1568;
	static int anInt1569;
	static int anInt1570;
	static int anInt1571;
	protected int anInt1572;
	static int[][][] anIntArrayArrayArray1573;
	
	static final void method1457(int i, byte b, RSString class16) {
		if (b >= -9) {
			method1457(50, (byte) 124, null);
		}
		RSString class16_0_ = class16.method145((byte) -107).method154((byte) 59);
		boolean bool = false;
		for (int i_1_ = 0; (Class23_Sub4_Sub11.anInt3067 ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
			Class38_Sub7_Sub2 class38_sub7_sub2 = Class23_Sub4_Sub2.aClass38_Sub7_Sub2Array2932[Class23_Sub13_Sub3.anIntArray3700[i_1_]];
			if (class38_sub7_sub2 != null && class38_sub7_sub2.aClass16_4389 != null && class38_sub7_sub2.aClass16_4389.method140(class16_0_, 40)) {
				bool = true;
				Class5.method66(0, class38_sub7_sub2.anIntArray2694[0], 2, class38_sub7_sub2.anIntArray2663[0], false, false, 0, 0, Class105.aClass38_Sub7_Sub2_1812.anIntArray2663[0], 1, Class105.aClass38_Sub7_Sub2_1812.anIntArray2694[0], 1);
				if (i != 1) {
					if (i == 4) {
						Class23_Sub13_Sub17.anInt4075++;
						Class23_Sub7.outBuffer.method486(228, 2976);
						Class23_Sub7.outBuffer.method427(Class23_Sub13_Sub3.anIntArray3700[i_1_], -1371695448);
					} else if (i != 6) {
						if (i == 7) {
							Class23_Sub7.outBuffer.method486(52, 2976);
							Class23_Sub7.outBuffer.method430(Class23_Sub13_Sub3.anIntArray3700[i_1_], 14982);
							Class23_Sub24.anInt2453++;
						}
					} else {
						Class82.anInt1446++;
						Class23_Sub7.outBuffer.method486(245, 2976);
						Class23_Sub7.outBuffer.method443(Class23_Sub13_Sub3.anIntArray3700[i_1_], (byte) 51);
					}
				} else {
					Class23_Sub7.outBuffer.method486(185, 2976);
					Class23_Sub23.anInt2422++;
					Class23_Sub7.outBuffer.method427(Class23_Sub13_Sub3.anIntArray3700[i_1_], -1371695448);
				}
				break;
			}
		}
		anInt1569++;
		if (!bool) {
			Class95.method1468(0, -1, Class23_Sub4_Sub14.method322(new RSString[] { Class34.aClass16_529, class16_0_ }, -79), Class23_Sub4_Sub38.aClass16_3509);
		}
	}
	
	static final void method1458(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (Class73.anInt1319 < 100) {
			Class23_Sub10_Sub2.method568(96);
		}
		Class20.method210(i_5_, i_3_, i_5_ + i_2_, i_4_ + i_3_);
		Class76.method1318();
		Class20.method222(i_5_, i_3_, i_2_, i_4_, 0);
		anInt1571++;
		if (Class73.anInt1319 < 100) {
			int i_6_ = 20;
			int i_7_ = i_2_ / 2 + i_5_;
			int i_8_ = -i_6_ + (-18 + (i_3_ + i_4_ / 2));
			Class20.method215(i_7_ + -152, i_8_, 304, 34, 9179409);
			Class20.method215(-151 + i_7_, 1 + i_8_, 302, 32, 0);
			Class20.method222(-150 + i_7_, i_8_ - -2, 3 * Class73.anInt1319, 30, 9179409);
			Class20.method222(3 * Class73.anInt1319 + -150 + i_7_, 2 + i_8_, -(3 * Class73.anInt1319) + 300, 30, 0);
			Class13.aClass23_Sub13_Sub8_240.method666(Class23_Sub14.aClass16_2326, i_7_, i_8_ - -i_6_, 16777215, -1);
		} else {
			Class33.anInt521 = -(int) ((double) i_2_ / Class107.aDouble1838) + Canvas_Sub1.anInt55;
			Class71_Sub2_Sub1.anInt4475 = (int) ((double) (2 * i_2_) / Class107.aDouble1838);
			Class31.anInt488 = -(int) ((double) i_4_ / Class107.aDouble1838) + Class8.anInt179;
			Class65.anInt1161 = (int) ((double) (2 * i_4_) / Class107.aDouble1838);
			int i_9_ = 127 % ((-31 - i) / 36);
			int i_10_ = -(int) ((double) i_4_ / Class107.aDouble1838) + Class8.anInt179;
			int i_11_ = Canvas_Sub1.anInt55 + -(int) ((double) i_2_ / Class107.aDouble1838);
			int i_12_ = (int) ((double) i_2_ / Class107.aDouble1838) + Canvas_Sub1.anInt55;
			int i_13_ = (int) ((double) i_4_ / Class107.aDouble1838) + Class8.anInt179;
			Class23_Sub4_Sub24.method368(i_3_, i_10_, i_2_ + i_5_, 1, i_11_, i_12_, i_5_, i_13_, i_3_ + i_4_);
			Class23_Sub13_Sub4.method624(i_13_, i_5_, i_3_, i_12_, i_11_, -3, i_10_, i_2_ + i_5_, i_3_ - -i_4_);
			if (Class17_Sub1.anInt2002 > 0) {
				Class17_Sub1.anInt2002--;
			}
			if (Class82.aBoolean1442) {
				int i_14_ = -5 + (i_5_ - -i_2_);
				int i_15_ = i_4_ + (i_3_ + -8);
				Class38_Sub7.aClass23_Sub13_Sub8_2637.method668(Class23_Sub4_Sub14.method322(new RSString[] { Class55.aClass16_881, Class23_Sub4_Sub23.method360((byte) -9, Class2.anInt79) }, -108), i_14_, i_15_, 16776960, -1);
				i_15_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_16_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_17_ = 16776960;
				if ((i_16_ ^ 0xffffffff) < -32769 && Class7.aBoolean170) {
					i_17_ = 16711680;
				}
				if (i_16_ > 65536 && !Class7.aBoolean170) {
					i_17_ = 16711680;
				}
				Class38_Sub7.aClass23_Sub13_Sub8_2637.method668(Class23_Sub4_Sub14.method322(new RSString[] { Class23_Sub11.aClass16_2279, Class23_Sub4_Sub23.method360((byte) -9, i_16_), Class23_Sub4_Sub9.aClass16_3038 }, -52), i_14_, i_15_, i_17_, -1);
				i_15_ -= 15;
			}
		}
	}
	
	public Class92() {
		/* empty */
	}
	
	public static void method1459(byte b) {
		anIntArrayArrayArray1573 = null;
		aClass64_1567 = null;
		aClass16_1564 = null;
		if (b != -73) {
			anInt1563 = 51;
		}
		aClass105_Sub1_1561 = null;
	}
	
	static final byte[] method1460(int i, boolean bool) {
		anInt1570++;
		if (bool != true) {
			method1457(-56, (byte) 16, null);
		}
		Class23_Sub13_Sub2 class23_sub13_sub2 = (Class23_Sub13_Sub2) Class42.aClass5_661.method62(117, (long) i);
		if (class23_sub13_sub2 == null) {
			byte[] bs = new byte[512];
			Random random = new Random((long) i);
			for (int i_18_ = 0; i_18_ < 255; i_18_++)
				bs[i_18_] = (byte) i_18_;
			for (int i_19_ = 0; i_19_ < 255; i_19_++) {
				int i_20_ = -i_19_ + 255;
				int i_21_ = Class23_Sub13_Sub9.method686(12402, random, i_20_);
				byte b = bs[i_21_];
				bs[i_21_] = bs[i_20_];
				bs[i_20_] = bs[-i_19_ + 511] = b;
			}
			class23_sub13_sub2 = new Class23_Sub13_Sub2(bs);
			Class42.aClass5_661.method67((long) i, class23_sub13_sub2, bool);
		}
		return class23_sub13_sub2.aByteArray3683;
	}
	
	Class92(Class92 class92_22_) {
		anInt1562 = class92_22_.anInt1562;
		anInt1568 = class92_22_.anInt1568;
		anInt1572 = class92_22_.anInt1572;
		anInt1565 = class92_22_.anInt1565;
	}
	
	static {
		anInt1563 = 2;
		anInt1566 = 0;
	}
}
