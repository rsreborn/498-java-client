/* Class23_Sub13_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub13_Sub26 extends Class23_Sub13
{
	static int anInt4297;
	static boolean aBoolean4298;
	static RSString aClass16_4299 = Class38_Sub6.method1076((byte) 86, "Suche nach Updates )2 ");
	static int anInt4300;
	static RSString aClass16_4301;
	protected byte aByte4302;
	protected int anInt4303;
	protected CacheArchive aClass105_Sub1_4304;
	static int anInt4305;
	static int anInt4306;
	static RSString[] aClass16Array4307;
	
	static final void method858(byte b) {
		anInt4300++;
		if (b >= -37) {
			aClass16Array4307 = null;
		}
		synchronized (Class21.anObject338) {
			if ((Class23.anInt353 ^ 0xffffffff) == -1) {
				Class23_Sub4_Sub3.aClass9_2939.method104(5, new Class7(), (byte) 72);
			}
			Class23.anInt353 = 600;
		}
	}
	
	public static void method859(boolean bool) {
		aClass16_4299 = null;
		aClass16_4301 = null;
		aClass16Array4307 = null;
		if (bool != false) {
			method860(false, -110, 51, 38, 20, -75);
		}
	}
	
	static final Class23_Sub13_Sub10 method860(boolean bool, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt4306++;
		long l = ((long) i_3_ << 38) + ((long) i - -((long) i_0_ << 16)) + ((bool ? 137438953472L : 0L) + ((long) i_1_ << 40));
		if (i_2_ != 500) {
			return null;
		}
		Class23_Sub13_Sub10 class23_sub13_sub10 = (Class23_Sub13_Sub10) Class23_Sub2.aClass5_2053.method62(-125, l);
		if (class23_sub13_sub10 != null) {
			return class23_sub13_sub10;
		}
		Class76.aBoolean1389 = false;
		class23_sub13_sub10 = Class47.method1147(bool, i_3_, i, false, i_1_, false, i_0_, false);
		if (class23_sub13_sub10 != null && !Class76.aBoolean1389) {
			Class23_Sub2.aClass5_2053.method67(l, class23_sub13_sub10, true);
		}
		return class23_sub13_sub10;
	}
	
	static {
		anInt4297 = 0;
		aClass16_4301 = Class38_Sub6.method1076((byte) 86, "Schlie-8en");
		aBoolean4298 = false;
		anInt4305 = 0;
		aClass16Array4307 = new RSString[500];
	}
}
