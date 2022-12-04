/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RuntimeException_Sub1 extends RuntimeException
{
	static int anInt1842;
	static int anInt1843;
	static int anInt1844;
	static RSString aClass16_1845;
	static int anInt1846;
	static int anInt1847;
	protected Throwable aThrowable1848;
	static RSString aClass16_1849 = Class38_Sub6.method1076((byte) 86, ")3");
	protected String aString1850;
	static short[][] aShortArrayArray1851;
	static int anInt1852;
	static int anInt1853;
	static int anInt1854;
	
	static final Class43[] method1585(Class105 class105, byte b, int i) {
		anInt1847++;
		if (b != -102) {
			method1588(null, false);
		}
		if (!Applet_Sub1.method32(class105, i, 3)) {
			return null;
		}
		return Class23_Sub4_Sub13.method317(b + -15935);
	}
	
	static final int method1586(byte b, int i) {
		anInt1844++;
		if (b >= -18) {
			return 94;
		}
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}
	
	static final void method1587(int i, int i_0_, byte b, int i_1_, int i_2_) {
		anInt1843++;
		int i_3_ = 0;
		if (b < -95) {
			int i_4_ = i_1_;
			int i_5_ = -i_1_;
			int i_6_ = -1;
			int i_7_ = Class23_Sub4_Sub32.method405(49, Class23_Sub13_Sub6.anInt3728, i - -i_1_, Class35.anInt554);
			int i_8_ = Class23_Sub4_Sub32.method405(81, Class23_Sub13_Sub6.anInt3728, -i_1_ + i, Class35.anInt554);
			Class23_Sub13_Sub6.method632(i_7_, (byte) -30, i_0_, Class4.anIntArrayArray98[i_2_], i_8_);
			while ((i_3_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
				i_6_ += 2;
				i_5_ += i_6_;
				if (i_5_ > 0) {
					i_4_--;
					i_5_ -= i_4_ << 1;
					int i_9_ = -i_4_ + i_2_;
					int i_10_ = i_4_ + i_2_;
					if ((i_10_ ^ 0xffffffff) <= (Class88.anInt1503 ^ 0xffffffff) && i_9_ <= Class23_Sub4_Sub33.anInt3435) {
						int i_11_ = Class23_Sub4_Sub32.method405(66, Class23_Sub13_Sub6.anInt3728, i_3_ + i, Class35.anInt554);
						int i_12_ = Class23_Sub4_Sub32.method405(115, Class23_Sub13_Sub6.anInt3728, i - i_3_, Class35.anInt554);
						if (i_10_ <= Class23_Sub4_Sub33.anInt3435) {
							Class23_Sub13_Sub6.method632(i_11_, (byte) -30, i_0_, Class4.anIntArrayArray98[i_10_], i_12_);
						}
						if (i_9_ >= Class88.anInt1503) {
							Class23_Sub13_Sub6.method632(i_11_, (byte) -30, i_0_, Class4.anIntArrayArray98[i_9_], i_12_);
						}
					}
				}
				i_3_++;
				int i_13_ = i_2_ - i_3_;
				int i_14_ = i_3_ + i_2_;
				if (i_14_ >= Class88.anInt1503 && Class23_Sub4_Sub33.anInt3435 >= i_13_) {
					int i_15_ = Class23_Sub4_Sub32.method405(65, Class23_Sub13_Sub6.anInt3728, i - -i_4_, Class35.anInt554);
					int i_16_ = Class23_Sub4_Sub32.method405(78, Class23_Sub13_Sub6.anInt3728, -i_4_ + i, Class35.anInt554);
					if ((i_14_ ^ 0xffffffff) >= (Class23_Sub4_Sub33.anInt3435 ^ 0xffffffff)) {
						Class23_Sub13_Sub6.method632(i_15_, (byte) -30, i_0_, Class4.anIntArrayArray98[i_14_], i_16_);
					}
					if ((i_13_ ^ 0xffffffff) <= (Class88.anInt1503 ^ 0xffffffff)) {
						Class23_Sub13_Sub6.method632(i_15_, (byte) -30, i_0_, Class4.anIntArrayArray98[i_13_], i_16_);
					}
				}
			}
		}
	}
	
	static final Class87_Sub1 method1588(Buffer class23_sub5, boolean bool) {
		anInt1842++;
		if (bool != true) {
			return null;
		}
		return new Class87_Sub1(class23_sub5.method474(true), class23_sub5.method474(true), class23_sub5.method474(bool), class23_sub5.method474(true), class23_sub5.getTriByte(114), class23_sub5.getTriByte(80), class23_sub5.readUByte());
	}
	
	static final void method1589(int i, int i_17_, int i_18_, int i_19_, boolean bool) {
		for (int i_20_ = 0; (Class23_Sub4_Sub25.anInt3306 ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
			if ((i_18_ ^ 0xffffffff) > (Class23_Sub4_Sub9.anIntArray3034[i_20_] - -Class24.anIntArray372[i_20_] ^ 0xffffffff) && Class23_Sub4_Sub9.anIntArray3034[i_20_] < i_17_ + i_18_ && i_19_ < Class23_Sub11.anIntArray2286[i_20_] - -Class55.anIntArray865[i_20_] && (i_19_ + i ^ 0xffffffff) < (Class23_Sub11.anIntArray2286[i_20_] ^ 0xffffffff)) {
				Class23_Sub4_Sub23_Sub1.aBooleanArray4478[i_20_] = true;
			}
		}
		if (bool != true) {
			aClass16_1849 = null;
		}
		anInt1852++;
	}
	
	RuntimeException_Sub1(Throwable throwable, String string) {
		aString1850 = string;
		aThrowable1848 = throwable;
	}
	
	public static void method1590(int i) {
		aClass16_1845 = null;
		if (i == 8404) {
			aClass16_1849 = null;
			aShortArrayArray1851 = null;
		}
	}
	
	static {
		aClass16_1845 = Class38_Sub6.method1076((byte) 86, "RuneScape wird geladen )2 bitte warten)3)3)3");
		aShortArrayArray1851 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}
}
