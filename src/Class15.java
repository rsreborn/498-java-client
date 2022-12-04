/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class15
{
	private static short[] aShortArray287 = new short[500];
	private static short[] aShortArray288 = new short[500];
	protected short[] aShortArray289;
	protected short[] aShortArray290;
	private static short[] aShortArray291;
	private static short[] aShortArray292 = new short[500];
	protected Class23_Sub12 aClass23_Sub12_293;
	protected boolean aBoolean294;
	protected int anInt295 = -1;
	protected short[] aShortArray296;
	protected short[] aShortArray297;
	protected short[] aShortArray298;
	private static short[] aShortArray299;
	
	public static void method136() {
		aShortArray299 = null;
		aShortArray291 = null;
		aShortArray287 = null;
		aShortArray292 = null;
		aShortArray288 = null;
	}
	
	Class15(byte[] bs, Class23_Sub12 class23_sub12) {
		aClass23_Sub12_293 = null;
		aBoolean294 = false;
		aClass23_Sub12_293 = class23_sub12;
		Buffer class23_sub5 = new Buffer(bs);
		Buffer class23_sub5_0_ = new Buffer(bs);
		class23_sub5.pos = 2;
		int i = class23_sub5.readUByte();
		int i_1_ = 0;
		int i_2_ = -1;
		int i_3_ = -1;
		class23_sub5_0_.pos = class23_sub5.pos + i;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			if (aClass23_Sub12_293.anIntArray2295[i_4_] == 0) {
				i_2_ = i_4_;
			}
			int i_5_ = class23_sub5.readUByte();
			if (i_5_ > 0) {
				if (aClass23_Sub12_293.anIntArray2295[i_4_] == 0) {
					i_3_ = i_4_;
				}
				aShortArray299[i_1_] = (short) i_4_;
				short s = 0;
				if (aClass23_Sub12_293.anIntArray2295[i_4_] == 3) {
					s = (short) 128;
				}
				if ((i_5_ & 0x1) != 0) {
					aShortArray291[i_1_] = (short) class23_sub5_0_.method459(true);
				} else {
					aShortArray291[i_1_] = s;
				}
				if ((i_5_ & 0x2) != 0) {
					aShortArray287[i_1_] = (short) class23_sub5_0_.method459(true);
				} else {
					aShortArray287[i_1_] = s;
				}
				if ((i_5_ & 0x4) != 0) {
					aShortArray292[i_1_] = (short) class23_sub5_0_.method459(true);
				} else {
					aShortArray292[i_1_] = s;
				}
				if (aClass23_Sub12_293.anIntArray2295[i_4_] == 2) {
					aShortArray291[i_1_] = (short) (((aShortArray291[i_1_] & 0xff) << 3) + (aShortArray291[i_1_] >> 8 & 0x7));
					aShortArray287[i_1_] = (short) (((aShortArray287[i_1_] & 0xff) << 3) + (aShortArray287[i_1_] >> 8 & 0x7));
					aShortArray292[i_1_] = (short) (((aShortArray292[i_1_] & 0xff) << 3) + (aShortArray292[i_1_] >> 8 & 0x7));
				}
				aShortArray288[i_1_] = (short) -1;
				if (aClass23_Sub12_293.anIntArray2295[i_4_] >= 1 && aClass23_Sub12_293.anIntArray2295[i_4_] <= 3 && i_2_ > i_3_) {
					aShortArray288[i_1_] = (short) i_2_;
					i_3_ = i_2_;
				}
				i_1_++;
				if (aClass23_Sub12_293.anIntArray2295[i_4_] == 5) {
					aBoolean294 = true;
				}
			}
		}
		if (class23_sub5_0_.pos != bs.length) {
			throw new RuntimeException();
		}
		anInt295 = i_1_;
		aShortArray296 = new short[i_1_];
		aShortArray297 = new short[i_1_];
		aShortArray289 = new short[i_1_];
		aShortArray298 = new short[i_1_];
		aShortArray290 = new short[i_1_];
		for (int i_6_ = 0; i_6_ < i_1_; i_6_++) {
			aShortArray296[i_6_] = aShortArray299[i_6_];
			aShortArray297[i_6_] = aShortArray291[i_6_];
			aShortArray289[i_6_] = aShortArray287[i_6_];
			aShortArray298[i_6_] = aShortArray292[i_6_];
			aShortArray290[i_6_] = aShortArray288[i_6_];
		}
	}
	
	static {
		aShortArray291 = new short[500];
		aShortArray299 = new short[500];
	}
}
