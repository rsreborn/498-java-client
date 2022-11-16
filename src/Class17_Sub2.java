/* Class17_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class17_Sub2 extends Class17
{
	private long aLong2004 = System.nanoTime();
	
	final int method186(int i, byte b, int i_0_) {
		long l = aLong2004 - System.nanoTime();
		long l_1_ = 1000000L * (long) i_0_;
		if (l < l_1_) {
			l = l_1_;
		}
		int i_2_ = 0;
		Class105.method1545((byte) -122, l / 1000000L);
		long l_3_;
		for (l_3_ = System.nanoTime(); i_2_ < 10 && (1 > i_2_ || aLong2004 < l_3_); i_2_++)
			aLong2004 += 1000000L * (long) i;
		int i_4_ = -66 / ((b - -49) / 45);
		if ((aLong2004 ^ 0xffffffffffffffffL) > (l_3_ ^ 0xffffffffffffffffL)) {
			aLong2004 = l_3_;
		}
		return i_2_;
	}
	
	final void method188(int i) {
		aLong2004 = System.nanoTime();
		int i_5_ = -6 % ((i - -80) / 35);
	}
	
	Class17_Sub2() {
		/* empty */
	}
}
