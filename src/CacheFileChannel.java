/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public class CacheFileChannel
{
	private long aLong433 = -1L;
	static int anInt434;
	static int anInt435;
	static int anInt436;
	private long aLong437 = -1L;
	static int anInt438;
	static int anInt439;
	static int anInt440;
	static int anInt441;
	static int anInt442;
	private byte[] aByteArray443;
	static int anInt444;
	static int anInt445;
	static int anInt446;
	private int anInt447;
	static int anInt448;
	private int anInt449 = 0;
	static int anInt450;
	static oa anOa451;
	private long aLong452;
	private byte[] aByteArray453;
	static int anInt454;
	static int anInt455;
	static int anInt456;
	static CacheArchive aClass105_Sub1_457;
	static int anInt458;
	static int anInt459;
	private static RSString aClass16_460 = Class38_Sub6.method1076((byte) 86, "Malformed login packet)3");
	static int anInt461;
	private long aLong462;
	static int anInt463 = 0;
	private SizedAccessFile aClass62_464;
	static RSString aClass16_465;
	private long aLong466;
	static long[] aLongArray467 = new long[100];
	private long aLong468;
	static int anInt469;
	static CacheArchive aClass105_Sub1_470;
	static Class6 aClass6_471;
	
	private final void method941(int i) throws IOException {
		anInt436++;
		if ((aLong437 ^ 0xffffffffffffffffL) != 0L) {
			if (aLong468 != aLong437) {
				aClass62_464.method1206((byte) -29, aLong437);
				aLong468 = aLong437;
			}
			long l = -1L;
			aClass62_464.method1205(aByteArray443, 0, anInt449, 1);
			long l_0_ = -1L;
			aLong468 += (long) anInt449;
			if ((aLong466 ^ 0xffffffffffffffffL) > (aLong468 ^ 0xffffffffffffffffL)) {
				aLong466 = aLong468;
			}
			if (aLong433 > aLong437 || (aLong437 ^ 0xffffffffffffffffL) <= (aLong433 - -(long) anInt447 ^ 0xffffffffffffffffL)) {
				if ((aLong437 ^ 0xffffffffffffffffL) >= (aLong433 ^ 0xffffffffffffffffL) && aLong437 - -(long) anInt449 > aLong433) {
					l_0_ = aLong433;
				}
			} else {
				l_0_ = aLong437;
			}
			if (aLong433 >= aLong437 + (long) anInt449 || ((long) anInt449 + aLong437 ^ 0xffffffffffffffffL) < ((long) anInt447 + aLong433 ^ 0xffffffffffffffffL)) {
				if ((aLong437 ^ 0xffffffffffffffffL) > ((long) anInt447 + aLong433 ^ 0xffffffffffffffffL) && ((long) anInt447 + aLong433 ^ 0xffffffffffffffffL) >= ((long) anInt449 + aLong437 ^ 0xffffffffffffffffL)) {
					l = aLong433 + (long) anInt447;
				}
			} else {
				l = (long) anInt449 + aLong437;
			}
			if ((l_0_ ^ 0xffffffffffffffffL) < 0L && (l ^ 0xffffffffffffffffL) < (l_0_ ^ 0xffffffffffffffffL)) {
				int i_1_ = (int) (l - l_0_);
				Class3.method56(aByteArray443, (int) (-aLong437 + l_0_), aByteArray453, (int) (l_0_ - aLong433), i_1_);
			}
			anInt449 = 0;
			aLong437 = -1L;
		}
		int i_2_ = 23 % ((i - -44) / 55);
	}
	
	private final void method942(int i) throws IOException {
		if (i != -1) {
			aClass6_471 = null;
		}
		anInt447 = 0;
		if (aLong462 != aLong468) {
			aClass62_464.method1206((byte) -29, aLong462);
			aLong468 = aLong462;
		}
		aLong433 = aLong462;
		anInt444++;
		int i_3_;
		for (/**/; (anInt447 ^ 0xffffffff) > (aByteArray453.length ^ 0xffffffff); anInt447 += i_3_) {
			int i_4_ = aByteArray453.length - anInt447;
			if ((i_4_ ^ 0xffffffff) < -200000001) {
				i_4_ = 200000000;
			}
			i_3_ = aClass62_464.method1202(true, aByteArray453, i_4_, anInt447);
			if ((i_3_ ^ 0xffffffff) == 0) {
				break;
			}
			aLong468 += (long) i_3_;
		}
	}
	
	public static void method943(byte b) {
		if (b < -52) {
			aClass16_465 = null;
			aClass16_460 = null;
			aLongArray467 = null;
			anOa451 = null;
			aClass105_Sub1_470 = null;
			aClass105_Sub1_457 = null;
			aClass6_471 = null;
		}
	}
	
	static final void method944(boolean bool) {
		anInt441++;
		if (Class51.aClass64_790 == null) {
			if (bool != false) {
				aClass6_471 = null;
			}
			if (Class23_Sub4_Sub8.aClass64_3028 == null) {
				int i = Class23_Sub13_Sub9.anInt3860;
				if (Class53.aBoolean840) {
					if (i != 1) {
						int i_5_ = Class23_Sub4_Sub14.anInt3126;
						int i_6_ = Class102.anInt1701;
						if ((i_5_ ^ 0xffffffff) > (-10 + Class23_Sub27.anInt2475 ^ 0xffffffff) || Class23_Sub27.anInt2475 + (Class69.anInt1216 - -10) < i_5_ || (Class23_Sub4_Sub3.anInt2950 + -10 ^ 0xffffffff) < (i_6_ ^ 0xffffffff) || i_6_ > 10 + (Class71_Sub3.anInt2746 + Class23_Sub4_Sub3.anInt2950)) {
							Class53.aBoolean840 = false;
							RuntimeException_Sub1.method1589(Class71_Sub3.anInt2746, Class69.anInt1216, Class23_Sub27.anInt2475, Class23_Sub4_Sub3.anInt2950, true);
						}
					}
					if (i == 1) {
						int i_7_ = Class23_Sub4_Sub3.anInt2950;
						int i_8_ = Class23_Sub27.anInt2475;
						int i_9_ = Class69.anInt1216;
						int i_10_ = -1;
						int i_11_ = Class90.anInt1538;
						int i_12_ = Class23_Sub13_Sub19.anInt4136;
						for (int i_13_ = 0; i_13_ < Class23_Sub13_Sub9.anInt3863; i_13_++) {
							int i_14_ = 15 * (-i_13_ + -1 + Class23_Sub13_Sub9.anInt3863) + 31 + i_7_;
							if ((i_11_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff) && i_11_ < i_9_ + i_8_ && (i_14_ + -13 ^ 0xffffffff) > (i_12_ ^ 0xffffffff) && (i_12_ ^ 0xffffffff) > (i_14_ + 3 ^ 0xffffffff)) {
								i_10_ = i_13_;
							}
						}
						if (i_10_ != -1) {
							Class71_Sub1_Sub1.method1272((byte) -82, i_10_);
						}
						Class53.aBoolean840 = false;
						RuntimeException_Sub1.method1589(Class71_Sub3.anInt2746, Class69.anInt1216, Class23_Sub27.anInt2475, Class23_Sub4_Sub3.anInt2950, true);
					}
				} else {
					if (i == 1 && Class23_Sub13_Sub9.anInt3863 > 0) {
						short s = Class38_Sub5.aShortArray2603[-1 + Class23_Sub13_Sub9.anInt3863];
						if (s == 36 || s == 7 || s == 8 || s == 28 || s == 51 || s == 50 || s == 47 || s == 20 || s == 6 || s == 11 || s == 18 || s == 1007) {
							int i_15_ = Class38_Sub2.anIntArray2502[Class23_Sub13_Sub9.anInt3863 + -1];
							int i_16_ = Class23_Sub4_Sub31.anIntArray3399[Class23_Sub13_Sub9.anInt3863 - 1];
							Class64 class64 = Class23_Sub24.method905(i_16_, (byte) 111);
							if (Class63.method1208(Class47.method1142(class64, 71), -114) || Class23_Sub1.method231(Class47.method1142(class64, 105), -128)) {
								Class23_Sub13_Sub23.aBoolean4262 = false;
								Class103.anInt1728 = 0;
								if (Class51.aClass64_790 != null) {
									Class91.method1450((byte) 29, Class51.aClass64_790);
								}
								Class51.aClass64_790 = Class23_Sub24.method905(i_16_, (byte) 111);
								Class87_Sub3.anInt2822 = i_15_;
								Class23_Sub23.anInt2435 = Class90.anInt1538;
								Class23_Sub4_Sub38.anInt3510 = Class23_Sub13_Sub19.anInt4136;
								Class91.method1450((byte) 29, Class51.aClass64_790);
								return;
							}
						}
					}
					if (i == 1 && (Class95.anInt1612 == 1 && Class23_Sub13_Sub9.anInt3863 > 2 || Class87_Sub4.method1425((byte) -3, -1 + Class23_Sub13_Sub9.anInt3863))) {
						i = 2;
					}
					if (i == 1 && Class23_Sub13_Sub9.anInt3863 > 0) {
						Class71_Sub1_Sub1.method1272((byte) -82, Class23_Sub13_Sub9.anInt3863 + -1);
					}
					if (i == 2 && (Class23_Sub13_Sub9.anInt3863 ^ 0xffffffff) < -1) {
						Class36.method986(false);
					}
				}
			}
		}
	}
	
	static final Class23_Sub13_Sub10_Sub1[] method945(int i, int i_17_, Class105 class105, byte b) {
		anInt458++;
		if (b < 52) {
			anInt445 = -99;
		}
		if (!Class23_Sub4_Sub29.method385(class105, 0, i_17_, i)) {
			return null;
		}
		return Class38.method997((byte) -127);
	}
	
	final long method946(boolean bool) {
		anInt450++;
		if (bool != true) {
			aLongArray467 = null;
		}
		return aLong452;
	}
	
	private final File method947(int i) {
		if (i != 20459) {
			return null;
		}
		anInt440++;
		return aClass62_464.method1204(true);
	}
	
	final void method948(long l, int i) throws IOException {
		anInt448++;
		if (i != -11320) {
			method951((byte) 34);
		}
		if ((l ^ 0xffffffffffffffffL) > -1L) {
			throw new IOException("Invalid seek to " + l + " in file " + method947(20459));
		}
		aLong462 = l;
	}
	
	static final void method949(int i, int i_18_, int i_19_) {
		Class23_Sub1 class23_sub1 = Class23_Sub24.aClass23_Sub1ArrayArrayArray2442[i][i_18_][i_19_];
		if (class23_sub1 != null) {
			class23_sub1.aClass46_2026 = null;
		}
	}
	
	final void method950(byte[] bs, int i) throws IOException {
		if (i <= 100) {
			aLong452 = -56L;
		}
		anInt469++;
		method953(bs.length, bs, 11524, 0);
	}
	
	static final Class17 method951(byte b) {
		anInt459++;
		try {
			if (b != -88) {
				anOa451 = null;
			}
			return (Class17) Class.forName("Class17_Sub2").newInstance();
		} catch (Throwable throwable) {
			return new Class17_Sub1();
		}
	}
	
	static final void method952(Class105 class105, Class105 class105_20_, int i) {
		Class43.aClass105_664 = class105_20_;
		anInt455++;
		if (i < 17) {
			anOa451 = null;
		}
		Class23_Sub4_Sub39.aClass105_3525 = class105;
	}
	
	final void method953(int i, byte[] bs, int i_21_, int i_22_) throws IOException {
		anInt454++;
		if (i_21_ == 11524) {
			try {
				if ((i + i_22_ ^ 0xffffffff) < (bs.length ^ 0xffffffff)) {
					throw new ArrayIndexOutOfBoundsException(-bs.length + (i_22_ - -i));
				}
				if ((aLong437 ^ 0xffffffffffffffffL) != 0L && (aLong437 ^ 0xffffffffffffffffL) >= (aLong462 ^ 0xffffffffffffffffL) && (aLong437 - -(long) anInt449 ^ 0xffffffffffffffffL) <= ((long) i + aLong462 ^ 0xffffffffffffffffL)) {
					Class3.method56(aByteArray443, (int) (aLong462 + -aLong437), bs, i_22_, i);
					aLong462 += (long) i;
					return;
				}
				int i_23_ = i;
				long l = aLong462;
				int i_24_ = i_22_;
				if (aLong462 >= aLong433 && (long) anInt447 + aLong433 > aLong462) {
					int i_25_ = (int) ((long) anInt447 + aLong433 + -aLong462);
					if ((i ^ 0xffffffff) > (i_25_ ^ 0xffffffff)) {
						i_25_ = i;
					}
					i -= i_25_;
					Class3.method56(aByteArray453, (int) (-aLong433 + aLong462), bs, i_22_, i_25_);
					i_22_ += i_25_;
					aLong462 += (long) i_25_;
				}
				if ((i ^ 0xffffffff) >= (aByteArray453.length ^ 0xffffffff)) {
					if ((i ^ 0xffffffff) < -1) {
						int i_26_ = i;
						method942(-1);
						if (i_26_ > anInt447) {
							i_26_ = anInt447;
						}
						Class3.method56(aByteArray453, 0, bs, i_22_, i_26_);
						aLong462 += (long) i_26_;
						i -= i_26_;
						i_22_ += i_26_;
					}
				} else {
					aClass62_464.method1206((byte) -29, aLong462);
					aLong468 = aLong462;
					while ((i ^ 0xffffffff) < -1) {
						int i_27_ = aClass62_464.method1202(true, bs, i, i_22_);
						if (i_27_ == -1) {
							break;
						}
						aLong462 += (long) i_27_;
						i -= i_27_;
						i_22_ += i_27_;
						aLong468 += (long) i_27_;
					}
				}
				if (aLong437 != -1L) {
					if ((aLong437 ^ 0xffffffffffffffffL) < (aLong462 ^ 0xffffffffffffffffL) && (i ^ 0xffffffff) < -1) {
						int i_28_ = (int) (-aLong462 + aLong437) + i_22_;
						if (i_28_ > i + i_22_) {
							i_28_ = i + i_22_;
						}
						while ((i_22_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff)) {
							i--;
							bs[i_22_++] = (byte) 0;
							aLong462++;
						}
					}
					long l_29_ = -1L;
					if ((l ^ 0xffffffffffffffffL) > (aLong437 + (long) anInt449 ^ 0xffffffffffffffffL) && aLong437 + (long) anInt449 <= l - -(long) i_23_) {
						l_29_ = (long) anInt449 + aLong437;
					} else if ((aLong437 ^ 0xffffffffffffffffL) > (l + (long) i_23_ ^ 0xffffffffffffffffL) && (l - -(long) i_23_ ^ 0xffffffffffffffffL) >= ((long) anInt449 + aLong437 ^ 0xffffffffffffffffL)) {
						l_29_ = (long) i_23_ + l;
					}
					long l_30_ = -1L;
					if (l <= aLong437 && (l + (long) i_23_ ^ 0xffffffffffffffffL) < (aLong437 ^ 0xffffffffffffffffL)) {
						l_30_ = aLong437;
					} else if ((aLong437 ^ 0xffffffffffffffffL) >= (l ^ 0xffffffffffffffffL) && (long) anInt449 + aLong437 > l) {
						l_30_ = l;
					}
					if (l_30_ > -1L && l_29_ > l_30_) {
						int i_31_ = (int) (l_29_ + -l_30_);
						Class3.method56(aByteArray443, (int) (l_30_ + -aLong437), bs, i_24_ + (int) (-l + l_30_), i_31_);
						if (aLong462 < l_29_) {
							i -= -aLong462 + l_29_;
							aLong462 = l_29_;
						}
					}
				}
			} catch (IOException ioexception) {
				aLong468 = -1L;
				throw ioexception;
			}
			if ((i ^ 0xffffffff) < -1) {
				throw new EOFException();
			}
		}
	}
	
	final void method954(byte b) throws IOException {
		int i = 30 % ((b - -79) / 35);
		anInt434++;
		method941(91);
		aClass62_464.method1201(1);
	}
	
	final void method955(int i, byte[] bs, int i_32_, int i_33_) throws IOException {
		anInt456++;
		try {
			if ((long) i_33_ + aLong462 > aLong452) {
				aLong452 = aLong462 + (long) i_33_;
			}
			if (aLong437 != -1L && ((aLong437 ^ 0xffffffffffffffffL) < (aLong462 ^ 0xffffffffffffffffL) || (aLong437 + (long) anInt449 ^ 0xffffffffffffffffL) > (aLong462 ^ 0xffffffffffffffffL))) {
				method941(14);
			}
			if ((aLong437 ^ 0xffffffffffffffffL) != 0L && aLong462 - -(long) i_33_ > (long) aByteArray443.length + aLong437) {
				int i_34_ = (int) ((long) aByteArray443.length - aLong462 + aLong437);
				Class3.method56(bs, i, aByteArray443, (int) (aLong462 + -aLong437), i_34_);
				i_33_ -= i_34_;
				aLong462 += (long) i_34_;
				i += i_34_;
				anInt449 = aByteArray443.length;
				method941(-106);
			}
			if (aByteArray443.length < i_33_) {
				if ((aLong462 ^ 0xffffffffffffffffL) != (aLong468 ^ 0xffffffffffffffffL)) {
					aClass62_464.method1206((byte) -29, aLong462);
					aLong468 = aLong462;
				}
				aClass62_464.method1205(bs, i, i_33_, i_32_ ^ ~0x1);
				long l = -1L;
				if ((aLong462 ^ 0xffffffffffffffffL) <= (aLong433 ^ 0xffffffffffffffffL) && (aLong462 ^ 0xffffffffffffffffL) > (aLong433 - -(long) anInt447 ^ 0xffffffffffffffffL)) {
					l = aLong462;
				} else if ((aLong433 ^ 0xffffffffffffffffL) <= (aLong462 ^ 0xffffffffffffffffL) && (long) i_33_ + aLong462 > aLong433) {
					l = aLong433;
				}
				aLong468 += (long) i_33_;
				if (aLong466 < aLong468) {
					aLong466 = aLong468;
				}
				long l_35_ = -1L;
				if ((long) i_33_ + aLong462 > aLong433 && ((long) anInt447 + aLong433 ^ 0xffffffffffffffffL) <= ((long) i_33_ + aLong462 ^ 0xffffffffffffffffL)) {
					l_35_ = (long) i_33_ + aLong462;
				} else if (aLong433 - -(long) anInt447 > aLong462 && (long) anInt447 + aLong433 <= (long) i_33_ + aLong462) {
					l_35_ = aLong433 - -(long) anInt447;
				}
				if (l > -1L && (l ^ 0xffffffffffffffffL) > (l_35_ ^ 0xffffffffffffffffL)) {
					int i_36_ = (int) (l_35_ + -l);
					Class3.method56(bs, (int) (-aLong462 + l + (long) i), aByteArray453, (int) (-aLong433 + l), i_36_);
				}
				aLong462 += (long) i_33_;
			} else if (i_32_ > (i_33_ ^ 0xffffffff)) {
				if (aLong437 == -1L) {
					aLong437 = aLong462;
				}
				Class3.method56(bs, i, aByteArray443, (int) (-aLong437 + aLong462), i_33_);
				aLong462 += (long) i_33_;
				if (aLong462 + -aLong437 > (long) anInt449) {
					anInt449 = (int) (-aLong437 + aLong462);
				}
			}
		} catch (IOException ioexception) {
			aLong468 = -1L;
			throw ioexception;
		}
	}
	
	CacheFileChannel(SizedAccessFile class62, int i, int i_37_) throws IOException {
		aClass62_464 = class62;
		aLong452 = aLong466 = class62.method1203((byte) -85);
		aLong462 = 0L;
		aByteArray443 = new byte[i_37_];
		aByteArray453 = new byte[i];
	}
	
	static {
		aClass16_465 = aClass16_460;
		anOa451 = new oa(4096);
	}
}
