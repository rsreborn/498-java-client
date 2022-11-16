/* Class23_Sub4_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub9 extends Class23_Sub4
{
	static int anInt3033;
	static int[] anIntArray3034;
	static Buffer aClass23_Sub5_3035;
	static int anInt3036 = 0;
	static RSString aClass16_3037;
	static RSString aClass16_3038;
	static int anInt3039;
	static int anInt3040;
	static Class17 aClass17_3041;
	
	public static void method297(byte b) {
		aClass23_Sub5_3035 = null;
		if (b != 74) {
			method298(111, 2, 35, 59L);
		}
		aClass16_3037 = null;
		anIntArray3034 = null;
		aClass17_3041 = null;
		aClass16_3038 = null;
	}
	
	public Class23_Sub4_Sub9() {
		super(0, true);
	}
	
	final int[] method260(int i, int i_0_) {
		anInt3033++;
		int[] is = aClass99_2115.method1500(i_0_, (byte) -118);
		if (aClass99_2115.aBoolean1681) {
			Class3.method53(is, 0, Class23_Sub4_Sub33.anInt3428, Class23_Sub13_Sub16.anIntArray4049[i_0_]);
		}
		if (i != 0) {
			method298(-40, 74, 114, -116L);
		}
		return is;
	}
	
	static final boolean method298(int i, int i_1_, int i_2_, long l) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_1_][i_2_];
		if (class23_sub1 == null) {
			return false;
		}
		if (class23_sub1.aClass83_2031 != null && class23_sub1.aClass83_2031.aLong1473 == l) {
			return true;
		}
		if (class23_sub1.aClass24_2038 != null && class23_sub1.aClass24_2038.aLong364 == l) {
			return true;
		}
		if (class23_sub1.aClass69_2034 != null && class23_sub1.aClass69_2034.aLong1209 == l) {
			return true;
		}
		for (int i_3_ = 0; i_3_ < class23_sub1.anInt2029; i_3_++) {
			if (class23_sub1.aClass39Array2028[i_3_].aLong603 == l) {
				return true;
			}
		}
		return false;
	}
	
	static final void method299(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		anInt3040++;
		if (Class17.method189(-10924, i_4_)) {
			if (i_6_ != 100) {
				aClass23_Sub5_3035 = null;
			}
			Class47.method1144(-1, i_9_, i, i_7_, Class23_Sub4_Sub28.aClass64ArrayArray3350[i_4_], i_10_, i_8_, i_6_ ^ 0x33, i_5_);
		}
	}
	
	static final Class23_Sub13_Sub24 method300(int i, int i_11_) {
		anInt3039++;
		Class23_Sub13_Sub24 class23_sub13_sub24 = (Class23_Sub13_Sub24) Class55.aClass5_871.method62(127, (long) i_11_);
		if (class23_sub13_sub24 != null) {
			return class23_sub13_sub24;
		}
		byte[] bs = Class23_Sub13_Sub23.aClass105_4256.method1544(i_11_, 0, i);
		class23_sub13_sub24 = new Class23_Sub13_Sub24();
		if (bs != null) {
			class23_sub13_sub24.method851(i_11_, i ^ ~0x740c, new Buffer(bs));
		}
		Class55.aClass5_871.method67((long) i_11_, class23_sub13_sub24, true);
		return class23_sub13_sub24;
	}
	
	static {
		anIntArray3034 = new int[100];
		aClass16_3038 = Class38_Sub6.method1076((byte) 86, "k");
		aClass16_3037 = Class38_Sub6.method1076((byte) 86, "Lade Benutzeroberfl-=che )2 ");
	}
}
