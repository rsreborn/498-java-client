/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96
{
	private static byte[] aByteArray1622 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private Buffer aClass23_Sub5_1623;
	private long aLong1624;
	protected int[] anIntArray1625;
	private int[] anIntArray1626;
	protected int anInt1627;
	private int anInt1628;
	private int[] anIntArray1629;
	private int[] anIntArray1630;
	
	final void method1471(int i) {
		aClass23_Sub5_1623.position = anIntArray1630[i];
	}
	
	public static void method1472() {
		aByteArray1622 = null;
	}
	
	final void method1473(int i) {
		anIntArray1630[i] = aClass23_Sub5_1623.position;
	}
	
	final void method1474(long l) {
		aLong1624 = l;
		int i = anIntArray1630.length;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			anIntArray1625[i_0_] = 0;
			anIntArray1626[i_0_] = 0;
			aClass23_Sub5_1623.position = anIntArray1629[i_0_];
			method1485(i_0_);
			anIntArray1630[i_0_] = aClass23_Sub5_1623.position;
		}
	}
	
	final int method1475() {
		int i = anIntArray1630.length;
		int i_1_ = -1;
		int i_2_ = 2147483647;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			if (anIntArray1630[i_3_] >= 0 && anIntArray1625[i_3_] < i_2_) {
				i_1_ = i_3_;
				i_2_ = anIntArray1625[i_3_];
			}
		}
		return i_1_;
	}
	
	final void method1476(byte[] bs) {
		aClass23_Sub5_1623.payload = bs;
		aClass23_Sub5_1623.position = 10;
		int i = aClass23_Sub5_1623.readShortBE();
		anInt1627 = aClass23_Sub5_1623.readShortBE();
		anInt1628 = 500000;
		anIntArray1629 = new int[i];
		int i_4_ = 0;
		while (i_4_ < i) {
			int i_5_ = aClass23_Sub5_1623.method472(-124);
			int i_6_ = aClass23_Sub5_1623.method472(-117);
			if (i_5_ == 1297379947) {
				anIntArray1629[i_4_] = aClass23_Sub5_1623.position;
				i_4_++;
			}
			aClass23_Sub5_1623.position += i_6_;
		}
		aLong1624 = 0L;
		anIntArray1630 = new int[i];
		for (int i_7_ = 0; i_7_ < i; i_7_++)
			anIntArray1630[i_7_] = anIntArray1629[i_7_];
		anIntArray1625 = new int[i];
		anIntArray1626 = new int[i];
	}
	
	final boolean method1477() {
		int i = anIntArray1630.length;
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			if (anIntArray1630[i_8_] >= 0) {
				return false;
			}
		}
		return true;
	}
	
	final void method1478() {
		aClass23_Sub5_1623.position = -1;
	}
	
	final int method1479() {
		return anIntArray1630.length;
	}
	
	final boolean method1480() {
		if (aClass23_Sub5_1623.payload == null) {
			return false;
		}
		return true;
	}
	
	final int method1481(int i) {
		int i_9_ = method1482(i);
		return i_9_;
	}
	
	private final int method1482(int i) {
		int i_10_ = aClass23_Sub5_1623.payload[aClass23_Sub5_1623.position];
		if (i_10_ < 0) {
			i_10_ &= 0xff;
			anIntArray1626[i] = i_10_;
			aClass23_Sub5_1623.position++;
		} else {
			i_10_ = anIntArray1626[i];
		}
		if (i_10_ == 240 || i_10_ == 247) {
			int i_11_ = aClass23_Sub5_1623.method437(false);
			if (i_10_ == 247 && i_11_ > 0) {
				int i_12_ = aClass23_Sub5_1623.payload[aClass23_Sub5_1623.position] & 0xff;
				if (i_12_ >= 241 && i_12_ <= 243 || i_12_ == 246 || i_12_ == 248 || i_12_ >= 250 && i_12_ <= 252 || i_12_ == 254) {
					aClass23_Sub5_1623.position++;
					anIntArray1626[i] = i_12_;
					return method1484(i, i_12_);
				}
			}
			aClass23_Sub5_1623.position += i_11_;
			return 0;
		}
		return method1484(i, i_10_);
	}
	
	final void method1483() {
		aClass23_Sub5_1623.payload = null;
		anIntArray1629 = null;
		anIntArray1630 = null;
		anIntArray1625 = null;
		anIntArray1626 = null;
	}
	
	private final int method1484(int i, int i_13_) {
		if (i_13_ == 255) {
			int i_14_ = aClass23_Sub5_1623.readByte();
			int i_15_ = aClass23_Sub5_1623.method437(false);
			if (i_14_ == 47) {
				aClass23_Sub5_1623.position += i_15_;
				return 1;
			}
			if (i_14_ == 81) {
				int i_16_ = aClass23_Sub5_1623.method471(82);
				i_15_ -= 3;
				int i_17_ = anIntArray1625[i];
				aLong1624 += (long) i_17_ * (long) (anInt1628 - i_16_);
				anInt1628 = i_16_;
				aClass23_Sub5_1623.position += i_15_;
				return 2;
			}
			aClass23_Sub5_1623.position += i_15_;
			return 3;
		}
		byte b = aByteArray1622[i_13_ - 128];
		int i_18_ = i_13_;
		if (b >= 1) {
			i_18_ |= aClass23_Sub5_1623.readByte() << 8;
		}
		if (b >= 2) {
			i_18_ |= aClass23_Sub5_1623.readByte() << 16;
		}
		return i_18_;
	}
	
	final void method1485(int i) {
		int i_19_ = aClass23_Sub5_1623.method437(false);
		anIntArray1625[i] += i_19_;
	}
	
	final long method1486(int i) {
		return aLong1624 + (long) i * (long) anInt1628;
	}
	
	public Class96() {
		aClass23_Sub5_1623 = new Buffer(null);
	}
	
	Class96(byte[] bs) {
		aClass23_Sub5_1623 = new Buffer(null);
		method1476(bs);
	}
}
