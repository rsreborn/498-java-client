/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class49
{
	static RSString aClass16_753 = Class38_Sub6.method1076((byte) 86, "(U5");
	static Class23_Sub13_Sub10_Sub1 aClass23_Sub13_Sub10_Sub1_754;
	static int anInt755;
	static int anInt756 = 0;
	static int anInt757;
	static int anInt758;
	static int anInt759;
	static RSString aClass16_760 = Class38_Sub6.method1076((byte) 86, "Texturen geladen)3");
	static int anInt761 = 0;
	static RSString aClass16_762;
	static RSString aClass16_763;
	static RSString aClass16_764 = null;
	static RSString aClass16_765 = Class38_Sub6.method1076((byte) 86, "Verbindung konnte nicht hergestellt werden)3");
	static int anInt766;
	
	static final boolean method1152(int i, int i_0_) {
		if (i != -1) {
			method1152(22, 69);
		}
		anInt758++;
		if ((0x1 & i_0_ >> 31 ^ 0xffffffff) == -1) {
			return false;
		}
		return true;
	}
	
	static final void method1153(byte b, long l) {
		if (b <= -55) {
			try {
				Thread.sleep(l);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			anInt755++;
		}
	}
	
	public static void method1154(int i) {
		aClass23_Sub13_Sub10_Sub1_754 = null;
		aClass16_753 = null;
		aClass16_760 = null;
		aClass16_765 = null;
		aClass16_764 = null;
		aClass16_763 = null;
		aClass16_762 = null;
		if (i >= -66) {
			aClass16_764 = null;
		}
	}
	
	static {
		aClass16_763 = Class38_Sub6.method1076((byte) 86, "Nehmen");
		aClass16_762 = Class38_Sub6.method1076((byte) 86, "Lade)3)3)3");
	}
}
