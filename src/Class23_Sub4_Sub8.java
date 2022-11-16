/* Class23_Sub4_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub8 extends Class23_Sub4
{
	static Class64 aClass64_3028 = null;
	static int anInt3029;
	static Class105_Sub1 aClass105_Sub1_3030;
	static Class105_Sub1 aClass105_Sub1_3031;
	static int anInt3032;
	
	public Class23_Sub4_Sub8() {
		super(1, true);
	}
	
	final int[] method260(int i, int i_0_) {
		if (i != 0) {
			aClass105_Sub1_3031 = null;
		}
		int[] is = aClass99_2115.method1500(i_0_, (byte) -111);
		if (aClass99_2115.aBoolean1681) {
			int[][] is_1_ = this.method256(0, (byte) -60, i_0_);
			int[] is_2_ = is_1_[0];
			int[] is_3_ = is_1_[1];
			int[] is_4_ = is_1_[2];
			for (int i_5_ = 0; i_5_ < Class23_Sub4_Sub33.anInt3428; i_5_++)
				is[i_5_] = (is_4_[i_5_] + (is_3_[i_5_] + is_2_[i_5_])) / 3;
		}
		anInt3029++;
		return is;
	}
	
	public static void method296(int i) {
		aClass105_Sub1_3030 = null;
		if (i == 1) {
			aClass64_3028 = null;
			aClass105_Sub1_3031 = null;
		}
	}
}
