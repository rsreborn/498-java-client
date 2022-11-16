/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98 implements Runnable
{
	static int anInt1648;
	static RSString aClass16_1649 = Class38_Sub6.method1076((byte) 86, "welle:");
	static int anInt1650;
	static RSString aClass16_1651;
	static RSString aClass16_1652;
	protected Object anObject1653;
	static Class5 aClass5_1654;
	static RSString[] aClass16Array1655 = new RSString[500];
	protected boolean aBoolean1656 = true;
	static RSString aClass16_1657;
	protected int[] anIntArray1658;
	protected int anInt1659;
	static int anInt1660;
	protected int[] anIntArray1661;
	static RSString aClass16_1662;
	
	static final int method1492(byte b, int i) {
		i = (~0x2aaaaaaa & i >>> 1) + (0x55555555 & i);
		i = (i >>> 2 & 0x33333333) + (i & 0x33333333);
		i = 0xf0f0f0f & (i >>> 4) + i;
		i += i >>> 8;
		if (b != 40) {
			method1493(-81);
		}
		i += i >>> 16;
		anInt1660++;
		return 0xff & i;
	}
	
	public final void run() {
		while (aBoolean1656) {
			synchronized (anObject1653) {
				if (anInt1659 < 500) {
					anIntArray1658[anInt1659] = Class23_Sub4_Sub14.anInt3126;
					anIntArray1661[anInt1659] = Class102.anInt1701;
					anInt1659++;
				}
			}
			Class105.method1545((byte) -105, 50L);
		}
		anInt1648++;
	}
	
	public static void method1493(int i) {
		aClass5_1654 = null;
		aClass16_1651 = null;
		if (i <= -85) {
			aClass16_1662 = null;
			aClass16Array1655 = null;
			aClass16_1649 = null;
			aClass16_1652 = null;
			aClass16_1657 = null;
		}
	}
	
	public Class98() {
		anObject1653 = new Object();
		anInt1659 = 0;
		anIntArray1658 = new int[500];
		anIntArray1661 = new int[500];
	}
	
	static {
		aClass16_1651 = Class38_Sub6.method1076((byte) 86, "mapflag");
		aClass16_1652 = Class38_Sub6.method1076((byte) 86, "");
		aClass16_1657 = Class38_Sub6.method1076((byte) 86, "loc)3dat");
		aClass5_1654 = new Class5(20);
		aClass16_1662 = Class38_Sub6.method1076((byte) 86, "sl_back");
	}
}
