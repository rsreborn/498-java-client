/* Class23_Sub4_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub35 extends Class23_Sub4
{
	private int anInt3451;
	static int anInt3452;
	static int anInt3453;
	private int anInt3454;
	static int anInt3455;
	static short aShort3456 = 32767;
	static byte[][][] aByteArrayArrayArray3457;
	static RSString aClass16_3458 = Class38_Sub6.method1076((byte) 86, "<col=00ff00>");
	static int anInt3459;
	static int anInt3460;
	static int[][][] anIntArrayArrayArray3461;
	private int anInt3462;
	
	public Class23_Sub4_Sub35() {
		this(0);
	}
	
	public static void method410(byte b) {
		aByteArrayArrayArray3457 = null;
		anIntArrayArrayArray3461 = null;
		if (b >= 9) {
			aClass16_3458 = null;
		}
	}
	
	private final void method411(byte b, int i) {
		anInt3452++;
		anInt3454 = i >> 4 & 0xff0;
		anInt3451 = (0xff0000 & i) >> 12;
		anInt3462 = i << 4 & 0xff0;
		if (b != -62) {
			anInt3453 = 62;
		}
	}
	
	private Class23_Sub4_Sub35(int i) {
		super(0, false);
		method411((byte) -62, i);
	}
	
	final int[][] method258(int i, byte b) {
		anInt3455++;
		int[][] is = aClass103_2108.method1518(b ^ ~0x73d3, i);
		if (b != 9) {
			method410((byte) 90);
		}
		if (aClass103_2108.aBoolean1733) {
			int[] is_0_ = is[0];
			int[] is_1_ = is[2];
			int[] is_2_ = is[1];
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class23_Sub4_Sub33.anInt3428 ^ 0xffffffff); i_3_++) {
				is_0_[i_3_] = anInt3451;
				is_2_[i_3_] = anInt3454;
				is_1_[i_3_] = anInt3462;
			}
		}
		return is;
	}
	
	final void method255(Buffer class23_sub5, int i, int i_4_) {
		if (i_4_ != 1000) {
			method411((byte) -29, 34);
		}
		anInt3460++;
		int i_5_ = i;
		if (i_5_ == 0) {
			method411((byte) -62, class23_sub5.method471(79));
		}
	}
	
	static {
		anInt3453 = 0;
	}
}
